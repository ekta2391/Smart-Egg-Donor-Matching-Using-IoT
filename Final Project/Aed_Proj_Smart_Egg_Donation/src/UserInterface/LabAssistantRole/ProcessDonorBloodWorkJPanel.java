/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistantRole;

import Business.WorkQueue.DonorBloodTestWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProcessDonorBloodWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessDonorBloodWorkJPanel
     */
    JPanel userProcessContainer;
    DonorBloodTestWorkRequest donorBloodRequest;
    
    public ProcessDonorBloodWorkJPanel(JPanel userProcessContainer,DonorBloodTestWorkRequest donorBloodRequest) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.donorBloodRequest=donorBloodRequest;
        valueLabel1.setText(donorBloodRequest.getDonor().getName());
       
        
    }


    /* * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        antiSpermBodiesTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbcTxtField = new javax.swing.JTextField();
        bloodGrpTxtField = new javax.swing.JTextField();
        heTxtField = new javax.swing.JTextField();
        submitTestResultJBtn = new javax.swing.JButton();
        backJBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Donor:");

        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueLabel1.setText("<value>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Anti Sperm Bodies Present:");

        antiSpermBodiesTxtField.setText(" ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Complete Blood Count (CBC):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Blood Group:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Haemoglobin Electrophoresis:");

        cbcTxtField.setText(" ");

        bloodGrpTxtField.setText(" ");

        heTxtField.setText(" ");

        submitTestResultJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitTestResultJBtn.setText("Submit Test Result");
        submitTestResultJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTestResultJBtnActionPerformed(evt);
            }
        });

        backJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJBtn.setText("Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(backJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submitTestResultJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heTxtField)
                            .addComponent(bloodGrpTxtField)
                            .addComponent(cbcTxtField)
                            .addComponent(antiSpermBodiesTxtField))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valueLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(antiSpermBodiesTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbcTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bloodGrpTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(heTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitTestResultJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
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
         
        if(counter==4) 
        
        
        { 
             JOptionPane.showMessageDialog(null, "Donor Blood Tests Completed");
        donorBloodRequest.setAntispermAntibodies(antiSpermBodiesTxtField.getText());
      donorBloodRequest.setCompleteBloodCount(Integer.parseInt(cbcTxtField.getText().trim()));
      donorBloodRequest.setBloodGroup(bloodGrpTxtField.getText());
      donorBloodRequest.setHemoglobinElectrophoresis(Integer.parseInt(heTxtField.getText().trim()));
      donorBloodRequest.setStatus("Test Completed.");
     
      
      Date date = new Date();
      donorBloodRequest.setCreatedOn(date);
      donorBloodRequest.getSender().getWorkQueue().getWorkRequestList().add(donorBloodRequest);
      
        }
    }//GEN-LAST:event_submitTestResultJBtnActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
 userProcessContainer.remove(this);
        

        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
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