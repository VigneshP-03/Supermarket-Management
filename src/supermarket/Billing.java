package supermarket;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Billing extends javax.swing.JFrame {

    public Billing() {
        initComponents();
        SelectSeller();
        GetCat();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        BillID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        GrdTotal = new javax.swing.JLabel();
        ProductQty = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        ProductCat = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillText = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Filterbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("BILLING SECTION");

        name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 0, 0));
        name1.setText("BILL ID");

        BillID.setForeground(new java.awt.Color(255, 51, 0));
        BillID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillIDMouseClicked(evt);
            }
        });
        BillID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("QUANTITY");

        GrdTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GrdTotal.setForeground(new java.awt.Color(255, 0, 0));
        GrdTotal.setText("Rs");

        ProductQty.setForeground(new java.awt.Color(255, 51, 0));
        ProductQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductQtyActionPerformed(evt);
            }
        });

        ProductName.setForeground(new java.awt.Color(255, 51, 0));
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });

        ProductCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Vegetables", "Fruits", " ", " " }));
        ProductCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProductCatItemStateChanged(evt);
            }
        });
        ProductCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductCatMouseClicked(evt);
            }
        });
        ProductCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductCatActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 51, 0));
        AddBtn.setText("ADD TO BILL");
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

        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 51, 0));
        UpdateBtn.setText("PRINT");
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

        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 51, 0));
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 51, 0));
        DeleteBtn.setText("REFRESH");
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

        ProductTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATOGARY"
            }
        ));
        ProductTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(255, 51, 51));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("PRODUCT LIST");

        BillText.setColumns(20);
        BillText.setRows(5);
        jScrollPane2.setViewportView(BillText);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("NAME");

        Filterbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Filterbtn.setForeground(new java.awt.Color(255, 51, 0));
        Filterbtn.setText("FILTER");
        Filterbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterbtnMouseClicked(evt);
            }
        });
        Filterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GrdTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(225, 225, 225))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BillID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProductQty, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBtn)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ClearBtn)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(Filterbtn)
                                .addGap(18, 18, 18)
                                .addComponent(ProductCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)
                                .addGap(74, 74, 74))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(AddBtn)
                        .addGap(28, 28, 28)
                        .addComponent(ClearBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn)
                            .addComponent(ProductCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Filterbtn))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GrdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("LOGOUT");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(831, 831, 831)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectSeller() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketDB", "Vignesh", "Vignesh");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Vignesh.ProductTable");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
    int Prid, newQty, AvailQty;
    double Uprice, ProductTotal = 0.0, GrossTotal = 0.0;
    public void update() {
        newQty = AvailQty - Integer.valueOf(ProductQty.getText());
        try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketDB", "Vignesh", "Vignesh");
                String Query = "Update Vignesh.ProductTable set ProductQty = " + newQty + "" + "where ProductID = "+ Prid;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectSeller();
            } catch(Exception e) {
                e.printStackTrace();
            }
    }
    
    private void GetCat() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketDB", "Vignesh", "Vignesh");
            St = Con.createStatement();
            String Query = "Select * from Vignesh.CategoryTable";
            Rs = St.executeQuery(Query);
            while(Rs.next()) {
                String MyCat = Rs.getString("CatName");
                ProductCat.addItem(MyCat);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private void BillIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIDActionPerformed

    private void ProductQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductQtyActionPerformed
    int i = 0;
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProductQty.getText().isEmpty() || ProductName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else if(AvailQty <= Integer.valueOf(ProductQty.getText())) {
            JOptionPane.showMessageDialog(this, "Out of Stock");
        } else {
            i++;
            ProductTotal = Uprice * Double.valueOf(ProductQty.getText());
            GrossTotal = GrossTotal + ProductTotal;
            if(i == 1) {
                BillText.setText(BillText.getText() + "\t*********SUPERMARKET**********\n" + "\tNO     PRODUCT     PRICE     QUANTITY     TOTAL\n\t" + i + "        " + ProductName.getText() + "       " + Uprice + "      " + ProductQty.getText() + "        " + ProductTotal + "\n\t");
            } else {
                BillText.setText(BillText.getText() + i + "        " + ProductName.getText() + "        " + Uprice + "        " + ProductQty.getText() + "        " + ProductTotal + "\n\t");
            }
            GrdTotal.setText("Rs" + GrossTotal);
            update();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        try {
            BillText.print();
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        BillID.setText("");
        ProductName.setText("");
        ProductQty.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        SelectSeller();
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int MyIndex = ProductTable.getSelectedRow();
        Prid = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        AvailQty = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
        ProductName.setText(model.getValueAt(MyIndex, 1).toString());
        Uprice = Double.valueOf(model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    private void ProductCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductCatActionPerformed

    private void BillIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillIDMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new  Loginpage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ProductCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductCatMouseClicked
        
    }//GEN-LAST:event_ProductCatMouseClicked

    private void ProductCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProductCatItemStateChanged
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketDB", "Vignesh", "Vignesh");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Vignesh.CategoryTable where CatName = '"+ ProductCat.getSelectedItem().toString() + "'");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ProductCatItemStateChanged

    private void FilterbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterbtnMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SupermarketDB", "Vignesh", "Vignesh");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Vignesh.CategoryTable where CatName = '"+ ProductCat.getSelectedItem().toString() + "'");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_FilterbtnMouseClicked

    private void FilterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField BillID;
    private javax.swing.JTextArea BillText;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton Filterbtn;
    private javax.swing.JLabel GrdTotal;
    private javax.swing.JComboBox<String> ProductCat;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField ProductQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables
}
