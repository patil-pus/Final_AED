/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Physician;

/**
 *
 * @author Atharva
 */

import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Lab.Lab;
import Business.Patient.Patient;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestRequest;
import Business.WorkQueue.PharmacyRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CreateLabTestRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateLabTestRequestJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Doctor doctor;
    private Object hospitalNameComboBox;
    
    
    CreateLabTestRequestJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business, Doctor doctor) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.account=account;
        this.business = business;
        
        populateLabComboBox();

        populatePatientComboBox();

    }
 public ArrayList<Patient> getAssociatedPatients() {
        Set<String> patientIdSet = new HashSet<>();
        ArrayList<Patient> list = new ArrayList();
        
        ArrayList<WorkRequest> workRequestOfDoctor = this.account.getWorkQueue().getWorkRequestList();
        
        for(WorkRequest w: workRequestOfDoctor) {
            String patientId = w.getSender().getId();
            
            if(!patientId.equals(this.account.getId()) && !patientIdSet.contains(patientId)) {
                list.add((Patient) w.getSender().getDetails());
                patientIdSet.add(patientId);
            }
            
        }
        
        return list;
        
    }
    
    public void populateLabComboBox() {
        
        ArrayList<Lab> labList = new ArrayList();
        labList.addAll(business.getLabDirectory().getNeurologyLabs());
        labList.addAll(business.getLabDirectory().getOrthopedicLabs());
        labList.addAll(business.getLabDirectory().getPathologyLabs());
       
        Lab[] comboBoxModel4 = labList.toArray(new Lab[0]);
        
        
        labListComboBox.setModel(new DefaultComboBoxModel<Lab>(comboBoxModel4));
        

        
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
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        patientjComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        labListComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        testListComboBox = new javax.swing.JComboBox<>();
        sendRequestBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE LAB TEST REQUEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 530, 42));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Patient ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 70, 30));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 60, -1));

        add(patientjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 232, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Lab:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 128, -1));

        labListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labListComboBoxActionPerformed(evt);
            }
        });
        add(labListComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 232, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Test:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 128, -1));

        testListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testListComboBoxActionPerformed(evt);
            }
        });
        add(testListComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 232, -1));

        sendRequestBtn1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        sendRequestBtn1.setText("Send Request");
        sendRequestBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestBtn1ActionPerformed(evt);
            }
        });
        add(sendRequestBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void labListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labListComboBoxActionPerformed
        // TODO add your handling code here:
        Lab selected = (Lab) labListComboBox.getSelectedItem();
        for(String test : selected.getTests()) {
            testListComboBox.addItem(test);
        }
        
        
        
        
    }//GEN-LAST:event_labListComboBoxActionPerformed

    private void testListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testListComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testListComboBoxActionPerformed

    private void sendRequestBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestBtn1ActionPerformed
        // TODO add your handling code here:
        
        Patient patient = (Patient) patientjComboBox.getSelectedItem();
        Lab lab = (Lab) labListComboBox.getSelectedItem();
        String test = (String) testListComboBox.getSelectedItem();       


        if(patient == null || lab == null || test == null) {
            JOptionPane.showMessageDialog(null, "Please select all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LabTestRequest newRequest = new LabTestRequest();
        newRequest.setSender(account);
        newRequest.setPatient(patient);
        newRequest.setReceiver(this.business.getUserAccountDirectory().getUserById(lab.getLabID()));
        newRequest.setStatus("pending lab approval");
        newRequest.setRequestDate(new Date());

        this.business.getUserAccountDirectory().getUserById(lab.getLabID()).getWorkQueue().getWorkRequestList().add(newRequest);
        this.account.getWorkQueue().getWorkRequestList().add(newRequest);
        this.business.getUserAccountDirectory().getUserById(patient.getPatientID()).getWorkQueue().getWorkRequestList().add(newRequest);

        JOptionPane.showMessageDialog(null, "Request sent to Lab for Test");

        

    }//GEN-LAST:event_sendRequestBtn1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<Lab> labListComboBox;
    private javax.swing.JComboBox<Patient> patientjComboBox;
    private javax.swing.JButton sendRequestBtn1;
    private javax.swing.JComboBox<String> testListComboBox;
    // End of variables declaration//GEN-END:variables

    private void populatePatientComboBox() {

        
        ArrayList<Patient> list = this.getAssociatedPatients();
        Patient[] comboBoxModel4 = list.toArray(new Patient[0]);
    
        patientjComboBox.setModel(new DefaultComboBoxModel<Patient>(comboBoxModel4));
        

    }

}
