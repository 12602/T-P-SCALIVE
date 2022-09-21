/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatnp_gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import scatnp_Dao.UserDao;
import scatnp_pojo.CurrentUser;
import scatnp_pojo.HrPojo;


/**
 *
 * @author LENOVO
 */
public class AdminModifyHrFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminModifyHrFrame
     */
      public AdminModifyHrFrame(){
        initComponents();
        this.setLocationRelativeTo(null);
        lblname.setText(CurrentUser.getName());
        Color c=new Color(0,0,0,1);
        
        txtcnfrmpwd.setBackground(c);
        txtcnfrmpwd.setBackground(c);
        txtHrId.setBackground(c);
      loadData();
            
    }
      private void loadData()
      {
          //very important method
          
          
          try
          {
          Map<String ,HrPojo>allHr=UserDao.getAllHrbyUserId();
          //map return all the keys in the from of the set;
          Set<String>keys=allHr.keySet();
          //first add the value in combobox then with the help of combobox we select username and hrid in their field
          for(String id:keys)
          {
              //for adding item in jcombobox we ad additem 
              jcUserId.addItem(id);
              
          }
          
          }
          catch(SQLException sq)
          {
              JOptionPane.showMessageDialog(null,"Db Error","Error",JOptionPane.ERROR_MESSAGE);
              
              sq.printStackTrace();
          }
          
      }
      private boolean validatePwd(String pwd,String cnfpwd)
      {
          if(pwd.equals(cnfpwd))
              return true;
          return false;
      }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcUserId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtHrId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        lblHrName = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcnfrmpwd = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\transparent logo.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 163, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\World-Map.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 104, 850, 106));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Welcome,");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 249, 99, -1));

        lblname.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel2.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 249, 118, 26));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("User Id:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 342, 232, 27));

        jcUserId.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jcUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcUserIdActionPerformed(evt);
            }
        });
        jPanel2.add(jcUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 382, 232, 34));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("Hr Name-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 510, 222, 10));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setText("Hr Id:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 279, 27));

        txtHrId.setEditable(false);
        txtHrId.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtHrId.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtHrId.setOpaque(false);
        jPanel2.add(txtHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 250, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("New Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 210, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 233, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 656, 890, 20));

        btnBack.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 218, 42));

        btnModify.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnModify.setText("Modify Changes Of  Hr");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel2.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 670, 269, 43));

        btnLogOut.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 224, 43));

        lblHrName.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel2.add(lblHrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 158, 26));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 282, 226, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 310, -1));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, -1));

        txtcnfrmpwd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtcnfrmpwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtcnfrmpwd.setOpaque(false);
        jPanel2.add(txtcnfrmpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 250, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 290, 70));

        txtpwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtpwd.setOpaque(false);
        txtpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwdActionPerformed(evt);
            }
        });
        jPanel2.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 260, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcUserIdActionPerformed
        // TODO add your handling code here:
        try
        {
            
        
              String userId=jcUserId.getSelectedItem().toString();
             HrPojo hr= UserDao.getSelectedHrValues(userId);
             lblHrName.setText(hr.getHrName());
             txtHrId.setText(hr.getHrId());
             
        }   
         catch(SQLException sq)
          {
              JOptionPane.showMessageDialog(null,"Db Error","Error",JOptionPane.ERROR_MESSAGE);
              
              sq.printStackTrace();
          }
       

    }//GEN-LAST:event_jcUserIdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        adminHrModuleFrame fr=new adminHrModuleFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        loginframe fr=new loginframe();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
      try
      {
          if(validatePwd(txtcnfrmpwd.getText(),txtcnfrmpwd.getText())==false)
                  {
                       JOptionPane.showMessageDialog(null,"Password Not Matched!!","Password Not Matched",JOptionPane.INFORMATION_MESSAGE);
                       return;
                      
                  }
         boolean res= UserDao.changePassword(jcUserId.getSelectedItem().toString(),txtcnfrmpwd.getText());
          if(res==true)
          {
              JOptionPane.showMessageDialog(null,"Password changed Succesfully!!","Password Changed",JOptionPane.INFORMATION_MESSAGE);
              return;
          }
          else
          {
               JOptionPane.showMessageDialog(null,"Password not changed !!","Password Not  Changed",JOptionPane.INFORMATION_MESSAGE);
               return;
          }
      }
      catch(SQLException sq)
      {
          JOptionPane.showMessageDialog(null,"Password not changed Db Error!!","Password Not  Changed",JOptionPane.ERROR_MESSAGE);
          sq.printStackTrace();
          return;
      }
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void txtpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminModifyHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcUserId;
    private javax.swing.JLabel lblHrName;
    private javax.swing.JLabel lblname;
    private javax.swing.JTextField txtHrId;
    private javax.swing.JPasswordField txtcnfrmpwd;
    private javax.swing.JPasswordField txtpwd;
    // End of variables declaration//GEN-END:variables
}
