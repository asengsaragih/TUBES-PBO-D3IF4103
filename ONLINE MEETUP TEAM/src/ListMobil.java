
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ListMobil extends javax.swing.JFrame {

    /**
     * Creates new form ListMobil
     */
    public ListMobil() {
        initComponents();
        tablemobilTampilData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cari = new javax.swing.JButton();
        carimobil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemobil = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 247, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon("D:\\[TEL-U]\\[INFORMATICS]\\KULIAH\\[SMST 3]\\[PBO]\\rolinnn\\cl.PNG")); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));

        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("List Mobil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 38, 70, 22));

        cari.setBackground(new java.awt.Color(244, 247, 252));
        cari.setForeground(new java.awt.Color(0, 153, 153));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 80, -1));
        jPanel1.add(carimobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 210, 23));

        tablemobil.setBackground(new java.awt.Color(244, 247, 252));
        tablemobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Mobil", "Merk Mobil", "Tipe Mobil", "Tahun Produksi", "No Polisi", "Harga Sewa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablemobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablemobil);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 620, 90));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("CR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablemobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemobilMouseClicked
//        int selectedRow = tablemobil.getSelectedRow();
//        DefaultTableModel model = (DefaultTableModel)tablemobil.getModel();
//        merkmbl.setText(model.getValueAt(selectedRow, 1).toString());
//        tipembl.setText(model.getValueAt(selectedRow, 2).toString());
//        tahunmbl.setSelectedItem(model.getValueAt(selectedRow, 3).toString());
//        nopolisimbl.setText(model.getValueAt(selectedRow, 4).toString());
//        hargambl.setText(model.getValueAt(selectedRow, 5).toString());

    }//GEN-LAST:event_tablemobilMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Mobil");
        model.addColumn("Merk Mobil");
        model.addColumn("Tipe Mobil");
        model.addColumn("Tahun");
        model.addColumn("No Polisi");
        model.addColumn("Harga Sewa");
   
      try{
        String search = this.carimobil.getText();
        Statement stm = (Statement)koneksi.getConnection().createStatement();
        ResultSet res=stm.executeQuery("select * from tbl_mobil where tipe like '%"+search+"%'");
        
         while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }tablemobil.setModel(model);
     
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
            
    }//GEN-LAST:event_cariActionPerformed

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
            java.util.logging.Logger.getLogger(ListMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListMobil().setVisible(true);
            }
        });
    }

    private void tablemobilTampilData() {
        TambahMobil mobil = new TambahMobil();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Mobil");
        model.addColumn("Merk Mobil");
        model.addColumn("Tipe Mobil");
        model.addColumn("Tahun");
        model.addColumn("No Polisi");
        model.addColumn("Harga Sewa");
        
        try{
            Statement st = (Statement)koneksi.getConnection().createStatement();
            ResultSet res = st.executeQuery("select * from tbl_mobil where status=1");
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            
            tablemobil.setModel(model);
           
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JTextField carimobil;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablemobil;
    // End of variables declaration//GEN-END:variables
}
