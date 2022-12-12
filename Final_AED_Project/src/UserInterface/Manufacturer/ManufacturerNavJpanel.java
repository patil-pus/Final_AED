/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacturer;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;

import Business.Manufacturer.Manufacturer;
import Business.Manufacturer.ManufacturerDirectory;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminManufacturerNewJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Atharva
 */
public class ManufacturerNavJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerNavJpanel
     */
    private JPanel userProcessContainer;
    Ecosystem  business;
   // ItemDirectory itemDirectory;
    UserAccount userAccount;
    Manufacturer manufacturer;
    ManufacturerDirectory manufacturerDirectory;
    
    
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ManufacturerNavJpanel(JPanel userProcessContainer, UserAccount userAccount,Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this. business =  business;
        this.manufacturerDirectory =  business.getManufacturerDirectory();
        this.userAccount = userAccount;
        this.manufacturer=(Manufacturer) userAccount.getDetails();
      
       // manuLabel.setText(this.userAccount.getUsername());
        for(Manufacturer manu : this.manufacturerDirectory.getManufacturerList()) {
            
            if(userAccount.getUsername().equals(manu.getUserName())) {
                String name1=manu.getUserName();
                
                String name2=userAccount.getUsername();
                
                System.out.println(name1);
                System.out.println(name2);
                this.manufacturer = manu;
                //this.itemDirectory =  manu.getItemDirectory();
                break;
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

        jPanel1 = new javax.swing.JPanel();
        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        manageItemBtn = new javax.swing.JButton();
        manageInfoBtn = new javax.swing.JButton();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 900));

        systemAdminPanel.setBackground(new java.awt.Color(248, 226, 205));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1788, Short.MAX_VALUE)
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1029, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(248, 226, 205));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 60, 30));

        manageItemBtn.setBackground(new java.awt.Color(0, 0, 0));
        manageItemBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageItemBtn.setText("Manage Items");
        manageItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageItemBtnActionPerformed(evt);
            }
        });
        jPanel3.add(manageItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 170, 30));

        manageInfoBtn.setBackground(new java.awt.Color(0, 0, 0));
        manageInfoBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageInfoBtn.setText("View Manufacturers");
        manageInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInfoBtnActionPerformed(evt);
            }
        });
        jPanel3.add(manageInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 170, 30));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/manufacture.jpg"))); // NOI18N
        rightSystemAdminPanel.add(jLabel1, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(systemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(systemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageItemBtnActionPerformed
        // TODO add your handling code here:
        ManageItemsJPanel mcjp = new ManageItemsJPanel(rightSystemAdminPanel, business,userAccount);
        rightSystemAdminPanel.add("ManageItemsJPanel",mcjp);
        CardLayout layout=(CardLayout)rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }//GEN-LAST:event_manageItemBtnActionPerformed

    private void manageInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInfoBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminManufacturerNewJPanel addmanu = new SystemAdminManufacturerNewJPanel(rightSystemAdminPanel, business,userAccount);
        rightSystemAdminPanel.add("AddManufacturerJPanel", addmanu);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel); 
    }//GEN-LAST:event_manageInfoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageInfoBtn;
    private javax.swing.JButton manageItemBtn;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
}
