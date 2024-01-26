package dsa;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class GCashDetails_UI extends javax.swing.JFrame {

    public GCashDetails_UI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GCash_name = new javax.swing.JTextField();
        GCash_num = new javax.swing.JTextField();
        GCash_govid = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        gcash_details = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GCash Details");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setText("Name on GCash:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setText("Number on GCash:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setText("Valid ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        GCash_name.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        GCash_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GCash_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GCash_nameKeyTyped(evt);
            }
        });
        getContentPane().add(GCash_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 219, -1));

        GCash_num.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        GCash_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GCash_numKeyTyped(evt);
            }
        });
        getContentPane().add(GCash_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 219, -1));

        GCash_govid.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        GCash_govid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SSS ID", "PHILHEALTH ID", "PAG-IBIG ID", "PASSPORT ID", "DRIVER'S LICENSE" }));
        getContentPane().add(GCash_govid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 158, -1));

        back.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        confirm.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        confirm.setText("BOOK NOW");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        gcash_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment_details.jpg"))); // NOI18N
        gcash_details.setText("jLabel4");
        getContentPane().add(gcash_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        if(GCash_govid.getSelectedItem() == "SELECT" || GCash_name.getText().isEmpty() || GCash_num.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please complete all the required information.");
        }else{
        String insert = "INSERT INTO details" + "(cc_gcash_name, cc_gcash_num, gov_id) VALUES"
             + "(?, ?, ?)";
                
                try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa","root","");
             PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(insert);
             
                 preparedStmt.setString(1,GCash_name.getText() );
                 preparedStmt.setString(2,GCash_num.getText() );
                 preparedStmt.setString(3, GCash_govid.getSelectedItem().toString());
                 
                 
                 preparedStmt.executeUpdate(); 
                 this.setVisible(false);
                 new CreditCard_GCash_UI().setVisible(true);
            
        }catch(Exception e) {
            System.out.println(e);
        } 
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void GCash_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GCash_nameKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE ))){
            evt.consume();
        }
    }//GEN-LAST:event_GCash_nameKeyTyped

    private void GCash_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GCash_nameKeyReleased
         GCash_name.setText(GCash_name.getText().toUpperCase());
    }//GEN-LAST:event_GCash_nameKeyReleased

    private void GCash_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GCash_numKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE ))){
            evt.consume();
        }
    }//GEN-LAST:event_GCash_numKeyTyped

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new ReservationUI().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GCashDetails_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GCash_govid;
    private javax.swing.JTextField GCash_name;
    private javax.swing.JTextField GCash_num;
    private javax.swing.JButton back;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel gcash_details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
