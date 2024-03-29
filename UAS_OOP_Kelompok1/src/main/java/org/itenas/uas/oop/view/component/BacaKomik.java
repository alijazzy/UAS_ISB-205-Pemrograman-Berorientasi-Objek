/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.uas.oop.view.component;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.itenas.uas.oop.pojo.Baca;
import org.itenas.uas.oop.pojo.Buku;
import org.itenas.uas.oop.pojo.Komik;
import org.itenas.uas.oop.pojo.Member;
import org.itenas.uas.oop.pojo.Sewa;
import org.itenas.uas.oop.service.BacaService;
import org.itenas.uas.oop.service.BukuService;
import org.itenas.uas.oop.service.MemberService;
import org.itenas.uas.oop.service.SewaService;
import org.itenas.uas.oop.service.TransaksiService;
import org.itenas.uas.oop.serviceimpl.BacaServiceImpl;
import org.itenas.uas.oop.serviceimpl.BukuServiceImpl;
import org.itenas.uas.oop.serviceimpl.KomikServiceImpl;
import org.itenas.uas.oop.serviceimpl.MemberServiceImpl;
import org.itenas.uas.oop.serviceimpl.SewaServiceImpl;
import org.itenas.uas.oop.serviceimpl.TransaksiServiceImpl;

/**
 *
 * @author Kelompok 1
 */
public class BacaKomik extends javax.swing.JFrame {

    BacaServiceImpl bacaService;
    KomikServiceImpl komikService;
    Komik komik;
    Baca baca;
    Member member;
    MemberService memberService;
    TransaksiService transaksiService;
    MessageForm messageForm;
    static List<Baca> listBaca = new ArrayList<>();
    String idKomik;
    boolean cek = false;
    double totalHarga = 0;
    
    public BacaKomik() {
        initComponents();
        this.setLocationRelativeTo(null);
        comboBoxModel();
        btn_tambah.setEnabled(cek);
    }
    
    private void emptyField(){
        cmb_idKomik.setSelectedIndex(0);
        txt_judul.setText("");
        txt_pengarang.setText("");
        txt_penerbit.setText("");
        txt_tahunTerbit.setText("");
        txt_harga.setText("");
        txt_status.setText("");
        txt_volume.setText("");
        cek = false;
        btn_tambah.setEnabled(cek);
   }

    private void comboBoxModel(){
        komikService = new KomikServiceImpl();
        List<Komik> listKomik = new ArrayList<>();
        listKomik = komikService.findAll();
        String[] objectKomik = new String[listKomik.size()+1];
        
        //Index pertama agar pilihan
        objectKomik[0] = "Pilih ID Komik";
        
        int counter = 1;
        
        for(Komik komik : listKomik){
            objectKomik[counter] = komik.getId();
            counter++;
        }
        
        DefaultComboBoxModel<String> komikModel = new DefaultComboBoxModel<>(objectKomik);
        cmb_idKomik.setModel(komikModel);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        judul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_idKomik = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        txt_judul = new javax.swing.JTextField();
        txt_pengarang = new javax.swing.JTextField();
        txt_penerbit = new javax.swing.JTextField();
        txt_tahunTerbit = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_bersihkan = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbl_totalHarga = new javax.swing.JLabel();
        btn_checkout = new javax.swing.JButton();
        lbl_status1 = new javax.swing.JLabel();
        txt_volume = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        judul.setBackground(new java.awt.Color(245, 172, 44));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BACA KOMIK");

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout judulLayout = new javax.swing.GroupLayout(judul);
        judul.setLayout(judulLayout);
        judulLayout.setHorizontalGroup(
            judulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, judulLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
            .addGroup(judulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        judulLayout.setVerticalGroup(
            judulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judulLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btn_exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 172, 44));
        jLabel2.setText(" Komik apa yang ingin Anda pesan kali ini?");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 172, 44));
        jLabel4.setText("Tekan \"Tambah\" untuk menambahkan komik");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 172, 44));
        jLabel5.setText("ID Komik           :");

        cmb_idKomik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_idKomikActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 172, 44));
        jLabel6.setText("Judul                 :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 172, 44));
        jLabel7.setText("Pengarang         :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 172, 44));
        jLabel8.setText("Penerbit             :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 172, 44));
        jLabel9.setText("Tahun Terbit      :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(245, 172, 44));
        jLabel10.setText("Harga                :");

        lbl_status.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(245, 172, 44));
        lbl_status.setText("Status                :");

        txt_judul.setEditable(false);
        txt_judul.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(245, 172, 44)));

        txt_pengarang.setEditable(false);
        txt_pengarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(245, 172, 44)));

        txt_penerbit.setEditable(false);
        txt_penerbit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(245, 172, 44)));

        txt_tahunTerbit.setEditable(false);
        txt_tahunTerbit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(245, 172, 44)));
        txt_tahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tahunTerbitActionPerformed(evt);
            }
        });

        txt_harga.setEditable(false);
        txt_harga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(245, 172, 44)));

        txt_status.setEditable(false);
        txt_status.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(245, 172, 44)));
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });

        btn_tambah.setBackground(new java.awt.Color(245, 172, 44));
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambahMouseClicked(evt);
            }
        });

        btn_bersihkan.setBackground(new java.awt.Color(245, 172, 44));
        btn_bersihkan.setForeground(new java.awt.Color(255, 255, 255));
        btn_bersihkan.setText("BERSIHKAN");
        btn_bersihkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bersihkanMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("TOTAL PEMBELIAN:");

        lbl_totalHarga.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_totalHarga.setForeground(new java.awt.Color(102, 102, 102));
        lbl_totalHarga.setText("Rp. ");

        btn_checkout.setBackground(new java.awt.Color(51, 255, 51));
        btn_checkout.setForeground(new java.awt.Color(255, 255, 255));
        btn_checkout.setText("CHECKOUT");
        btn_checkout.setEnabled(false);
        btn_checkout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_checkoutMouseClicked(evt);
            }
        });
        btn_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkoutActionPerformed(evt);
            }
        });

        lbl_status1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_status1.setForeground(new java.awt.Color(245, 172, 44));
        lbl_status1.setText("Volume");

        txt_volume.setEditable(false);
        txt_volume.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(245, 172, 44)));
        txt_volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_volumeActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin icon.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_checkout)
                .addGap(44, 44, 44))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(cmb_idKomik, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(txt_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(txt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9)
                        .addGap(30, 30, 30)
                        .addComponent(txt_tahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbl_status)
                        .addGap(29, 29, 29)
                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbl_status1)
                        .addGap(87, 87, 87)
                        .addComponent(txt_volume, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btn_tambah)
                        .addGap(18, 18, 18)
                        .addComponent(btn_bersihkan))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_totalHarga)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addGap(4, 4, 4)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmb_idKomik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_pengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_tahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_status)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_status1)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tambah)
                    .addComponent(btn_bersihkan))
                .addGap(28, 28, 28)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_totalHarga)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_checkout)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tahunTerbitActionPerformed

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statusActionPerformed

    private void cmb_idKomikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_idKomikActionPerformed
    double harga;
    komikService = new KomikServiceImpl();
    komik = new Komik();
    idKomik = cmb_idKomik.getSelectedItem().toString();
    
    komik = komikService.findById(idKomik);
    if (komik != null) {
        txt_judul.setText(komik.getJudul());
        txt_pengarang.setText(komik.getPengarang());
        txt_penerbit.setText(komik.getPenerbit());
        txt_tahunTerbit.setText(komik.getTahunTerbit());
        harga = komik.getHarga();
        txt_harga.setText("Rp. "+harga);
        txt_status.setText(komik.getStatus());
        txt_volume.setText(komik.getVolume());

        if(komik.getStatus().equals("Tersedia")){
            txt_status.setForeground(Color.GREEN);
            cek = true;
            btn_tambah.setEnabled(cek);
        }
        else if(komik.getStatus().equals("Tidak Tersedia")){
            txt_status.setForeground(Color.red);
            cek = false;
            btn_tambah.setEnabled(cek);
        }
    } else {
        emptyField();
    }
    }//GEN-LAST:event_cmb_idKomikActionPerformed

    private void btn_bersihkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bersihkanMouseClicked
        emptyField();
    }//GEN-LAST:event_btn_bersihkanMouseClicked

    private void btn_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseClicked
    String tglTransaksi, idBuku;
    double harga = 0;
    idBuku = cmb_idKomik.getSelectedItem().toString();
    
    LocalDate currentDate = LocalDate.now();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    tglTransaksi = formatter.format(currentDate);
    
    String hargaText = txt_harga.getText();
    String numericPart = hargaText.replace("Rp.", "").replace(",", "");
    harga = Double.parseDouble(numericPart);
    String tglTransaksi1 = tglTransaksi;
            
    baca = new Baca();
    baca.setTglTransaksi(tglTransaksi);
    baca.setTotalHarga(harga);
    
    komik = new Komik();
    komik.setId(idKomik);
    baca.setKomik(komik);
    
    
    
    listBaca.add(baca);
    
    btn_checkout.setEnabled(true);
    totalHarga += harga;
    lbl_totalHarga.setText("Rp. "+totalHarga);
    
    messageForm = new MessageForm();
    messageForm.gantiText("PESAN", "Data Komik berhasil ditambahkan.", "Lanjutkan");
    messageForm.setVisible(true);
    emptyField();
    }//GEN-LAST:event_btn_tambahMouseClicked

    private void btn_checkoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_checkoutMouseClicked
        int counter = 0;
        bacaService = new BacaServiceImpl();
        transaksiService = new TransaksiServiceImpl();
        for(Baca baca : listBaca){
            bacaService.create(baca);
            counter++;
        }
        
        messageForm = new MessageForm();
        messageForm.gantiText("TRANSAKSI DIBUAT", "Silahkan pergi ke kasir untuk membayar.", "Lanjutkan");
        messageForm.setVisible(true);
    }//GEN-LAST:event_btn_checkoutMouseClicked

    private void btn_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_checkoutActionPerformed

    private void txt_volumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_volumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_volumeActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        DashboardUser dashboard = new DashboardUser();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

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
            java.util.logging.Logger.getLogger(BacaKomik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BacaKomik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BacaKomik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BacaKomik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BacaKomik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_bersihkan;
    private javax.swing.JButton btn_checkout;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> cmb_idKomik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel judul;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_status1;
    private javax.swing.JLabel lbl_totalHarga;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_penerbit;
    private javax.swing.JTextField txt_pengarang;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_tahunTerbit;
    private javax.swing.JTextField txt_volume;
    // End of variables declaration//GEN-END:variables
}
