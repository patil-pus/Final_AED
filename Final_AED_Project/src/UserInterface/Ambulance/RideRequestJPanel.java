/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Ambulance;

import Business.Ambulance.Ambulance;
import Business.Ecosystem;
import Business.Patient.Patient;
import Business.SOSRequest.SOSRequests;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminAmbulanceJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pranavkulkarni
 */
public class RideRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RideRequestJPanel
     */
    JPanel CardLayoutJPanel;
    Ecosystem business;
    Ambulance ambulance;
    UserAccount account;
    Patient patient;
    public RideRequestJPanel(JPanel CardLayoutJPanel,Ecosystem business,UserAccount account,Ambulance ambulance) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        this.ambulance = (Ambulance) account.getDetails();
        this.populateSOSTable();
    }
    public void populateSOSTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) sosreq.getModel();
        
        tablemodel.setRowCount(0);
        
       
        for (Ambulance ambu: business.getAmbulancefleet().getAmbulanceFleet()) {
           
            if (ambu.getUsername().equals(account.getUsername())) {
                //System.out.println(restro.getOrderList());
               for(SOSRequests req: ambu.getSosreq()){
                Object[] row = new Object[8];
                row[0] = req.getRequestId();
                row[1] = req.getAmbulanceId();
                row[2] = req.getAmbuBaseLocation();
                row[3] = req.getAmbulancePhoneNo();
                row[4] = req.getPatientName();
                row[5] = req.getPatientAddr();
                row[6] = req.getPatientPhone();
                row[7] = req.getReqStatus();
                tablemodel.addRow(row); 
               }
                
            }
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        sosreq = new javax.swing.JTable();
        UpdateStatus = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sosreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REQUEST ID", "AMBULANCE ID", "AMBU LOCATION", "AMBU CONTACT", "PATIENT NAME", "PATIENT ADDR", "PATIENT CONTACT", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sosreq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 840, 320));

        UpdateStatus.setBackground(new java.awt.Color(0, 0, 0));
        UpdateStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateStatus.setForeground(new java.awt.Color(255, 255, 255));
        UpdateStatus.setText("Update Status");
        UpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStatusActionPerformed(evt);
            }
        });
        add(UpdateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 110, -1));

        RefreshBtn.setBackground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });
        add(RefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 80, -1));

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStatusActionPerformed
       int row = sosreq.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
          
           String reqId;
           reqId= (String) sosreq.getValueAt(row, 0);
                
                 UpdateStatusJPanel updateStatusJPanel =new UpdateStatusJPanel(CardLayoutJPanel,business,account,patient ,reqId, ambulance);
                 CardLayoutJPanel.add("UpdateStatusPanel",updateStatusJPanel);
                 CardLayout layout=(CardLayout)CardLayoutJPanel.getLayout();
                 layout.next(CardLayoutJPanel);
        }
    }//GEN-LAST:event_UpdateStatusActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
       populateSOSTable();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        AmbulanceWorkAreaJPanel updateStatusJPanel =new AmbulanceWorkAreaJPanel(CardLayoutJPanel,account,business);
        CardLayoutJPanel.add("UpdateStatusPanel",updateStatusJPanel);
        CardLayout layout=(CardLayout)CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
               
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton UpdateStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sosreq;
    // End of variables declaration//GEN-END:variables
}
