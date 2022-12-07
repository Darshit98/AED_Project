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
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.ClinicOrganization;
import Business.Organization.medicalOrganization;
import Business.Person.Patient;
import Business.Person.Person;
import Business.Role.Role.RoleType;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author darsh
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final Enterprise enterprise;
    /**
     * Creates new form CreatePersonJPanel
     * @param workContainer
     * @param enterprise
     */
    public CreatePersonJPanel(JPanel workContainer, Enterprise enterprise) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        comboBoxDepartmentList.removeAllItems();
        populateDepartmentComboBox();
        lblClinicName.setVisible(false);
            txtClinicName.setVisible(false);
        if(enterprise instanceof HospitalEnterprise)
        {
            lblClinicName.setVisible(true);
            txtClinicName.setVisible(true);
        }
        
        
    }
    
    public void populateDepartmentComboBox(){
        
        for(Organization organize: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            comboBoxDepartmentList.addItem(organize);
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

        lbl1 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtDomain = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        jDateDOB = new com.toedter.calendar.JDateChooser();
        btnAddPerson = new javax.swing.JButton();
        lblDepartment = new javax.swing.JLabel();
        comboBoxDepartmentList = new javax.swing.JComboBox();
        lblClinicName = new javax.swing.JLabel();
        txtClinicName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lbl1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 102));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Create Person");

        lblFirstName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(0, 0, 102));
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name:");

        txtFirstName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblLastName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(0, 0, 102));
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name:");

        txtEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 102));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email:");

        lbl5.setText("@");

        txtDomain.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblPhone.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(0, 0, 102));
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Phone:");

        txtPhone.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblDateOfBirth.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblDateOfBirth.setForeground(new java.awt.Color(0, 0, 102));
        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateOfBirth.setText("Date of Birth:");

        btnAddPerson.setBackground(new java.awt.Color(0, 0, 102));
        btnAddPerson.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAddPerson.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        lblDepartment.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(0, 0, 102));
        lblDepartment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDepartment.setText("Department:");

        comboBoxDepartmentList.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        comboBoxDepartmentList.setForeground(new java.awt.Color(0, 0, 102));
        comboBoxDepartmentList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxDepartmentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDepartmentListActionPerformed(evt);
            }
        });

        lblClinicName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblClinicName.setForeground(new java.awt.Color(0, 0, 102));
        lblClinicName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClinicName.setText("Clinic Name:");

        txtClinicName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtClinicName.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(0, 0, 102));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(159, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDateOfBirth)
                                    .addComponent(lblDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxDepartmentList, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblClinicName, lblDateOfBirth, lblDepartment, lblEmail, lblFirstName, lblLastName, lblPhone});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5)
                    .addComponent(txtDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOfBirth)
                    .addComponent(jDateDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartment)
                    .addComponent(comboBoxDepartmentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClinicName)
                    .addComponent(txtClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddPerson)
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        try{
            long phone = Long.parseLong(txtPhone.getText());

            String firstName = txtFirstName.getText();
            if(firstName.trim().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter first Name!");
                return;
            }

            String lastName = txtLastName.getText();
            if(lastName.trim().equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter last Name!");
                return;
            }
            String email = txtEmail.getText()+"@"+txtDomain.getText();

            Date dob = jDateDOB.getDate();
            Organization organize = (Organization)comboBoxDepartmentList.getSelectedItem();
            Person person = null;
            Patient patient = null;
            if(enterprise instanceof CDC){
                if(organize instanceof CDCOrganization){
                    person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.CDCEmployee);
                }
                if(organize instanceof medicalOrganization){
                    person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.MedicalOfficer);
                }

            }
            if(enterprise instanceof Manufacturer)
            { person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Manufacturer);
            }
            if(enterprise instanceof Distributor)
            { person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Distributor);
            }
            if(enterprise instanceof LocalHealthDepartment)
            { person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.LocalHealthDepartment);
            }
            if(enterprise instanceof HospitalEnterprise)
            {
                if(organize instanceof HospitalOrganization)
                { person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Provider);
                }
                if(organize instanceof PatientOrganization)
                { patient = (Patient)organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.Patient);
                }
                if(organize instanceof ClinicOrganization)
                { person = organize.getPersonDirectory().createPerson(firstName, lastName, RoleType.ClinicProvider);
                }

            }
            if(person!=null)
            {person.setDateOfBirth(dob);
                person.setEmail(email);
                person.setPhone(phone);
            }
            if(patient!=null)
            {patient.setDateOfBirth(dob);
                patient.setEmail(email);
                patient.setPhone(phone);
            }

            JOptionPane.showMessageDialog(null, "Person Added!");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter numeric value for phone");
            //return;
        }

    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void comboBoxDepartmentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDepartmentListActionPerformed
        // TODO add your handling code here:

        Organization organize =(Organization)comboBoxDepartmentList.getSelectedItem();
        if(organize ==  null)
        {
            return;
        }
        if(organize instanceof ClinicOrganization)
        {   ClinicOrganization satOrg = (ClinicOrganization)organize;
            txtClinicName.setText(satOrg.getClincName());
        }
        else
        return;

    }//GEN-LAST:event_comboBoxDepartmentListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboBoxDepartmentList;
    private com.toedter.calendar.JDateChooser jDateDOB;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblClinicName;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField txtClinicName;
    private javax.swing.JTextField txtDomain;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
