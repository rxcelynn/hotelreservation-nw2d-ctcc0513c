package dsa;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        management_login = new javax.swing.JButton();
        about_us = new javax.swing.JButton();
        contact_us = new javax.swing.JButton();
        cancel_booking = new javax.swing.JButton();
        book_now = new javax.swing.JButton();
        home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SwifReserve Hotel");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOK NOW");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        management_login.setBackground(new java.awt.Color(0, 102, 153));
        management_login.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        management_login.setForeground(new java.awt.Color(255, 255, 255));
        management_login.setText("Management LOGIN");
        management_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                management_loginActionPerformed(evt);
            }
        });
        getContentPane().add(management_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, 40));

        about_us.setBackground(new java.awt.Color(0, 102, 153));
        about_us.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        about_us.setForeground(new java.awt.Color(255, 255, 255));
        about_us.setText("ABOUT US ");
        about_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_usActionPerformed(evt);
            }
        });
        getContentPane().add(about_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        contact_us.setBackground(new java.awt.Color(0, 102, 153));
        contact_us.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        contact_us.setForeground(new java.awt.Color(255, 255, 255));
        contact_us.setText("CONTACT US");
        contact_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_usActionPerformed(evt);
            }
        });
        getContentPane().add(contact_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        cancel_booking.setBackground(new java.awt.Color(0, 102, 153));
        cancel_booking.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cancel_booking.setForeground(new java.awt.Color(255, 255, 255));
        cancel_booking.setText("CANCEL BOOKING");
        cancel_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_bookingActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        book_now.setBackground(new java.awt.Color(0, 102, 153));
        book_now.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        book_now.setForeground(new java.awt.Color(255, 255, 255));
        book_now.setText("BOOK NOW!");
        book_now.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_nowActionPerformed(evt);
            }
        });
        getContentPane().add(book_now, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 500, 270, 60));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        home.setText("jLabel2");
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void management_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_management_loginActionPerformed
        this.setVisible(false);
        new Management_Login_UI().setVisible(true);
    }//GEN-LAST:event_management_loginActionPerformed

    private void cancel_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_bookingActionPerformed
        this.setVisible(false);
        new Cancel_Booking().setVisible(true);
    }//GEN-LAST:event_cancel_bookingActionPerformed

    private void contact_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_usActionPerformed
        this.setVisible(false);
        new Contact_Us_UI().setVisible(true);
    }//GEN-LAST:event_contact_usActionPerformed

    private void about_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_usActionPerformed
        this.setVisible(false);
        new About_Us_UI().setVisible(true);
    }//GEN-LAST:event_about_usActionPerformed

    private void book_nowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_nowActionPerformed
        this.setVisible(false);
        new ReservationUI().setVisible(true);
    }//GEN-LAST:event_book_nowActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_us;
    private javax.swing.JButton book_now;
    private javax.swing.JButton cancel_booking;
    private javax.swing.JButton contact_us;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton management_login;
    // End of variables declaration//GEN-END:variables
}
