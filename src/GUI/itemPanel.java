/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Item;
import DTO.Supplier;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngoba
 */
public class itemPanel extends javax.swing.JPanel {

    ArrayList<Item> list;
    ArrayList<Supplier> listSup;
    boolean save = true;

    /**
     * Creates new form itemPanel
     */
    public itemPanel() {
        initComponents();
        loadSupplier();
        loadItem();
        loadSupItem();
        JTABLE1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    void loadSupplier() {
        try {
            listSup = DAO.supplierDAO.getAllSupplier();
            Vector header = new Vector();
            header.add("SupCode");
            header.add("SupName");
            header.add("Address");
//            header.add("Status");

            Vector data = new Vector();
            for (Supplier s : listSup) {
                Vector row = new Vector();
                row.add(s.getCode());
                row.add(s.getName());
                row.add(s.getAddress());
//               row.add(s.getStatus());
                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) JTABLE1.getModel();
            model.setDataVector(data, header);
        } catch (Exception e) {
            e.getMessage();
        }

    }

    void loadItem() {
        try {
            list = DAO.ItemDAO.getAllItem();
            listSup = DAO.supplierDAO.getAllSupplier();
            Vector header = new Vector();
            header.add("ItemCode");
            header.add("ItemName");
            header.add("Supplier");
            header.add("Unit");
            header.add("Price");
            Vector data = new Vector();
            for (Item item : list) {
                Vector row = new Vector();
                String nameSup = getNameSup(item.getSupCode());
                row.add(item.getItemCode());
                row.add(item.getItemName());
                row.add(item.getSupCode() + '-' + nameSup);
                row.add(item.getUnit());
                row.add(item.getPrice());
                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) JTABLE1.getModel();
            model.setDataVector(data, header);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    String getNameSup(String supCode) {
        for (Supplier supplier : listSup) {
            if (supCode.equalsIgnoreCase(supplier.getCode())) {
                return supplier.getName();
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLE1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddNeW = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        JtextItemCode = new javax.swing.JTextField();
        jtextItemName = new javax.swing.JTextField();
        jcombobox = new javax.swing.JComboBox<>();
        jtextUnit = new javax.swing.JTextField();
        jtextPrice = new javax.swing.JTextField();
        jcheckboxSupplying = new javax.swing.JCheckBox();
        btnCancel = new javax.swing.JButton();
        btnPre_delete = new javax.swing.JButton();
        btnGetAll = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextStatus = new javax.swing.JTextField();

        JTABLE1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JTABLE1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTABLE1.getTableHeader().setReorderingAllowed(false);
        JTABLE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTABLE1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTABLE1);
        if (JTABLE1.getColumnModel().getColumnCount() > 0) {
            JTABLE1.getColumnModel().getColumn(0).setResizable(false);
            JTABLE1.getColumnModel().getColumn(0).setHeaderValue("null");
            JTABLE1.getColumnModel().getColumn(1).setResizable(false);
            JTABLE1.getColumnModel().getColumn(1).setHeaderValue("null");
            JTABLE1.getColumnModel().getColumn(2).setResizable(false);
            JTABLE1.getColumnModel().getColumn(2).setHeaderValue("null");
            JTABLE1.getColumnModel().getColumn(3).setResizable(false);
            JTABLE1.getColumnModel().getColumn(3).setHeaderValue("null");
            JTABLE1.getColumnModel().getColumn(4).setResizable(false);
            JTABLE1.getColumnModel().getColumn(4).setHeaderValue("null");
            JTABLE1.getColumnModel().getColumn(5).setResizable(false);
            JTABLE1.getColumnModel().getColumn(5).setHeaderValue("null");
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Item Code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Supplier");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Unit");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Supplying");

        btnAddNeW.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddNeW.setForeground(new java.awt.Color(102, 0, 255));
        btnAddNeW.setText("Add New ");
        btnAddNeW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNeWActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(102, 0, 255));
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 0, 255));
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        JtextItemCode.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        JtextItemCode.setForeground(new java.awt.Color(51, 51, 51));
        JtextItemCode.setEnabled(false);

        jtextItemName.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jtextItemName.setForeground(new java.awt.Color(51, 51, 51));
        jtextItemName.setEnabled(false);

        jcombobox.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jcombobox.setForeground(new java.awt.Color(51, 51, 51));

        jtextUnit.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jtextUnit.setForeground(new java.awt.Color(51, 51, 51));
        jtextUnit.setEnabled(false);

        jtextPrice.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jtextPrice.setForeground(new java.awt.Color(51, 51, 51));
        jtextPrice.setEnabled(false);

        jcheckboxSupplying.setEnabled(false);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 0, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnPre_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPre_delete.setForeground(new java.awt.Color(102, 0, 255));
        btnPre_delete.setText("Pre_Delete");
        btnPre_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPre_deleteActionPerformed(evt);
            }
        });

        btnGetAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetAll.setForeground(new java.awt.Color(102, 0, 255));
        btnGetAll.setText("GetAll");
        btnGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Status");

        jTextStatus.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnAddNeW))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcheckboxSupplying)
                            .addComponent(JtextItemCode)
                            .addComponent(jtextItemName)
                            .addComponent(jcombobox, 0, 294, Short.MAX_VALUE)
                            .addComponent(jtextUnit)
                            .addComponent(jtextPrice)
                            .addComponent(jTextStatus))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnPre_delete)
                .addGap(43, 43, 43)
                .addComponent(btnGetAll, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtextItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcombobox, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcheckboxSupplying))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddNeW)
                            .addComponent(btnSave)
                            .addComponent(btnCancel)
                            .addComponent(btnDelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPre_delete)
                    .addComponent(btnGetAll))
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTABLE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTABLE1MouseClicked
        // TODO add your handling code here:
        save = false;
        int pos = JTABLE1.getSelectedRow();
        if (JTABLE1.getSelectedRow() >= 0) {
            btnSave.setEnabled(true);
            btnDelete.setEnabled(true);
            JtextItemCode.setText((String) JTABLE1.getValueAt(pos, 0));
            jtextItemName.setText((String) JTABLE1.getValueAt(pos, 1));
            jcombobox.setSelectedItem("" + JTABLE1.getValueAt(pos, 2));
            jtextUnit.setText((String) JTABLE1.getValueAt(pos, 3));
            jtextPrice.setText("" + JTABLE1.getValueAt(pos, 4));
            if (findSup(JtextItemCode.getText())) {
                jcheckboxSupplying.setSelected(true);
            } else {
                jcheckboxSupplying.setSelected(false);
            }
            jTextStatus.setText((String) list.get(pos).getStatus());
            jtextItemName.setEnabled(true);
            jtextUnit.setEnabled(true);
            jtextPrice.setEnabled(true);
            jTextStatus.setEnabled(false);
            jcheckboxSupplying.setEnabled(true);

        }
    }//GEN-LAST:event_JTABLE1MouseClicked

    private void btnAddNeWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNeWActionPerformed
        // TODO add your handling code here:
        if (!listSup.isEmpty()) {
            save = true;
            JTABLE1.clearSelection();
            JtextItemCode.setEnabled(true);
            jtextItemName.setEnabled(true);
            jcombobox.setEnabled(true);
            jcombobox.setSelectedItem(0);
            jtextUnit.setEnabled(true);
            jtextPrice.setEnabled(true);
            jcheckboxSupplying.setEnabled(true);
            jTextStatus.setText("1");
            jTextStatus.setEnabled(false);
            setNull();
            jcheckboxSupplying.setSelected(false);
            btnSave.setEnabled(true);
            JTABLE1.setEnabled(false);
            btnDelete.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "nhà cung cấp rỗng");
        }

    }//GEN-LAST:event_btnAddNeWActionPerformed

    void setNull() {
        JtextItemCode.setText("");
        jtextItemName.setText("");
        jtextUnit.setText("");
        jtextPrice.setText("");
    }

    void setEnableFalse() {
        JtextItemCode.setEnabled(false);
        jtextItemName.setEnabled(false);
        jcombobox.setSelectedItem(null);
        jtextUnit.setEnabled(false);
        jtextPrice.setEnabled(false);
        jcheckboxSupplying.setEnabled(false);
        jcheckboxSupplying.setSelected(false);
        btnSave.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int pos = JTABLE1.getSelectedRow();
        String itemCode = JtextItemCode.getText();
        String itemName = jtextItemName.getText();
        String unit = jtextUnit.getText();
        String price = jtextPrice.getText();
        boolean supplying = jcheckboxSupplying.isSelected();
        String[] supCode = ((String) jcombobox.getSelectedItem()).split("-");
        String status = jTextStatus.getText();
        int checkSup;
        if (supplying) {
            checkSup = 1;
        } else {
            checkSup = 0;
        }
        int checkNull = checkNull();
        if (checkNull > 0) {
            if (checkPrice(price)) {
                float price2 = Float.parseFloat(price);
                if (save) {
                    try {
                        int result = DAO.ItemDAO.InsertItem(itemCode, itemName, unit, price2, supplying, supCode[0], status);
                        if (result != 0) {
                            JOptionPane.showMessageDialog(null, "Saved Successfully!!!");
                            loadItem();
                            setNull();
                            setEnableFalse();
                            JTABLE1.setEnabled(true);
                        }
                    } catch (Exception e) {
                        if (e.getMessage().contains("duplicate")) {
                            JOptionPane.showMessageDialog(null, "Duplicate ItemCode");
                        } else {
                            JOptionPane.showMessageDialog(null, "Enter full information and the correct length !!!");
                        }
                    }
                } else {
                    try {
                        int result = DAO.ItemDAO.updateItem(itemName, supCode[0], unit, price2, supplying, itemCode);
                        if (result != 0) {
                            JOptionPane.showMessageDialog(null, "Update successfully");
                            loadItem();
                            setNull();
                            setEnableFalse();
                            JTABLE1.clearSelection();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please input price >0");
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int pos = JTABLE1.getSelectedRow();
        String itemcode = JtextItemCode.getText();
        String[] supCode = ((String) jcombobox.getSelectedItem()).split("-");
        if (pos >= 0) {
            try {
                int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (a == JOptionPane.YES_OPTION) {
                    int result = DAO.ItemDAO.DeleteITEMLan1(itemcode, supCode[0]);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(null, "Deleted successfully");
                        loadItem();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Delete faileds");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Select to delete");

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        JTABLE1.setEnabled(true);
        setEnableFalse();
        jcombobox.setSelectedItem(null);
        setNull();
        JTABLE1.clearSelection();
        loadSupItem();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPre_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPre_deleteActionPerformed
        // TODO add your handling code here:
        Pre_DeleteITEMS pre = new Pre_DeleteITEMS();
        pre.setVisible(true);


    }//GEN-LAST:event_btnPre_deleteActionPerformed

    private void btnGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllActionPerformed
        // TODO add your handling code here:
        loadItem();
        loadSupItem();
    }//GEN-LAST:event_btnGetAllActionPerformed
    public void loadSupItem() {
        jcombobox.removeAllItems();
        for (Supplier supplier : listSup) {
            jcombobox.addItem(supplier.getCode() + "-" + supplier.getName());
        }
    }

    boolean findSup(String code) {
        for (Item item : list) {
            if (code.equalsIgnoreCase(item.getItemCode())) {
                return item.isSupplying();
            }
        }
        return false;
    }

    public int checkNull() {
        if (JtextItemCode.getText().trim().isEmpty() || jtextItemName.getText().trim().isEmpty() || jtextUnit.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter full information and the correct length !!!");
            return 0;
        }
        return 1;
    }

    boolean checkPrice(String price) {
        try {
            if (Float.parseFloat(price) > 0) {

                return true;
            }

        } catch (Exception e) {
            jtextPrice.grabFocus();
            jtextPrice.selectAll();
            return false;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTABLE1;
    private javax.swing.JTextField JtextItemCode;
    private javax.swing.JButton btnAddNeW;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JButton btnPre_delete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextStatus;
    private javax.swing.JCheckBox jcheckboxSupplying;
    private javax.swing.JComboBox<String> jcombobox;
    private javax.swing.JTextField jtextItemName;
    private javax.swing.JTextField jtextPrice;
    private javax.swing.JTextField jtextUnit;
    // End of variables declaration//GEN-END:variables
}
