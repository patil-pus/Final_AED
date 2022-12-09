/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.Patient.Patient;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pushk
 */
public class PatientInfoJPanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    Patient patient;
    

    /**
     * Creates new form PatientInfoJPanel
     */
    public PatientInfoJPanel(JPanel CardLayoutJPanel, Patient patient) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        
        this.patient = patient;
        
        this.addressTxt.setText(patient.getAddress());
        this.ageTxt.setText(patient.getAge());
        this.idTxt.setText(patient.getPatientID());
        this.nameTxt.setText(patient.getName());
        this.numberTxt.setText(patient.getPhoneNo());
        this.bloodGroupTxt.setText(patient.getBloodGroup());
        this.genderComboBox.setSelectedItem(patient.getGender());
        this.emailTxt.setText(patient.getEmailId());
       this.addressTxt.setEnabled(false);
       this.emailTxt.setEnabled(false);
       this.idTxt.setEnabled(false);
       this.nameTxt.setEnabled(false);
       this.numberTxt.setEnabled(false);
       this.ageTxt.setEnabled(false);
       this.bloodGroupTxt.setEnabled(false);
       this.genderComboBox.setEnabled(false);
       
       this.saveBtn.setEnabled(false);
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
        nameTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        numberTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        bloodGroupTxt = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(138, 194, 211));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1969, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PATIENT INFORMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 221, -1));
        add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 220, 30));
        add(numberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 221, 30));

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 220, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Id:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email id:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 207, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact number:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 221, 30));

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 130, -1));

        UpdateBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 130, -1));

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 111, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, 15));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Blood Group:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 220, 30));
        add(bloodGroupTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 221, -1));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "female", "male", "other" }));
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 221, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
       this.addressTxt.setEnabled(true);
       this.emailTxt.setEnabled(true);
       this.nameTxt.setEnabled(true);
       this.numberTxt.setEnabled(true);
       this.ageTxt.setEnabled(true);
       this.bloodGroupTxt.setEnabled(true);
       this.genderComboBox.setEnabled(true);
       this.saveBtn.setEnabled(true);
       this.UpdateBtn.setEnabled(false);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        patient.setAddress(addressTxt.getText());
        patient.setEmailId(emailTxt.getText());
        patient.setName(nameTxt.getText());
        patient.setPhoneNo(numberTxt.getText());
        patient.setAge(ageTxt.getText());
        patient.setBloodGroup(bloodGroupTxt.getText());
        patient.setGender(genderComboBox.getSelectedItem().toString());
        
        
       this.addressTxt.setEnabled(false);
       this.emailTxt.setEnabled(false);
       this.idTxt.setEnabled(false);
       this.nameTxt.setEnabled(false);
       this.numberTxt.setEnabled(false);
       this.ageTxt.setEnabled(false);
       this.bloodGroupTxt.setEnabled(false);
       this.genderComboBox.setEnabled(false);
       
       
       this.saveBtn.setEnabled(false);
       
       this.UpdateBtn.setEnabled(true);
        
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bloodGroupTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
