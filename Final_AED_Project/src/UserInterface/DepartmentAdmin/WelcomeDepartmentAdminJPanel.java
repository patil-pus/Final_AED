/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DepartmentAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.Department.Department;
import UserInterface.Patient.*;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.ManagePhysicianJPanel;
import UserInterface.LoginJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import UserInterface.Patient.PatientInfoJPanel;

/**
 *
 * @author pranavkulkarni
 */
public class WelcomeDepartmentAdminJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    
    private Department department;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form WelcomePatientJPanel
     */
    public WelcomeDepartmentAdminJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        this.department = (Department) this.account.getDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        deptInformation = new javax.swing.JButton();
        managePhysicianBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Department Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 46));

        deptInformation.setBackground(new java.awt.Color(204, 204, 204));
        deptInformation.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deptInformation.setText("Department Information");
        deptInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptInformationActionPerformed(evt);
            }
        });
        add(deptInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 50));

        managePhysicianBtn.setBackground(new java.awt.Color(204, 204, 204));
        managePhysicianBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        managePhysicianBtn.setText("Manage Physicians");
        managePhysicianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePhysicianBtnActionPerformed(evt);
            }
        });
        add(managePhysicianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 230, 50));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        logOutBtn.setBackground(new java.awt.Color(204, 204, 204));
        logOutBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        logOutBtn.setText("Logout");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });
        add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void managePhysicianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePhysicianBtnActionPerformed
        // TODO add your handling code here:
        ManagePhysicianJPanel managePhysicianJPanel = new ManagePhysicianJPanel(CardLayoutJPanel, this.department.getHospital(), this.department, this.business, this.account);
        CardLayoutJPanel.add("ManagePhysicianJPanel", managePhysicianJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_managePhysicianBtnActionPerformed

    private void deptInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptInformationActionPerformed
        // TODO add your handling code here:
        DepartmentInfoJPanel departmentInfoJPanel = new DepartmentInfoJPanel(CardLayoutJPanel, this.department);
        CardLayoutJPanel.add("DepartmentInfoJPanel", departmentInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_deptInformationActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(business);
        LoginJPanel loginJPanel = new LoginJPanel(CardLayoutJPanel, business,"");
        CardLayoutJPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_logOutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deptInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton managePhysicianBtn;
    // End of variables declaration//GEN-END:variables
}
