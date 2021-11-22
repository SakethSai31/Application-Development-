/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

/**
 *
 * @author sunny
 */
public class createMenu extends javax.swing.JPanel {

    /**
     * Creates new form createMenu
     */
    
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    Restaurant resto;
    RestaurantDirectory rd;
    ArrayList<String> menu ;
    
    
    public createMenu(JPanel userProcessContainer , Restaurant restaurant,EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        this.resto = restaurant;
        refreshTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        menuList = new javax.swing.JList<>();
        txtAddItem = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bgdimg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 75, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item List");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 120, 60));

        jScrollPane1.setViewportView(menuList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 310));
        add(txtAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 82, -1));

        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 233, 90, 40));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(86, 107, 48));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 30));

        bgdimg.setIcon(new javax.swing.ImageIcon("D:\\Study\\Northeastern University\\INFO 5100_AED\\Assignments\\Assignment Images\\Assignment 5\\menu_1_768x589.jpg")); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 770, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        
        resto.addToMenu(txtAddItem.getText());
        refreshTable();
        txtAddItem.setText("");
        
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"RestaurantAdmin");
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> menuList;
    private javax.swing.JTextField txtAddItem;
    // End of variables declaration//GEN-END:variables

    public void refreshTable() {
          
          menu = resto.getMenu();
          DefaultListModel dl = new DefaultListModel();
          
          for(String s: menu)
          {
              dl.addElement(s);
          }
          menuList.setModel(dl);
         
    }
}
