/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatnp_DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class DbConnection {
    public static Connection conn ;
       static
       {
           try
           {
             Class.forName("oracle.jdbc.OracleDriver");
                 conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-3JDRGG3:1521/xe","project","abc");
               
              
                    
            
           }
           catch(Exception sq)
           {
           JOptionPane.showMessageDialog(null,"Exception in opning connection to the db!!!");
               
           }
       
    
    }
     public static Connection getConnection() {
        return conn;
    }
    
}
