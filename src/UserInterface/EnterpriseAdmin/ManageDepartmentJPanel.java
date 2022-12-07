/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EnterpriseAdmin;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.LocalHealthDepartment;
import Business.NationalEnterprise.CDC;
import Business.NationalEnterprise.Distributor;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.CDCOrganization;
import Business.Organization.DistributorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.Organization.LHDImmuneOrganization;
import Business.Organization.PatientOrganization;
import Business.Organization.ClinicOrganization;
import Business.Organization.medicalOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author darsh
 */
public class ManageDepartmentJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final Enterprise enterprise;
    /**
     * Creates new form ManageDepartmentJPanel
     * @param workContainer
     * @param enterprise
     */
    
    DefaultTableModel tblModel;
            
    public ManageDepartmentJPanel(JPanel workContainer, Enterprise enterprise ) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        populateOrganizationTable();
        populateCombo();
        txtClinicName.setVisible(false);
            lblClinicName.setVisible(false);
        if(enterprise instanceof HospitalEnterprise)
        {
            txtClinicName.setVisible(true);
            lblClinicName.setVisible(true);
                
        }
        
    }
    
    private void populateCombo(){
        comboBoxOrganizationList.removeAllItems();
        if(enterprise instanceof CDC)
        {   
            comboBoxOrganizationList.addItem(Organization.OrganizationType.CDCOrg);
            comboBoxOrganizationList.addItem(Organization.OrganizationType.MedicalOrganization);
        }
        if(enterprise instanceof Manufacturer)
        {
            comboBoxOrganizationList.addItem(Organization.OrganizationType.ManufactureOrg);
        }
        if(enterprise instanceof Distributor)
        {
            comboBoxOrganizationList.addItem(Organization.OrganizationType.DistributorOrg);
            
        }
        if( enterprise instanceof LocalHealthDepartment)
        {
            comboBoxOrganizationList.addItem(Organization.OrganizationType.LocalHealthDepartmentOrg);
        }
        
        if( enterprise instanceof HospitalEnterprise)
        {
            comboBoxOrganizationList.addItem(Organization.OrganizationType.HospitalOrg);
            comboBoxOrganizationList.addItem(Organization.OrganizationType.PatientOrganization);
            comboBoxOrganizationList.addItem(Organization.OrganizationType.ClinicOrganization);
        }
        
       
    }
    
    private void populateOrganizationTable(){
        tblModel = (DefaultTableModel) tblOrganizationDetails.getModel();
        
        tblModel.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            Object[] rowData = new Object[2];
            rowData[0] = organization.getOrganizationID();
            if(organization instanceof ClinicOrganization)
            {
                ClinicOrganization satOrg =(ClinicOrganization)organization;
                rowData[1] = satOrg.getClincName()+"Clinic";
            }
            else
            rowData[1] = organization.getName();
            
            tblModel.addRow(rowData);
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizationDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblOrganizationType = new javax.swing.JLabel();
        comboBoxOrganizationList = new javax.swing.JComboBox();
        btnAddOrganization = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddOrganization = new javax.swing.JLabel();
        lblClinicName = new javax.swing.JLabel();
        txtClinicName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Organization");

        tblOrganizationDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblOrganizationDetails.setForeground(new java.awt.Color(0, 0, 102));
        tblOrganizationDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrganizationDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOrganizationDetails);

        btnBack.setBackground(new java.awt.Color(0, 0, 102));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganizationType.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblOrganizationType.setForeground(new java.awt.Color(0, 0, 102));
        lblOrganizationType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrganizationType.setText("Organization Type:");

        comboBoxOrganizationList.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        comboBoxOrganizationList.setForeground(new java.awt.Color(0, 0, 102));
        comboBoxOrganizationList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddOrganization.setBackground(new java.awt.Color(0, 0, 102));
        btnAddOrganization.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 102));

        lblAddOrganization.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAddOrganization.setForeground(new java.awt.Color(0, 0, 102));
        lblAddOrganization.setText("Add Organization:");

        lblClinicName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblClinicName.setForeground(new java.awt.Color(0, 0, 102));
        lblClinicName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClinicName.setText(" Clinic Name:");

        txtClinicName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddOrganization)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClinicName)
                                    .addComponent(lblOrganizationType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comboBoxOrganizationList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblClinicName, lblOrganizationType});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddOrganization)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizationType)
                    .addComponent(comboBoxOrganizationList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClinicName)
                    .addComponent(txtClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddOrganization)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
        // TODO add your handling code here:

        Organization.OrganizationType type = (Organization.OrganizationType) comboBoxOrganizationList.getSelectedItem();
        //check if organization exists

        //
        boolean corg =false;
        boolean morg =false;

        if( enterprise instanceof CDC)
        {

            for(Organization organize : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(organize instanceof CDCOrganization)
                {
                    corg=true;
                }
                if(organize instanceof medicalOrganization)
                {
                    morg=true;
                }

            }
            if(corg==true && type.equals(Organization.OrganizationType.CDCOrg))
            {
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }
            else if(morg==true && type.equals(Organization.OrganizationType.MedicalOrganization)){
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }

        }
        //

        if(enterprise instanceof Manufacturer)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof ManufactureOrganization)
                {
                    JOptionPane.showMessageDialog(null, "Department Exists!");
                    return;
                }
            }
        }
        if(enterprise instanceof Distributor)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof DistributorOrganization)
                {
                    JOptionPane.showMessageDialog(null, "Department Exists!");
                    return;
                }
            }

        }
        if( enterprise instanceof LocalHealthDepartment)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof LHDImmuneOrganization)
                {
                    JOptionPane.showMessageDialog(null, "Department Exists!");
                    return;
                }
            }
        }
        boolean hospOrg=false;
        boolean patientOrg=false;
        if( enterprise instanceof HospitalEnterprise)
        {
            String satClinicName = txtClinicName.getText();

            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof HospitalOrganization)
                {
                    hospOrg=true;
                }
                if(org instanceof PatientOrganization)
                {
                    patientOrg=true;
                }

            }
            if(hospOrg==true && type.equals(Organization.OrganizationType.HospitalOrg))
            {
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }
            else if(patientOrg==true && type.equals(Organization.OrganizationType.PatientOrganization)){
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }
            else if(type.equals(Organization.OrganizationType.ClinicOrganization))
            {
                ClinicOrganization satOrg = (ClinicOrganization)enterprise.getOrganizationDirectory().createOrganization(type);
                satOrg.setClincName(satClinicName);
                populateOrganizationTable();
                return;
            }

        }

        enterprise.getOrganizationDirectory().createOrganization(type);
        populateOrganizationTable();

    }//GEN-LAST:event_btnAddOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboBoxOrganizationList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddOrganization;
    private javax.swing.JLabel lblClinicName;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrganizationDetails;
    private javax.swing.JTextField txtClinicName;
    // End of variables declaration//GEN-END:variables
}
