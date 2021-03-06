/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Supplier;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngoba
 */
public class Pre_DELETE1 extends javax.swing.JFrame {

    /**
     * Creates new form Pre_DELETE1
     */
    ArrayList<Supplier> listsup;

    public Pre_DELETE1() {
        initComponents();
        loadSupplier111();
        loadsupplier222();
        setResizable(false);
        jButtonDelete.setEnabled(false);
        jButtonPreDelete.setEnabled(false);
        jTextFieldSUPCODE.setEnabled(false);
        jTextFieldSUPNAME.setEnabled(false);
        jTextFieldSTATUS.setEnabled(false);
        jTextFieldAddress.setEnabled(false);
        jTextFieldSTATUS.setText("0");

    }

    private void loadSupplier111() {
        try {
            listsup = DAO.supplierDAO.getAllSupplier111();
            // if (!listma.isEmpty()) {
            Vector header = new Vector();
            header.add("SupCode");
            header.add("SupName");
            header.add("Address");
//            header.add("Status");
            Vector data = new Vector();
            for (Supplier s : listsup) {
                Vector row = new Vector();
                row.add(s.getCode());
                row.add(s.getName());
                row.add(s.getAddress());
//                row.add(s.getStatus());
                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setDataVector(data, header);

        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void loadsupplier222() {
        try {
            listsup = DAO.supplierDAO.getAllSupplier222();
            if (!listsup.isEmpty()) {
                Vector header = new Vector();
                header.add("SupCode");
                header.add("SupName");
                header.add("Address");
//            header.add("Status");
                Vector data = new Vector();
                for (Supplier s : listsup) {
                    Vector row = new Vector();
                    row.add(s.getCode());
                    row.add(s.getName());
                    row.add(s.getAddress());
//                row.add(s.getStatus());
                    data.add(row);
                }
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setDataVector(data, header);

            } else {
                JOptionPane.showMessageDialog(this, "List is Null");

            }
        } catch (Exception e) {
            e.getMessage();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jButtonPreDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSUPCODE = new javax.swing.JTextField();
        jTextFieldSUPNAME = new javax.swing.JTextField();
        jTextFieldSTATUS = new javax.swing.JTextField();
        jButtonGetALL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 0, 0));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonPreDelete.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonPreDelete.setForeground(new java.awt.Color(255, 0, 0));
        jButtonPreDelete.setText("Pre_Delete");
        jButtonPreDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("THE LIST OF SUPPLIER");

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel.setText("SupCode");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("SupName");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Status");

        jTextFieldSUPCODE.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextFieldSUPCODE.setForeground(new java.awt.Color(255, 0, 0));

        jTextFieldSUPNAME.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextFieldSUPNAME.setForeground(new java.awt.Color(255, 0, 0));

        jTextFieldSTATUS.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextFieldSTATUS.setForeground(new java.awt.Color(255, 0, 0));

        jButtonGetALL.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonGetALL.setForeground(new java.awt.Color(255, 0, 0));
        jButtonGetALL.setText("GetAll");
        jButtonGetALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetALLActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Address");

        jTextFieldAddress.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextFieldAddress.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButtonDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPreDelete)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonGetALL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldSUPCODE, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldSUPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSUPCODE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSUPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonPreDelete)
                            .addComponent(jButtonGetALL))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldSTATUS, jTextFieldSUPCODE, jTextFieldSUPNAME});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int pos = jTable1.getSelectedRow();
        String supcode = listsup.get(pos).getCode().trim();
        if (pos >= 0) {
            try {
                int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (a == JOptionPane.YES_OPTION) {
                    int result = DAO.supplierDAO.DeleteSupplierThat(supcode);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(null, "Deleted successfully");
                        loadSupplier111();
                        loadsupplier222();

                        jButtonDelete.setEnabled(false);
                        jButtonPreDelete.setEnabled(false);
                        jButtonDelete.setEnabled(false);
                        jButtonPreDelete.setEnabled(false);
                        jTextFieldSUPNAME.setEnabled(false);
                        jTextFieldAddress.setEnabled(false);
                        jTextFieldSUPCODE.setText("");
                        jTextFieldAddress.setText("");
                        jTextFieldSUPNAME.setText("");
                        jTextFieldSTATUS.setText("");

                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Delete faileds");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Select to delete");

        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonPreDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreDeleteActionPerformed

        int pos = jTable1.getSelectedRow();
        String supcode = listsup.get(pos).getCode().trim();
        if (pos >= 0) {
            try {
                int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to Pre_Delete?", "confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (a == JOptionPane.YES_OPTION) {
                    int result = DAO.supplierDAO.Pre_DELETESUPPLIER(supcode);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(null, "Pre_Delete successfully");
                        loadSupplier111();
                        loadsupplier222();
                        jButtonPreDelete.setEnabled(false);
                        jButtonDelete.setEnabled(false);
                        jButtonPreDelete.setEnabled(false);
                        jTextFieldSUPNAME.setEnabled(false);
                        jTextFieldAddress.setEnabled(false);
                        jTextFieldSUPCODE.setText("");
                        jTextFieldAddress.setText("");
                        jTextFieldSUPNAME.setText("");
                        jTextFieldSTATUS.setText("");

                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pre_Delete fail");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Select to Pre_Delete");

        }
    }//GEN-LAST:event_jButtonPreDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int pos = jTable1.getSelectedRow();
        resetJtext();
        try {
            if (pos >= 0) {
                jTextFieldSUPCODE.setText("" + jTable1.getValueAt(pos, 0));
                jTextFieldSUPNAME.setText("" + jTable1.getValueAt(pos, 1));
                jTextFieldAddress.setText("" + jTable1.getValueAt(pos, 2));
                jTextFieldSTATUS.setText("" + listsup.get(pos).getStatus());
                jTextFieldSUPNAME.setEditable(false);
                jTextFieldSTATUS.setEnabled(false);
                jTextFieldAddress.setEditable(false);
                jTextFieldAddress.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select row to show");

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonGetALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetALLActionPerformed
        loadSupplier111();
        loadsupplier222();
        jButtonDelete.setEnabled(false);
        jButtonPreDelete.setEnabled(false);
        jTextFieldSUPCODE.setText("");
        jTextFieldSUPNAME.setText("");
        jTextFieldSTATUS.setText("");
        jTextFieldSUPNAME.setEnabled(false);
        jTextFieldSUPCODE.setEnabled(false);
        jTextFieldAddress.setEnabled(false);
        jTextFieldAddress.setText("");
    }//GEN-LAST:event_jButtonGetALLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pre_DELETE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pre_DELETE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pre_DELETE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pre_DELETE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pre_DELETE1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonGetALL;
    private javax.swing.JButton jButtonPreDelete;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldSTATUS;
    private javax.swing.JTextField jTextFieldSUPCODE;
    private javax.swing.JTextField jTextFieldSUPNAME;
    // End of variables declaration//GEN-END:variables

    private void resetJtext() {
        jTextFieldSUPCODE.setEnabled(false);
        jTextFieldSUPNAME.setEnabled(true);
        jTextFieldAddress.setEnabled(false);
        jButtonDelete.setEnabled(true);
        jButtonPreDelete.setEnabled(true);

    }
}
