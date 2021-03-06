/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DBUtil;
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
public class supplierPanel extends javax.swing.JPanel {

    Vector<Supplier> list;
    boolean save = true;
    ArrayList<Supplier> listsup;

    /**
     * Creates new form supplierPanel
     */
    public supplierPanel() {
        initComponents();
        loadSupplier();
        jtable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public int checkNull() {
        if (jtextCode.getText().trim().isEmpty() || jtextName.getText().trim().isEmpty() || jtextAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter full information and the correct length !!!");
            return 0;
        }
        return 1;
    }

    void loadSupplier() {
        try {
            listsup = DAO.supplierDAO.getAllSupplier();
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
//               row.add(s.getStatus());
                data.add(row);
            }
            DefaultTableModel model = (DefaultTableModel) jtable1.getModel();
            model.setDataVector(data, header);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    boolean findCol(String supcode) {
        for (Supplier sup : listsup) {
            if (supcode.equalsIgnoreCase(sup.getCode())) {
                return sup.isCollaborating();
            }
        }
        return false;
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
        jtable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtextCode = new javax.swing.JTextField();
        jtextName = new javax.swing.JTextField();
        jtextAddress = new javax.swing.JTextField();
        jcheckboxCollaborating = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnPre_Delete = new javax.swing.JButton();
        btnGetAll = new javax.swing.JButton();
        jtext5 = new javax.swing.JLabel();
        jTextStatus = new javax.swing.JTextField();

        jtable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable1.getTableHeader().setReorderingAllowed(false);
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable1);
        if (jtable1.getColumnModel().getColumnCount() > 0) {
            jtable1.getColumnModel().getColumn(0).setResizable(false);
            jtable1.getColumnModel().getColumn(1).setResizable(false);
            jtable1.getColumnModel().getColumn(2).setResizable(false);
            jtable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Collaborating");

        jtextCode.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jtextCode.setToolTipText("");
        jtextCode.setEnabled(false);

        jtextName.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jtextName.setEnabled(false);

        jtextAddress.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jtextAddress.setEnabled(false);

        jcheckboxCollaborating.setEnabled(false);

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 0, 204));
        btnAdd.setText("Add New ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(51, 0, 204));
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 0, 204));
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(51, 0, 204));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnPre_Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPre_Delete.setForeground(new java.awt.Color(51, 0, 204));
        btnPre_Delete.setText("Pre_Delete");
        btnPre_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPre_DeleteActionPerformed(evt);
            }
        });

        btnGetAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetAll.setForeground(new java.awt.Color(51, 0, 204));
        btnGetAll.setText("GetAll");
        btnGetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllActionPerformed(evt);
            }
        });

        jtext5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtext5.setText("Status");

        jTextStatus.setText("1");
        jTextStatus.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnPre_Delete)
                .addGap(35, 35, 35)
                .addComponent(btnGetAll, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtext5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtextCode)
                                .addComponent(jtextName)
                                .addComponent(jtextAddress)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jcheckboxCollaborating)))
                            .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 71, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jtextName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jcheckboxCollaborating)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtext5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPre_Delete)
                    .addComponent(btnGetAll))
                .addGap(0, 75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        // TODO add your handling code here:
        save = false;
        int pos = jtable1.getSelectedRow();
        if (jtable1.getSelectedRow() >= 0) {
            btnSave.setEnabled(true);
            btnDelete.setEnabled(true);
            jtextCode.setText((String) jtable1.getValueAt(pos, 0));
            jtextName.setText((String) jtable1.getValueAt(pos, 1));
            jtextAddress.setText((String) jtable1.getValueAt(pos, 2));

            if (findCol(jtextCode.getText())) {
                jcheckboxCollaborating.setSelected(true);
            } else {
                jcheckboxCollaborating.setSelected(false);
            }
            jTextStatus.setText((String) listsup.get(pos).getStatus());
            jtextName.setEnabled(true);
            jtextAddress.setEnabled(true);
            jcheckboxCollaborating.setEnabled(true);

        }
    }//GEN-LAST:event_jtable1MouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        save = true;
        jtable1.clearSelection();
        jtextCode.setEnabled(true);
        jtextName.setEnabled(true);
        jtextAddress.setEnabled(true);
        jcheckboxCollaborating.setEnabled(true);
        btnSave.setEnabled(true);
        setNull();
        jtable1.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnAddActionPerformed

    void setNull() {
        jtextCode.setText("");
        jtextName.setText("");
        jtextAddress.setText("");
        jcheckboxCollaborating.setSelected(false);
    }

    void setEnableFalse() {
        jtable1.clearSelection();
        jtextCode.setEnabled(false);
        jtextName.setEnabled(false);
        jtextAddress.setEnabled(false);
        jcheckboxCollaborating.setEnabled(false);
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String tableName = "Suppliers";
        String sql = "";
        String code = jtextCode.getText().trim();
        String name = jtextName.getText().trim();
        String address = jtextAddress.getText().trim();
        String status = jTextStatus.getText();
        boolean collaborating = jcheckboxCollaborating.isSelected();
        int checkCol;
        if (collaborating) {
            checkCol = 1;
        } else {
            checkCol = 0;
        }
        int checkNull = checkNull();
        if (checkNull > 0) {
            if (save) {
                try {
                    sql = "Insert Into Suppliers(supCode, supName, address, collaborating,status)"
                            + "values('" + code + "','" + name + "','" + address + "'," + checkCol + ",'" + status + "')";
                    int result = DBUtil.doRecord(tableName, sql);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(null, "Saved Successfully!!!");
                        loadSupplier();
                        jtable1.setEnabled(true);
                        btnSave.setEnabled(false);
                        setNull();
                        setEnableFalse();
                    }
                } catch (Exception e) {
                    if (e.getMessage().contains("duplicate")) {
                        JOptionPane.showMessageDialog(null, "duplicate");
                    } else {
                        JOptionPane.showMessageDialog(null, "Enter full information and the correct length !!!");
                    }
                }
            } else {
                try {

                    sql = "update Suppliers\n"
                            + "set supName ='" + name + "',address = '" + address + "', collaborating =" + checkCol + "\n"
                            + "where supCode = '" + code + "'";
                    int result = DBUtil.doRecord(tableName, sql);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(null, "Saved Successfully!!!");
                        loadSupplier();
                        btnSave.setEnabled(false);
                        setNull();
                        setEnableFalse();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here'
        int pos = jtable1.getSelectedRow();
        String supcode = jtextCode.getText();
        if (pos >= 0) {
            try {
                int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (a == JOptionPane.YES_OPTION) {
                    int result = DAO.supplierDAO.DeleteSupplier(supcode);
                    if (result != 0) {
                        JOptionPane.showMessageDialog(null, "Deleted successfully");
                        loadSupplier();
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
        // TODO add your handling code here:
        jtable1.setEnabled(true);
        setNull();
        setEnableFalse();
        btnDelete.setEnabled(false);
        btnSave.setEnabled(false);

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPre_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPre_DeleteActionPerformed
        // TODO add your handling code here:
        Pre_DELETE1 pr = new Pre_DELETE1();
        pr.setVisible(true);
    }//GEN-LAST:event_btnPre_DeleteActionPerformed
    private void btnGetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllActionPerformed
        loadSupplier();
    }//GEN-LAST:event_btnGetAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JButton btnPre_Delete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextStatus;
    private javax.swing.JCheckBox jcheckboxCollaborating;
    private javax.swing.JTable jtable1;
    private javax.swing.JLabel jtext5;
    private javax.swing.JTextField jtextAddress;
    private javax.swing.JTextField jtextCode;
    private javax.swing.JTextField jtextName;
    // End of variables declaration//GEN-END:variables
}
