/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HealthcareOfficial;

import NUHealthCare.Account.Account;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.JobQueue.GovtFundJob;
import NUHealthCare.Map.SendEmail;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.SecretaryOrg;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class OfficerProcessRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OfficerPrecessRequestsJPanel
     */
    
    private JPanel jPanel;
    private Enterprise enterprise;
    private Account userAccount;
    private GovtFundJob governmentFundRequest;
    private HealthOfficialWorkArea officerWorkAreaJPanel;
    
    public OfficerProcessRequestsJPanel(JPanel jPanel, Account userAccount, GovtFundJob fundRequest, Enterprise enterprise) {
        initComponents();
        
        this.jPanel = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.governmentFundRequest = fundRequest;
        txtAmount.setText(String.valueOf(governmentFundRequest.getRequestAmount()));
        txtLocation.setText(governmentFundRequest.getLocation());
        txtPopulation.setText(String.valueOf(governmentFundRequest.getPopulation()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSendRequestToSecretary = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        txtPopulation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txtAmount.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Amount");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Message");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Officer Request Process area ");

        btnSendRequestToSecretary.setBackground(new java.awt.Color(153, 0, 0));
        btnSendRequestToSecretary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendRequestToSecretary.setForeground(new java.awt.Color(255, 255, 255));
        btnSendRequestToSecretary.setText("Send Request to Secretary");
        btnSendRequestToSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestToSecretaryActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Location");

        txtLocation.setEnabled(false);

        txtPopulation.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Population");

        btnReject.setBackground(new java.awt.Color(153, 0, 0));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(38, 38, 38)
                                        .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSendRequestToSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(376, 376, 376))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnReject, btnSendRequestToSecretary});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addComponent(btnSendRequestToSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnReject, btnSendRequestToSecretary});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestToSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestToSecretaryActionPerformed
        // TODO add your handling code here:
        
        String message = txtMessage.getText();
        String sub="Your Fund request is approved by Health Officer";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            governmentFundRequest.setMessage(message);
            
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
            
            if (dialogResult == JOptionPane.YES_OPTION) {
            
            governmentFundRequest.setSender(userAccount);
            governmentFundRequest.setStatus("Sent to Secretary");
            try{
                SendEmail.send(governmentFundRequest.getAdminEmail(),"\nHi "+governmentFundRequest.getAdminName()+","+"\n\nYour funding request for Location "+ governmentFundRequest.getLocation()+
                        " is approved by Health Officer: "+userAccount.getEmployee().getEmpName()
                +"\n\n\nThanks\nGovenrment",sub);
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Sent");
                    System.out.println(ex.getMessage());
                }

            Org org = null;
            for (Org organization : enterprise.getOrgDirectory().getOrganizations()) {
                if (organization instanceof SecretaryOrg) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getJobQueue().getJobRequestList().add(governmentFundRequest);
                userAccount.getJobQueue().getJobRequestList().add(governmentFundRequest);
            }
            JOptionPane.showMessageDialog(null, "Request to Secretary Successful!!!");
            txtMessage.setText("");
            btnReject.setEnabled(false);
            btnSendRequestToSecretary.setEnabled(false);
            }
            txtMessage.setText("");
        }

    }//GEN-LAST:event_btnSendRequestToSecretaryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HealthOfficialWorkArea owjp = (HealthOfficialWorkArea) component;
        owjp.populateTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
    
        String message = txtMessage.getText();
        String sub="Your Fund request is approved by Health Officer";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            governmentFundRequest.setMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
            
            if (dialogResult == JOptionPane.YES_OPTION) {
                governmentFundRequest.setStatus("Rejected");
                try{
                SendEmail.send(governmentFundRequest.getAdminEmail(),"\nHi "+governmentFundRequest.getAdminName()+","+"\n\nYour funding request for Location "+ governmentFundRequest.getLocation()+
                        " is Rejected by Secretary: "+userAccount.getEmployee().getEmpName()+"\n\n\n Message: "+message+"\n\n\nThanks\nGovenrment",sub);
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Sent");
                    System.out.println(ex.getMessage());
                }
                JOptionPane.showMessageDialog(null, "Rejected!");
                txtMessage.setText("");
            btnReject.setEnabled(false);
            btnSendRequestToSecretary.setEnabled(false);
            }
           
            txtMessage.setText("");
        }
        
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSendRequestToSecretary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPopulation;
    // End of variables declaration//GEN-END:variables
}
