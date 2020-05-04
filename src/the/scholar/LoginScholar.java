/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.scholar;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Optimus Prime
 */
public class LoginScholar extends javax.swing.JFrame {
    
    Connection loginconn = null;
    
    public LoginScholar() {
        initComponents();
      showicon();
        loginconn = DBconnect.connect();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginMain = new javax.swing.JPanel();
        panel_icon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_details = new javax.swing.JPanel();
        txt_uname = new javax.swing.JTextField();
        txt_pwd = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_pwdicon = new javax.swing.JLabel();
        lbl_unameicon = new javax.swing.JLabel();
        btn_login = new java.awt.Button();
        lbl_close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(10, 10));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginMain.setBackground(new java.awt.Color(255, 255, 255));
        LoginMain.setPreferredSize(new java.awt.Dimension(710, 480));
        LoginMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LoginMainMouseDragged(evt);
            }
        });
        LoginMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginMainMousePressed(evt);
            }
        });
        LoginMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_icon.setBackground(new java.awt.Color(204, 0, 204));
        panel_icon.setPreferredSize(new java.awt.Dimension(370, 454));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main.png"))); // NOI18N

        javax.swing.GroupLayout panel_iconLayout = new javax.swing.GroupLayout(panel_icon);
        panel_icon.setLayout(panel_iconLayout);
        panel_iconLayout.setHorizontalGroup(
            panel_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_iconLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        panel_iconLayout.setVerticalGroup(
            panel_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_iconLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        LoginMain.add(panel_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 480));

        panel_details.setBackground(new java.awt.Color(255, 255, 255));
        panel_details.setPreferredSize(new java.awt.Dimension(328, 454));

        txt_uname.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18));
        txt_uname.setText("username");
        txt_uname.setBorder(null);
        txt_uname.setCaretColor(new java.awt.Color(204, 0, 204));
        txt_uname.setCaretPosition(0);
        txt_uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_unameFocusGained(evt);
            }
        });

        txt_pwd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_pwd.setText("jPasswordField1");
        txt_pwd.setBorder(null);
        txt_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pwdFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 0, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 0, 204));

        jSeparator2.setBackground(new java.awt.Color(204, 0, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 0, 204));

        lbl_pwdicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N

        lbl_unameicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.png"))); // NOI18N

        btn_login.setBackground(new java.awt.Color(204, 0, 204));
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setLabel("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        lbl_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cross.png"))); // NOI18N
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_closeMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Forgotten account?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 0, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Create a new account");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 0, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Welcome.........");

        javax.swing.GroupLayout panel_detailsLayout = new javax.swing.GroupLayout(panel_details);
        panel_details.setLayout(panel_detailsLayout);
        panel_detailsLayout.setHorizontalGroup(
            panel_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(lbl_close))
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbl_unameicon)
                .addGap(10, 10, 10)
                .addGroup(panel_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_uname, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jSeparator1)))
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbl_pwdicon)
                .addGap(10, 10, 10)
                .addGroup(panel_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_detailsLayout.setVerticalGroup(
            panel_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detailsLayout.createSequentialGroup()
                .addComponent(lbl_close)
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(panel_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_unameicon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_detailsLayout.createSequentialGroup()
                        .addComponent(txt_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_pwdicon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_detailsLayout.createSequentialGroup()
                        .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(106, 106, 106))
        );

        btn_login.getAccessibleContext().setAccessibleName("btn_login");

        LoginMain.add(panel_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 340, 480));

        getContentPane().add(LoginMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(710, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int xy, xx;
    private void LoginMainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMainMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_LoginMainMouseDragged

    private void LoginMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMainMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_LoginMainMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        NewScholar nc = new NewScholar();
        nc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MousePressed

    private void lbl_closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMousePressed
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMousePressed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        try {
            String query = "select * from passbook where uname=? and pass=? ";
            
            PreparedStatement pst = loginconn.prepareStatement(query);
            pst.setString(1, txt_uname.getText());
            pst.setString(2, txt_pwd.getText());
            
            ResultSet rs = pst.executeQuery();
            
            int count = 0;
            
            while (rs.next()) {
                count++;
            }
            
            if (count == 1) {
                String user = txt_uname.getText();
                MainSheet m = new MainSheet();
                m.username(user);
                m.setVisible(true);
                OptionDisplay op = new OptionDisplay();
                op.loginSuccess(user);
                this.dispose();
            } else {
                OptionDisplay op = new OptionDisplay();
                op.Warning();
                
                txt_uname.setText("username");
                txt_pwd.setText("SFASDFSDGSDGDFHSDRHD");
                
            }
            
            rs.close();
            pst.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            String err = e.getMessage();
            OptionDisplay op = new OptionDisplay();
            op.dbFailed(err);
        }
        

    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusGained
        txt_pwd.setText("");
    }//GEN-LAST:event_txt_pwdFocusGained

    private void txt_unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_unameFocusGained
        txt_uname.setText("");
    }//GEN-LAST:event_txt_unameFocusGained

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        OptionDisplay op = new OptionDisplay();
        op.forgetpass();
    }//GEN-LAST:event_jLabel1MousePressed

    private void showicon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/main.png"));
    }
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
            java.util.logging.Logger.getLogger(LoginScholar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScholar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScholar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScholar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginScholar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginMain;
    private java.awt.Button btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_pwdicon;
    private javax.swing.JLabel lbl_unameicon;
    private javax.swing.JPanel panel_details;
    private javax.swing.JPanel panel_icon;
    private javax.swing.JPasswordField txt_pwd;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
