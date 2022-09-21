/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatnp_Dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import scatnp_DbUtil.DbConnection;
import scatnp_pojo.HrPojo;

/**
 *
 * @author LENOVO
 */
public class HrDao 
{
    public static int getHrId()throws SQLException
    {
        Connection conn =DbConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(hrid) from hr ");
        int id=101;
        if(rs.next())
        {
           String hrid=  rs.getString(1);
            
         if(hrid!=null)
         {
             
             id=Integer.parseInt(hrid.substring(3));
             //we add 1 after substring the id in id variablse this is not valid hrid.aubatring(3)+1 it gives wrong id 
             id=id+1;
             
         }
      
        }
        
        return id;
    }
    public static int addNewHr(HrPojo hr)throws SQLException
    {
         Connection conn =DbConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select userid from users where userid=?");
         ps.setString(1, hr.getUserId());
         ResultSet rs=ps.executeQuery();
         if(rs.next())
         {
             JOptionPane.showMessageDialog(null,"Record exist");
             return -1;
         }
         
         ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
         ps.setString(1,hr.getUserId());
         ps.setString(2, hr.getHrId());
         ps.setString(3, hr.getHrName());
         ps.setString(4, hr.getPassword());
         ps.setString(5, hr.getType());
         ps.setString(6, "Y");
         rs=ps.executeQuery();
         if(rs==null)
         {
             JOptionPane.showMessageDialog(null,"Record not inserted in user");
             
         }
         if(rs!=null)
         {
             ps=conn.prepareStatement("insert into hr values(?,?,?,?)");
             ps.setString(1, hr.getHrId());
             ps.setString(2,hr.getMobileNo());
             ps.setString(3, hr.getCompanyName());
             
             ps.setString(4,hr.getProfeesion());
             rs=ps.executeQuery();
             if(rs!=null)
             {
                 return 1;
             }
             else
                 JOptionPane.showMessageDialog(null,"Record not inserted in hr");
           }
        return -1;
        
    }
    
    
    public  static List<HrPojo> allHrList()throws SQLException
            
    {
        
    List <HrPojo> allHrList=new ArrayList<>();
    Connection conn=DbConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select hr.hrid,users.userId,users.name,hr.phone,hr.companyname from hr,users where hr.hrid=users.id order by id");
   
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
        HrPojo row=new HrPojo();
        row.setHrId(rs.getString(1));
        row.setUserId(rs.getString(2));
        row.setHrName(rs.getString(3));
        row.setMobileNo(rs.getString(4));
        row.setCompanyName(rs.getString(5));
      allHrList.add(row);
       
        
        
    }
    return allHrList;
    
    
    }
     public static List<HrPojo> getAllActiveHr() throws SQLException
     {
         List<HrPojo> allHrList=new ArrayList<>();
         Connection conn=DbConnection.getConnection();
        
           PreparedStatement ps=conn.prepareStatement("select hr.hrid,users.userId,users.name,hr.phone,hr.companyname from hr,users where hr.hrid=users.id and active='Y' order by id ");
   
    ResultSet rs=ps.executeQuery();
    
         while(rs.next())
         {
             HrPojo hr=new HrPojo();
             hr.setHrId(rs.getString(1));
             hr.setUserId(rs.getString(2));
             hr.setMobileNo(rs.getString(4));
             hr.setHrName(rs.getString(3));
             hr.setCompanyName(rs.getString(5));
           
             allHrList.add(hr);
         }
       
         return allHrList;
         
     }
     public static  String getCompanyNameByHrId(String hrid)throws SQLException
     {
         Connection conn=DbConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("select companyname from hr where hrid=?");
         ps.setString(1, hrid);
         ResultSet rs=ps.executeQuery();
        rs.next();
        return rs.getString(1);
        
     }
    




}
