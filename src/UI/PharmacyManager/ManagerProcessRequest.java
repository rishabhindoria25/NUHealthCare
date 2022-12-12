/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PharmacyManager;

//import userinterface.GovernmentTreasurerRole.*;
import NUHealthCare.Account.Account;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.JobQueue.OrderJob;
import NUHealthCare.Map.MapViewer;
import NUHealthCare.Map.SMS;
import NUHealthCare.Map.SendEmail;
import NUHealthCare.Order.ItemList;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.TransportOrg;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class ManagerProcessRequest extends javax.swing.JPanel {

    private JPanel jPanel;
    private OrderJob orderItemRequest;
    private Enterprise enterprise;
    private Account account;

    /**
     * Creates new form ManagerProcessRequest
     */
    public ManagerProcessRequest(JPanel jPanel, OrderJob fundRequest, Enterprise enterprise, Account account) {
        initComponents();
        this.jPanel = jPanel;
        this.orderItemRequest = fundRequest;
        this.account = account;
        this.enterprise = enterprise;
        txtAmount.setText(String.valueOf(orderItemRequest.getOrder().getAmount()));
        txtLocation.setText(orderItemRequest.getVisitReason());
        txtPopulation.setText(String.valueOf(orderItemRequest.getOrderMsg()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSendToTransport = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        txtPopulation = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnViewOnMap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnSendToTransport.setBackground(new java.awt.Color(153, 0, 0));
        btnSendToTransport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendToTransport.setText("Send To Transport");
        btnSendToTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendToTransportActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(153, 0, 0));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Order Message");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Address");

        txtPopulation.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtAmount.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Message To Transport");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager Work Area");

        btnViewOnMap.setBackground(new java.awt.Color(153, 0, 0));
        btnViewOnMap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewOnMap.setText("View on Map");
        btnViewOnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOnMapActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Amount");

        txtLocation.setEnabled(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/NU_Health_footer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnViewOnMap))
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSendToTransport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnBack)
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOnMap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendToTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jLabel6)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendToTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendToTransportActionPerformed
        btnSendToTransport.setEnabled(true);
        String message = txtMessage.getText();
        String sub = "Your Order is Ready to deliver";
        String odrderDtl = "Order Details\n*************************************************\n";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            orderItemRequest.setMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                orderItemRequest.setSender(account);
                orderItemRequest.setReceiver(null);
                orderItemRequest.setStatus("Sent to Transport");

                Org org = null;
                for (Org organization : enterprise.getOrgDirectory().getOrganizations()) {
                    if (organization instanceof TransportOrg) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getJobQueue().getJobRequestList().add(orderItemRequest);
                    account.getJobQueue().getJobRequestList().add(orderItemRequest);
                }
                //Send email
                try {

                    List<ItemList> itm = orderItemRequest.getOrder().getItemList();
                    for (ItemList i : itm) {
                        odrderDtl = odrderDtl + "Item: " + i.getItem() + " , Quantity: " + i.getQuantity() + ", Item Price: $" + i.getTotal() + "\n";
                    }
                    odrderDtl = odrderDtl + "*************************************************\n";
                    odrderDtl = odrderDtl + "\n\nTotal Price: $" + orderItemRequest.getOrder().getAmount();
                    SendEmail.send(orderItemRequest.getHospitalAdmin().getEmployee().getEmpEmail(), "\nHi " + orderItemRequest.getHospitalAdmin().getEmployee().getEmpName() + "," + "\n\nYour Order# " + orderItemRequest.getOrder().getItemID()
                            + " is ready for delivery" + "\n\n\n\n" + odrderDtl + "\n\nThanks,\n", sub);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Email Sent");
                    System.out.println(ex.getMessage());
                }
                //Send SMS
                try {
                    SMS.SendSMS("+18573138300", "Hi " + orderItemRequest.getHospitalAdmin().getEmployee().getEmpName() + "," + "\nYour order# : " + orderItemRequest.getOrder().getItemID() + " is ready for delivery"
                            + "\n\nThanks");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                //Send SMS end
                JOptionPane.showMessageDialog(null, "Request to Transport sent Successful!!!");
                txtMessage.setText("");
                btnReject.setEnabled(false);
                btnSendToTransport.setEnabled(false);
            }

            txtMessage.setText("");
        }

    }//GEN-LAST:event_btnSendToTransportActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerWorkArea dwjp = (ManagerWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        String message = txtMessage.getText();
        String sub = "Your Order is Rejected";
        String odrderDtl = "Order Details\n*************************************************\n";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            orderItemRequest.setMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                orderItemRequest.setStatus("Rejected");
                try {

                    List<ItemList> itm = orderItemRequest.getOrder().getItemList();
                    for (ItemList i : itm) {
                        odrderDtl = odrderDtl + "Item: " + i.getItem() + " , Quantity: " + i.getQuantity() + ", Item Price: $" + i.getTotal() + "\n";
                    }
                    odrderDtl = odrderDtl + "*************************************************\n";
                    odrderDtl = odrderDtl + "\n\nTotal Price: $" + orderItemRequest.getOrder().getAmount();
                    SendEmail.send(orderItemRequest.getHospitalAdmin().getEmployee().getEmpEmail(), "\nHi " + orderItemRequest.getHospitalAdmin().getEmployee().getEmpName() + "," + "\n\nYour Order# " + orderItemRequest.getOrder().getItemID()
                            + " is Rejected by: " + orderItemRequest.getReceiver().getEmployee().getEmpName() + "\nMessage: " + message
                            + "\n\n\n\n" + odrderDtl + "\n\nThanks,\n", sub);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Email Sent");
                    System.out.println(ex.getMessage());
                }
                //Send SMS
                try {
                    SMS.SendSMS("+18573138300", "Hi " + orderItemRequest.getHospitalAdmin().getEmployee().getEmpName() + "," + "\nYour order# : " + orderItemRequest.getOrder().getItemID() + " is rejected\nMessage: " + message
                            + "\n\nThanks");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                //Send SMS end
                txtMessage.setText("");
                btnReject.setEnabled(false);
                btnSendToTransport.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Rejected");
            }
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnViewOnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOnMapActionPerformed
        // TODO add your handling code here:
        if (txtLocation.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter address first");
        } else {
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    MapViewer browser = new MapViewer();
                    browser.setVisible(true);
                    browser.loadURL("https://www.google.com/maps/search/?api=1&query=" + txtLocation.getText().trim());
                }
            });
        }
    }//GEN-LAST:event_btnViewOnMapActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSendToTransport;
    private javax.swing.JButton btnViewOnMap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPopulation;
    // End of variables declaration//GEN-END:variables
}
