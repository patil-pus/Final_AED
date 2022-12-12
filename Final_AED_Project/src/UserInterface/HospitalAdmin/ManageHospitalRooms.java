/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import Business.Ecosystem;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;

import Business.Rooms.Rooms;
import Business.UserAccount.UserAccount;
import UserInterface.Rooms.UpdateRoom;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pranavkulkarni
 */
public class ManageHospitalRooms extends javax.swing.JPanel {

    /**
     * Creates new form Manage Hospital Rooms
     */
    JPanel CardLayoutJPanel;
    private Ecosystem business;
    private UserAccount account;
    private Hospital hospital;
    
   
    int id;
    String RoomType;
    String RoomStatus;
    int rooms_quan;
    int rooms_quan_updated;
    public ManageHospitalRooms(JPanel CardLayoutJPanel,Ecosystem business,UserAccount account) {
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.business=business;
        this.account=account;
        this.hospital=(Hospital) this.account.getDetails();
        this.populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txtrooms = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        UpdateQuan = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 226, 205));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 226, 205));

        RoomsTable.setBackground(new java.awt.Color(215, 215, 215));
        RoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room ID", "Room Type", "Number of Rooms", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RoomsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, 420));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Manage Rooms");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 270, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Room Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Number of rooms:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 30));

        Txtrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtroomsActionPerformed(evt);
            }
        });
        add(Txtrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "ICU", "ICCU", "NICU", "PICU", "CCU", "ER", "MICU", "SICU", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 130, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 80, -1));

        UpdateQuan.setBackground(new java.awt.Color(0, 0, 0));
        UpdateQuan.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        UpdateQuan.setForeground(new java.awt.Color(255, 255, 255));
        UpdateQuan.setText("Update ");
        UpdateQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateQuanActionPerformed(evt);
            }
        });
        add(UpdateQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 90, -1));

        deletebtn.setBackground(new java.awt.Color(0, 0, 0));
        deletebtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Room Status:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Occupied" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 130, -1));

        Refresh.setBackground(new java.awt.Color(0, 0, 0));
        Refresh.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        Refresh.setForeground(new java.awt.Color(255, 255, 255));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TxtroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtroomsActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        RoomType =  (String) jComboBox1.getSelectedItem();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Rooms newRoom = new Rooms();
        newRoom.setRoomType(RoomType);
        rooms_quan = Integer.parseInt(Txtrooms.getText());
        newRoom.setRoomQuantity(rooms_quan);
        newRoom.setRoomStatus(RoomStatus);
        newRoom.setHospital(hospital);
        hospital.addRooms(newRoom);
        populateTable();
        JOptionPane.showMessageDialog(null, "Room Added");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
      
       int i = RoomsTable.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
        hospital.removeRoom(i);
        populateTable();
        }
        
             
        
        
  
    }//GEN-LAST:event_deletebtnActionPerformed

    private void UpdateQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateQuanActionPerformed
        int row = RoomsTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int viewRoom = (int) RoomsTable.getValueAt(row, 0);
      

        UpdateRoom labInfo1JPanel = new UpdateRoom(CardLayoutJPanel,business, account,viewRoom, hospital);
        CardLayoutJPanel.add("UpdateRoomStatus", labInfo1JPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
        
        
        
    }//GEN-LAST:event_UpdateQuanActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        RoomStatus =  (String) jComboBox2.getSelectedItem();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JTable RoomsTable;
    private javax.swing.JTextField Txtrooms;
    private javax.swing.JButton UpdateQuan;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       
                
        int rowCount = RoomsTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)RoomsTable.getModel();
    
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Rooms r : hospital.getRoomDirectory() ) {
            Object row[] = new Object[4];
            row[0] = r.getSerialNo();
            row[1] = r.getRoomType();
            row[2] = r.getRoomQuantity();
            row[3] = r.getRoomStatus();
            
            model.addRow(row);
        }
    }
}
