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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import scatnp_DbUtil.DbConnection;
import scatnp_pojo.CurrentUser;
import scatnp_pojo.JobPojo;

/**
 *
 * @author LENOVO
 */
public class JobDao {
     public  static int getJobId()throws SQLException
     {
         int jobId=101;
         Connection conn=DbConnection.getConnection();
       
         Statement st=conn.createStatement();
         ResultSet rs=st.executeQuery("select max(jobId) from jobs");
         
         
         if(rs.next())
         {
             String Id=rs.getString(1);
             if(Id!=null)
             {
                 Id=Id.substring(3);
             
            
             jobId=Integer.parseInt(Id);
            
             jobId++;
             return jobId;
             }
             
             
         }
         
         return jobId;
         
     }
     
     public static boolean addNewJobs(JobPojo job) throws SQLException
     {
         Connection conn=DbConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("insert into jobs values(?,?,?,?,?)");
         ps.setString(1,job.getJobId());
         ps.setString(2,job.getJobTitle());
         ps.setString(3,job.getHrId());
         ps.setString(4,job.getTags());
         ps.setString(5,String.valueOf(job.getStatus()));
         
         ResultSet rs=ps.executeQuery();
         if(rs.next())
         {
             return true;
             
         }
         else
             return false;
         
         
     }
      public static List<JobPojo>getAllActiveJobs(String hrId)throws SQLException
      {
       List<JobPojo> allJobs=new ArrayList<>();
       Connection conn=DbConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("select jobId,jobTitle,tags,status from jobs where status='0' and hrid=?");
       ps.setString(1, hrId);
       
       ResultSet rs=ps.executeQuery();
       
       while(rs.next())
       {
           JobPojo job=new JobPojo();
           job.setHrId(CurrentUser.getId());
           job.setJobId(rs.getString(1));
           job.setJobTitle(rs.getString(2));
           job.setTags(rs.getString(3));
           job.setStatus(rs.getInt(4));
           allJobs.add(job);
           
       }
       return allJobs;
      }
      public static boolean removeJobByJobId(String JobId)throws SQLException
      {
          Connection conn=DbConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("update jobs set status='-1' where jobid=?");
          ps.setString(1, JobId);
          ResultSet rs=ps.executeQuery();
          
          if(rs.next())
          return true;
          else
              return false;
      }
      public static List<JobPojo>getAllEditableJobByCurrentHr(String hrId)throws SQLException
      {
          List<JobPojo> allJobs =new ArrayList();
          Connection conn=DbConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status=0  ");
          
          ps.setString(1, hrId);
          ResultSet rs=ps.executeQuery();
          while(rs.next())
          {
              JobPojo job =new JobPojo();
            job.setJobId(rs.getString(1));
           job.setJobTitle(rs.getString(2));
             job.setTags(rs.getString(3));
            job.setStatus(rs.getInt(4));
            allJobs.add(job);
            
              
          }
            
          return allJobs;
      }
      
      
     public static boolean editJobByJobId(JobPojo job)throws SQLException
     {
         Connection conn=DbConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("update jobs set jobtitle=?,tags=?   where jobid=? and status=0");
         ps.setString(1, job.getJobTitle());
         ps.setString(2, job.getTags());
         ps.setString(3,job.getJobId());
        int rs=ps.executeUpdate();
         if(rs!=-1)
             return true;
         return false;
         
     }
     public void setJobStatus(String jobId) throws SQLException
     {
         Connection conn=DbConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("update jobs set status=1 where jobId=?");
         ps.setString(1, jobId);
         int res=ps.executeUpdate();
         if(res!=-1)
         {
             JOptionPane.showMessageDialog(null,"Status of Job updated");
         }
         else
         {
          JOptionPane.showMessageDialog(null,"Status of Job Not updated");   
         }
      
     }
     
}
