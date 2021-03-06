
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ashbo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(616,439);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernamelab = new javax.swing.JLabel();
        passwordlab = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        register1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        usernamelab.setBackground(new java.awt.Color(255, 255, 255));
        usernamelab.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        usernamelab.setForeground(new java.awt.Color(102, 0, 0));
        usernamelab.setText("Username:");
        getContentPane().add(usernamelab);
        usernamelab.setBounds(340, 100, 130, 32);

        passwordlab.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        passwordlab.setForeground(new java.awt.Color(102, 0, 0));
        passwordlab.setText("Password:");
        getContentPane().add(passwordlab);
        passwordlab.setBounds(340, 170, 130, 32);

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginnone(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(340, 260, 80, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(153, 255, 204), new java.awt.Color(0, 102, 102)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 170, 190, 60);

        password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(password);
        password.setBounds(340, 200, 210, 30);

        register1.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        register1.setForeground(new java.awt.Color(153, 255, 255));
        register1.setText("Create a new account");
        register1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register1MouseClicked(evt);
            }
        });
        getContentPane().add(register1);
        register1.setBounds(370, 310, 151, 21);

        username.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(340, 130, 210, 30);

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(460, 260, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\college\\sy com sci\\oop\\background.PNG")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 0, 300, 400);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 310, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginMousePressed

    private void loginnone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginnone
        // TODO add your handling code here:
    }//GEN-LAST:event_loginnone

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
 
    }//GEN-LAST:event_loginKeyPressed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        username.setText("");
        password.setText("");
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void register1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register1MouseClicked
        Register register = new Register();
        register.setVisible(true);
        register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_register1MouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        String str1 = username.getText(); 
        String str2 = password.getText();
        String str3 = "abc";
        String str4 = "123";
        boolean retval1=str1.equals(str3);
        boolean retval2=str2.equals(str4);
        if((retval1)&&(retval2))
        {
            JOptionPane.showMessageDialog(this,"Logged in successfully","LOGIN",JOptionPane.PLAIN_MESSAGE);
            username.setText("");
            password.setText("");
        }
        else if(!retval1)
        {
            JOptionPane.showMessageDialog(this,"Invalid Username","LOGIN",JOptionPane.PLAIN_MESSAGE);
            username.setText("");
        }
        else if(!retval2)
        {
            JOptionPane.showMessageDialog(this,"Invalid password","LOGIN",JOptionPane.PLAIN_MESSAGE);
            password.setText("");
        }
    }//GEN-LAST:event_loginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordlab;
    private javax.swing.JLabel register1;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernamelab;
    // End of variables declaration//GEN-END:variables
}
