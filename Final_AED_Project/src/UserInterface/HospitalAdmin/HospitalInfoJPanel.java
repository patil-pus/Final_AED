package UserInterface.HospitalAdmin;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranavkulkarni
 */
public class HospitalInfoJPanel extends javax.swing.JPanel {

    private JPanel CardLayoutJPanel;
    private Hospital hospital;
    private UserAccount account;
    private Ecosystem business;
    /**
     * Creates new form HospitalInfoJPanel
     */
    
    HospitalInfoJPanel(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business=business;
        this.account=account;
        this.hospital = business.getHospitalDirectory().getHospital(TOOL_TIP_TEXT_KEY);
        
        /*this.addressTxt.setText(hospital.getAddress());
        this.nameTxt.setText(hospital.getName());
        this.idTxt.setText(hospital.getHospitalId());
        this.adminTxt.setText(hospital.getAdminName());
        this.contactNumberTxt.setText(hospital.getPhoneNo());
        this.licenseTxt.setText(hospital.getLicenseNo());
        */
        
       this.addressTxt.setEnabled(false);
       this.nameTxt.setEnabled(false);
       this.adminTxt.setEnabled(false);
       this.idTxt.setEnabled(false);
       this.contactNumberTxt.setEnabled(false);
       this.licenseTxt.setEnabled(false);
       this.saveBtn.setEnabled(false);
        

        for (Hospital hos : business.getHospitalDirectory().getHospitalList()) {
            
            if (hos.getHospitalId().equalsIgnoreCase(account.getId())) {
                this.hospital = hos;
                
            }  }
        
        if (hospital == null) {
            System.out.println("=====nulll");
        }  else { 
        
        idTxt.setText(hospital.getHospitalId());
        nameTxt.setText(hospital.getName());
        adminTxt.setText(hospital.getAdminName());
        addressTxt.setText(hospital.getAddress());
        contactNumberTxt.setText(hospital.getPhoneNo());
        licenseTxt.setText(hospital.getLicenseNo());
    
    }
    }
    

    public HospitalInfoJPanel(JPanel CardLayoutJPanel, Hospital viewHospital) {

        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        
        this.hospital = viewHospital;
        
        this.addressTxt.setText(hospital.getAddress());
        this.nameTxt.setText(hospital.getName());
        this.idTxt.setText(hospital.getHospitalId());
        this.adminTxt.setText(hospital.getAdminName());
        this.contactNumberTxt.setText(hospital.getPhoneNo());
        this.licenseTxt.setText(hospital.getLicenseNo());
        
       this.addressTxt.setEnabled(false);
       this.nameTxt.setEnabled(false);
       this.adminTxt.setEnabled(false);
       this.idTxt.setEnabled(false);
       this.contactNumberTxt.setEnabled(false);
       this.licenseTxt.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contactNumberTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adminTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        licenseTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(138, 194, 211));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOSPITAL INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 480, 42));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hospital Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hospital ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, 30));
        jPanel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 150, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        jPanel1.add(contactNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 150, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        jPanel1.add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 150, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hospital Admin Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        jPanel1.add(adminTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 150, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("License Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));
        jPanel1.add(licenseTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 150, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 380));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, -1));

        UpdateBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 120, -1));

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
       
       hospital.setAddress(addressTxt.getText());
       hospital.setName(nameTxt.getText());
       hospital.setAdminName(adminTxt.getText());
       hospital.setPhoneNo(contactNumberTxt.getText());
       hospital.setLicenseNo(licenseTxt.getText());
       
       
       this.addressTxt.setEnabled(false);
       this.nameTxt.setEnabled(false);
       this.adminTxt.setEnabled(false);
       this.contactNumberTxt.setEnabled(false);
       this.licenseTxt.setEnabled(false);
       
       this.saveBtn.setEnabled(false);
       this.UpdateBtn.setEnabled(true);
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
       this.addressTxt.setEnabled(true);
       this.nameTxt.setEnabled(true);
       this.adminTxt.setEnabled(true);
       this.contactNumberTxt.setEnabled(true);
       this.licenseTxt.setEnabled(true);
       
       this.saveBtn.setEnabled(true);

       this.UpdateBtn.setEnabled(false);
    }//GEN-LAST:event_UpdateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField adminTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField contactNumberTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField licenseTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
