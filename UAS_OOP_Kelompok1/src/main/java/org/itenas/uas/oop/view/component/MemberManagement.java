/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itenas.uas.oop.view.component;

import org.itenas.uas.oop.pojo.Member;
import org.itenas.uas.oop.service.MemberService;
import org.itenas.uas.oop.serviceimpl.MemberServiceImpl;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.itenas.uas.oop.view.component.swing.Button;
import org.itenas.uas.oop.view.component.swing.Label;
import org.itenas.uas.oop.view.component.swing.MyPasswordField;
import org.itenas.uas.oop.view.component.swing.MyTextField;
import org.itenas.uas.oop.view.component.swing.ShowPasswordCheckBox;

/**
 *
 * @author BillHafidz
 */
public class MemberManagement extends javax.swing.JFrame {

    /**
     * Creates new form MemberManagement
     */
    
    MemberService memberService;
    
    public MemberManagement() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadData();
    }
    
    public void close() {
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }
    
    private void emptyField() {
        txt_id_member.setText("");
        txt_nama_member.setText("");
        txt_alamat.setText("");
        txt_email.setText("");
        txt_nomor_telepon.setText("");
    }
    
    private void loadData() {
        memberService = new MemberServiceImpl();
        List<Member> listMember = new ArrayList<>();
        listMember = memberService.findAll();
        Object[][] objectMember = new Object[listMember.size()][5];
        
        int counter = 0;
        
        for (Member member : listMember) {
            objectMember[counter][0] = member.getId();
            objectMember[counter][1] = member.getNama();
            objectMember[counter][2] = member.getAlamat();
            objectMember[counter][3] = member.getEmail();
            objectMember[counter][4] = member.getNomorTelp();
            counter++;
        }
        tabel_member.setModel(new javax.swing.table.DefaultTableModel(
            objectMember,
            new String [] {
                "ID Member", "Nama Member", "Alamat", "Email", "Nomor Telepon"
            }
        ));
    }
    
    private void loadData(Member member) {
        Object[][] objectMember = new Object[1][5];
        
        objectMember[0][0] = member.getId();
        objectMember[0][1] = member.getNama();
        objectMember[0][2] = member.getAlamat();
        objectMember[0][3] = member.getEmail();
        objectMember[0][4] = member.getNomorTelp();
            
        tabel_member.setModel(new javax.swing.table.DefaultTableModel(
            objectMember,
            new String [] {
                "ID Member", "Nama Member", "Alamat", "Email", "Nomor Telepon"
            }
        ));
    }
    
    private Member findMember(String id) {
        Member member = new Member();
        memberService = new MemberServiceImpl();
        member = memberService.findById(id);
    
        return member;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_member = new org.itenas.uas.oop.view.component.swing.TableDark();
        btn_print = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        txt_search_id = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_id_member = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama_member = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_clear = new org.itenas.uas.oop.view.component.swing.Button();
        jLabel8 = new javax.swing.JLabel();
        txt_nomor_telepon = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        btn_add = new org.itenas.uas.oop.view.component.swing.Button();
        btn_update = new org.itenas.uas.oop.view.component.swing.Button();
        btn_delete = new org.itenas.uas.oop.view.component.swing.Button();
        txt_email = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        admin_dashboard_item = new javax.swing.JMenuItem();
        komik_management_item = new javax.swing.JMenuItem();
        buku_management_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1120, 800));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(245, 172, 44));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MEMBER MANAGEMENT");

        tabel_member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul Buku", "Pengarang", "Penerbit", "Tahun Terbit", "Harga", "Status"
            }
        ));
        tabel_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_memberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_member);

        btn_print.setBackground(new java.awt.Color(255, 255, 255));
        btn_print.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btn_print.setForeground(new java.awt.Color(0, 0, 0));
        btn_print.setText("PRINT");
        btn_print.setMargin(new java.awt.Insets(4, 14, 4, 14));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        btn_refresh.setBackground(new java.awt.Color(255, 255, 255));
        btn_refresh.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btn_refresh.setForeground(new java.awt.Color(0, 0, 0));
        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        txt_search_id.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        txt_search_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search_idMouseClicked(evt);
            }
        });
        txt_search_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_idActionPerformed(evt);
            }
        });
        txt_search_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_search_idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_search_idKeyTyped(evt);
            }
        });

        btn_search.setBackground(new java.awt.Color(255, 255, 255));
        btn_search.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        btn_search.setForeground(new java.awt.Color(0, 0, 0));
        btn_search.setText("SEARCH");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user group.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 90, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_refresh)))
                        .addGap(115, 115, 115)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_refresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        txt_id_member.setBackground(new java.awt.Color(245, 172, 45));
        txt_id_member.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_id_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_memberActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID Member");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("nama member");

        txt_nama_member.setBackground(new java.awt.Color(245, 172, 44));
        txt_nama_member.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nama_member.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_nama_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_memberActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("email");

        btn_clear.setBackground(new java.awt.Color(51, 51, 255));
        btn_clear.setText("CLEAR");
        btn_clear.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("nomor telepon");

        txt_nomor_telepon.setBackground(new java.awt.Color(245, 172, 44));
        txt_nomor_telepon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nomor_telepon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_nomor_telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomor_teleponActionPerformed(evt);
            }
        });

        txt_alamat.setBackground(new java.awt.Color(245, 172, 44));
        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_alamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(51, 204, 0));
        btn_add.setText("ADD");
        btn_add.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(255, 255, 0));
        btn_update.setText("UPDATE");
        btn_update.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 51, 51));
        btn_delete.setText("DELETE");
        btn_delete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_email.setBackground(new java.awt.Color(245, 172, 44));
        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nama_member, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addComponent(txt_id_member, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_nomor_telepon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(txt_id_member, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txt_nama_member, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txt_nomor_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Menu");

        admin_dashboard_item.setText("Admin Dashboard");
        admin_dashboard_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_dashboard_itemActionPerformed(evt);
            }
        });
        jMenu1.add(admin_dashboard_item);

        komik_management_item.setText("Komik Management");
        komik_management_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komik_management_itemActionPerformed(evt);
            }
        });
        jMenu1.add(komik_management_item);

        buku_management_item.setText("Buku Management");
        buku_management_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buku_management_itemActionPerformed(evt);
            }
        });
        jMenu1.add(buku_management_item);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void txt_id_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_memberActionPerformed

    private void txt_nama_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_memberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_memberActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        emptyField();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_nomor_teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomor_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomor_teleponActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String id_member, nama, alamat, email, nomorTelepon;
        memberService = new MemberServiceImpl();

        id_member = txt_id_member.getText();
        nama = txt_nama_member.getText();
        alamat = txt_alamat.getText();
        email = txt_email.getText();
        nomorTelepon = txt_nomor_telepon.getText();

        Member member = new Member();
        member.setId(id_member);
        member.setNama(nama);
        member.setAlamat(alamat);
        member.setEmail(email);
        member.setNomorTelp(nomorTelepon);

        memberService.create(member);
        JOptionPane.showMessageDialog(null, "Data member berhasil dibuat!");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String id_member, nama, alamat, email, nomorTelepon;
        memberService = new MemberServiceImpl();

        id_member = txt_id_member.getText();
        nama = txt_nama_member.getText();
        alamat = txt_alamat.getText();
        email = txt_email.getText();
        nomorTelepon = txt_nomor_telepon.getText();

        Member member = new Member();
        member.setId(id_member);
        member.setNama(nama);
        member.setAlamat(alamat);
        member.setEmail(email);
        member.setNomorTelp(nomorTelepon);

        memberService.update(member);
        JOptionPane.showMessageDialog(null, "Data member berhasil di update!");
        loadData();
        emptyField();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        String id_member;
        memberService = new MemberServiceImpl();
        int dialogButton = JOptionPane.YES_NO_OPTION;

        id_member = txt_id_member.getText();

        int dialogResult = JOptionPane.showConfirmDialog (null, "Apakah anda yakin untuk menghapus?", "Warning", dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            memberService.delete(id_member);
            JOptionPane.showMessageDialog(null, "Data member berhasil di hapus!");
            loadData();
            emptyField();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void tabel_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_memberMouseClicked
        String id_member, nama, alamat, email, nomorTelepon;
        memberService = new MemberServiceImpl();

        int row = tabel_member.getSelectedRow();
        id_member = tabel_member.getValueAt(row, 0).toString();
        nama = tabel_member.getValueAt(row, 1).toString();
        alamat = tabel_member.getValueAt(row, 2).toString();
        email = tabel_member.getValueAt(row, 3).toString();
        nomorTelepon = tabel_member.getValueAt(row, 4).toString();

        txt_id_member.setText(id_member);
        txt_nama_member.setText(nama);
        txt_alamat.setText(alamat);
        txt_email.setText(email);
        txt_nomor_telepon.setText(nomorTelepon);
    }//GEN-LAST:event_tabel_memberMouseClicked

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("Laporan List Member");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            tabel_member.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        loadData();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void txt_search_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search_idMouseClicked
        txt_search_id.setText("");
    }//GEN-LAST:event_txt_search_idMouseClicked

    private void txt_search_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_idActionPerformed
        txt_search_id.setText("");
    }//GEN-LAST:event_txt_search_idActionPerformed

    private void txt_search_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_idKeyPressed

    }//GEN-LAST:event_txt_search_idKeyPressed

    private void txt_search_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_idKeyReleased
        DefaultTableModel ob = (DefaultTableModel)tabel_member.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        tabel_member.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter("(?i)"+txt_search_id.getText()));
    }//GEN-LAST:event_txt_search_idKeyReleased

    private void txt_search_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_idKeyTyped

    }//GEN-LAST:event_txt_search_idKeyTyped

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String id_member;
        Member searchedMember = new Member();

        id_member = txt_search_id.getText();
        searchedMember = findMember(id_member);
        if (searchedMember != null) {
            loadData(searchedMember);
        } else {
            JOptionPane.showMessageDialog(null, "Data dengan id '" + id_member + "' tidak ditemukan!");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void admin_dashboard_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_dashboard_itemActionPerformed
        AdminDashboard dashboard = new AdminDashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_admin_dashboard_itemActionPerformed

    private void komik_management_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komik_management_itemActionPerformed
        KomikManagement komikManagement = new KomikManagement();
        komikManagement.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_komik_management_itemActionPerformed

    private void buku_management_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buku_management_itemActionPerformed
        BukuManagement bukuManagement = new BukuManagement();
        bukuManagement.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buku_management_itemActionPerformed

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
            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem admin_dashboard_item;
    private org.itenas.uas.oop.view.component.swing.Button btn_add;
    private org.itenas.uas.oop.view.component.swing.Button btn_clear;
    private org.itenas.uas.oop.view.component.swing.Button btn_delete;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_search;
    private org.itenas.uas.oop.view.component.swing.Button btn_update;
    private javax.swing.JMenuItem buku_management_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem komik_management_item;
    private org.itenas.uas.oop.view.component.swing.TableDark tabel_member;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id_member;
    private javax.swing.JTextField txt_nama_member;
    private javax.swing.JTextField txt_nomor_telepon;
    private javax.swing.JTextField txt_search_id;
    // End of variables declaration//GEN-END:variables
}
