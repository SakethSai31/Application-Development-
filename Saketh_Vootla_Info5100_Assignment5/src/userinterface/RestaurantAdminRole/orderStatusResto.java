/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

/**
 *
 * @author sunny
 */
public class orderStatusResto extends javax.swing.JPanel {

    /**
     * Creates new form orderStatusResto
     */
    public orderStatusResto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgdimg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrder.setBackground(new java.awt.Color(250, 248, 223));
        lblOrder.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        lblOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrder.setText("Order status");
        add(lblOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 472, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Item", "status", "Delivery", "Comment", "OrderId"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 472, 167));

        bgdimg.setIcon(new javax.swing.ImageIcon("D:\\Study\\Northeastern University\\INFO 5100_AED\\Assignments\\Assignment Images\\Assignment 5\\food_822x606.jpg")); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 820, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblOrder;
    // End of variables declaration//GEN-END:variables
}
