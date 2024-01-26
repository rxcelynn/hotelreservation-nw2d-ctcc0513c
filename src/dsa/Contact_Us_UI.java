package dsa;

public class Contact_Us_UI extends javax.swing.JFrame {

    public Contact_Us_UI() {
        initComponents();
        
        String fb = "<HTML><u> SwiftReserve Hotel </u></HTML>";
        facebook.setText(fb);
        
        String insta = "<HTML><u> @swiftreserve_hotel </u></HTML>";
        ig.setText(insta);
        
        String email = "<HTML><u> srhotel@gmail.com </u></HTML>";
        email_add.setText(email);
        
        String cp = "<HTML><u> 0912-345-6789 </u></HTML>";
        contact.setText(cp);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fbpage = new javax.swing.JLabel();
        igfeed = new javax.swing.JLabel();
        emailadd = new javax.swing.JLabel();
        contact_num = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        ig = new javax.swing.JLabel();
        email_add = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        contact_us = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Us ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fbpage.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        fbpage.setForeground(new java.awt.Color(255, 255, 255));
        fbpage.setText("Facebook Page:");
        getContentPane().add(fbpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        igfeed.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        igfeed.setForeground(new java.awt.Color(255, 255, 255));
        igfeed.setText("Instagram:");
        getContentPane().add(igfeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        emailadd.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        emailadd.setForeground(new java.awt.Color(255, 255, 255));
        emailadd.setText("Email Address:");
        getContentPane().add(emailadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        contact_num.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        contact_num.setForeground(new java.awt.Color(255, 255, 255));
        contact_num.setText("Contact Number:");
        getContentPane().add(contact_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        facebook.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        facebook.setForeground(new java.awt.Color(255, 255, 255));
        facebook.setText("SwiftReserve Hotel ");
        getContentPane().add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        ig.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        ig.setForeground(new java.awt.Color(255, 255, 255));
        ig.setText("@swiftreserve_hotel");
        getContentPane().add(ig, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        email_add.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        email_add.setForeground(new java.awt.Color(255, 255, 255));
        email_add.setText("srhotel@gmail.com");
        getContentPane().add(email_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        contact.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setText("0912-345-6789");
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        contact_us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contact_us_ui.png"))); // NOI18N
        contact_us.setText("jLabel5");
        getContentPane().add(contact_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
        public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contact_Us_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contact;
    private javax.swing.JLabel contact_num;
    private javax.swing.JLabel contact_us;
    private javax.swing.JLabel email_add;
    private javax.swing.JLabel emailadd;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel fbpage;
    private javax.swing.JLabel ig;
    private javax.swing.JLabel igfeed;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
