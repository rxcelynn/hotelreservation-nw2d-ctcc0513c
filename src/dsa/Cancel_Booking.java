package dsa;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
public class Cancel_Booking extends javax.swing.JFrame {

    public Cancel_Booking() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CDate = new com.toedter.calendar.JDateChooser();
        confirm_cancellation = new javax.swing.JButton();
        back = new javax.swing.JButton();
        cancellation_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cancellation of Booking");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CANCELLATION OF BOOKING ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        Cname.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        Cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CnameKeyTyped(evt);
            }
        });
        getContentPane().add(Cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 250, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name registered on your reservation:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check-in Date registered on your booking:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        CDate.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(CDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 154, -1));

        confirm_cancellation.setBackground(new java.awt.Color(0, 0, 102));
        confirm_cancellation.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        confirm_cancellation.setForeground(new java.awt.Color(255, 255, 255));
        confirm_cancellation.setText("CONFIRM CANCELLATION");
        confirm_cancellation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_cancellationActionPerformed(evt);
            }
        });
        getContentPane().add(confirm_cancellation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        back.setBackground(new java.awt.Color(0, 0, 102));
        back.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        cancellation_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancellation.png"))); // NOI18N
        cancellation_image.setText("jLabel4");
        getContentPane().add(cancellation_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirm_cancellationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_cancellationActionPerformed
    try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa", "root", "");
    String inputName = Cname.getText();
    java.sql.Date inputDate = new java.sql.Date(CDate.getDate().getTime());
    boolean bookingFound = false;

    String query = "SELECT name, checkin_date FROM reservation WHERE name = ? AND checkin_date = ?";
    try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
        preparedStatement.setString(1, inputName);
        preparedStatement.setDate(2, inputDate);
        
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            bookingFound = true;
            String deleteQuery = "DELETE FROM reservation WHERE name = ? AND checkin_date = ?";
            try (PreparedStatement deleteStatement = con.prepareStatement(deleteQuery)) {
                deleteStatement.setString(1, inputName);
                deleteStatement.setDate(2, inputDate);
                int rowsAffected = deleteStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Booking cancelled successfully!");
                }
            }
        }
    }

    if (!bookingFound) {
        JOptionPane.showMessageDialog(rootPane, "No such booking.");
    }
} catch (Exception e) {
    System.out.println(e);
}
    }//GEN-LAST:event_confirm_cancellationActionPerformed

    private void CnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CnameKeyReleased
         Cname.setText(Cname.getText().toUpperCase());
    }//GEN-LAST:event_CnameKeyReleased

    private void CnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CnameKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE ))){
            evt.consume();
        }
    }//GEN-LAST:event_CnameKeyTyped

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.setVisible(false);
       new Home().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
        public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cancel_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CDate;
    private javax.swing.JTextField Cname;
    private javax.swing.JButton back;
    private javax.swing.JLabel cancellation_image;
    private javax.swing.JButton confirm_cancellation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
