/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Provider;

import Business.Network.StateNetwork;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.Organization.LHDImmuneOrganization;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darsh
 */
public class ViewDetailsOfClinicOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsOfPlacedOrderJPanel
     */
    private final JPanel workContainer;
    private final ProviderVaccineOrderWorkRequest request;
    private final StateNetwork state;
    
    public ViewDetailsOfClinicOrderJPanel(JPanel workContainer, ProviderVaccineOrderWorkRequest request, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.request = request;
        this.state = state;
        displayContractDetails();
        calculateTotalCostOfOrder();
        txtornum.setText(String.valueOf(request.getVaccineOrder().getOrderNumber()));
        populateOrderTable();
    }
    
    private void displayContractDetails(){
        
        if(request.ishalfmonthContract())
            txtdetails.setText("Half Monthly");
        if(request.isfullMonthContract())
            txtdetails.setText("Monthly");
        if(request.isasReq())
            txtdetails.setText("Adhoc");
        
    }
    
    private void calculateTotalCostOfOrder(){
        
        double total = 0;
        for(OrderItem oi : request.getVaccineOrder().getItemList())
        {
            total = total + (oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity());
        }
        txttamt.setText(String.valueOf(total));
    }
    
    private void populateOrderTable(){
        
         int rowCount = tblorderdetail.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblorderdetail.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        for(OrderItem oi: request.getVaccineOrder().getItemList())
        {
            Object[] row = new Object[9];
            
                row[0] = oi.getVaccineDetails();
                row[1] = oi;
                row[2] = oi.getVaccineDetails().getManufacturerName();
                row[3] = oi.getVaccineDetails().getVaccineId();
                row[4] = oi.getVaccineDetails().getBatchId();
                
                row[5] = oi.getVaccineDetails().getVaccinePrice();
                row[6] = oi.getQuantity();
                row[7] = oi.getVaccineDetails().getManufactureDate();
                row[8] = oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity();              
                defaulttabelmodel.addRow(row);
        
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

        jLabel1 = new javax.swing.JLabel();
        txtdetails = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttamt = new javax.swing.JTextField();
        txtornum = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblorderdetail = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnbvack = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Details of Placed Order by Clinic");

        txtdetails.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Order Details:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Total Cost of the Order:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Order Number:");

        txttamt.setEnabled(false);

        txtornum.setEnabled(false);

        tblorderdetail.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblorderdetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Vaccine id", "Batch ID", "Price", "Quantity", "Manufacture date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorderdetail.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblorderdetail);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Order");

        btnbvack.setBackground(new java.awt.Color(0, 0, 102));
        btnbvack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnbvack.setForeground(new java.awt.Color(255, 255, 255));
        btnbvack.setText("<");
        btnbvack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbvackActionPerformed(evt);
            }
        });

        btnsubmit.setBackground(new java.awt.Color(0, 0, 102));
        btnsubmit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("Forward the Order to LHD");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttamt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnbvack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbvack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txttamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbvackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbvackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnbvackActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        if(request.getStatus().equalsIgnoreCase("FWD to LHD") || request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("Stored"))
        {
            JOptionPane.showMessageDialog(null, "Order already forwarded to LHD!");
            return;
        }
        
        
        for(Organization org: state.getLocalHealthDepartment().getOrganizationDirectory().getOrganizationList())
                {
                    if(org instanceof LHDImmuneOrganization)
                    {
                        org.getWorkQueue().addWorkRequest(request);
                    }
                }
        request.setStatus("FWD to LHD");
        
        JOptionPane.showMessageDialog(null, "Order forwarded to LHD!");
    }//GEN-LAST:event_btnsubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbvack;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblorderdetail;
    private javax.swing.JTextField txtdetails;
    private javax.swing.JTextField txtornum;
    private javax.swing.JTextField txttamt;
    // End of variables declaration//GEN-END:variables
}
