/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Ambulance.Ambulance;
import Business.Ambulance.AmbulanceFleet;
import Business.Ecosystem;
import Business.Hospital.Hospital;
import UserInterface.Ambulance.AmbulanceInfoJPanel;
import UserInterface.Ambulance.CreateAmbulanceJPanel;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pushk
 */

public class SystemAdminAmbulanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminAmbulanceJPanel
     */
    private JPanel CardLayoutJPanel;
    private Ecosystem business;
    

    SystemAdminAmbulanceJPanel(JPanel CardLayoutJPanel, Ecosystem business) {

        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.populateTable();

    }
    public void populateTable() {
        // populate all patients in patient directory
        ArrayList<Ambulance> ambulanceList = business.getAmbulancefleet().getAmbulanceFleet();
    
        int rowCount = ambulanceTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)ambulanceTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Ambulance amb : ambulanceList) {
            Object row[] = new Object[5];
            row[0] = amb;
            row[1] = amb.getDriverName();
            row[2] = amb.getPhoneNo();
            row[3] = amb.getBaseLocation();
            row[4] = amb.getLicenseNo();
           
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
        ambulanceTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        createAmbulanceBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewAmbulanceBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 50, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MANAGE AMBULANCE ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        ambulanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ambulance Id", "Driver Name", "Contact Number", "Base Location", "License Number"
            }
        ));
        jScrollPane1.setViewportView(ambulanceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 770, 260));

        refreshBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 200, 40));

        createAmbulanceBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        createAmbulanceBtn.setText("Add ");
        createAmbulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAmbulanceBtnActionPerformed(evt);
            }
        });
        add(createAmbulanceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 200, 40));

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 200, 40));

        viewAmbulanceBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        viewAmbulanceBtn.setText("View");
        viewAmbulanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAmbulanceBtnActionPerformed(evt);
            }
        });
        add(viewAmbulanceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 579, 200, 40));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(138, 194, 211));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/cover1.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1180, 790));
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

    private void createAmbulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAmbulanceBtnActionPerformed
        // TODO add your handling code here:
        CreateAmbulanceJPanel createAmbulanceJPanel = new CreateAmbulanceJPanel(CardLayoutJPanel, business);
        CardLayoutJPanel.add("CreateAmbulanceJPanel", createAmbulanceJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_createAmbulanceBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int row = ambulanceTable.getSelectedRow();
        Ambulance selectedAmb = (Ambulance) ambulanceTable.getValueAt(row, 0);

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        AmbulanceFleet ambulanceFleet = business.getAmbulancefleet();
        
        business.getAmbulancefleet().deleteAmbulance(selectedAmb.getAmbulanceId(), business);

        
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void viewAmbulanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAmbulanceBtnActionPerformed
        // TODO add your handling code here:

        int row = ambulanceTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        System.out.println("=========== >> " + ambulanceTable.getValueAt(row, 0));

        Ambulance viewAmbulance = (Ambulance) ambulanceTable.getValueAt(row, 0);

        AmbulanceInfoJPanel ambulanceInfoJPanel = new AmbulanceInfoJPanel(CardLayoutJPanel, viewAmbulance);
        CardLayoutJPanel.add("AmbulanceInfoJPanel", ambulanceInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_viewAmbulanceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ambulanceTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createAmbulanceBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewAmbulanceBtn;
    // End of variables declaration//GEN-END:variables
}
