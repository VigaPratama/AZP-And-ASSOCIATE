/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lawyer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import koneksi.Konfig;
import static Lawyer.MainPage.a;
import static Lawyer.MainPage.b;
import static Lawyer.MainPage.c;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;




/**
 *
 * @author Me
 */
public class FormDataKasusPHI extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    /**
     * Creates new form FormPendampingPKH
     */
    public FormDataKasusPHI() {
        initComponents();
        id_data();
        ActionListener ac1=new ActionListener(){
           @Override public void actionPerformed(ActionEvent e){
             a=lb1MovingText.getText();
             b=a.substring(0, 1);
             c=a.substring(1, a.length());
             lb1MovingText.setText(c+b);
           }
        }; new javax.swing.Timer(400, ac1).start();
    }
    
    
      private void id_data(){
        try{
        Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/lawyer","root","");
        Statement stat = koneksi.createStatement();
        ResultSet rs = stat.executeQuery("select * from data_kasus_phi order by ID_Klien desc");
        if(rs.next()){
            String idd = rs.getString("ID_Klien").substring(1);
            String AN = "" + (Integer.parseInt(idd)+1);
            String Nol = "";
            
            if (AN.length()==1){Nol = "000";}
            else if (AN.length()==2){Nol = "00";}
            else if (AN.length()==3){Nol = "0";}
            else if (AN.length()==4){Nol = "";}
            
            txt_id_klien.setText("A" + Nol + AN);
        
        }else{
            txt_id_klien.setText("A0001");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    protected void kosong(){
        txt_nama_klien.setText("");
        txt_nama_kasus.setText("");
        txttgl.setDate(null);
        txt_status_kasus.setText("");
     
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nama_kasus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_status_kasus = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bhalaman = new javax.swing.JButton();
        txt_id_klien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttgl = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txt_nama_klien = new javax.swing.JTextField();
        lb1MovingText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Kasus");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txt_nama_kasus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_kasusActionPerformed(evt);
            }
        });
        jPanel4.add(txt_nama_kasus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 260, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal Kasus");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status Kasus");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        txt_status_kasus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_status_kasusActionPerformed(evt);
            }
        });
        jPanel4.add(txt_status_kasus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 260, -1));

        bsave.setBackground(new java.awt.Color(0, 0, 204));
        bsave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.PNG"))); // NOI18N
        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel4.add(bsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 120, -1));

        bedit.setBackground(new java.awt.Color(255, 153, 0));
        bedit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.PNG"))); // NOI18N
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        jPanel4.add(bedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 120, -1));

        bdelete.setBackground(new java.awt.Color(255, 0, 0));
        bdelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.PNG"))); // NOI18N
        bdelete.setText("DELETE");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        jPanel4.add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 120, -1));

        bhalaman.setBackground(new java.awt.Color(0, 0, 0));
        bhalaman.setForeground(new java.awt.Color(255, 255, 255));
        bhalaman.setText("Kembali Ke Halaman Sebelumnya -->");
        bhalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhalamanActionPerformed(evt);
            }
        });
        jPanel4.add(bhalaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, 30));
        jPanel4.add(txt_id_klien, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Klien");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));
        jPanel4.add(txttgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 260, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Klien");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        txt_nama_klien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_klienActionPerformed(evt);
            }
        });
        jPanel4.add(txt_nama_klien, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 260, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 470));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 470));

        lb1MovingText.setFont(new java.awt.Font("BIZ UDMincho Medium", 1, 18)); // NOI18N
        lb1MovingText.setForeground(new java.awt.Color(255, 255, 255));
        lb1MovingText.setText("                                                                                                                                      Form Data Kasus PHI");
        jPanel2.add(lb1MovingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 880, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
             String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(txttgl.getDate()));
        
        try{
            String sql = "INSERT INTO data_kasus_phi VALUES ('"+txt_id_klien.getText()+"','"+txt_nama_klien.getText()+"','"+txt_nama_kasus.getText()+"','"+tanggal+"','"+txt_status_kasus.getText()+"')";
            java.sql.Connection con = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
            kosong();
            id_data();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Simpan Data Gagal");
            
        }
       
    }//GEN-LAST:event_bsaveActionPerformed

    private void bhalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhalamanActionPerformed
        // TODO add your handling code here:
        DataKasusPHI backpage = new DataKasusPHI();
        backpage.show();
        dispose();
    }//GEN-LAST:event_bhalamanActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        String tampilan ="yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(txttgl.getDate()));
        
        try{
            String sql = "update data_kasus_phi set Nama_Klien='"+txt_nama_klien.getText()+"', Nama_Kasus='"+txt_nama_kasus.getText()+"', Tanggal_Kasus='"+tanggal+"', Status_Kasus='"+txt_status_kasus.getText()+"'  where ID_Klien='"+txt_id_klien.getText()+"'";
                    
            
            java.sql.Connection con = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            kosong();
            id_data();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "Edit Data Gagal");
            
        }
                
    }//GEN-LAST:event_beditActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM data_kasus_phi WHERE ID_Klien ='"+txt_id_klien.getText()+"'";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            kosong();
            id_data();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
                
    }//GEN-LAST:event_bdeleteActionPerformed

    private void txt_nama_kasusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_kasusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_kasusActionPerformed

    private void txt_status_kasusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_status_kasusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_status_kasusActionPerformed

    private void txt_nama_klienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_klienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_klienActionPerformed

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
            java.util.logging.Logger.getLogger(FormDataKasusPHI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataKasusPHI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataKasusPHI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataKasusPHI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataKasusPHI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhalaman;
    private javax.swing.JButton bsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb1MovingText;
    private javax.swing.JTextField txt_id_klien;
    private javax.swing.JTextField txt_nama_kasus;
    private javax.swing.JTextField txt_nama_klien;
    private javax.swing.JTextField txt_status_kasus;
    private com.toedter.calendar.JDateChooser txttgl;
    // End of variables declaration//GEN-END:variables
}
