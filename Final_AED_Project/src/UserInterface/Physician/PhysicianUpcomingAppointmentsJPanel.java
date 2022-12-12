/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

import Business.Doctor.Doctor;
import UserInterface.Patient.*;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.Patient.PatientDetails;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PhysicianRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pushk
 */
public class PhysicianUpcomingAppointmentsJPanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;

    /**
     * Creates new form PatientUpcomingAppointmentsJPanel
     */
    public PhysicianUpcomingAppointmentsJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        this.populateTable();
        
    }

    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<WorkRequest> appointmentList = account.getWorkQueue().getWorkRequestList();
        
        ArrayList<WorkRequest> upcomingAppointmentList = new ArrayList();
        for(WorkRequest w: appointmentList) {
            if(w.getStatus().equals("physician accepted")) {
                upcomingAppointmentList.add(w);
            }
        }
        
    
        int rowCount = jTable4.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(WorkRequest w: upcomingAppointmentList) {
            Object row[] = new Object[5];
        
            PhysicianRequest pr = (PhysicianRequest) w;
            
            Patient p = (Patient) this.business.getUserAccountDirectory().getUserById(pr.getSender().getId()).getDetails();
            Doctor d = (Doctor) this.account.getDetails();
        
            row[0] = p.getName();
            row[1] = d.getDepartment().getHospital().getName();
            row[2] = pr;
            row[3] = pr.getTime();
            //row[4] = pr.getAppointmentDate();
            
            model.addRow(row);
            
            
        }     
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        completeBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(248, 226, 205));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 32)); // NOI18N
        jLabel4.setText("Upcoming Appointment");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 58));

        jTable4.setBackground(new java.awt.Color(215, 215, 215));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient", "Hospital", "Date Requested", "Time Slot"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 730, 183));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cancel Appointment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 180, 30));

        completeBtn.setBackground(new java.awt.Color(0, 0, 0));
        completeBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        completeBtn.setForeground(new java.awt.Color(255, 255, 255));
        completeBtn.setText("Complete Appointment");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });
        jPanel4.add(completeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        int rowCount = jTable4.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        WorkRequest request = (WorkRequest) jTable4.getValueAt(rowCount, 2);
        
        request.setStatus("physician canceled");
        
        JOptionPane.showMessageDialog(null, "Appointment canceled");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        // TODO add your handling code here:
        
        
        int rowCount = jTable4.getSelectedRow();
        
        if(rowCount < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        WorkRequest request = (WorkRequest) jTable4.getValueAt(rowCount, 2);
        request.setResolveDate(new Date());
        request.setStatus("Physician appointment completed");
        
        Patient  p = (Patient) request.getSender().getDetails();
        Doctor d = (Doctor) account.getDetails();
        
        PatientDetails newDetails = new PatientDetails(d, new Date(), "");
        p.getPatientDetails().add(newDetails);
        
        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel(CardLayoutJPanel, newDetails, this.account);
        CardLayoutJPanel.add("PatientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
        
    }//GEN-LAST:event_completeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
