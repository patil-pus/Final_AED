/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.Lab.Lab;
import Business.WorkQueue.LabTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saad Ghojaria
 */
public class TestInformationJPanel extends javax.swing.JPanel {
    
    JPanel CardLayoutJPanel;
    Lab lab;

    /**
     * Creates new form TestInformationJPanel
     */
    public TestInformationJPanel(JPanel CardLayoutJPanel, Lab lab) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.lab = lab;
        
        populateTable();
    }
    
    public void populateTable() {
        
        
        // populate all patients in patient directory
        ArrayList<String> tests = lab.getTests();
     
    
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(String w: tests) {
            Object row[] = new Object[1];
            row[0] = w;
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(138, 194, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Tests"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 170, 450, 150));

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, -1));

        addBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        addBtn.setText("Add ");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 180, 40));

        removeBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        removeBtn.setText("Delete");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String newTest = JOptionPane.showInputDialog("Please enter the new test");
        
        if(newTest != null) {
           lab.getTests().add(newTest);
           populateTable();
        }
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = jTable1.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        lab.getTests().remove(jTable1.getValueAt(selectedRow, 0));
        populateTable();
        
        
    }//GEN-LAST:event_removeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}
