/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sunny
 */
public class RestaurantInfo extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantInfo
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount ua;
    Restaurant resto;
    public RestaurantInfo(JPanel userProcessContainer,Restaurant resto) {
        this.userProcessContainer = userProcessContainer;
        this.resto = resto;
        initComponents();
        populateData();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserResto = new javax.swing.JTextField();
        txtPwdResto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddResto = new javax.swing.JTextField();
        txtCityResto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurant Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 260, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, 82, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, 90, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, 51, -1));

        txtUserResto.setEditable(false);
        txtUserResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserRestoActionPerformed(evt);
            }
        });
        add(txtUserResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 92, -1));

        txtPwdResto.setEditable(false);
        add(txtPwdResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 92, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));

        txtAddResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddRestoActionPerformed(evt);
            }
        });
        add(txtAddResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 92, -1));
        add(txtCityResto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 92, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, 42, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        bgdimg.setIcon(new javax.swing.ImageIcon("D:\\Study\\Northeastern University\\INFO 5100_AED\\Assignments\\Assignment Images\\Assignment 5\\Restaurent_-1_822x606.jpg")); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserRestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserRestoActionPerformed

    private void txtAddRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddRestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddRestoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        resto.setCity(txtCityResto.getText());
        resto.setAddress(txtAddResto.getText());
        populateData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"RestaurantAdmin");
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAddResto;
    private javax.swing.JTextField txtCityResto;
    private javax.swing.JTextField txtPwdResto;
    private javax.swing.JTextField txtUserResto;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
       txtAddResto.setText(resto.getAddress());
       txtCityResto.setText(resto.getCity());
       txtUserResto.setText(resto.getUserAccount().getUsername());
       txtPwdResto.setText(resto.getUserAccount().getPassword());
    }
}
