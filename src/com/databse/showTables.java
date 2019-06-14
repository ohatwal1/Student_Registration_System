/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.databse;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Omkar
 */
public class showTables extends javax.swing.JFrame {

    /**
     * Creates new form showStudents
     */
    public showTables() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(0, 153, 153));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Students", "Enrollment", "Courses", "Classes", "TA's", "Prerequisites", "Logs" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(tableData);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select The Table to Display Contents");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Registration System");

        backButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            // TODO add your handling code here:
            //            createConnection();

            ResultSet rset = null;
            CallableStatement stmt = null;
            tableData.setVisible(false);

            int count = 0;
            ResultSetMetaData rsmt = null;
            OracleDataSource ds = new oracle.jdbc.pool.OracleDataSource();
            ds.setURL(DbConstants.DB_URL);
            Connection conn = ds.getConnection("ohatwal1", "Ralliyo1234");
            System.out.println("Conn Success");

            JComboBox cb = (JComboBox) evt.getSource();
            String msg = (String) cb.getSelectedItem();

            String selection = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());

            switch (selection) {
                case "Students":
                    tableData.setVisible(true);
                    stmt = conn.prepareCall("{call Project_Two.Show_Students(?)}");

                    stmt.registerOutParameter(1, OracleTypes.CURSOR);

                    // Save result
//                    ResultSet rset;
                    count = stmt.executeUpdate();
                    rset = (ResultSet) stmt.getObject(1);

                    tableData.setModel(DbUtils.resultSetToTableModel(rset));
                    System.out.println("com.databse.Database_Frame.jComboBox1ActionPerformed() Done");
                    rsmt = rset.getMetaData();

                    while (rset.next()) {
                        for (int i = 1; i <= rsmt.getColumnCount(); i++) {
                            System.out.print(rset.getString(i) + "\t");
                            String itemText = (String) jComboBox1.getSelectedItem();
                            System.out.println(rset.getString(i) + "\t");

                        }
                        System.out.println("");
                    }
                    rset.close();

                    // }
                    break;

                case "Enrollment":
                    tableData.setVisible(true);
                    stmt = conn.prepareCall("{call Project_Two.Show_Enrollments(?)}");

                    stmt.registerOutParameter(1, OracleTypes.CURSOR);

                    // Save result
                    count = stmt.executeUpdate();
                    rset = (ResultSet) stmt.getObject(1);

                    tableData.setModel(DbUtils.resultSetToTableModel(rset));
                    System.out.println("com.databse.Database_Frame.jComboBox1ActionPerformed() Done");
                    rsmt = rset.getMetaData();

                    while (rset.next()) {
                        for (int i = 1; i <= rsmt.getColumnCount(); i++) {
                            System.out.print(rset.getString(i) + "\t");
                            String itemText = (String) jComboBox1.getSelectedItem();
                            System.out.println(rset.getString(i) + "\t");

                        }
                        System.out.println("");
                    }
                    rset.close();

                    // }
                    break;

                case "Courses":
                    tableData.setVisible(true);
                    stmt = conn.prepareCall("{call Project_Two.Show_Courses(?)}");

                    stmt.registerOutParameter(1, OracleTypes.CURSOR);

                    // Save result
                    count = stmt.executeUpdate();
                    rset = (ResultSet) stmt.getObject(1);

                    tableData.setModel(DbUtils.resultSetToTableModel(rset));
                    System.out.println("com.databse.Database_Frame.jComboBox1ActionPerformed() Done");
                    rsmt = rset.getMetaData();

                    while (rset.next()) {
                        for (int i = 1; i <= rsmt.getColumnCount(); i++) {
                            System.out.print(rset.getString(i) + "\t");
                            String itemText = (String) jComboBox1.getSelectedItem();
                            System.out.println(rset.getString(i) + "\t");

                        }
                        System.out.println("");
                    }
                    rset.close();

                    // }
                    break;

                case "Classes":
                    tableData.setVisible(true);
                    stmt = conn.prepareCall("{call Project_Two.Show_Classes(?)}");

                    stmt.registerOutParameter(1, OracleTypes.CURSOR);

                    // Save result
                    count = stmt.executeUpdate();
                    rset = (ResultSet) stmt.getObject(1);

                    tableData.setModel(DbUtils.resultSetToTableModel(rset));
                    System.out.println("com.databse.Database_Frame.jComboBox1ActionPerformed() Done");
                    rsmt = rset.getMetaData();

                    while (rset.next()) {
                        for (int i = 1; i <= rsmt.getColumnCount(); i++) {
                            System.out.print(rset.getString(i) + "\t");
                            String itemText = (String) jComboBox1.getSelectedItem();
                            System.out.println(rset.getString(i) + "\t");

                        }
                        System.out.println("");
                    }
                    rset.close();

                    // }
                    break;

                case "TA's":
                    tableData.setVisible(true);
                    stmt = conn.prepareCall("{call Project_Two.Show_TAs(?)}");

                    stmt.registerOutParameter(1, OracleTypes.CURSOR);

                    // Save result
                    count = stmt.executeUpdate();
                    rset = (ResultSet) stmt.getObject(1);

                    tableData.setModel(DbUtils.resultSetToTableModel(rset));
                    System.out.println("com.databse.Database_Frame.jComboBox1ActionPerformed() Done");
                    rsmt = rset.getMetaData();

                    while (rset.next()) {
                        for (int i = 1; i <= rsmt.getColumnCount(); i++) {
                            System.out.print(rset.getString(i) + "\t");
                            String itemText = (String) jComboBox1.getSelectedItem();
                            System.out.println(rset.getString(i) + "\t");

                        }
                        System.out.println("");
                    }
                    rset.close();

                    // }
                    break;

                case "Prerequisites":
                    tableData.setVisible(true);
                    stmt = conn.prepareCall("{call Project_Two.Show_Prerequisites(?)}");

                    stmt.registerOutParameter(1, OracleTypes.CURSOR);

                    // Save result
                    count = stmt.executeUpdate();
                    rset = (ResultSet) stmt.getObject(1);

                    tableData.setModel(DbUtils.resultSetToTableModel(rset));
                    System.out.println("com.databse.Database_Frame.jComboBox1ActionPerformed() Done");
                    rsmt = rset.getMetaData();

                    while (rset.next()) {
                        for (int i = 1; i <= rsmt.getColumnCount(); i++) {
                            System.out.print(rset.getString(i) + "\t");
                            String itemText = (String) jComboBox1.getSelectedItem();
                            System.out.println(rset.getString(i) + "\t");

                        }
                        System.out.println("");
                    }
                    rset.close();

                    // }
                    break;

                case "Logs":
                    tableData.setVisible(true);
                    stmt = conn.prepareCall("{call Project_Two.Show_Logs(?)}");

                    stmt.registerOutParameter(1, OracleTypes.CURSOR);

                    // Save result
                    count = stmt.executeUpdate();
                    rset = (ResultSet) stmt.getObject(1);

                    tableData.setModel(DbUtils.resultSetToTableModel(rset));
                    System.out.println("com.databse.Database_Frame.jComboBox1ActionPerformed() Done");
                    rsmt = rset.getMetaData();

                    while (rset.next()) {
                        for (int i = 1; i <= rsmt.getColumnCount(); i++) {
                            System.out.print(rset.getString(i) + "\t");
                            String itemText = (String) jComboBox1.getSelectedItem();
                            System.out.println(rset.getString(i) + "\t");

                        }
                        System.out.println("");
                    }
                    rset.close();
                    conn.close();

                    // }
                    break;

                default:
                    break;
            }

//                        stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        Database_Frame df = new Database_Frame();
        df.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        ((DefaultTableModel)tableData.getModel()).setNumRows(0);
        ((DefaultTableModel)tableData.getModel()).setColumnCount(4);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
