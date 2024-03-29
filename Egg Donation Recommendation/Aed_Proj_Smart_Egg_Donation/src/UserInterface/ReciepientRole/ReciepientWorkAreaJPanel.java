/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReciepientRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class ReciepientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReciepientWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public ReciepientWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.organization=organization;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myRecordsJBtn = new javax.swing.JButton();
        tempDropJBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myRecordsJBtn.setText("My RECORDS");
        myRecordsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myRecordsJBtnActionPerformed(evt);
            }
        });
        add(myRecordsJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 430, 169, 51));

        tempDropJBtn.setText("TempDrop");
        tempDropJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempDropJBtnActionPerformed(evt);
            }
        });
        add(tempDropJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 499, 169, 53));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel1.setText("Welcome Recepient");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 30, 231, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ReciepientRole/the-incredible-edible-egg.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 79, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void myRecordsJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myRecordsJBtnActionPerformed
 RecepientRecordJPanel recepientRecordJPanel= new RecepientRecordJPanel(userProcessContainer, enterprise,organization,userAccount);
        userProcessContainer.add("createDonorJPanel", recepientRecordJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);     }//GEN-LAST:event_myRecordsJBtnActionPerformed

    private void tempDropJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempDropJBtnActionPerformed
 RecordRecepientTempIOTJPanel recepientTempIOTJPanel= new RecordRecepientTempIOTJPanel(userProcessContainer, enterprise,organization,userAccount);
        userProcessContainer.add("createDonorJPanel", recepientTempIOTJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);    }//GEN-LAST:event_tempDropJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton myRecordsJBtn;
    private javax.swing.JButton tempDropJBtn;
    // End of variables declaration//GEN-END:variables
}
