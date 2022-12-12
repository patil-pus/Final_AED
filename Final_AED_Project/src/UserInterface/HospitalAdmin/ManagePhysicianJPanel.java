/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import UserInterface.Physician.PhysicianInfoJPanel;
import Business.Department.Department;
import Business.Doctor.Doctor;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.CreatePhysicianJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srushtidesai
 */
public class ManagePhysicianJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePhysicianJPanel
     */
    private JPanel CardLayoutJPanel;
    private Hospital hospital;
    private Department department;
    private Ecosystem business;
    UserAccount account;
    public ManagePhysicianJPanel() {
        initComponents();
    }

    public ManagePhysicianJPanel(JPanel CardLayoutJPanel, Hospital hospital, Department department, Ecosystem business,UserAccount account) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.hospital = hospital;
        this.department = department;
        this.business = business;
        
        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        physicianTable = new javax.swing.JTable();
        createPhysiciansBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewPhysicianBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Doctors");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 300, -1));

        physicianTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Physician ID", "Physician Name", "Contact Number", "Gender", "Email ID", "License Number"
            }
        ));
        jScrollPane1.setViewportView(physicianTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 710, 180));

        createPhysiciansBtn.setBackground(new java.awt.Color(204, 204, 204));
        createPhysiciansBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        createPhysiciansBtn.setText("Add ");
        createPhysiciansBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPhysiciansBtnActionPerformed(evt);
            }
        });
        add(createPhysiciansBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 100, 30));

        deleteBtn.setBackground(new java.awt.Color(204, 204, 204));
        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 100, 30));

        viewPhysicianBtn.setBackground(new java.awt.Color(204, 204, 204));
        viewPhysicianBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        viewPhysicianBtn.setText("View ");
        viewPhysicianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPhysicianBtnActionPerformed(evt);
            }
        });
        add(viewPhysicianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 100, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createPhysiciansBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPhysiciansBtnActionPerformed
        // TODO add your handling code here:
        CreatePhysicianJPanel createPhysicianJPanel = new CreatePhysicianJPanel(CardLayoutJPanel, business,hospital);
        CardLayoutJPanel.add("createPhysicianJPanel", createPhysicianJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_createPhysiciansBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = physicianTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Doctor selectedDoctor = (Doctor) physicianTable.getValueAt(row, 1);
        
        selectedDoctor.getDepartment().deleteDoctor(selectedDoctor.getDoctorId(), business);
       
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Doctor> doctorList = new ArrayList();
        if(department == null) {
           for(Department d : this.hospital.getDepartmentDirectory()) {
                doctorList.addAll(d.getDoctorDirectory());
            } 
        } else {
            doctorList.addAll(this.department.getDoctorDirectory());
        }
        int rowCount = physicianTable.getRowCount();
        
        DefaultTableModel model = (DefaultTableModel)physicianTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Department d: this.hospital.getDepartmentDirectory()){
            for(Doctor doc: d.getDoctorDirectory()) {
                Object row[] = new Object[6];
                    row[0] = doc.getDoctorId();
                    row[1] = doc.getName();
                    row[2] = doc.getPhoneNo();
                    row[3] = doc.getGender();
                    row[4] = doc.getEmailId();
                    row[5] = doc.getLicenseNo();
                model.addRow(row);
            }
        }
        
        for(Doctor d : doctorList) {
            Object row[] = new Object[6];
            row[0] = d.getDoctorId();
            row[1] = d;
            row[2] = d.getPhoneNo();
            row[3] = d.getGender();
            row[4] = d.getEmailId();
            row[5] = d.getLicenseNo();
           
            model.addRow(row);
        }
    }
    
    private void viewPhysicianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPhysicianBtnActionPerformed
        // TODO add your handling code here:
        int row = physicianTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Doctor viewDoctor = (Doctor) physicianTable.getValueAt(row, 1);
        PhysicianInfoJPanel physicianInfoJPanel = new PhysicianInfoJPanel(CardLayoutJPanel, viewDoctor);
        CardLayoutJPanel.add("physicianInfoJPanel", physicianInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewPhysicianBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createPhysiciansBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable physicianTable;
    private javax.swing.JButton viewPhysicianBtn;
    // End of variables declaration//GEN-END:variables
}
