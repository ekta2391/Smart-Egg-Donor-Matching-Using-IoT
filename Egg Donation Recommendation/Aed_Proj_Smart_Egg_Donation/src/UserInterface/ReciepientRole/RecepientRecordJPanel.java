/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReciepientRole;

import Business.Employee.Employee;
import Business.Employee.Recepient;
import Business.Enterprise.Enterprise;
import Business.HormonalRecords.HormonalRecords;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RecepientBloodTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;


public class RecepientRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecepientRecordJPanel
     */
     private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    RecepientBloodTestWorkRequest recBloodTestWrkRqst;
    
    public RecepientRecordJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount userAccount) {
         
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.organization=organization;
        this.enterprise=enterprise;
       //populateTable(); 
        valueLabel1.setText(userAccount.getUsername());
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) recHormonalRecordsJTbl.getModel();
        
        dtm.setRowCount(0);
         //System.err.println("the user is "+userAccount);
        //System.err.println("the request list is "+userAccount.getWorkQueue().getWorkRequestList());
        for (Employee recepient : organization.getEmployeeDirectory().getEmployeeList()){
             if(recepient.getName().equalsIgnoreCase(userAccount.getEmployee().getName())){
         for(HormonalRecords hr : recepient.getHormonalRecordsHistory().getHormonalRecordsList()){
             Object row[]=new Object[5];
             row[0] = hr;
             row[1] = hr.getLeutinizingHormoneLevels();
             row[2] = hr.getFollicleStimulatingHormoneLevels();
             row[3] = hr.gethCGLevels();
             row[4] = hr.getTempDropIOT();
              dtm.addRow(row);
             
         }         



          
          
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

        jScrollPane1 = new javax.swing.JScrollPane();
        recHormonalRecordsJTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        backJBtn = new javax.swing.JButton();
        viewStatsJBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recHormonalRecordsJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Leutinizing Hormone", "Follicle Stimulating Hormone", "HCG Levels", "My BBT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(recHormonalRecordsJTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 609, 91));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Welcome to your records:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 11, -1, -1));

        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueLabel1.setText("<value>");
        add(valueLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 11, -1, -1));

        backJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJBtn.setText("Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });
        add(backJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 231, 96, 34));

        viewStatsJBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewStatsJBtn.setText("View Stats");
        viewStatsJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStatsJBtnActionPerformed(evt);
            }
        });
        add(viewStatsJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 231, 117, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
 userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    }//GEN-LAST:event_backJBtnActionPerformed

    private void viewStatsJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStatsJBtnActionPerformed
int selectedRow=recHormonalRecordsJTbl.getSelectedRow();
      if (selectedRow>=0){
      double lHLevel =0.0;
      double FSH =0.0;
      double hcg =0.0;
      for( Employee donor : organization.getEmployeeDirectory().getEmployeeList()){
      if(donor.getName().equalsIgnoreCase(userAccount.getEmployee().getName())){
         for(HormonalRecords hr : donor.getHormonalRecordsHistory().getHormonalRecordsList()){
             //hr = (HormonalRecords)donorHormoneLevelsJTbl.getValueAt(selectedRow,0);
             
           lHLevel =  hr.getLeutinizingHormoneLevels();
           FSH= hr.getFollicleStimulatingHormoneLevels();
           hcg  = hr.gethCGLevels();
        
           
      } 
           DefaultCategoryDataset data = new DefaultCategoryDataset();
           data.setValue(lHLevel,"Value","LH level");
           data.setValue(FSH,"Value","FSH level");
           data.setValue(hcg,"Value","HCG level");
           
           JFreeChart chart = ChartFactory.createBarChart3D("Hormonal Level Stats", "Hormonal Parameters", "Values", data);
             chart.setBackgroundPaint(Color.WHITE);
             chart.getTitle().setPaint(Color.BLUE);
             CategoryPlot p = chart.getCategoryPlot();
             p.setRangeGridlinePaint(Color.RED);
             ChartFrame frame = new ChartFrame("Bar Chart for Donor", chart);
             frame.setVisible(true);
             frame.setSize(450, 350);
            }
      }
            
          
             
         
          
      
  }
        
       else{
                 JOptionPane.showMessageDialog(null,"Please select a row from the table","Warning",JOptionPane.WARNING_MESSAGE);
               
    
          
         
        
        
  }    }//GEN-LAST:event_viewStatsJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recHormonalRecordsJTbl;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JButton viewStatsJBtn;
    // End of variables declaration//GEN-END:variables
}
