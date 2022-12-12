/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DepartmentAdmin;

import Business.Department.Department;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.ManageSlotsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Saad Ghojaria
 */
public class DepartmentInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentInfoJPanel
     */
    
    private JPanel CardLayoutJPanel;
    private Department viewDepartment;


    public DepartmentInfoJPanel(JPanel CardLayoutJPanel, Department viewDepartment) {

        initComponents();
        
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.nameTxt.setText(viewDepartment.getDepartmentName());
        this.adminTxt.setText(viewDepartment.getDepartmentAdminName());
        
        this.viewDepartment = viewDepartment;
        
        this.nameTxt.setEnabled(false);
        this.adminTxt.setEnabled(false);
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
        backBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adminTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Department Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 550, 42));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        UpdateBtn.setBackground(new java.awt.Color(0, 0, 0));
        UpdateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 80, -1));

        saveBtn.setBackground(new java.awt.Color(0, 0, 0));
        saveBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Department Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 150, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Department Admin Name: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        add(adminTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
       
        this.nameTxt.setEnabled(true);
        this.adminTxt.setEnabled(true);
        
        this.saveBtn.setEnabled(true);

        this.UpdateBtn.setEnabled(false);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

      
        viewDepartment.setDepartmentName(nameTxt.getText());
        viewDepartment.setDepartmentAdminName(adminTxt.getText());
       

       
        this.nameTxt.setEnabled(false);
        this.adminTxt.setEnabled(false);
       

        this.saveBtn.setEnabled(false);
        this.UpdateBtn.setEnabled(true);

    }//GEN-LAST:event_saveBtnActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField adminTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
