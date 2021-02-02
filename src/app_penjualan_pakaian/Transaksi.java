/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_penjualan_pakaian;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Transaksi extends javax.swing.JFrame {
    private Statement st,str;
    private ResultSet rsb,rst;
    private int update_stock;
    private String sKode,stock,s;
    private DefaultTableModel barang,transaksi;
    Connection cn = Koneksi.Koneksi();
    
    public Transaksi() {
        initComponents();
        setVisible(true);
        refresh();
        autokode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        btnTutup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJenisBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHargaSatuan = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnBeli = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Data Barang");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBarang.setVerifyInputWhenFocusTarget(false);
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTransaksi.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tblTransaksi);

        btnTutup.setText("Tutup");
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kode Barang");

        txtKodeBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtKodeBarang.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Jenis Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Harga Satuan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Jumlah");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Total Harga");

        txtJenisBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtJenisBarang.setEnabled(false);

        txtNamaBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNamaBarang.setEnabled(false);

        txtHargaSatuan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHargaSatuan.setEnabled(false);

        txtJumlah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtJumlah.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtJumlahPropertyChange(evt);
            }
        });

        txtTotalHarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotalHarga.setEnabled(false);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnBeli.setText("Beli");
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Data Barang");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Data Transaksi");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtHargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        setSize(new java.awt.Dimension(725, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        btnTambah.setEnabled(false);
        btnBeli.setEnabled(false);
        btnBatal.setEnabled(true);
        
        tblBarang.setEnabled(true);
        
        tblBarang.setFocusable(true);
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        txtKodeBarang.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(), 0).toString());
        txtNamaBarang.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(), 1).toString());
        txtJenisBarang.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(), 2).toString());
        stock = (tblBarang.getValueAt(tblBarang.getSelectedRow(), 3).toString());
        txtHargaSatuan.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(), 4).toString());
        
        txtJumlah.setEnabled(true);
        
        btnTambah.setEnabled(false);
        btnHitung.setEnabled(true);
        btnBeli.setEnabled(false);
        btnBatal.setEnabled(true);
    }//GEN-LAST:event_tblBarangMouseClicked

    private void updatedata(){
    try {
            st = cn.createStatement();
            
            update_stock = Integer.parseInt(stock) - Integer.parseInt(txtJumlah.getText());
           
            st.executeUpdate("UPDATE barang set " +"stock='"+ update_stock + "' WHERE kode_barang ='" + txtKodeBarang.getText() + "' ");
                 
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed

        try {
            st = cn.createStatement();
            
            if (txtJumlah.getText().equals("")) {        
                JOptionPane.showMessageDialog(null, "Data Masih Kosong!","Pesan Error", JOptionPane.ERROR_MESSAGE);
            }
            
            int jawab;
            if ((jawab = JOptionPane.showConfirmDialog(null, "Lanjutkan Pembelian?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
                if (cariData(" WHERE kode_transaksi like  '%"+sKode+"%'")){
                JOptionPane.showMessageDialog(null, "Data Sudah Ada!","Pesan Error", JOptionPane.ERROR_MESSAGE);
                tampilDataTransaksi("");
                }else{
                    st.executeUpdate("INSERT INTO transaksi VALUES ('"+sKode+"','"+txtKodeBarang.getText()+"','"+txtNamaBarang.getText()+"','"+txtJenisBarang.getText()+"','"+txtJumlah.getText()+"','"+txtHargaSatuan.getText()+"','"+txtTotalHarga.getText()+"')");
                    updatedata();
                    JOptionPane.showMessageDialog(null, "Pembelian Berhasil!");
                    tampilDataTransaksi("");
                    refresh();
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBeliActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        refresh();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTutupActionPerformed

    private void txtJumlahPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtJumlahPropertyChange
        
    }//GEN-LAST:event_txtJumlahPropertyChange

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
       TransaksiLogic tr = new TransaksiLogic();
       if  (Integer.parseInt(txtJumlah.getText()) > (Integer.parseInt(stock))){
           JOptionPane.showMessageDialog(null, "Melebihi Stock Yang Tersedia!","Pesan Error", JOptionPane.ERROR_MESSAGE);
       }else{
           tr.setHargaSatuan(Double.parseDouble(txtHargaSatuan.getText()));
           tr.setJumlah(Double.parseDouble(txtJumlah.getText()));
           txtTotalHarga.setText(String.valueOf(tr.getHargaTotal()));
           btnBeli.setEnabled(true);
        }
      
    }//GEN-LAST:event_btnHitungActionPerformed
    
    public void judulBarang(){
        Object[] judulbarang = {"Kode Barang","Nama Barang","Jenis Barang","Stock Barang","Harga Barang"};
        barang  = new DefaultTableModel(null, judulbarang);
        tblBarang.setModel(barang);
        
        tblBarang.getColumnModel().getColumn(0).setPreferredWidth(25);
        tblBarang.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblBarang.getColumnModel().getColumn(2).setPreferredWidth(30);
        tblBarang.getColumnModel().getColumn(3).setPreferredWidth(10);
        tblBarang.getColumnModel().getColumn(4).setPreferredWidth(30);
    }
    public void judulTransaksi() {
        Object[] judultransaksi = {"Kode Transaksi","Kode Barang","Nama Barang","Jenis Barang","Jumlah","Harga Satuan","Harga Total"};
        transaksi = new DefaultTableModel(null, judultransaksi);
        tblTransaksi.setModel(transaksi);
        
        tblTransaksi.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblTransaksi.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblTransaksi.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblTransaksi.getColumnModel().getColumn(3).setPreferredWidth(35);
        tblTransaksi.getColumnModel().getColumn(4).setPreferredWidth(10);
        tblTransaksi.getColumnModel().getColumn(5).setPreferredWidth(30);
        tblTransaksi.getColumnModel().getColumn(6).setPreferredWidth(30);
    }
    
    public void refresh(){
        txtKodeBarang.setText("");
        txtNamaBarang.setText("");
        txtJenisBarang.setText("");
        txtHargaSatuan.setText("");
        txtJumlah.setText("");
        txtTotalHarga.setText("");
        
        txtJumlah.setEnabled(false);
        
        btnTambah.setEnabled(true);
        btnHitung.setEnabled(false);
        btnBeli.setEnabled(false);
        btnBatal.setEnabled(true);
        
        tblBarang.setEnabled(false);
        
        autokode();
            
        judulBarang();
        judulTransaksi();
        tampilDataBarang("");
        tampilDataTransaksi("");
    }
    
    public void autokode(){
        sKode = String.valueOf((tblTransaksi.getRowCount())+1);
        s = String.valueOf(sKode.length());
        switch(s){
                case "1" :
                    sKode = "TF-" + "000" + sKode;
                    break;
                case "2" :
                    sKode = "TF-" + "00" + sKode;
                    break;
                case "3" :
                    sKode = "TF-" + "0" + sKode;
                    break;
                case "4" :
                    sKode = "TF-" + "" + sKode;
                    break;
            }
        jLabel10.setText("Kode transaksi : "+sKode);
       
        jLabel11.setText("Jumlah Data :"+String.valueOf(tblBarang.getRowCount()));
    }
    
    public void tampilDataBarang(String where) {
      try {
        st = cn.createStatement();
        barang.getDataVector().removeAllElements();
        barang.fireTableDataChanged();
        rsb= st.executeQuery("SELECT * FROM barang " + where);
      

        while (rsb.next()) {
          Object[] data = {
              rsb.getString("kode_barang"),
              rsb.getString("nama_barang"),
              rsb.getString("jenis_barang"),
              rsb.getString("stock"),
              rsb.getString("harga"),
          };
          barang.addRow(data);
        }
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
    
    public void tampilDataTransaksi(String where) {
      try {
        str = cn.createStatement();
        transaksi.getDataVector().removeAllElements();
        transaksi.fireTableDataChanged();
        rst = str.executeQuery("SELECT * FROM transaksi " + where);

        while (rst.next()) {
          Object[] data = {
              rst.getString("kode_transaksi"),
              rst.getString("kode_barang"),
              rst.getString("nama_barang"),
              rst.getString("jenis_barang"),
              rst.getString("jumlah"),
              rst.getString("harga_satuan"),
              rst.getString("harga_total"),
          };
          transaksi.addRow(data);
        }
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
    
    public Boolean cariData(String where){
        try {
        st = cn.createStatement();
        transaksi.getDataVector().removeAllElements();
        transaksi.fireTableDataChanged();
        rst = st.executeQuery("SELECT * FROM transaksi " + where);

        while (rst.next()) {
          Object[] data = {
              rst.getString("kode_transakis"),
              rst.getString("kode_barang"),
              rst.getString("nama_barang"),
              rst.getString("jenis_barang"),
              rst.getString("jumlah"),
              rst.getString("harga_satuan"),
              rst.getString("harga_total"),
          };
          transaksi.addRow(data);
          return (true);
        }
        return (false);
      }catch(Exception e) {
        e.printStackTrace();
      }return(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTutup;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField txtHargaSatuan;
    private javax.swing.JTextField txtJenisBarang;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
