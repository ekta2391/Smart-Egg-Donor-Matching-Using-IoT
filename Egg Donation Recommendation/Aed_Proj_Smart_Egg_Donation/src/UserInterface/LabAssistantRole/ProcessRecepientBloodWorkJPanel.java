/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantRole;

import Business.WorkQueue.RecepientBloodTestWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProcessRecepientBloodWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRecepientBloodWorkJPanel
     */
    RecepientBloodTestWorkRequest request;
    JPanel userProcessContainer;
    public ProcessRecepientBloodWorkJPanel(JPanel userProcessContainer,RecepientBloodTestWorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        valueLabel1.setText(request.getRecepient().getName());
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbcTxtField = new javax.swing.JTextField();
        bloodGrpTxtField = new javax.swing.JTextField();
        heTxtField = new javax.swing.JTextField();
        submitTestResultJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJBtn = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        antiSpermBodiesTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbcTxtField.setText(" ");
        add(cbcTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 117, 147, -1));

        bloodGrpTxtField.setText(" ");
        add(bloodGrpTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 155, 147, -1));

        heTxtField.setText(" ");
        add(heTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 200, 147, -1));

        submitTestResultJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitTestResultJBtn.setText("Submit Test Result");
        submitTestResultJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTestResultJBtnActionPerformed(evt);
            }
        });
        add(submitTestResultJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 238, -1, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Donor:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        backJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJBtn.setText("Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });
        add(backJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, 96, 34));

        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueLabel1.setText("<value>");
        add(valueLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Anti Sperm Bodies Present:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, -1, -1));

        antiSpermBodiesTxtField.setText(" ");
        add(antiSpermBodiesTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 73, 147, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Complete Blood Count (CBC):");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Blood Group:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Haemoglobin Electrophoresis:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitTestResultJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTestResultJBtnActionPerformed
         int counter =0;
        if(antiSpermBodiesTxtField.getText().trim().equals(""))
       {
       JOptionPane.showMessageDialog(null,"Enter AntiSperm bodies description");
       }
       else
       {
           counter++;
       }
        
         if(cbcTxtField.getText().trim().equals(""))
       {
       JOptionPane.showMessageDialog(null,"Enter Complete Blood Count");
       }
       else
       {
            try
      {
       Integer.parseInt(cbcTxtField.getText().trim());
       counter++;
       
      }
      catch(Exception e)  {
             JOptionPane.showMessageDialog(null,"Enter numeric value for Complete Blood Count");     
              }
       }
        
         if(bloodGrpTxtField.getText().trim().equals(""))
       {
       JOptionPane.showMessageDialog(null,"Enter Blood Group");
       }
       else
       {
           counter++;
       }
            if(heTxtField.getText().trim().equals(""))
       {
       JOptionPane.showMessageDialog(null,"Enter Haemoglobin Electrophoresis");
       }
       else
       {
            try
      {
       Integer.parseInt(heTxtField.getText().trim());
       counter++;
       
      }
      catch(Exception e)  {
             JOptionPane.showMessageDialog(null,"Enter numeric value for Haemoglobin Electrophoresis");     
              }
       }
            
            if(counter==4){
        
          JOptionPane.showMessageDialog(null, "Recepient Blood Tests Completed");
        request.setAntispermAntibodies(antiSpermBodiesTxtField.getText());
        request.setCompleteBloodCount(Integer.parseInt(cbcTxtField.getText().trim()));
        request.setBloodGroup(bloodGrpTxtField.getText());
        request.setHemoglobinElectrophoresis(Integer.parseInt(heTxtField.getText().trim()));
        request.setStatus("Test Completed.");

        Date date = new Date();
        request.setCreatedOn(date);
        request.getSender().getWorkQueue().getWorkRequestList().add(request);
            }  
      
    }//GEN-LAST:event_submitTestResultJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antiSpermBodiesTxtField;
    private javax.swing.JButton backJBtn;
    private javax.swing.JTextField bloodGrpTxtField;
    private javax.swing.JTextField cbcTxtField;
    private javax.swing.JTextField heTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submitTestResultJBtn;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
