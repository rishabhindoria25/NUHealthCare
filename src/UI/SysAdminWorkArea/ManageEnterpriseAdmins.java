/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SysAdminWorkArea;

import NUHealthCare.Account.Account;
import NUHealthCare.Account.AccountDirectory;
import NUHealthCare.Ecosystem;
import NUHealthCare.Employee.Employee;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.NetworkSystem.NetworkSystem;
import NUHealthCare.Role.EnterpriseAdmin;
import NUHealthCare.Role.Role;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class ManageEnterpriseAdmins extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdmins
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private Account account;
    private Employee employee;
    private AccountDirectory accountDirectory;
    private ArrayList<String> ename = new ArrayList<String>();

    public ManageEnterpriseAdmins(JPanel userProcessContainer, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;

        txtUsername.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtPassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtConfirmPassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txtName.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        populateNetworkCombo();
        populateEnterpriseTable();
        passwordValidator();

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
        tblEnterprise = new javax.swing.JTable();
        lblNetwork = new javax.swing.JLabel();
        cbNetwork = new javax.swing.JComboBox();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblEnterprise = new javax.swing.JLabel();
        cbEnterprise = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEnterprise.setBackground(new java.awt.Color(204, 204, 204));
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 540, 220));

        lblNetwork.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNetwork.setText("Network");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        cbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNetworkActionPerformed(evt);
            }
        });
        add(cbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 136, -1));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setText("Username");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 136, 25));

        lblEnterprise.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEnterprise.setText("Enterprise");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        cbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 136, -1));

        btnSubmit.setBackground(new java.awt.Color(153, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, 90, 40));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 136, 28));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, -1, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 136, 25));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));
        add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 136, 29));

        lblConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConfirmPassword.setText("Confirm Password");
        add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Enterprise Admin");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 352, -1));
    }// </editor-fold>//GEN-END:initComponents

  private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] cmpArr = userProcessContainer.getComponents();
        Component component = cmpArr[cmpArr.length - 1];
        SysAdminWorkArea sysAdmin = (SysAdminWorkArea) component;
        sysAdmin.populateNetworkSystems();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
  }//GEN-LAST:event_btnBackActionPerformed

  private void cbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNetworkActionPerformed
        // TODO add your handling code here:
        NetworkSystem ns = (NetworkSystem) cbNetwork.getSelectedItem();
        if (ns != null) {
            populateEnterpriseCombo(ns);
        }
  }//GEN-LAST:event_cbNetworkActionPerformed

  private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) cbEnterprise.getSelectedItem();

//        int num = cbNetwork.getItemCount();
//
//        // Get items
//        for (int i = 0; i < num; i++) {
//            Object item = cbNetwork.getItemAt(i);
//            ename.add(item.toString());
//            System.out.println(item.toString());
//        }
//
//        int num1 = ename.size();
        String username = txtUsername.getText();
        for (String s : ename) {
            if (s.equals(username)) {
                JOptionPane.showMessageDialog(null, "Username taken");
                return;
            }
        }
        Role role = null;
        String password = String.valueOf(txtPassword.getPassword());
        String rePassword = String.valueOf(txtConfirmPassword.getPassword());
        String name = txtName.getText();

        if (username == null || username.equals("")) {
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblUsername.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Username can't be empty");
            return;
        }
        if (password == null || password.equals("")) {
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lblUsername.setForeground(Color.BLACK);
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPassword.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Password field cannot be left empty!");
            return;
        }

        if (!passwordValidator()) {
            JOptionPane.showMessageDialog(null,
                    "Password should be at least 6 Characters "
                    + "digits and a combination of number , uppercase letter, "
                    + "lowercase letter and Special characters are not allowed other than $, +, _");
            txtPassword.
                    setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPassword.setForeground(Color.RED);
            return;
        }

        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!");
            txtPassword.
                    setBorder(BorderFactory.createLineBorder(Color.RED));
            txtConfirmPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblPassword.setForeground(Color.RED);
            lblConfirmPassword.setForeground(Color.RED);
            return;
        }

        if (name == null || name.equals("")) {
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txtConfirmPassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lblPassword.setForeground(Color.BLACK);
            lblConfirmPassword.setForeground(Color.BLACK);
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblName.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Name field cannot be left empty!");
            return;
        } else {
            List<Account> userAccountList = enterprise.getUserAccountDirectory().
                    getUserAccountList();
            for (Account userAccount : userAccountList) {
                if (userAccount.getUsername().equals(username)) {
                    JOptionPane.showMessageDialog(null, "This username is already taken!");
                    txtUsername.setBorder(BorderFactory.createLineBorder(Color.RED));
                    return;
                }
            }

            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
            Account userAccount = enterprise.getUserAccountDirectory().
                    createUserAccount(username, password, employee, new EnterpriseAdmin());

            populateEnterpriseTable();

            txtName.setText("");
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            txtUsername.setText("");
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JOptionPane.showMessageDialog(null, "User account created successfully!");
        }
  }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbEnterprise;
    private javax.swing.JComboBox cbNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateEnterpriseCombo(NetworkSystem ns) {
        cbEnterprise.removeAllItems();
        for (Enterprise enterprise : ns.getEnterpriseDirectory().getEnterpriseList()) {
            cbEnterprise.addItem(enterprise);
        }
    }

    private void populateNetworkCombo() {
        cbNetwork.removeAllItems();
        for (NetworkSystem ns : ecosystem.getNetworkSystems()) {
            cbNetwork.addItem(ns);
        }
    }

    private void populateEnterpriseTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (NetworkSystem ns : ecosystem.getNetworkSystems()) {
            for (Enterprise enterprise : ns.getEnterpriseDirectory().getEnterpriseList()) {
                for (Account userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getOrgName();
                    row[1] = ns.getName();
                    row[2] = userAccount.getUsername();
                    row[3] = enterprise.getEnterpriseType().getValue();

                    model.addRow(row);
                }
            }
        }

        for (NetworkSystem ns : ecosystem.getNetworkSystems()) {
            for (Enterprise enterprise : ns.getEnterpriseDirectory().getEnterpriseList()) {
                for (Account userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
//                    System.out.println(userAccount.getUsername());
                    ename.add(userAccount.getUsername());
//                    model.addRow(row);
                }
            }
        }

//        for (NetworkSystem ns : ecosystem.getNetworkSystems()) {
//            for (Enterprise enterprise : ns.getEnterpriseDirectory().getEnterpriseList()) {
//                for (Org o : enterprise.getOrgDirectory().getOrganizations()) {
//                    for (Account userAccount : o.getUserAccountDirectory().getUserAccountList()) {
//                        System.out.println(userAccount.getUsername());
//                    }
//                }
//            }
//        }
    }

    private boolean passwordValidator() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$+_])(?=\\S+$).{6,}$");
        Matcher m = p.matcher(String.valueOf(txtPassword.getPassword()));
        boolean b = m.matches();
        return b;
    }
}