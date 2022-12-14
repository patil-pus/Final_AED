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
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyRequest;
import Business.WorkQueue.PhysicianRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pushk
 */
public class PhysicianPatientMedicationsJPanel1 extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;
    Patient patient;

    /**
     * Creates new form PatientUpcomingAppointmentsJPanel
     */
    public PhysicianPatientMedicationsJPanel1(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business, Patient patient) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        this.patient = patient;
        
        this.populateTable();
        
    }

    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<WorkRequest> appointmentList = account.getWorkQueue().getWorkRequestList();
        
        Set<String> pharmacyIds = new HashSet();
        for(Pharmacy ph : this.business.getPharmacyDirectory().getPharmacyList()) {
            pharmacyIds.add(ph.getPharmacyId());
        }
        
        ArrayList<PharmacyRequest> upcomingAppointmentList = new ArrayList();
        for(WorkRequest w: appointmentList) {
            
            if(w.getSender().getId().equals(account.getId()) && pharmacyIds.contains(w.getReceiver().getId())) {
               PharmacyRequest pr = (PharmacyRequest) w;
              if(pr.getPatient().getPatientID().equals(patient.getPatientID())) {
                upcomingAppointmentList.add(pr);
                
              }  
            }
            
           
        }
        
    
        int rowCount = jTable4.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(PharmacyRequest w: upcomingAppointmentList) {
            Object row[] = new Object[5];
        
            Patient p = w.getPatient();
            Doctor d = (Doctor) this.account.getDetails();
        
            row[0] = business.getUserAccountDirectory().getUserById(w.getReceiver().getId());
            row[1] = w;
            row[2] = w.getResolveDate();
            row[3] = w.getStatus();
            row[4] = w.getMessage();
            
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

        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setBackground(new java.awt.Color(248, 226, 205));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 32)); // NOI18N
        jLabel4.setText("Patient Medications");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 58));

        jTable4.setBackground(new java.awt.Color(215, 215, 215));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pharmacy", "Date Requested", "Date Completed", "Status", "Prescription Details"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 630, 120));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
