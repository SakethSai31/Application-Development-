/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRoles;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Order.FinalOrder;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunny
 */
public class CustomerProfile extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProfile
     */
    JPanel userProcessContainer;
    Customer c;
    EcoSystem ecosystem;
    RestaurantDirectory rd;
    CustomerDirectory cd;
    public CustomerProfile(JPanel userProcessContainer,Customer c,EcoSystem ecosystem) {
        this.c = c;
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
               
        initComponents();
        populateTable();
        nameLabel.setText(c.getCustomerName());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        listOrdersReview = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textReview = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        btnUpdateReview = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reviewItem = new javax.swing.JTextField();
        reviewResto = new javax.swing.JTextField();
        bgdimg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        ordersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant", "Item", "Order date", "OrderId", "Status", "Delivery", "Review"
            }
        ));
        jScrollPane1.setViewportView(ordersList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 572, 128));

        jLabel2.setText("Orders:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 118, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 70, 60, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 50, 90, 20));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 80, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Feedback");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OrderId:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 100, -1));

        listOrdersReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOrdersReviewActionPerformed(evt);
            }
        });
        add(listOrdersReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 119, -1));

        jScrollPane2.setViewportView(textReview);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 119, 77));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Feedback:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        btnUpdateReview.setBackground(new java.awt.Color(99, 68, 48));
        btnUpdateReview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdateReview.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateReview.setText("Submit Feedback");
        btnUpdateReview.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateReviewActionPerformed(evt);
            }
        });
        add(btnUpdateReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, 140, 31));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Restaurant:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        reviewItem.setEditable(false);
        add(reviewItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 119, -1));

        reviewResto.setEditable(false);
        add(reviewResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 119, -1));

        bgdimg.setIcon(new javax.swing.ImageIcon("D:\\Study\\Northeastern University\\INFO 5100_AED\\Assignments\\Assignment Images\\Assignment 5\\Feedback_683x648.jpg")); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 680, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Customer");
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnUpdateReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateReviewActionPerformed
        // TODO add your handling code here:
        String orderId =(String) listOrdersReview.getSelectedItem();
        rd = ecosystem.getRestaurantDirectory();
        FinalOrder f = rd.getOrder(orderId);
        f.setReview(textReview.getText());
        populateTable();
        textReview.setText("");
        reviewItem.setText("");
        reviewResto.setText("");
        
        JOptionPane.showMessageDialog(this, "Thank you for the feedback");
    }//GEN-LAST:event_btnUpdateReviewActionPerformed

    private void listOrdersReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOrdersReviewActionPerformed
        // TODO add your handling code here:
        String orderId =(String) listOrdersReview.getSelectedItem();
        rd = ecosystem.getRestaurantDirectory();
        FinalOrder f = rd.getOrder(orderId);
        reviewItem.setText(f.getItem());
        reviewResto.setText(f.getRestaurant());
        
    }//GEN-LAST:event_listOrdersReviewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnUpdateReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listOrdersReview;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTable ordersList;
    private javax.swing.JTextField reviewItem;
    private javax.swing.JTextField reviewResto;
    private javax.swing.JTextPane textReview;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        nameLabel.setText(c.getCustomerName());
        ArrayList<Order> orders = c.getPreviousOrders();
        rd = ecosystem.getRestaurantDirectory();
        ArrayList<Restaurant> restos = rd.getRestaurantList();
        ArrayList<FinalOrder> finalOrders;
        DefaultTableModel df = (DefaultTableModel) ordersList.getModel();
        DefaultComboBoxModel dl = new DefaultComboBoxModel();
        df.setRowCount(0);
        for(Restaurant r: restos)
        {
            finalOrders = r.getAcceptedOrders();
            for(FinalOrder f: finalOrders)
            {
                if(f.getCustomer().equals(c.getCustomerName()))
                {
                    String[] row = {f.getRestaurant(),f.getItem(),f.getDate(),f.getOrderId(),f.getStatus(),f.getDeliveryMan(),f.getReview()};
                    df.addRow(row);
                    dl.addElement(f.getOrderId());
                }
            }
        }
        ordersList.setModel(df);
        listOrdersReview.setModel(dl);
        
        
        
    }
}
