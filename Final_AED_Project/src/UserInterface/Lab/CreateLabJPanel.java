/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.Ecosystem;
import Business.Lab.Lab;
import Business.Role.LabRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pushk
 */
public class CreateLabJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateLabJPanel
     */
    JPanel CardLayoutJPanel;
    private Ecosystem business;
    
    public CreateLabJPanel(JPanel CardLayoutJPanel, Ecosystem business) {

        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
         this.business = business;

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
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numberTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 37, 70));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backBtn.setText("< ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 60, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LAB INFORMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lab Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, 20));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 221, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact number:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, 30));
        add(numberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 221, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email id:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 30));

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 221, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, 20));

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 221, -1));

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 120, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, 30));
        add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 221, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, 20));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 221, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pathology Lab", "Neurology Lab", "Orthopedic Lab" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 220, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture/lab2.jpeg"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        Lab newLab = new Lab();
        
        String name = nameTxt.getText();
        String phoneNo = numberTxt.getText();
        String emailId = emailTxt.getText();
        String address = addressTxt.getText();
        //String labId = idTxt.getText();
        String username = usernameTxt.getText();
        String password = passwordTxt.getText();
        String type = (String) jComboBox1.getSelectedItem();
        
        System.out.println("============= >>> " + type);
        
        newLab.setLabname(name);
        newLab.setAddress(address);
        newLab.setEmailId(emailId);
       // newLab.setLabID(labId);
        newLab.setPassword(password);
        newLab.setPhoneNo(phoneNo);
        newLab.setUsername(username);
        newLab.setType(type);
        
        //business.getPatientDirectory().add(newPatient);
        if(name.isEmpty() || phoneNo.isEmpty() || address.isEmpty()|| username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        }
        else if(!phoneFormat(phoneNo))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }
        else if(!business.getPatientDirectory().isPhoneUnique(phoneNo)){
            JOptionPane.showMessageDialog(null, "Phone No already registered!");
        }
        else if(!business.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
       else{
            Lab lab = business.getLabDirectory().addLab(newLab);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(username, password, lab.getLabID(), new LabRole(), lab);
        
        JOptionPane.showMessageDialog(null, "New Lab signed up");
    }                                       
    }
        public boolean phoneFormat(String phoneNo){
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phoneNo);
        if(matcher.matches()){
            return true;
        }
        return false;
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
