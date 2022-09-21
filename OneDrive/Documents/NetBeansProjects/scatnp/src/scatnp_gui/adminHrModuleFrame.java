/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatnp_gui;

import scatnp_pojo.CurrentUser;



/**
 *
 * @author LENOVO
 */
public class adminHrModuleFrame extends javax.swing.JFrame {

    /**
     * Creates new form hrframe
     */
    public adminHrModuleFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUser.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminHrModulePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnAddHr = new javax.swing.JButton();
        btnRemoveHr = new javax.swing.JButton();
        btnModifyHr = new javax.swing.JButton();
        btnViewAllHr = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        imgHr = new javax.swing.JLabel();
        imgRemoveHr = new javax.swing.JLabel();
        imgModifyHr = new javax.swing.JLabel();
        imgViewHr = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        imgWorldMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Welcome ,");

        lblName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnAddHr.setBackground(new java.awt.Color(204, 204, 255));
        btnAddHr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAddHr.setText("Add New HR");
        btnAddHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHrActionPerformed(evt);
            }
        });

        btnRemoveHr.setBackground(new java.awt.Color(204, 204, 255));
        btnRemoveHr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRemoveHr.setText("Remove HR");
        btnRemoveHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveHrActionPerformed(evt);
            }
        });

        btnModifyHr.setBackground(new java.awt.Color(204, 204, 255));
        btnModifyHr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModifyHr.setText("Modify HR");
        btnModifyHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyHrActionPerformed(evt);
            }
        });

        btnViewAllHr.setBackground(new java.awt.Color(204, 204, 255));
        btnViewAllHr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnViewAllHr.setText("View All HR");
        btnViewAllHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllHrActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(204, 204, 255));
        btnLogOut.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        imgHr.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\addNewEmp.png")); // NOI18N

        imgRemoveHr.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\Remove-Emp.png")); // NOI18N

        imgModifyHr.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\modify-emp.png")); // NOI18N

        imgViewHr.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\viewAllHr.png")); // NOI18N

        imgLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\transparent logo.png")); // NOI18N

        imgWorldMap.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Desktop\\images\\pngs\\hrimages\\World-Map.png")); // NOI18N

        javax.swing.GroupLayout adminHrModulePanelLayout = new javax.swing.GroupLayout(adminHrModulePanel);
        adminHrModulePanel.setLayout(adminHrModulePanelLayout);
        adminHrModulePanelLayout.setHorizontalGroup(
            adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminHrModulePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imgWorldMap, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imgHr, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAddHr, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnRemoveHr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(imgRemoveHr, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                        .addGap(38, 38, 38)
                                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnModifyHr, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(imgModifyHr))
                                        .addGap(42, 42, 42)
                                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imgViewHr, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnViewAllHr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59))))
                            .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminHrModulePanelLayout.setVerticalGroup(
            adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgWorldMap, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(imgModifyHr, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imgRemoveHr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgHr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddHr)
                            .addComponent(btnRemoveHr)
                            .addComponent(btnModifyHr)
                            .addComponent(btnViewAllHr))
                        .addGap(85, 85, 85)
                        .addGroup(adminHrModulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnLogOut))
                        .addGap(0, 0, 0))
                    .addGroup(adminHrModulePanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(imgViewHr, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminHrModulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adminHrModulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveHrActionPerformed
        // TODO add your handling code here:
        AdminHrRemoveFrame hr=new AdminHrRemoveFrame();
        hr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRemoveHrActionPerformed

    private void btnAddHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHrActionPerformed
        // TODO add your handling code here:
        AdminAddNewHrFrame hr=new AdminAddNewHrFrame();
        hr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAddHrActionPerformed

    private void btnViewAllHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllHrActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdminViewAllHRFrame admin=new AdminViewAllHRFrame();
        admin.setVisible(true);
    }//GEN-LAST:event_btnViewAllHrActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        adminOptionFrame admin=new adminOptionFrame();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        loginframe fr=new loginframe();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnModifyHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyHrActionPerformed
        // TODO add your handling code here:
      AdminModifyHrFrame fr=new AdminModifyHrFrame();
        fr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnModifyHrActionPerformed

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
            java.util.logging.Logger.getLogger(adminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHrModuleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminHrModulePanel;
    private javax.swing.JButton btnAddHr;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnModifyHr;
    private javax.swing.JButton btnRemoveHr;
    private javax.swing.JButton btnViewAllHr;
    private javax.swing.JLabel imgHr;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgModifyHr;
    private javax.swing.JLabel imgRemoveHr;
    private javax.swing.JLabel imgViewHr;
    private javax.swing.JLabel imgWorldMap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
