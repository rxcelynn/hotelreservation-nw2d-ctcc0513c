package dsa;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class CreditCard_Details extends javax.swing.JFrame {
    public CreditCard_Details() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CC_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CC_num = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JComboBox<>();
        book = new javax.swing.JButton();
        back = new javax.swing.JButton();
        cc_details = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Credit Card Details");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setText("Name on Credit Card:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        CC_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CC_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CC_nameKeyTyped(evt);
            }
        });
        getContentPane().add(CC_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 230, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setText("Credit Card Number:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        CC_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CC_numKeyTyped(evt);
            }
        });
        getContentPane().add(CC_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 230, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setText("Valid ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        ID.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        ID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SSS ID", "PHILHEALTH ID", "PAG-IBIG ID", "PASSPORT ID", "DRIVER'S LICENSE" }));
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 160, -1));

        book.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        book.setText("BOOK NOW");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        back.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        cc_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment_details.jpg"))); // NOI18N
        cc_details.setText("jLabel4");
        getContentPane().add(cc_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        
        if(ID.getSelectedItem() == "SELECT" || CC_name.getText().isEmpty() || CC_num.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please complete all the required information.");
        }else{
        String insert = "INSERT INTO details" + "(cc_gcash_name, cc_gcash_num, gov_id) VALUES"
             + "(?, ?, ?)";
                
                try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa","root","");
             PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(insert);
             
                 preparedStmt.setString(1,CC_name.getText() );
                 preparedStmt.setString(2,CC_num.getText() );
                 preparedStmt.setString(3, ID.getSelectedItem().toString());
                 
                 
                 preparedStmt.executeUpdate(); 
                 this.setVisible(false);
                 new CreditCard_GCash_UI().setVisible(true);
            
        }catch(Exception e) {
            System.out.println(e);
        } 
        }
    }//GEN-LAST:event_bookActionPerformed

    private void CC_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CC_nameKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE ))){
            evt.consume();
    }//GEN-LAST:event_CC_nameKeyTyped
    }
    private void CC_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CC_numKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE ))){
            evt.consume();
    }//GEN-LAST:event_CC_numKeyTyped
    }
    private void CC_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CC_nameKeyReleased
        CC_name.setText(CC_name.getText().toUpperCase());
    }//GEN-LAST:event_CC_nameKeyReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.setVisible(false);
       new ReservationUI().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new CreditCard_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CC_name;
    private javax.swing.JTextField CC_num;
    private javax.swing.JComboBox<String> ID;
    private javax.swing.JButton back;
    private javax.swing.JButton book;
    private javax.swing.JLabel cc_details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
