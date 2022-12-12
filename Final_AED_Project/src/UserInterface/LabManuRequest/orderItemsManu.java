/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabManuRequest;

import Business.Ecosystem;
import Business.Items.Item;
import Business.Manufacturer.Manufacturer;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pushk
 */
public class orderItemsManu extends javax.swing.JPanel {

    /**
     * Creates new form orderItemsManu
     */
    JPanel CardLayoutJPanel;
    UserAccount account;
    Ecosystem business;
    Manufacturer manu;
    String manuId;
    String manuId2;
    public orderItemsManu(JPanel CardLayoutJPanel, UserAccount account, Ecosystem business, String manuId) {
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.account=account;
        this.business= business;
        this.manuId=manuId;
        populatetable();
        
        
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
        manuTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(manuTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 710, 275));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manuTable;
    // End of variables declaration//GEN-END:variables

    private void populatetable() {
        
        ArrayList<Manufacturer> manuList = business.getManufacturerDirectory().getManufacturerList();
    
        int rowCount = manuTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)manuTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Manufacturer m: manuList)
        {  if(m.getManuId().equals(manuId)){
            Object row[] = new Object[6];
            row[0] = m.getManuId();
            row[1] = m.getManuName();
            row[2] = m.getPhoneNumber();
            row[3] = m.getEmailAddress();
            model.addRow(row);
        }
        }
    }

    private void populatetable1() {
        /*DefaultTableModel menuModel = (DefaultTableModel) itemtable.getModel();
        menuModel.setRowCount(0);
        ArrayList<Manufacturer> manuList1 = business.getManufacturerDirectory().getManufacturerList();
        for(Manufacturer m: manuList1){
            
            if(m.getManuId().equals(manuId2)){
              //System.out.println(m.getManuId());  
                for(Item i : m.getItemDirectory())
              {
                 System.out.println(manuId2);
           
                Object [] row = new Object[3];
                row[0] = i.getItemName();
                row[1] = i.getQuantity();
                row[2] = i.getPrice();
              

                menuModel.addRow(row);
             }  
        }}*/
    }
}
