/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Manufacturer.Manufacturer;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminManufacturerNewJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class ViewManufacturer extends javax.swing.JPanel {

    /**
     * Creates new form ViewManufacturer
     */
    private JPanel CardLayoutJPanel;
    String manufacturer;
    private UserAccount account;
    private Ecosystem business;
    public ViewManufacturer( JPanel CardLayoutJPanel,Ecosystem business, String manufacturer)
    {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account=account;                      /* UserAccount account,Ecosystem business*/
        this.manufacturer = manufacturer;
        for(Manufacturer m : business.getManufacturerDirectory().getManufacturerList()){
            if(m.getManuId().equalsIgnoreCase(manufacturer)){
                this.TxtName.setText(m.getManuName());
                this.TxtContact.setText(m.getPhoneNumber());
                this.Txtemail.setText(m.getEmailAddress());
            }
            
        }
    
       
        
        this.TxtName.setEnabled(false);
        this.TxtContact.setEnabled(false);
        this.Txtemail.setEnabled(false);
        this.Savebtn.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtContact = new javax.swing.JTextField();
        Savebtn = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Txtemail = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manufacturer Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone number:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });
        add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, -1));
        add(TxtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, -1));

        Savebtn.setBackground(new java.awt.Color(0, 0, 0));
        Savebtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Savebtn.setForeground(new java.awt.Color(255, 255, 255));
        Savebtn.setText("Save");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });
        add(Savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 70, -1));

        Backbtn.setBackground(new java.awt.Color(0, 0, 0));
        Backbtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Backbtn.setForeground(new java.awt.Color(255, 255, 255));
        Backbtn.setText("Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-mail:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 20));
        add(Txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 170, -1));

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manufacturer Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        

      /*m.setManuName(TxtName.getText());
      m.setPhoneNumber(TxtContact.getText());
      manufacturer.setEmailAddress(Txtemail.getText());*/
      
      for(Manufacturer m : business.getManufacturerDirectory().getManufacturerList()){
            if(m.getManuId().equalsIgnoreCase(manufacturer)){
                m.setManuName(TxtName.getText());
                m.setPhoneNumber(TxtContact.getText());
                m.setEmailAddress(Txtemail.getText());
            }
             
        }
    
        
        
        this.TxtName.setEnabled(false);
        this.TxtContact.setEnabled(false);
        this.Txtemail.setEnabled(false);
        this.Savebtn.setEnabled(false);
       
        this.updateBtn.setEnabled(true);

    }//GEN-LAST:event_SavebtnActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        SystemAdminManufacturerNewJPanel addmanu = new SystemAdminManufacturerNewJPanel(CardLayoutJPanel, business,account);
        CardLayoutJPanel.add("AddManufacturerJPanel", addmanu);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        this.TxtName.setEnabled(true);
        this.TxtContact.setEnabled(true);
        this.Txtemail.setEnabled(true);
        this.Savebtn.setEnabled(true);
       
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton Savebtn;
    private javax.swing.JTextField TxtContact;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField Txtemail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
