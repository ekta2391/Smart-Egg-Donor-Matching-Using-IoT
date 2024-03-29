/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRole;

import Business.WorkQueue.RecepientPhysicalTestWorkRequest;
import java.util.Date;
import javax.swing.JPanel;



public class ProcessRecepientPhysicalTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRecepientPhysicalTestJPanel
     */
    JPanel userProcessContainer;
    RecepientPhysicalTestWorkRequest request;
    public ProcessRecepientPhysicalTestJPanel(JPanel userProcessContainer,RecepientPhysicalTestWorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJBtn = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        baseLineUSTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cavityCheckCountTxtField = new javax.swing.JTextField();
        cysticFibrosisTxtField = new javax.swing.JTextField();
        submitTestResultJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJBtn.setText("Back");
        add(backJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, 96, 34));

        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueLabel1.setText("<value>");
        add(valueLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Base Line Ultra Sound");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, -1, -1));

        baseLineUSTxtField.setText(" ");
        add(baseLineUSTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 73, 147, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cavity Check Count");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cystic Fibrosis");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        cavityCheckCountTxtField.setText(" ");
        add(cavityCheckCountTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 117, 147, -1));

        cysticFibrosisTxtField.setText(" ");
        add(cysticFibrosisTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 155, 147, -1));

        submitTestResultJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitTestResultJBtn.setText("Submit Test Result");
        submitTestResultJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTestResultJBtnActionPerformed(evt);
            }
        });
        add(submitTestResultJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 238, -1, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Donor:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitTestResultJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTestResultJBtnActionPerformed

        request.setBaseLineUltrasound(baseLineUSTxtField.getText());
        request.setCavityCheck(Integer.parseInt(cavityCheckCountTxtField.getText()));
        request.setCysticFibrosis(Integer.parseInt(cysticFibrosisTxtField.getText()));

        request.setStatus("Test Completed.");

        Date date = new Date();
        request.setCreatedOn(date);
    }//GEN-LAST:event_submitTestResultJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBtn;
    private javax.swing.JTextField baseLineUSTxtField;
    private javax.swing.JTextField cavityCheckCountTxtField;
    private javax.swing.JTextField cysticFibrosisTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton submitTestResultJBtn;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
