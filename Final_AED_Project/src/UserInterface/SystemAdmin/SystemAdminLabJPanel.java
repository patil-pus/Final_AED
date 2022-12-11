/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Lab.Lab;
import Business.Lab.LabDirectory;
import UserInterface.Lab.CreateLabJPanel;
import UserInterface.Lab.LabInfoJpanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UserInterface.Lab.LabInfoJpanel;

/**
 *
 * @author pushk
 */

public class SystemAdminLabJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminLabJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;

    SystemAdminLabJPanel(JPanel CardLayoutJPanel, Ecosystem business) {

         initComponents();
         
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        populateTable();

    }
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Lab> labList = new ArrayList();
        labList.addAll(business.getLabDirectory().getNeurologyLabs());
        labList.addAll(business.getLabDirectory().getOrthopedicLabs());
        labList.addAll(business.getLabDirectory().getPathologyLabs());
    
        int rowCount = labTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)labTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Lab l : labList) {
            Object row[] = new Object[6];
            row[0] = l;
            row[1] = l.getLabID();
            row[2] = l.getPhoneNo();
            row[3] = l.getAddress();
            row[4] = l.getEmailId();
            row[5] = l.getType();
          
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

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        createLabBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewHospitalBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(850, 540));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/icons8-back-arrow-24.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 30, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LAB PORTAL ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        labTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Lab name", "Lab Id", "Contact Number", "Address", "Email", "Type"
            }
        ));
        jScrollPane1.setViewportView(labTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 760, 190));

        refreshBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 190, 40));

        createLabBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        createLabBtn.setText("Sign up New Lab");
        createLabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLabBtnActionPerformed(evt);
            }
        });
        add(createLabBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 190, 40));

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        deleteBtn.setText("Delete Existing Lab");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 190, 40));

        viewHospitalBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        viewHospitalBtn.setText("View Details");
        viewHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHospitalBtnActionPerformed(evt);
            }
        });
        add(viewHospitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 190, 40));

        jLabel2.setBackground(new java.awt.Color(138, 194, 211));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/cover1.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1180, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void createLabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLabBtnActionPerformed
        // TODO add your handling code here:
        CreateLabJPanel createLabJPanel = new CreateLabJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("CreateLabJPanel", createLabJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_createLabBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = labTable.getSelectedRow();
        Lab selected = (Lab) labTable.getValueAt(row, 0);

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LabDirectory labDirectory = business.getLabDirectory();

        business.getLabDirectory().deleteLab(selected.getLabID(), selected.getType(), business);

        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHospitalBtnActionPerformed
        // TODO add your handling code here:

        int row = labTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //System.out.println("=========== >> " + labTable.getValueAt(row, 0));

        Lab viewLab = (Lab) labTable.getValueAt(row, 0);

        LabInfo1Jpanel labInfo1JPanel = new LabInfo1Jpanel(CardLayoutJPanel, viewLab);
        CardLayoutJPanel.add("LabInfo1JPanel", labInfo1JPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewHospitalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createLabBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewHospitalBtn;
    // End of variables declaration//GEN-END:variables
}
