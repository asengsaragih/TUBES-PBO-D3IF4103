/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakaku;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Layat
 */
public class AdminTebakAku extends javax.swing.JFrame {

    /**
     * Creates new form HalamanAdmin
     */
    private Connection connection;
    public AdminTebakAku() {
        initComponents();
        // Koneksi ke database
        connection = Config.databaseConnection();
        // Mengatur JFrame menjadi ke tengah
        this.setLocationRelativeTo(null);
        // Tampil Tebak Aku
        tampilTebakAku();
        // Hidden ID
        getIdQuiz.setVisible(false);
        // Gambar Pengaturan
        ImageIcon settingImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Image/profil.png")));
        Image settings = settingImage.getImage();
        Image imageScaled = settings.getScaledInstance(gambarAdmin.getWidth(), gambarAdmin.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon settingsImage = new ImageIcon(imageScaled);
        gambarAdmin.setIcon(settingsImage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnTebakAku = new javax.swing.JLabel();
        btnTebakAngka = new javax.swing.JLabel();
        btnTebakGambar = new javax.swing.JLabel();
        btnDaftarPemain = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JLabel();
        gambarAdmin = new javax.swing.JLabel();
        textAdmin = new javax.swing.JLabel();
        textMenu = new javax.swing.JLabel();
        textMenu1 = new javax.swing.JLabel();
        Mini3 = new javax.swing.JLabel();
        Close3 = new javax.swing.JLabel();
        textMenu2 = new javax.swing.JLabel();
        inputSoalQuiz = new javax.swing.JTextField();
        inputJawabanQuiz = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JLabel();
        btnUbah = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTebakAku = new javax.swing.JTable();
        getIdQuiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));

        btnTebakAku.setBackground(new java.awt.Color(102, 153, 255));
        btnTebakAku.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTebakAku.setForeground(new java.awt.Color(255, 255, 255));
        btnTebakAku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTebakAku.setText("TEBAK AKU");
        btnTebakAku.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTebakAku.setOpaque(true);
        btnTebakAku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTebakAkuMouseClicked(evt);
            }
        });

        btnTebakAngka.setBackground(new java.awt.Color(137, 196, 244));
        btnTebakAngka.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTebakAngka.setForeground(new java.awt.Color(255, 255, 255));
        btnTebakAngka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTebakAngka.setText("TEBAK ANGKA");
        btnTebakAngka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTebakAngka.setOpaque(true);
        btnTebakAngka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTebakAngkaMouseClicked(evt);
            }
        });

        btnTebakGambar.setBackground(new java.awt.Color(137, 196, 244));
        btnTebakGambar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnTebakGambar.setForeground(new java.awt.Color(255, 255, 255));
        btnTebakGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTebakGambar.setText("TEBAK GAMBAR");
        btnTebakGambar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTebakGambar.setOpaque(true);
        btnTebakGambar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTebakGambarMouseClicked(evt);
            }
        });

        btnDaftarPemain.setBackground(new java.awt.Color(137, 196, 244));
        btnDaftarPemain.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnDaftarPemain.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftarPemain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDaftarPemain.setText("DAFTAR PEMAIN");
        btnDaftarPemain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDaftarPemain.setOpaque(true);
        btnDaftarPemain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDaftarPemainMouseClicked(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(255, 51, 51));
        btnKeluar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKeluar.setText("KELUAR");
        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.setOpaque(true);
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });

        gambarAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gambarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profil.png"))); // NOI18N
        gambarAdmin.setText("GAMBAR");

        textAdmin.setBackground(new java.awt.Color(137, 196, 244));
        textAdmin.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textAdmin.setForeground(new java.awt.Color(255, 255, 255));
        textAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAdmin.setText("Administrator");
        textAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textAdmin.setOpaque(true);
        textAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTebakAku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTebakAngka, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnTebakGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnDaftarPemain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(textAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(gambarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(gambarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnTebakAku, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTebakAngka, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTebakGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDaftarPemain, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textMenu.setBackground(new java.awt.Color(102, 153, 255));
        textMenu.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textMenu.setForeground(new java.awt.Color(255, 255, 255));
        textMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMenu.setText("TEBAK AKU");
        textMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textMenu.setOpaque(true);
        textMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMenuMouseClicked(evt);
            }
        });

        textMenu1.setBackground(new java.awt.Color(255, 255, 255));
        textMenu1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textMenu1.setText("Soal Quiz        :");
        textMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textMenu1.setOpaque(true);
        textMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMenu1MouseClicked(evt);
            }
        });

        Mini3.setBackground(new java.awt.Color(255, 255, 255));
        Mini3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Mini3.setText("-");
        Mini3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mini3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mini3MouseClicked(evt);
            }
        });

        Close3.setBackground(new java.awt.Color(255, 255, 255));
        Close3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        Close3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close3.setText("x");
        Close3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close3MouseClicked(evt);
            }
        });

        textMenu2.setBackground(new java.awt.Color(255, 255, 255));
        textMenu2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        textMenu2.setText("Jawaban Quiz :");
        textMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textMenu2.setOpaque(true);
        textMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMenu2MouseClicked(evt);
            }
        });

        inputSoalQuiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        inputJawabanQuiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSimpan.setBackground(new java.awt.Color(102, 153, 255));
        btnSimpan.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSimpan.setText("Simpan");
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setOpaque(true);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(51, 255, 51));
        btnUbah.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnUbah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUbah.setText("Ubah");
        btnUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbah.setOpaque(true);
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 0));
        btnReset.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setOpaque(true);
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 51, 51));
        btnHapus.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus.setText("Hapus");
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setOpaque(true);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        tabelTebakAku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "ID Quiz", "Soal Quiz", "Jawaban Quiz"
            }
        ));
        tabelTebakAku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTebakAkuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTebakAku);
        if (tabelTebakAku.getColumnModel().getColumnCount() > 0) {
            tabelTebakAku.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getIdQuiz.setText("hidden Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mini3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(inputJawabanQuiz))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 225, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(textMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(getIdQuiz)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(inputSoalQuiz))))))
                        .addGap(18, 18, 18)
                        .addComponent(Close3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(textMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mini3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(textMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(getIdQuiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSoalQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputJawabanQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTebakAkuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTebakAkuMouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_btnTebakAkuMouseClicked

    private void btnTebakAngkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTebakAngkaMouseClicked
        // TODO add your handling code here:
        new AdminTebakAngka().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTebakAngkaMouseClicked

    private void btnTebakGambarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTebakGambarMouseClicked
        // TODO add your handling code here:
        new AdminTebakGambar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTebakGambarMouseClicked

    private void btnDaftarPemainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDaftarPemainMouseClicked
        // TODO add your handling code here:
        new AdminDaftarPemain().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDaftarPemainMouseClicked

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(this, "Kamu yakin mau keluar?");
        if(dialogResult == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void textAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAdminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textAdminMouseClicked

    private void textMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textMenuMouseClicked

    private void textMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textMenu1MouseClicked

    private void Mini3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mini3MouseClicked
        // TODO add your handling code here:
        //untuk me-minimize landing page
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_Mini3MouseClicked

    private void Close3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close3MouseClicked
        // TODO add your handling code here:
        //untuk menutup/meng-close landing page
        int dialogResult = JOptionPane.showConfirmDialog(this, "Kamu yakin mau keluar?");
        if(dialogResult == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_Close3MouseClicked

    private void textMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMenu2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textMenu2MouseClicked

    private void tampilTebakAku(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Quiz");
        model.addColumn("Soal Quiz");
        model.addColumn("Jawaban Quiz");
        int nomor = 1;
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM quiz_tebak_aku");
            while(resultSet.next()){
                model.addRow(new Object[]{
                    nomor++,
                    resultSet.getString("id_quiz"),
                    resultSet.getString("soal_quiz"),
                    resultSet.getString("jawaban_quiz")
                });
            }
            tabelTebakAku.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void clearForm(){
        inputSoalQuiz.setText("");
        inputJawabanQuiz.setText("");
    }
    
    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        // TODO add your handling code here:
        String soalQuiz = inputSoalQuiz.getText();
        String jawabanQuiz = inputJawabanQuiz.getText();
        if(soalQuiz.equals("") || jawabanQuiz.equals("")){
            JOptionPane.showMessageDialog(this, "Form tidak boleh kosong");
        }else{
            try{
                Statement statement = connection.createStatement();
                statement.execute("INSERT INTO quiz_tebak_aku (soal_quiz,jawaban_quiz) VALUES ('"+soalQuiz+"','"+jawabanQuiz+"')");
                JOptionPane.showMessageDialog(this, "Berhasil Input Data");
                clearForm();
                tampilTebakAku();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        // TODO add your handling code here:
        String idQuiz = getIdQuiz.getText();
        String soalQuiz = inputSoalQuiz.getText();
        String jawabanQuiz = inputJawabanQuiz.getText();
        try{
            int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin akan mengubah data?");
            if(dialogResult == JOptionPane.YES_OPTION){
                Statement statement = connection.createStatement();
                statement.execute("UPDATE quiz_tebak_aku SET soal_quiz = '"+soalQuiz+"', jawaban_quiz = '"+jawabanQuiz+"' WHERE id_quiz = '"+idQuiz+"'");
                JOptionPane.showMessageDialog(this, "Berhasil Mengubah Data");
            }
            tampilTebakAku();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
        String idQuiz = getIdQuiz.getText();
        try{
            int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin akan hapus data?");
            if(dialogResult == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, "Berhasil Hapus Data");
                Statement statement = connection.createStatement();
                statement.execute("DELETE FROM quiz_tebak_aku WHERE id_quiz = '"+idQuiz+"'");
            }
            tampilTebakAku();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnHapusMouseClicked

    private void tabelTebakAkuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTebakAkuMouseClicked
        // TODO add your handling code here:
        int baris = tabelTebakAku.rowAtPoint(evt.getPoint());
        String idQuiz = tabelTebakAku.getValueAt(baris,1).toString();
        getIdQuiz.setText(idQuiz);
        String soalQuiz = tabelTebakAku.getValueAt(baris,2).toString();
        inputSoalQuiz.setText(soalQuiz);
        String jawabanQuiz = tabelTebakAku.getValueAt(baris,3).toString();
        inputJawabanQuiz.setText(jawabanQuiz);
    }//GEN-LAST:event_tabelTebakAkuMouseClicked

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
            java.util.logging.Logger.getLogger(AdminTebakAku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTebakAku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTebakAku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTebakAku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTebakAku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close3;
    private javax.swing.JLabel Mini3;
    private javax.swing.JLabel btnDaftarPemain;
    private javax.swing.JLabel btnHapus;
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JLabel btnReset;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel btnTebakAku;
    private javax.swing.JLabel btnTebakAngka;
    private javax.swing.JLabel btnTebakGambar;
    private javax.swing.JLabel btnUbah;
    private javax.swing.JLabel gambarAdmin;
    private javax.swing.JLabel getIdQuiz;
    private javax.swing.JTextField inputJawabanQuiz;
    private javax.swing.JTextField inputSoalQuiz;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelTebakAku;
    private javax.swing.JLabel textAdmin;
    private javax.swing.JLabel textMenu;
    private javax.swing.JLabel textMenu1;
    private javax.swing.JLabel textMenu2;
    // End of variables declaration//GEN-END:variables
}
