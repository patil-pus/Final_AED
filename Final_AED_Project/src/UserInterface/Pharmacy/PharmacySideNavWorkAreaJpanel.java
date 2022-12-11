/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy;

import UserInterface.Patient.*;
import UserInterface.Lab.*;
import Business.DB4OUtil.DB4OUtil;
import UserInterface.HospitalAdmin.*;
import Business.Department.Department;
import UserInterface.SystemAdmin.*;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Lab.Lab;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

  
 

public class PharmacySideNavWorkAreaJpanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Patient patient;
    Lab lab;
    UserAccount account;
    Ecosystem business;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
   
    private Pharmacy pharmacy;
    /**
     * Creates new form MedicalCareWorkAreaJpanel
     */
   
     public PharmacySideNavWorkAreaJpanel(JPanel userProcessContainer, UserAccount account, Ecosystem business) {

       initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        
        this.pharmacy = (Pharmacy) account.getDetails();
        


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pastPrescriptionsBtn = new javax.swing.JButton();
        prescriptionsBtn = new javax.swing.JButton();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1800, 900));

        systemAdminPanel.setBackground(new java.awt.Color(215, 81, 81));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1780, Short.MAX_VALUE)
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2424, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Pharmacy !!");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 30));

        pastPrescriptionsBtn.setBackground(new java.awt.Color(204, 204, 204));
        pastPrescriptionsBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        pastPrescriptionsBtn.setText("Past Prescriptions");
        pastPrescriptionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastPrescriptionsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(pastPrescriptionsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, 40));

        prescriptionsBtn.setBackground(new java.awt.Color(204, 204, 204));
        prescriptionsBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        prescriptionsBtn.setText("Prescriptions");
        prescriptionsBtn.setMaximumSize(new java.awt.Dimension(200, 40));
        prescriptionsBtn.setMinimumSize(new java.awt.Dimension(200, 40));
        prescriptionsBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        prescriptionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(prescriptionsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/BKG3_1.jpg"))); // NOI18N
        rightSystemAdminPanel.add(jLabel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(systemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 2446, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(systemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prescriptionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionsBtnActionPerformed
        // TODO add your handling code here:
        PendingPrescriptionsJPanel pendingPrescriptionsJPanel = new PendingPrescriptionsJPanel(rightSystemAdminPanel, account, this.pharmacy, business);
        rightSystemAdminPanel.add("PastPrescriptionsJPanel", pendingPrescriptionsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
        
    }//GEN-LAST:event_prescriptionsBtnActionPerformed

    private void pastPrescriptionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastPrescriptionsBtnActionPerformed
        // TODO add your handling code here:
        PastPrescriptionsJPanel pastPrescriptionsJPanel = new PastPrescriptionsJPanel(rightSystemAdminPanel, account, this.pharmacy);
        rightSystemAdminPanel.add("PastPrescriptionsJPanel", pastPrescriptionsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
    }//GEN-LAST:event_pastPrescriptionsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton pastPrescriptionsBtn;
    private javax.swing.JButton prescriptionsBtn;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
