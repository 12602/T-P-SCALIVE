/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatnp_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import scatnp_DbUtil.DbConnection;
import scatnp_pojo.CurrentUser;
import scatnp_pojo.HrPojo;
import scatnp_pojo.UserPojo;

/**
 *
 * @author LENOVO
 */
public class UserDao {
    public static boolean validateUser(UserPojo user)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and type=?");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getPassword());
        ps.setString(3,user.getType());
       
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            CurrentUser.setUserid(rs.getString(1));
            CurrentUser.setId(rs.getString(2));
            CurrentUser.setName(rs.getString(3));
            CurrentUser.setType(rs.getString(5));
            
            return  true;
        } 
        else
            return false;
    }
    public static Map<String ,HrPojo> getAllHrbyUserId()throws SQLException
    {
        Map<String,HrPojo>allHr=new HashMap<>();
        Connection conn=DbConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select userid,name,id  from users where type='Hr' order by id");
        while(rs.next())
        {
            HrPojo hr=new HrPojo();
            hr.setUserId(rs.getString(2));
            hr.setHrId(rs.getString(3));
            allHr.put(rs.getString(1),hr);
            
        }
        return allHr;
       
    }
    public static HrPojo getSelectedHrValues(String UserId)throws SQLException
    {
        Map<String ,HrPojo>map=new HashMap<>();
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select name,id  from users where type='Hr'and userid=? order by id");
        ps.setString(1, UserId);
        ResultSet rs=ps.executeQuery();
        rs.next();
      HrPojo hr=new HrPojo();
      hr.setHrName(rs.getString(1));
      hr.setHrId(rs.getString(2));
      return hr;
        
       
        
        
    }
    public static boolean changePassword(String userId,String pwd)throws SQLException
    {
        Connection conn=DbConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where userid=? ");
        ps.setString(1, pwd);
        ps.setString(2, userId);
        
       int res=ps.executeUpdate();
       if(res==-1)
           return false;
       return true;
       
        
    }
    public static boolean removeHr(String hrid)throws SQLException
    {
       
          Connection conn=DbConnection.getConnection();
          //in the Query we write id=? noot hrid=? becuase hrid is not present in user table
          PreparedStatement ps=conn.prepareStatement("update users set active='N' where id=?");
          ps.setString(1, hrid);
          ResultSet rs=ps.executeQuery();
          if(rs.next())
          {
              return true;
          }
          return false;
          
    }
    
}
