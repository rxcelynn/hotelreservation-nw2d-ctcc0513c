package dsa;
import javax.swing.JOptionPane;

public class Management_Login_UI extends javax.swing.JFrame {

    String management_un = "swiftreservehotel";
    String management_pass = "swiftreservehotel";
        
    public Management_Login_UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        management_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Management");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRATOR:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        un.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unKeyTyped(evt);
            }
        });
        getContentPane().add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 220, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 220, -1));

        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        management_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        management_login.setText("jLabel3");
        getContentPane().add(management_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(un.getText().equalsIgnoreCase(management_un) && pass.getText().equalsIgnoreCase(management_pass)){
            this.setVisible(false);
             new Management_UI().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Invalid login credentials.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void unKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c))){
            evt.consume();
        }
    }//GEN-LAST:event_unKeyTyped

    private void unKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyReleased
        un.setText(un.getText().toLowerCase());
    }//GEN-LAST:event_unKeyReleased

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management_Login_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel management_login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
