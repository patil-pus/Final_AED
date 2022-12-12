/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Department.Department;
import Business.Ecosystem;
import Business.Hospital.Hospital;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pushk
 */

public class MedicalCareWorkAreaJpanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Ecosystem business;
     UserAccount account;
    /**
     * Creates new form MedicalCareWorkAreaJpanel
     */
    public MedicalCareWorkAreaJpanel(JPanel userProcessContainer, UserAccount account, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account=account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        hospitalPortalBtn = new javax.swing.JButton();
        manageManu = new javax.swing.JButton();
        labbtn = new javax.swing.JButton();
        pharmacyBtn1 = new javax.swing.JButton();
        manageAMBULANCE1 = new javax.swing.JButton();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1800, 900));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hospitalPortalBtn.setBackground(new java.awt.Color(204, 204, 204));
        hospitalPortalBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        hospitalPortalBtn.setText("Manage Hospital ");
        hospitalPortalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalPortalBtnActionPerformed(evt);
            }
        });
        jPanel3.add(hospitalPortalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, 40));

        manageManu.setBackground(new java.awt.Color(204, 204, 204));
        manageManu.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        manageManu.setText("Manage Manufacturer");
        manageManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageManuActionPerformed(evt);
            }
        });
        jPanel3.add(manageManu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 40));

        labbtn.setBackground(new java.awt.Color(204, 204, 204));
        labbtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        labbtn.setText("Manage Labs");
        labbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labbtnActionPerformed(evt);
            }
        });
        jPanel3.add(labbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 40));

        pharmacyBtn1.setBackground(new java.awt.Color(204, 204, 204));
        pharmacyBtn1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        pharmacyBtn1.setText("Pharmacy Portal");
        pharmacyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(pharmacyBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        manageAMBULANCE1.setBackground(new java.awt.Color(204, 204, 204));
        manageAMBULANCE1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        manageAMBULANCE1.setText("Manage Ambulance");
        manageAMBULANCE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAMBULANCE1ActionPerformed(evt);
            }
        });
        jPanel3.add(manageAMBULANCE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 200, 40));

        rightSystemAdminPanel.setBackground(new java.awt.Color(138, 194, 211));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(138, 194, 211));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/cover1.jpeg"))); // NOI18N
        rightSystemAdminPanel.add(jLabel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1211, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pharmacyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyBtn1ActionPerformed
        // TODO add your handling code here:
        SystemAdminPharmacyJPanel systemAdminPharmacyJPanel = new SystemAdminPharmacyJPanel(rightSystemAdminPanel, business);
        rightSystemAdminPanel.add("SystemAdminPharmacyJPanel", systemAdminPharmacyJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_pharmacyBtn1ActionPerformed

    private void labbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labbtnActionPerformed
        // TODO add your handling code here:
        SystemAdminLabJPanel systemAdminLabJPanel = new SystemAdminLabJPanel(rightSystemAdminPanel, business);
        rightSystemAdminPanel.add("SystemAdminLabJPanel", systemAdminLabJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_labbtnActionPerformed

    private void manageManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageManuActionPerformed
        SystemAdminManufacturerNewJPanel systemAdminManufacturerJPanel = new SystemAdminManufacturerNewJPanel(rightSystemAdminPanel, business,account);
        rightSystemAdminPanel.add("SystemAdminLabJPanel", systemAdminManufacturerJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
      
    }//GEN-LAST:event_manageManuActionPerformed

    private void hospitalPortalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalPortalBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminHospitalPortalJPanel systemAdminHospitalPortalJPanel = new SystemAdminHospitalPortalJPanel(rightSystemAdminPanel, business);
        rightSystemAdminPanel.add("SystemAdminHospitalPortalJPanel", systemAdminHospitalPortalJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_hospitalPortalBtnActionPerformed

    private void manageAMBULANCE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAMBULANCE1ActionPerformed
        SystemAdminAmbulanceJPanel  systemAdminAmbulanceJPanel = new  SystemAdminAmbulanceJPanel(rightSystemAdminPanel, business);
        rightSystemAdminPanel.add("SystemAdminHospitalPortalJPanel",  systemAdminAmbulanceJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_manageAMBULANCE1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hospitalPortalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton labbtn;
    private javax.swing.JButton manageAMBULANCE1;
    private javax.swing.JButton manageManu;
    private javax.swing.JButton pharmacyBtn1;
    private javax.swing.JPanel rightSystemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
