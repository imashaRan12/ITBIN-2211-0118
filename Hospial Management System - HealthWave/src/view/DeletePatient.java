
package view;

import controller.DeleteController;
import controller.TableController;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public final class DeletePatient extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    
    public DeletePatient() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon ic = new ImageIcon(getClass().getResource("/images/hospital.png"));
        this.setIconImage(ic.getImage());
        
        Object columns[] = {"Serial No", "Date", "Id", "Name", "Age", "Gender", "Address", "Phone Number", "Status", "Disease", "Room Number"};
        defaultTableModel.setColumnIdentifiers(columns);
        pDTable.setModel(defaultTableModel);
        loadData();
    }
    public void loadData() {
        new TableController().loadDataPatient(defaultTableModel); 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pDTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pSearchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Patient Details");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 191, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1230, 560));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        pDTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pDTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pDTable);

        jButton2.setBackground(new java.awt.Color(168, 231, 237));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(168, 231, 237));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setText("Delete");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Delete Patient Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("To Delete Enter The Patient ID:");

        pSearchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pSearchField.setText("HWPAT");
        pSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pSearchFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(296, 296, 296))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(pSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(79, 79, 79)))
                .addComponent(jButton2)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pDTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDTableMouseClicked

    }//GEN-LAST:event_pDTableMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PatientManagement pMgt = new PatientManagement();
        pMgt.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DeleteController.DeletePatient(pSearchField.getText());
        pSearchField.setText("HWPAT");
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        loadData();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pSearchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pDTable;
    private javax.swing.JTextField pSearchField;
    // End of variables declaration//GEN-END:variables
}
