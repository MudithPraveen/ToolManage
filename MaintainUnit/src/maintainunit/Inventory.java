
package maintainunit;

import java.awt.Frame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MUDITH PRAVEEN
 */
public class Inventory extends javax.swing.JFrame {
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    /**
     * Creates new form Inventory
     */
    public Inventory() {
        initComponents();
        SelectInve();
        GetStore();
        GetStoreFiter();
    }

   
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Mini = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTB = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        storeIDList = new javax.swing.JComboBox<>();
        StatusBar = new javax.swing.JPanel();
        StatusWord = new javax.swing.JLabel();
        DropStatus = new javax.swing.JComboBox<>();
        Filter = new javax.swing.JComboBox<>();
        FilterBtn = new javax.swing.JButton();
        Filter2 = new javax.swing.JComboBox<>();
        Clear = new javax.swing.JButton();
        FromBar = new javax.swing.JPanel();
        FromBarWord = new javax.swing.JLabel();
        LocationBar = new javax.swing.JPanel();
        LocationBarWord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(185, 173, 17));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Maintain Inventory Management System");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Inventory");

        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("X");
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled-3.png"))); // NOI18N

        Mini.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Mini.setForeground(new java.awt.Color(255, 255, 255));
        Mini.setText("-");
        Mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
                .addComponent(Mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeBtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(closeBtn)
                                    .addComponent(Mini, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 16, 49));
        jLabel3.setText("Item Name");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 16, 49));
        jLabel2.setText("Item ID");

        itemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 16, 49));
        jLabel5.setText("Category");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 16, 49));
        jLabel6.setText("Store ID");

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Safety Gear", "Storage Equipment", "Power Tools", "Hand Tools", "Electrical Tools", "Cleaning Supplies", "Landscap Equipment" }));

        AddBtn.setBackground(new java.awt.Color(102, 255, 102));
        AddBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(204, 204, 0));
        UpdateBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        DeleteBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(57, 16, 49));
        homeBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        inventoryTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Category", "Store ID", "Status"
            }
        ));
        inventoryTB.setRowHeight(25);
        inventoryTB.setSelectionBackground(new java.awt.Color(0, 102, 255));
        inventoryTB.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inventoryTB.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inventoryTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryTB);

        jPanel3.setBackground(new java.awt.Color(185, 173, 17));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        StatusBar.setBackground(new java.awt.Color(204, 204, 204));

        StatusWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StatusWord.setForeground(new java.awt.Color(255, 255, 255));
        StatusWord.setText("Not Selected");

        javax.swing.GroupLayout StatusBarLayout = new javax.swing.GroupLayout(StatusBar);
        StatusBar.setLayout(StatusBarLayout);
        StatusBarLayout.setHorizontalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusBarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(StatusWord)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        StatusBarLayout.setVerticalGroup(
            StatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StatusWord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DropStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable", "Repair", " " }));
        DropStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DropStatusMouseClicked(evt);
            }
        });
        DropStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropStatusActionPerformed(evt);
            }
        });

        Filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Safety Gear", "Storage Equipment", "Power Tools", "Hand Tools", "Electrical Tools", "Cleaning Supplies", "Landscap Equipment" }));
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        FilterBtn.setBackground(new java.awt.Color(57, 16, 49));
        FilterBtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        FilterBtn.setForeground(new java.awt.Color(255, 255, 255));
        FilterBtn.setText("Filter");
        FilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterBtnMouseClicked(evt);
            }
        });
        FilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBtnActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(102, 102, 102));
        Clear.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        FromBar.setBackground(new java.awt.Color(204, 204, 204));

        FromBarWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FromBarWord.setForeground(new java.awt.Color(255, 255, 255));
        FromBarWord.setText("Not Selected");

        javax.swing.GroupLayout FromBarLayout = new javax.swing.GroupLayout(FromBar);
        FromBar.setLayout(FromBarLayout);
        FromBarLayout.setHorizontalGroup(
            FromBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FromBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FromBarWord)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FromBarLayout.setVerticalGroup(
            FromBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FromBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FromBarWord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LocationBar.setBackground(new java.awt.Color(204, 204, 204));

        LocationBarWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LocationBarWord.setForeground(new java.awt.Color(255, 255, 255));
        LocationBarWord.setText("Not Selected");

        javax.swing.GroupLayout LocationBarLayout = new javax.swing.GroupLayout(LocationBar);
        LocationBar.setLayout(LocationBarLayout);
        LocationBarLayout.setHorizontalGroup(
            LocationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocationBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LocationBarWord)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LocationBarLayout.setVerticalGroup(
            LocationBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LocationBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LocationBarWord, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Filter2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FilterBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(homeBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Clear))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(AddBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UpdateBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DeleteBtn)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemId)
                                    .addComponent(itemName)
                                    .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(storeIDList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StatusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(DropStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FromBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LocationBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(itemId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storeIDList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DropStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(FromBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LocationBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(UpdateBtn)
                            .addComponent(DeleteBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homeBtn)
                            .addComponent(Clear)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FilterBtn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Filter2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemIdActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

    public void StatusMeth(String x)
    {
        String S=null;
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
            PreparedStatement ad = Con.prepareStatement("select STATUS from INVENTORY where ITEMID=?");
            ad.setString(1,x);
            Rs = ad.executeQuery();
            while(Rs.next()){
                S = Rs.getString("status");
            }
            if(S.equals("Available")){
                
                StatusBar.setBackground(new java.awt.Color(0,255,0,255));
                StatusWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                StatusWord.setForeground(new java.awt.Color(255, 255, 255));
                StatusWord.setText("Available");
                
            }else{
                if(S.equals("Unavailable")){
                    StatusBar.setBackground(new java.awt.Color(255,0,0,255));
                    StatusWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    StatusWord.setForeground(new java.awt.Color(255, 255, 255));
                    StatusWord.setText("Unvailable");
                }else{
                    if(S.equals("Repair")){
                        StatusBar.setBackground(new java.awt.Color(255,204,0,255));
                        StatusWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                        StatusWord.setForeground(new java.awt.Color(255, 255, 255));
                        StatusWord.setText("Repair");
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void FromMeth(String x){
        String S=null;
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
            PreparedStatement ad = Con.prepareStatement("select TAKE_BY from INVENTORY where ITEMID=?");
            ad.setString(1,x);
            Rs = ad.executeQuery();
            while(Rs.next()){
                S = Rs.getString("TAKE_BY");
            }
            if(S.equals("No One Taken")){
                    FromBar.setBackground(new java.awt.Color(204,204,204,255));
                    FromBarWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    FromBarWord.setForeground(new java.awt.Color(255, 255, 255));
                    FromBarWord.setText(S);
                
            }else{
                FromBar.setBackground(new java.awt.Color(0,0,255,255));
                FromBarWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                FromBarWord.setForeground(new java.awt.Color(255, 255, 255));
                FromBarWord.setText("Take By: "+S);
     
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void LocationMeth(String x,String y){
        String S=null;
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
            PreparedStatement ad = Con.prepareStatement("select LOCATION from INVENTORY where ITEMID=?");
            ad.setString(1,x);
            Rs = ad.executeQuery();
            while(Rs.next()){
                S = Rs.getString("LOCATION");
            }
            if(S.equals("No One Taken")){
                    LocationBar.setBackground(new java.awt.Color(204,204,204,255));
                    LocationBarWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                    LocationBarWord.setForeground(new java.awt.Color(255, 255, 255));
                    LocationBarWord.setText("Location: "+y);
             
            }else{
               
                LocationBar.setBackground(new java.awt.Color(0,0,255,255));
                LocationBarWord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                LocationBarWord.setForeground(new java.awt.Color(255, 255, 255));
                LocationBarWord.setText("Location: "+S);
             
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void SelectInve()
    {
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
            St = Con.createStatement();
            Rs = St.executeQuery("select ITEMID,ITEMNAME,CATEGORY,STOREID,STATUS from INVENTORY");
            inventoryTB.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    private void GetStoreFiter()
    {
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
            St = Con.createStatement();
            String Query = "Select * from User1.STORETD";
            Rs=St.executeQuery(Query);
            Filter2.addItem("All");
            while(Rs.next()){
                String MyStore = Rs.getString("STOREID");
                Filter2.addItem(MyStore);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void GetStore()
    {
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
            St = Con.createStatement();
            String Query = "Select * from User1.STORETD";
            Rs=St.executeQuery(Query);
            while(Rs.next()){
                String MyStore = Rs.getString("STOREID");
                storeIDList.addItem(MyStore);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
            PreparedStatement add = Con.prepareStatement("insert into INVENTORY values(?,?,?,?,?,?,?)");
            add.setString(1,itemId.getText());
            add.setString(2,itemName.getText());
            add.setString(3,category.getSelectedItem().toString());
            add.setString(4,storeIDList.getSelectedItem().toString());
            add.setString(5,DropStatus.getSelectedItem().toString());
            add.setString(6,"No One Taken");
            add.setString(7,"No One Taken");
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Item Successfully Added!");
            Con.close();
            SelectInve();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(itemId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Enter The Item Id to be Deleted");
        } 
        else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
                String Id = itemId.getText();
                PreparedStatement Add = Con.prepareStatement("DELETE FROM User1.INVENTORY where ITEMID=?");
                Add.setString(1,Id);
                Add.executeUpdate();
                SelectInve();
                JOptionPane.showMessageDialog(this,"Item Deleted Successfully");
            }catch(SQLException e){
                 e.printStackTrace();
            } 
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void inventoryTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTBMouseClicked
        DefaultTableModel model = (DefaultTableModel)inventoryTB.getModel();
        int Myindex = inventoryTB.getSelectedRow();
        itemId.setText(model.getValueAt(Myindex, 0).toString());
        itemName.setText(model.getValueAt(Myindex, 1).toString());
        category.setSelectedItem(model.getValueAt(Myindex, 2).toString());
        storeIDList.setSelectedItem(model.getValueAt(Myindex, 3).toString());
        DropStatus.setSelectedItem(model.getValueAt(Myindex, 4).toString());
        String S = inventoryTB.getValueAt(Myindex, 0).toString();
        String S2 = inventoryTB.getValueAt(Myindex, 3).toString();
        StatusMeth(S);
        FromMeth(S);
        LocationMeth(S,S2);
    }//GEN-LAST:event_inventoryTBMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
       if(itemId.getText().isEmpty()||itemName.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"Missing Information!");
       }
       else{
           try{
               Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
               PreparedStatement Ad = Con.prepareStatement("update User1.INVENTORY set ITEMNAME=?,CATEGORY=?,STOREID=?,STATUS=? where ITEMID=?");
               Ad.setString(1,itemName.getText());
               Ad.setString(2,category.getSelectedItem().toString());
               Ad.setString(3,storeIDList.getSelectedItem().toString());
               Ad.setString(4,DropStatus.getSelectedItem().toString());
               Ad.setString(5,itemId.getText());
               Ad.executeUpdate();
               JOptionPane.showMessageDialog(this,"Item Updated Successfully!");
               SelectInve();
           }catch(Exception e)
           {
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void DropStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropStatusActionPerformed

    }//GEN-LAST:event_DropStatusActionPerformed

    private void DropStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DropStatusMouseClicked
       
    }//GEN-LAST:event_DropStatusMouseClicked

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterActionPerformed

    private void FilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterBtnMouseClicked
        
        if(Filter.getSelectedItem().toString()=="All" && Filter2.getSelectedItem().toString()=="All"){
            try{
                    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
                    St = Con.createStatement();
                    Rs = St.executeQuery("select ITEMID,ITEMNAME,CATEGORY,STOREID,STATUS from INVENTORY");
                    inventoryTB.setModel(DbUtils.resultSetToTableModel(Rs));
                }catch(SQLException e){
                    e.printStackTrace();
            } 
        }else{
            if(Filter2.getSelectedItem().toString()=="All"){
                try{
                    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
                    St = Con.createStatement();
                    Rs = St.executeQuery("select ITEMID,ITEMNAME,CATEGORY,STOREID,STATUS from INVENTORY where CATEGORY='"+Filter.getSelectedItem().toString()+"'");
                    inventoryTB.setModel(DbUtils.resultSetToTableModel(Rs));
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }else{
                    if(Filter.getSelectedItem().toString()=="All"){
                        try{
                            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
                            St = Con.createStatement();
                            Rs = St.executeQuery("select ITEMID,ITEMNAME,CATEGORY,STOREID,STATUS from INVENTORY where STOREID='"+Filter2.getSelectedItem().toString()+"'");
                            inventoryTB.setModel(DbUtils.resultSetToTableModel(Rs));
                            }catch(SQLException e){
                                e.printStackTrace();
                            }
                    }
                    else{
                         try{
                            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/maintainUnitDB","User1","1234");
                            St = Con.createStatement();
                            Rs = St.executeQuery("select ITEMID,ITEMNAME,CATEGORY,STOREID,STATUS from INVENTORY where STOREID='"+Filter2.getSelectedItem().toString()+"'"+" and CATEGORY='"+Filter.getSelectedItem().toString()+"'");
                            inventoryTB.setModel(DbUtils.resultSetToTableModel(Rs));
                            }catch(SQLException e){
                                e.printStackTrace();
                            }
                    }
                }
            
        }
               
    }//GEN-LAST:event_FilterBtnMouseClicked

    private void FilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBtnActionPerformed

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        itemId.setText("");
        itemName.setText("");

    }//GEN-LAST:event_ClearMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void MiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MiniMouseClicked

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton Clear;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JComboBox<String> DropStatus;
    private javax.swing.JComboBox<String> Filter;
    private javax.swing.JComboBox<String> Filter2;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JPanel FromBar;
    private javax.swing.JLabel FromBarWord;
    private javax.swing.JPanel LocationBar;
    private javax.swing.JLabel LocationBarWord;
    private javax.swing.JLabel Mini;
    private javax.swing.JPanel StatusBar;
    private javax.swing.JLabel StatusWord;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JTable inventoryTB;
    private javax.swing.JTextField itemId;
    private javax.swing.JTextField itemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> storeIDList;
    // End of variables declaration//GEN-END:variables
}
