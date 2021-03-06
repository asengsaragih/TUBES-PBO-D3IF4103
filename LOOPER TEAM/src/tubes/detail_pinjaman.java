/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.*;
import java.util.*;
import javax.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MbahGenius
 */
public class detail_pinjaman extends javax.swing.JFrame {

    /**
     * Creates new form detail_pinjaman
     */
    private Connection db;
    public detail_pinjaman() throws SQLException {
        initComponents();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        
        tgl.setDateFormatString("yyyy-MM-dd");
        LocalDate now = LocalDate.now();
        
    Instant min = now.plusMonths(1)
            .atStartOfDay(ZoneId.systemDefault())
            .toInstant();
    tgl.setSelectableDateRange(new Date(),Date.from(min) );

        ImageIcon settingImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Pinjam Ruangan.png")));
        Image login = settingImage.getImage();
        Image imageScaled = login.getScaledInstance(lb_pinjam.getWidth(), lb_pinjam.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon settingsImage = new ImageIcon(imageScaled);
        lb_pinjam.setIcon(settingsImage);
        
         this.bt_pinjam.setFont(new Font("Forte", Font.PLAIN, 33)); 
        this.bt_pinjam.setForeground(Color.YELLOW);
        this.bt_pinjam.setOpaque(false);
        this.bt_pinjam.setContentAreaFilled(false);
        this.bt_pinjam.setBorderPainted(false);
        this.bt_pinjam.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
         this.bt_batal.setFont(new Font("Forte", Font.PLAIN, 33)); 
        this.bt_batal.setForeground(Color.YELLOW);
        this.bt_batal.setOpaque(false);
        this.bt_batal.setContentAreaFilled(false);
        this.bt_batal.setBorderPainted(false);
        this.bt_batal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        txt_tujuan.setOpaque(false);
        txt_tujuan.setBackground(new java.awt.Color(255, 255, 255, 0));
        
        
        
        db = (Connection) koneksi.koneksiDB();
        tampil_ruangan();
    }
     public void tampil_ruangan()
    {
        try
        {
            koneksi a=new koneksi();
            String sql = "SELECT * FROM ruangan";
            Statement tsql = db.createStatement();
            ResultSet result=tsql.executeQuery(sql);
           
            cb_ruangan.addItem("-Pilih Ruangan");
            while(result.next())
            {
                cb_ruangan.addItem(result.getString("nama_ruangan"));
            }
        }
        catch(Exception ex)
        {
            
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

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_tujuan = new javax.swing.JTextArea();
        cb_mulai = new javax.swing.JComboBox<>();
        cb_durasi = new javax.swing.JComboBox<>();
        bt_pinjam = new javax.swing.JButton();
        bt_batal = new javax.swing.JButton();
        tgl = new com.toedter.calendar.JDateChooser();
        cb_ruangan = new javax.swing.JComboBox<>();
        lb_pinjam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_tujuan.setColumns(20);
        txt_tujuan.setRows(5);
        jScrollPane1.setViewportView(txt_tujuan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 340, 150));

        cb_mulai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        getContentPane().add(cb_mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 130, 40));

        cb_durasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 jam", "2 jam" }));
        getContentPane().add(cb_durasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 130, 40));

        bt_pinjam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_pinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pinjamActionPerformed(evt);
            }
        });
        getContentPane().add(bt_pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 170, 50));

        bt_batal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_batal.setActionCommand("bt_batal");
        bt_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batalActionPerformed(evt);
            }
        });
        getContentPane().add(bt_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 170, 50));
        getContentPane().add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 171, 223, 40));

        getContentPane().add(cb_ruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 130, 30));

        lb_pinjam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_pinjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/Pinjam Ruangan.png"))); // NOI18N
        getContentPane().add(lb_pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 
    private void bt_pinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pinjamActionPerformed
        // TODO add your handling code here:
        String id_peminjam = user_session.getU_id();
        
        
        String nama_ruang = cb_ruangan.getSelectedItem().toString();
        String tanggal = ((JTextField)tgl.getDateEditor().getUiComponent()).getText();
        String mulai= cb_mulai.getSelectedItem().toString();
        
        String akhir=null,tengah=null,dt_mulai=null,id_ruangan=null;
        int in_akhir=0,in_tengah=0;
        String arr[] = mulai.split(":",0);
        String jam = arr[0];
        int res_jam = Integer.parseInt(jam);
        String durasi=cb_durasi.getSelectedItem().toString();
        mulai = Integer.toString(res_jam);
        
        
//        if(durasi=="1 jam"){
//            in_akhir = res_jam + 1;
//            akhir = Integer.toString(in_akhir);
//            
//        }else{
//            in_akhir = res_jam + 2;
//            akhir = Integer.toString(in_akhir);
//            in_tengah = res_jam + 1;
//            tengah = Integer.toString(in_tengah);
//        }
//        
        
        String tujuan = txt_tujuan.getText();
        
        try {
            Statement tsql = db.createStatement();
            String sqlt="SELECT id_ruangan FROM ruangan WHERE nama_ruangan = '" + nama_ruang+ "'";
            ResultSet result=tsql.executeQuery(sqlt);
            result.next();
                String id_ruang= result.getString("id_ruangan");
            
            
            
//            result.next();
            if (result.getRow()>0) {
                Statement tsql2=db.createStatement();
                
                String sqls="select ruangan.nama_ruangan,ruangan.jenis_ruangan, ruangan.kapasitas, detail_ruangan.jam_8, detail_ruangan.jam_9, detail_ruangan.jam_10"
                    + ", detail_ruangan.jam_11, detail_ruangan.jam_12, detail_ruangan.jam_13, detail_ruangan.jam_14, detail_ruangan.jam_15, detail_ruangan.jam_16, detail_ruangan.jam_17"
                    + ", detail_ruangan.jam_18, detail_ruangan.jam_19, detail_ruangan.jam_20 from ruangan,detail_ruangan where ruangan.id_ruangan=detail_ruangan.id_ruangan AND detail_ruangan.tanggal= '"+tanggal+"' AND ruangan.nama_ruangan = '"+nama_ruang+"' order by ruangan.jenis_ruangan desc";
                ResultSet res = tsql2.executeQuery(sqls);
                res.next();
                String mul =res.getString("jam_"+mulai);

                System.out.println(mul);
                System.out.println("f"+id_ruang);
                while(res.next()){
                    if(durasi=="1 jam" && mul!= "isi"){
                        in_akhir = res_jam + 1;
                        
                        akhir = Integer.toString(in_akhir);
                        
                        String sql1=("insert into detail_peminjaman(tanggal_peminjaman, waktu_mulai, waktu_akhir, tanggal_pengajuan,waktu_pengajuan, id_peminjam,id_admin, id_ruangan, keperluan,status)"
                        + " values('" + tanggal + "','" + mulai+ ":00 ','"+akhir+ ":00','"+ getTanggal()+"','"+getWaktu()+ "','"+id_peminjam+"','"+id_peminjam+"','"+id_ruang+"','"+tujuan+"','belum')");
                        String sql2="update detail_ruangan SET jam_"+mulai+" = 'isi' where id_ruangan = '"+id_ruang+"' AND tanggal = '"+tanggal+"'";
                        tsql.addBatch(sql1);
                        tsql.addBatch(sql2);
                        
                        tsql.executeBatch();
                        JOptionPane.showMessageDialog(this, "Data peminjaman berhasil ditambah");
                       
                      
                    }
                    else if(durasi=="2 jam" && mul!="isi"){
                        in_akhir = res_jam + 1;
                        akhir = Integer.toString(in_akhir);
                        
//                        mulai = Integer.toString(res_jam);
//                        in_tengah = res_jam + 1;
//                        tengah = Integer.toString(in_tengah);
                        
                        String sql1=("insert into detail_peminjaman(tanggal_peminjaman, waktu_mulai, waktu_akhir, tanggal_pengajuan,waktu_pengajuan, id_peminjam,id_admin, id_ruangan, keperluan,status)"
                        + " values('" + tanggal + "','" + mulai+ ":00 ','"+akhir+ ":00 ','"+ getTanggal()+"','"+getWaktu()+ "','"+id_peminjam+"','"+id_peminjam+"','"+id_ruang+"','"+tujuan+"','belum')");
                        String sql2="update detail_ruangan SET jam_"+mulai+" = 'isi', jam_"+akhir+" = 'isi' where id_ruangan = '"+id_ruang+"' AND tanggal = '"+tanggal+"'";
                        tsql.addBatch(sql1);
                        tsql.addBatch(sql2);
                        
                        tsql.executeBatch();
//                        JOptionPane.showMessageDialog(this, "Data peminjaman berhasil ditambah");
                        
                    }else{
                        System.out.println("data salah");
                        JOptionPane.showMessageDialog(this, "Data salah");
                    }
                    
                        
                    
            
                    
                }
            } else{
//                res.next();
//                Statement tsql2 = db.createStatement();
//                ResultSet res2 = tsql2.executeQuery(sqls);
                String sql1="insert into detail_ruangan(id_ruangan,jam_8,jam_9,jam_10,jam_11,jam_12,jam_13,jam_14,jam_15,jam_16,jam_17,jam_18,jam_19,jam_20,tanggal)"
                        + " values('01 ','-','-','-','-','-','-','-','-','-','-','-','-','-','"+tanggal+"')";
                
                String sql2="insert into detail_ruangan(id_ruangan,jam_8,jam_9,jam_10,jam_11,jam_12,jam_13,jam_14,jam_15,jam_16,jam_17,jam_18,jam_19,jam_20,tanggal)"
                        + " values('02 ','-','-','-','-','-','-','-','-','-','-','-','-','-','"+tanggal+"')";
                
                String sql3="insert into detail_ruangan(id_ruangan,jam_8,jam_9,jam_10,jam_11,jam_12,jam_13,jam_14,jam_15,jam_16,jam_17,jam_18,jam_19,jam_20,tanggal)"
                        + " values('03 ','-','-','-','-','-','-','-','-','-','-','-','-','-','"+tanggal+"')";
                String sql4="insert into detail_ruangan(id_ruangan,jam_8,jam_9,jam_10,jam_11,jam_12,jam_13,jam_14,jam_15,jam_16,jam_17,jam_18,jam_19,jam_20,tanggal)"
                        + " values('04 ','-','-','-','-','-','-','-','-','-','-','-','-','-','"+tanggal+"')";
                
                String sql5="insert into detail_ruangan(id_ruangan,jam_8,jam_9,jam_10,jam_11,jam_12,jam_13,jam_14,jam_15,jam_16,jam_17,jam_18,jam_19,jam_20,tanggal)"
                        + " values('05 ','-','-','-','-','-','-','-','-','-','-','-','-','-','"+tanggal+"')";
                
                String sql6="insert into detail_ruangan(id_ruangan,jam_8,jam_9,jam_10,jam_11,jam_12,jam_13,jam_14,jam_15,jam_16,jam_17,jam_18,jam_19,jam_20,tanggal)"
                        + " values('06 ','-','-','-','-','-','-','-','-','-','-','-','-','-','"+tanggal+"')";
                
                String sql7="insert into detail_ruangan(id_ruangan,jam_8,jam_9,jam_10,jam_11,jam_12,jam_13,jam_14,jam_15,jam_16,jam_17,jam_18,jam_19,jam_20,tanggal)"
                        + " values('07 ','-','-','-','-','-','-','-','-','-','-','-','-','-','"+tanggal+"')";
                
                
                tsql.addBatch(sql1);
                tsql.addBatch(sql2);
                tsql.addBatch(sql3);
                tsql.addBatch(sql4);
                tsql.addBatch(sql5);
                tsql.addBatch(sql6);
                tsql.addBatch(sql7);
                
                tsql.executeBatch();
//                res.next();
//                tsql.executeUpdate(""+sql1);
//                res.next();
//                tsql.executeUpdate(""+sql2);
                
                
                


            }
            
//            String sql = "SELECT id_ruangan FROM ruangan WHERE nama_ruangan = '" + nama_ruangan+ "'";
//            Statement tsql = db.createStatement();
//            ResultSet result=tsql.executeQuery(sql);
//            result.next();
//            String id_ruang= result.getString("id_ruangan");
//            
//            if(durasi=="1 jam"){
//                tsql.execute("insert into detail_peminjaman(tanggal_peminjaman, waktu_mulai, waktu_akhir, tanggal_pengajuan,waktu_pengajuan, id_peminjam,id_admin, id_ruangan, keperluan)"
//                    + " values('" + tanggal + "','" + mulai + "','"+akhir+ "','"+ getTanggal()+"','"+getWaktu()+ "','"+id_peminjam+"','2','"+id_ruang+"','"+tujuan+"')");
//                tsql.execute(sql);
//            }
//            tsql.execute("insert into detail_peminjaman(tanggal_peminjaman, waktu_mulai, waktu_akhir, tanggal_pengajuan,waktu_pengajuan, id_peminjam,id_admin, id_ruangan, keperluan)"
//                    + " values('" + tanggal + "','" + mulai + "','"+akhir+ "','"+ getTanggal()+"','"+getWaktu()+ "','"+id_peminjam+"','2','"+id_ruang+"','"+tujuan+"')");
//            
////            tsql.execute("update ruangan(tanggal_peminjaman, waktu_mulai, waktu_akhir, id_peminjam,id_admin, id_ruangan, keperluan)"
////                    + " values('" + tanggal + "','" + mulai + "','"+akhir+ "','6706174073','2','01','"+tujuan+"')");
//            
//            
//            JOptionPane.showMessageDialog(this, "Data peminjaman berhasil ditambah");
//            
////                    id_ruangan = result.getString("id_ruangan");
////            fd_id.setText("");
////            fd_pw.setText("");
////            fd_nama.setText("");
//            
//JOptionPane.showMessageDialog(this, "Data peminjaman berhasil ditambah");
            menu_peminjam pm = new menu_peminjam();
            pm.show();
            this.dispose();
//            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
           
        }
    }//GEN-LAST:event_bt_pinjamActionPerformed

    private void bt_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batalActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bt_batalActionPerformed

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
            java.util.logging.Logger.getLogger(detail_pinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detail_pinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detail_pinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detail_pinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new detail_pinjaman().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(detail_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_batal;
    private javax.swing.JButton bt_pinjam;
    private javax.swing.JComboBox<String> cb_durasi;
    private javax.swing.JComboBox<String> cb_mulai;
    private javax.swing.JComboBox<String> cb_ruangan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_pinjam;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextArea txt_tujuan;
    // End of variables declaration//GEN-END:variables
}
