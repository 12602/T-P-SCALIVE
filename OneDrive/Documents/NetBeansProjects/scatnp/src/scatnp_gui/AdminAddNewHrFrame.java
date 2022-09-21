/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatnp_gui;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import scatnp_Dao.HrDao;
import scatnp_pojo.HrPojo;


/**
 *
 * @author LENOVO
 */
public class AdminAddNewHrFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminAddNewHrFrame
     */
   
  
    
    
    private String password;
    private String confrmPwd;
    public AdminAddNewHrFrame() {
        initComponents();
        Color c=new Color(0,0,0,1);
        txtName.setBackground(c);
        txtMob.setBackground(c);
        txtCompany.setBackground(c);
        txtMail.setBackground(c);
        txtPwd.setBackground(c);
        txtCnfrmPwd.setBackground(c);
       
        this.setLocationRelativeTo(null);
        loadId();
    }
         private void loadId(){
        try{
            int hrId=HrDao.getHrId();
           lblHrId.setText("Hr-"+hrId);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error In Generating HrID",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
       
         private boolean validateInputs(){
        password=String.valueOf(txtPwd.getPassword());
        confrmPwd=String.valueOf(txtCnfrmPwd.getPassword());
        int index=jcProff.getSelectedIndex();
        if(txtName.getText().isEmpty()||txtMail.getText().isEmpty()||txtMob.getText().isEmpty()||txtCompany.getText().isEmpty()||password.isEmpty()||confrmPwd.isEmpty()||index==0)
            return false;
        return true;
    }
    private boolean matchPasswords(){
        return password.equals(confrmPwd);
    }
             private void clearAll()
    {
        txtName.setText("");
        txtMail.setText("");
        txtCompany.setText("");
        txtMob.setText("");
        txtPwd.setText("");
        txtCnfrmPwd.setText("");
        jcProff.setSelectedIndex(0);
    }

       
        
    
   
              
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtMob = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        txtCnfrmPwd = new javax.swing.JPasswordField();
        jcProff = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddNewHr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        lblHrId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 293, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtName.setOpaque(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 332, 260, 30));

        txtMob.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMob.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMob.setOpaque(false);
        jPanel2.add(txtMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 270, 40));

        txtMail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtMail.setOpaque(false);
        jPanel2.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 250, 40));

        txtPwd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPwd.setOpaque(false);
        txtPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwdActionPerformed(evt);
            }
        });
        jPanel2.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 260, 40));

        txtCnfrmPwd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCnfrmPwd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCnfrmPwd.setOpaque(false);
        txtCnfrmPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnfrmPwdActionPerformed(evt);
            }
        });
        jPanel2.add(txtCnfrmPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 260, 40));

        jcProff.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jcProff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Proffesion", "Technical", "Developer", "FrontEnd", "SDE", " " }));
        jPanel2.add(jcProff, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 270, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Email");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 206, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Mobile No:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 386, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("PassWord");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 493, 209, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setText("Confirm Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 223, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\World-Map.png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 74, 818, 111));

        btnBack.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 229, -1));

        btnAddNewHr.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnAddNewHr.setText("Add New Hr");
        btnAddNewHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewHrActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddNewHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 194, 44));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setText("Company Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 203, -1, -1));

        txtCompany.setBackground(new java.awt.Color(240, 240, 240));
        txtCompany.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtCompany.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCompany.setOpaque(false);
        jPanel2.add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 207, 160, -1));

        lblHrId.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblHrId.setEnabled(false);
        jPanel2.add(lblHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 203, 182, 22));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("HrId:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 203, 63, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\transparent logo.png")); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setText("Proffesion In");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 206, -1));

        btnLogout.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnLogout.setText("LogOut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 176, -1));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 210, 54));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 232, 182, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 236, 202, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 36));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 130, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 290, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 290, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 290, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\tg_image_915734271.png")); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 280, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewHrActionPerformed
        // TODO add your handling code here:
        
        if(validateInputs()==false){
           JOptionPane.showMessageDialog(null,"Please input all the fields","Error!",JOptionPane.ERROR_MESSAGE);
           return;
        }
        if(matchPasswords()==false){
            JOptionPane.showMessageDialog(null,"Passwords do not match!","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            HrPojo hr=new HrPojo();
            hr.setUserId(txtMail.getText().trim().toUpperCase());
            hr.setHrId(lblHrId.getText().trim());
            hr.setHrName(txtName.getText().trim());
            hr.setCompanyName(txtCompany.getText().trim());
            hr.setPassword(password);
            hr.setProfeesion(jcProff.getSelectedItem().toString());
            hr.setMobileNo(txtMob.getText().trim());
            hr.setType("Hr");
            int result=HrDao.addNewHr(hr);
            if(result==1){
                
                JOptionPane.showMessageDialog(null,"Record Added!","Success!",JOptionPane.INFORMATION_MESSAGE);
                clearAll();
                loadId();
                return;
            }
            else if(result==-1){
                JOptionPane.showMessageDialog(null,"This Email Id Is Already Registered","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else{
                JOptionPane.showMessageDialog(null,"Cannot add the record","Error!",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
         catch(SQLException ex){
          JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
         }  
        
               

    }//GEN-LAST:event_btnAddNewHrActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        adminHrModuleFrame admin=new adminHrModuleFrame();
        admin.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        loginframe fr=new loginframe();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwdActionPerformed

    private void txtCnfrmPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnfrmPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnfrmPwdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
    
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
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddNewHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddNewHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewHr;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JComboBox<String> jcProff;
    private javax.swing.JLabel lblHrId;
    private javax.swing.JPasswordField txtCnfrmPwd;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMob;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
