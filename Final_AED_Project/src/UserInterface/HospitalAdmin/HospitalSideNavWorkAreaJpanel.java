/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import Business.Department.Department;
import UserInterface.SystemAdmin.*;
import Business.Ecosystem;
import Business.Hospital.Hospital;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author srushtidesai
 */
public class HospitalSideNavWorkAreaJpanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Ecosystem business;
    UserAccount account;
    Hospital hospital;
    /**
     * Creates new form MedicalCareWorkAreaJpanel
     */
    public HospitalSideNavWorkAreaJpanel(JPanel userProcessContainer, UserAccount account, 
             Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
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
        manageDoctorsbtn = new javax.swing.JButton();
        editHospitalInfo = new javax.swing.JButton();
        manageDepartments = new javax.swing.JButton();
        managePatientsBtn1 = new javax.swing.JButton();
        ManageRooms = new javax.swing.JButton();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1800, 900));

        systemAdminPanel.setBackground(new java.awt.Color(0, 51, 51));
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
        jLabel3.setText("Hospital Admin!");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 120, 30));

        manageDoctorsbtn.setBackground(new java.awt.Color(204, 204, 204));
        manageDoctorsbtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        manageDoctorsbtn.setText("Manage Doctors");
        manageDoctorsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDoctorsbtnActionPerformed(evt);
            }
        });
        jPanel3.add(manageDoctorsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 40));

        editHospitalInfo.setBackground(new java.awt.Color(204, 204, 204));
        editHospitalInfo.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        editHospitalInfo.setText("Edit Information");
        editHospitalInfo.setMaximumSize(new java.awt.Dimension(200, 40));
        editHospitalInfo.setMinimumSize(new java.awt.Dimension(200, 40));
        editHospitalInfo.setPreferredSize(new java.awt.Dimension(200, 40));
        editHospitalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHospitalInfoActionPerformed(evt);
            }
        });
        jPanel3.add(editHospitalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        manageDepartments.setBackground(new java.awt.Color(204, 204, 204));
        manageDepartments.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        manageDepartments.setText("Manage Departments");
        manageDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDepartmentsActionPerformed(evt);
            }
        });
        jPanel3.add(manageDepartments, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 40));

        managePatientsBtn1.setBackground(new java.awt.Color(204, 204, 204));
        managePatientsBtn1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        managePatientsBtn1.setText("Manage Patients");
        managePatientsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientsBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(managePatientsBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 40));

        ManageRooms.setBackground(new java.awt.Color(204, 204, 204));
        ManageRooms.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        ManageRooms.setText("Manage Rooms");
        ManageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRoomsActionPerformed(evt);
            }
        });
        jPanel3.add(ManageRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 40));

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

    private void manageDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDepartmentsActionPerformed
        // TODO add your handling code here:
        HospitalManageDepartmentJPanel hmdJPanel = new HospitalManageDepartmentJPanel(rightSystemAdminPanel, account, business);
        rightSystemAdminPanel.add("HospitalManageJPanel", hmdJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_manageDepartmentsActionPerformed

    private void editHospitalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHospitalInfoActionPerformed
        // TODO add your handling code here:
        HospitalInfoJPanel hospitalInfoJpanel  = new HospitalInfoJPanel(rightSystemAdminPanel, account, business);
        rightSystemAdminPanel.add("SystemAdminPatientPortalJPanel", hospitalInfoJpanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_editHospitalInfoActionPerformed

    private void manageDoctorsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDoctorsbtnActionPerformed
        // TODO add your handling code here:
        Department dpt = new Department();
        hospital = (Hospital) this.account.getDetails();
        ManagePhysicianJPanel systemAdminHospitalPortalJPanel = new ManagePhysicianJPanel(rightSystemAdminPanel, hospital, dpt, business,account);
        rightSystemAdminPanel.add("SystemAdminHospitalPortalJPanel", systemAdminHospitalPortalJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_manageDoctorsbtnActionPerformed

    private void managePatientsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientsBtn1ActionPerformed
        SystemAdminPatientPortalJPanel systemAdminPatientPortalJPanel  = new  SystemAdminPatientPortalJPanel(rightSystemAdminPanel, business);
        rightSystemAdminPanel.add("SystemAdminInventoryJPanel", systemAdminPatientPortalJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_managePatientsBtn1ActionPerformed

    private void ManageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRoomsActionPerformed
        // TODO add your handling code here:
        ManageRooms mngr = new ManageRooms(rightSystemAdminPanel, business,account);
        rightSystemAdminPanel.add("Managerooms", mngr);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_ManageRoomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageRooms;
    private javax.swing.JButton editHospitalInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageDepartments;
    private javax.swing.JButton manageDoctorsbtn;
    private javax.swing.JButton managePatientsBtn1;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
