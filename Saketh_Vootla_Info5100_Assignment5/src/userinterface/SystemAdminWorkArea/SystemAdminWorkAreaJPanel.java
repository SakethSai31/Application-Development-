/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import Business.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.createNewUser.createLogin;

/**
 *
 * @author sunny
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        jPanel1.setVisible(false);
        //jSplitPane.setVisible(false);
        //jPanel2.setVisible(true);
        populateTree();
    }
    
    public void populateTree(){
        //DefaultTreeModel model=(DefaultTreeModel)Admin.getModel();
       // Add the code for draw your system structure shown by JTree
       
      //  model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bgdimg = new javax.swing.JLabel();
        imgtitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(30, 119, 179));

        btnManageNetwork.setBackground(new java.awt.Color(12, 77, 167));
        btnManageNetwork.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnManageNetwork.setText("Customer Database");
        btnManageNetwork.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setBackground(new java.awt.Color(12, 77, 167));
        btnManageEnterprise.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterprise.setText("Restaurant Database");
        btnManageEnterprise.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageAdmin.setBackground(new java.awt.Color(12, 77, 167));
        btnManageAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnManageAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAdmin.setText("Delivery Database");
        btnManageAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        btnAddUser.setBackground(new java.awt.Color(12, 77, 167));
        btnAddUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setIcon(new javax.swing.ImageIcon("D:\\Study\\Northeastern University\\INFO 5100_AED\\Assignments\\Assignment Images\\Assignment 5\\icons8-user-64.png")); // NOI18N
        btnAddUser.setText("Add New User");
        btnAddUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageNetwork))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddUser, btnManageAdmin, btnManageEnterprise, btnManageNetwork});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnManageNetwork)
                .addGap(44, 44, 44)
                .addComponent(btnManageEnterprise)
                .addGap(38, 38, 38)
                .addComponent(btnManageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddUser, btnManageAdmin, btnManageEnterprise, btnManageNetwork});

        jSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bgdimg.setBackground(new java.awt.Color(30, 119, 179));
        bgdimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgdimg.setIcon(new javax.swing.ImageIcon("D:\\Study\\Northeastern University\\INFO 5100_AED\\Assignments\\Assignment Images\\Assignment 5\\system-administrator.jpg")); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -10, 530, 710));

        imgtitle.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        imgtitle.setText("Admin Control Panel\n");
        add(imgtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 460, 70));

        jPanel3.setBackground(new java.awt.Color(30, 119, 179));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 530, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        createLogin cl = new createLogin(userProcessContainer, ecosystem);
        userProcessContainer.add("createLogin",cl);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"createLogin");
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageDeliveryManWorkArena md = new ManageDeliveryManWorkArena(userProcessContainer,ecosystem);
        userProcessContainer.add("manageDelivery",md);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"manageDelivery");
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageRestaurantsWorkArena mr = new ManageRestaurantsWorkArena(userProcessContainer,ecosystem);
        userProcessContainer.add("manageResto",mr);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"manageResto");
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed

        ManageCustomersWorkArena mc = new ManageCustomersWorkArena(userProcessContainer,ecosystem);
        userProcessContainer.add("manageCustomers",mc);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"manageCustomers");
    }//GEN-LAST:event_btnManageNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel imgtitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
