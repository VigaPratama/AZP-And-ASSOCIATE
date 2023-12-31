
package Lawyer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {
   Connection con =null;
   Statement st = null;

private void hapuslayar(){
txtuser.setText("");
txtnama.setText("");
txtpassword.setText("");
txtketikpassword.setText("");
}
    
    public RegisterForm(java.awt.Frame parent, boolean modal) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namaPlaceholder = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userPlaceholder = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        passwordPlaceholder = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        repasswordPlaceholder = new javax.swing.JLabel();
        txtketikpassword = new javax.swing.JPasswordField();
        BtnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        namaPlaceholder.setForeground(new java.awt.Color(102, 102, 102));
        namaPlaceholder.setText("Masukkan Nama");
        jPanel1.add(namaPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 115, 260, 20));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnamaKeyTyped(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 273, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Re-Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        userPlaceholder.setForeground(new java.awt.Color(102, 102, 102));
        userPlaceholder.setText("Masukkan Username");
        jPanel1.add(userPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 145, 260, 20));

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuserKeyTyped(evt);
            }
        });
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 273, -1));

        passwordPlaceholder.setBackground(new java.awt.Color(255, 255, 255));
        passwordPlaceholder.setForeground(new java.awt.Color(102, 102, 102));
        passwordPlaceholder.setText("Masukkan Password");
        jPanel1.add(passwordPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 175, 260, 20));

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 273, -1));

        repasswordPlaceholder.setForeground(new java.awt.Color(102, 102, 102));
        repasswordPlaceholder.setText("Masukkan Re-Password");
        jPanel1.add(repasswordPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 205, 260, 20));

        txtketikpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtketikpasswordActionPerformed(evt);
            }
        });
        txtketikpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtketikpasswordKeyTyped(evt);
            }
        });
        jPanel1.add(txtketikpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 273, -1));
        txtketikpassword.getAccessibleContext().setAccessibleName("");

        BtnRegister.setBackground(new java.awt.Color(0, 255, 0));
        BtnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnRegister.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegister.setText("REGISTER");
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 270, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sudah Punya Account?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 153, 0));
        Login.setText("Login");
        Login.setBorder(null);
        Login.setPreferredSize(new java.awt.Dimension(34, 15));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
       new LoginForm(null, true).setVisible(true);
    }//GEN-LAST:event_LoginActionPerformed

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
        // TODO add your handling code here:
                try {
           
                    
         if(txtuser.getText().equals("") || txtpassword.getText().equals("") || txtnama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
        hapuslayar();
        }
         
        else{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lawyer","root","");
                st=con.createStatement();
                String simpan = "INSERT INTO login VALUES('"+txtuser.getText()+"','"+String.valueOf(txtpassword.getPassword())+"','"+txtnama.getText()+"')";
                st=con.createStatement();
                int SA = st.executeUpdate(simpan);
                JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
                this.setVisible(false);
                new LoginForm(null, true).setVisible(true);
             }
        } catch (Exception e) {
          JOptionPane.showMessageDialog(this,"This Account is Already exist / Duplicate Account ", "Pesan",JOptionPane.WARNING_MESSAGE);
hapuslayar();
       }

    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void txtketikpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtketikpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtketikpasswordActionPerformed

    private void txtnamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyTyped
        // TODO add your handling code here:
        if ("".equals(txtnama.getText())){
            namaPlaceholder.setVisible(true);
            namaPlaceholder.setEnabled(false);
        }
        else{
            namaPlaceholder.setVisible(false);
            namaPlaceholder.setEnabled(false);
        }
    }//GEN-LAST:event_txtnamaKeyTyped

    private void txtuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyTyped
        // TODO add your handling code here:
        if ("".equals(txtuser.getText())){
            userPlaceholder.setVisible(true);
            userPlaceholder.setEnabled(false);
        }
        else{
            userPlaceholder.setVisible(false);
            userPlaceholder.setEnabled(false);
        }
    }//GEN-LAST:event_txtuserKeyTyped

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
        // TODO add your handling code here:
        if ("".equals(txtpassword.getText())){
            passwordPlaceholder.setVisible(true);
            passwordPlaceholder.setEnabled(false);
        }
        else{
            passwordPlaceholder.setVisible(false);
            passwordPlaceholder.setEnabled(false);
        }
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtketikpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtketikpasswordKeyTyped
        // TODO add your handling code here:
        if ("".equals(txtketikpassword.getText())){
            repasswordPlaceholder.setVisible(true);
            repasswordPlaceholder.setEnabled(false);
        }
        else{
            repasswordPlaceholder.setVisible(false);
            repasswordPlaceholder.setEnabled(false);
        }
    }//GEN-LAST:event_txtketikpasswordKeyTyped

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            RegisterForm dialog = new RegisterForm(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override public void
            windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
            }
            });
            dialog.setVisible(true);
            }
            });
                }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegister;
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namaPlaceholder;
    private javax.swing.JLabel passwordPlaceholder;
    private javax.swing.JLabel repasswordPlaceholder;
    private javax.swing.JPasswordField txtketikpassword;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    private javax.swing.JLabel userPlaceholder;
    // End of variables declaration//GEN-END:variables
}
