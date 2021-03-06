
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
public class Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
        tabletrxTampilData();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idpinjam = new javax.swing.JTextField();
        selesai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabletrx = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tglkembali = new javax.swing.JLabel();
        merk = new javax.swing.JLabel();
        tipe = new javax.swing.JLabel();
        pinjam = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        lama = new javax.swing.JLabel();
        price = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 247, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Transaksi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 38, 70, 22));

        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Id Peminjam");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 22));

        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Tipe Mobil");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 22));

        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Tanggal Pinjam");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 22));

        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Total");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 90, 22));

        idpinjam.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                idpinjamCaretUpdate(evt);
            }
        });
        idpinjam.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                idpinjamComponentHidden(evt);
            }
        });
        idpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpinjamActionPerformed(evt);
            }
        });
        jPanel1.add(idpinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, 30));

        selesai.setForeground(new java.awt.Color(0, 153, 153));
        selesai.setText("Selesai");
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        jPanel1.add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        tabletrx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id trx", "Id Peminjam", "Tipe Mobil", "Merk Mobil", "Tanggal Pinjam", "Tanggal Kembali", "Harga "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabletrx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletrxMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabletrx);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 660, 90));

        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Tanggal Kembali");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, 22));

        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Harga");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, 22));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("CR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 80, 70));

        close.setIcon(new javax.swing.ImageIcon("D:\\[TEL-U]\\[INFORMATICS]\\KULIAH\\[SMST 3]\\[PBO]\\rolinnn\\cl.PNG")); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 40, 40));

        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Merk Mobil");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 22));

        tglkembali.setText("-");
        jPanel1.add(tglkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 150, 30));

        merk.setText("-");
        jPanel1.add(merk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 30));

        tipe.setText("-");
        jPanel1.add(tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 150, 30));

        pinjam.setText("-");
        jPanel1.add(pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 30));

        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Lama Pinjam");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 90, 22));

        harga.setText("-");
        jPanel1.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 140, 30));

        lama.setText("-");
        jPanel1.add(lama, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 140, 30));

        price.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                priceCaretUpdate(evt);
            }
        });
        price.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                priceComponentHidden(evt);
            }
        });
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 160, 30));

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

    private void idpinjamComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_idpinjamComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_idpinjamComponentHidden

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("");

       
        String idP = idpinjam.getText();
        String tipeM = tipe.getText();
        String merkM = merk.getText();
        String tglP = pinjam.getText();
        String tglK = tglkembali.getText();
        String hargambl = harga.getText();
        int durasi = Integer.parseInt(lama.getText());
        int totalP = Integer.parseInt(price.getText());
        
    
        try {
//            Calendar cal = Calendar.getInstance();
//            System.out.println(dateFormat.format(cal.getTime().getDate()));
            Statement st = (Statement)koneksi.getConnection().createStatement();
            st.execute("insert into tbl_transaksi (id_peminjam, tipe_mobil, merk_mobil, tgl_pinjam, tgl_kembali,  harga, lama , total) values"
                + "('" + idP + "','" +tipeM+  "','" +merkM + "','" +tglP +"','" +tglK+ "','" +hargambl+ "','" + durasi + "','" + totalP+ "')");
            JOptionPane.showMessageDialog(this, "Data Transaksi berhasil Ditambahkan");

//            clearPinjam();
            tabletrxTampilData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_selesaiActionPerformed

    private void tabletrxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletrxMouseClicked


    }//GEN-LAST:event_tabletrxMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void idpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpinjamActionPerformed
        
    }//GEN-LAST:event_idpinjamActionPerformed

    private void idpinjamCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_idpinjamCaretUpdate
        try {
            String id = (String)this.idpinjam.getText();
            int id2 = Integer.parseInt(id);
            Connection con = koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from pelanggan where id_peminjam = '" + id2 +"'" ;
            ResultSet res = st.executeQuery(sql);

            if (res.next()) {
                getTanggal(res.getString("id_peminjam"));
                
            } else {
                this.pinjam.setText("-");
            }
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_idpinjamCaretUpdate

    private void priceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_priceCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_priceCaretUpdate

    private void priceComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_priceComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_priceComponentHidden

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel harga;
    private javax.swing.JTextField idpinjam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lama;
    private javax.swing.JLabel merk;
    private javax.swing.JLabel pinjam;
    private javax.swing.JTextField price;
    private javax.swing.JButton selesai;
    private javax.swing.JTable tabletrx;
    private javax.swing.JLabel tglkembali;
    private javax.swing.JLabel tipe;
    // End of variables declaration//GEN-END:variables

    
//    private void getTipe(String idmobil){
//        try{
//            String tipemobil="";
//            String merkmbl="";
//            Connection con = koneksi.getConnection();
//            Statement st = con.createStatement();
//            String sql = "select * from tbl_mobil where id_mobil='" +idmobil+"'" ;
//            ResultSet res = st.executeQuery(sql);
//            
//            while(res.next()){
//                tipemobil = res.getString("tipe");
//                merkmbl = res.getString("merk");
//                tipe.setText(tipemobil);
//                merk.setText(merkmbl);
//                
//            }
//            
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
    
     private void getTanggal(String id_peminjam){
        try{
            String tglP="";
            String tglK="";
            String tipemobil="";
            String merkmbl="";
            String hargambl="";
            String durasi="";
            
            int total;
            
            
            Connection con = koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from pelanggan where id_peminjam='" +id_peminjam+"'" ;
            ResultSet res = st.executeQuery(sql);
            
            while(res.next()){
                tglP = res.getString("tgl_pinjam");
                tglK = res.getString("tgl_kembali");
                tipemobil = res.getString("tipe_mobil");
                merkmbl = res.getString("merk_mobil");
                hargambl =res.getString("harga");
                durasi =res.getString("durasi");
                total =Integer.parseInt(hargambl)*Integer.parseInt(durasi);
                
                
                pinjam.setText(tglP);
                tglkembali.setText(tglK);
                tipe.setText(tipemobil);
                merk.setText(merkmbl);
                harga.setText(hargambl);
                lama.setText(durasi);
                price.setText(""+total);
                
                
            }
            
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void tabletrxTampilData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Transaksi");
        model.addColumn("Id Peminjam");
//        model.addColumn("Telp");
        model.addColumn("Tipe ");
        model.addColumn("Merk ");
        model.addColumn("tglpinjam");
        model.addColumn("tglkembali");
        model.addColumn("Harga");
        model.addColumn("lama");
        model.addColumn("total");
        
        
        try{
            Statement st = (Statement)koneksi.getConnection().createStatement();
            ResultSet res = st.executeQuery("select * from tbl_transaksi");
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2),res.getString(3),res.getString(4),res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)});
            }tabletrx.setModel(model);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
        
}


