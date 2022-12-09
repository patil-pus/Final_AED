/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import UserInterface.HospitalAdmin.*;
import Business.Department.Department;
import Business.Doctor.Doctor;
import UserInterface.SystemAdmin.*;
import Business.Ecosystem;
import Business.Hospital.Hospital;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class DoctorSideNavWorkAreaJpanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Ecosystem business;
    UserAccount account;
    Hospital hospital;
    Doctor doctor;
    /**
     * Creates new form MedicalCareWorkAreaJpanel
     */
    public DoctorSideNavWorkAreaJpanel(JPanel userProcessContainer, UserAccount account, 
             Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.doctor = (Doctor) account.getDetails();
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
        appointmentsBtn = new javax.swing.JButton();
        patientHistorybtn = new javax.swing.JButton();
        createPrescriptionbtn = new javax.swing.JButton();
        labTestRequestBtn = new javax.swing.JButton();
        personalInfoBtn1 = new javax.swing.JButton();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1800, 900));

        systemAdminPanel.setBackground(new java.awt.Color(215, 81, 81));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1788, Short.MAX_VALUE)
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1019, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Doctor portal");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        appointmentsBtn.setBackground(new java.awt.Color(204, 204, 204));
        appointmentsBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        appointmentsBtn.setText("Appointments");
        appointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentsBtnActionPerformed(evt);
            }
        });
        jPanel3.add(appointmentsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, 40));

        patientHistorybtn.setBackground(new java.awt.Color(204, 204, 204));
        patientHistorybtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        patientHistorybtn.setText("Patient History");
        patientHistorybtn.setMaximumSize(new java.awt.Dimension(200, 40));
        patientHistorybtn.setMinimumSize(new java.awt.Dimension(200, 40));
        patientHistorybtn.setPreferredSize(new java.awt.Dimension(200, 40));
        patientHistorybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientHistorybtnActionPerformed(evt);
            }
        });
        jPanel3.add(patientHistorybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        createPrescriptionbtn.setBackground(new java.awt.Color(204, 204, 204));
        createPrescriptionbtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        createPrescriptionbtn.setText("Prescriptions");
        createPrescriptionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPrescriptionbtnActionPerformed(evt);
            }
        });
        jPanel3.add(createPrescriptionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 40));

        labTestRequestBtn.setBackground(new java.awt.Color(204, 204, 204));
        labTestRequestBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        labTestRequestBtn.setText("Request Lab Test");
        labTestRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labTestRequestBtnActionPerformed(evt);
            }
        });
        jPanel3.add(labTestRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        personalInfoBtn1.setBackground(new java.awt.Color(204, 204, 204));
        personalInfoBtn1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        personalInfoBtn1.setText("Personal Information");
        personalInfoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalInfoBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(personalInfoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 200, 40));

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

    private void createPrescriptionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPrescriptionbtnActionPerformed
        // TODO add your handling code here:
        CreatePrescriptionJPanel createPrescriptionJPanel = new CreatePrescriptionJPanel( rightSystemAdminPanel,account, business, this.doctor);
        rightSystemAdminPanel.add("CreatePrescriptionJPanel", createPrescriptionJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
    }//GEN-LAST:event_createPrescriptionbtnActionPerformed

    private void patientHistorybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientHistorybtnActionPerformed
         SearchJPanel searchJPanel = new SearchJPanel(rightSystemAdminPanel, this.doctor, this.account, business);
        rightSystemAdminPanel.add("SearchPatientJPanel", searchJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
    }//GEN-LAST:event_patientHistorybtnActionPerformed

    private void appointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentsBtnActionPerformed
        // TODO add your handling code here:
        PhysicianAppointmentsJPanel physicianAppointmentsJPanel = new PhysicianAppointmentsJPanel(rightSystemAdminPanel, account, business);
        rightSystemAdminPanel.add("PhysicianAppointmentsJPanel", physicianAppointmentsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_appointmentsBtnActionPerformed

    private void labTestRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labTestRequestBtnActionPerformed
        // TODO add your handling code here:
        CreateLabTestRequestJPanel createLabTestRequestJPanel = new CreateLabTestRequestJPanel( rightSystemAdminPanel,account, business, this.doctor);
        rightSystemAdminPanel.add("CreateLabTestRequestJPanel", createLabTestRequestJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_labTestRequestBtnActionPerformed

    private void personalInfoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalInfoBtn1ActionPerformed
        // TODO add your handling code here:
        PhysicianInfoJPanel physicianInfoJPanel = new PhysicianInfoJPanel(rightSystemAdminPanel, this.doctor);
        rightSystemAdminPanel.add("PhysicianInfoJPanel", physicianInfoJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
    }//GEN-LAST:event_personalInfoBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentsBtn;
    private javax.swing.JButton createPrescriptionbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton labTestRequestBtn;
    private javax.swing.JButton patientHistorybtn;
    private javax.swing.JButton personalInfoBtn1;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
