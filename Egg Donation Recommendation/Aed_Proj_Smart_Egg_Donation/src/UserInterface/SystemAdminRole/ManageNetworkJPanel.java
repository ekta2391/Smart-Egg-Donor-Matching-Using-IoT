/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.Ecosystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    JPanel userProcessContainer;
    Ecosystem system;
    
    public ManageNetworkJPanel(JPanel userProcessContainer,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        
        populateNetworkJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addNetworkTxtField = new javax.swing.JTextField();
        submitJBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setText("Welcome to Network Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 0, -1, -1));

        jTabbedPane1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        jLabel2.setText("Enter Network Name : ");

        addNetworkTxtField.setText(" ");
        addNetworkTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkTxtFieldActionPerformed(evt);
            }
        });

        submitJBtn.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        submitJBtn.setText("SUBMIT");
        submitJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitJBtn)
                    .addComponent(addNetworkTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addNetworkTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitJBtn)
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("Add a Network", jPanel1);

        networkJTable.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Network Name"
            }
        ));
        jScrollPane1.setViewportView(networkJTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View Existing Networks", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 54, 337, -1));

        jButton1.setFont(new java.awt.Font("Vrinda", 2, 11)); // NOI18N
        jButton1.setText("<< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 263, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkTxtFieldActionPerformed
        // TODO add
    }//GEN-LAST:event_addNetworkTxtFieldActionPerformed

    private void submitJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJBtnActionPerformed
       String name = addNetworkTxtField.getText();
       Network network = system.createAndAddNetwork();
       network.setName(name);
       populateNetworkJTable();
        JOptionPane.showMessageDialog(null, "Your Network has been added");
       
    }//GEN-LAST:event_submitJBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

      private void populateNetworkJTable() {
          DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
          model.setRowCount(0);
          for(Network network : system.getNetworkList()){
              Object [] row = new Object [1];
              row[0] = network.getName();
              model.addRow(row);
          }
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addNetworkTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJBtn;
    // End of variables declaration//GEN-END:variables

  
}
