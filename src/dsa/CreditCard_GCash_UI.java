package dsa;
import java.sql.*;
import javax.swing.JOptionPane;

public class CreditCard_GCash_UI extends javax.swing.JFrame {

    public CreditCard_GCash_UI() {
        initComponents();
        
        T1.setEditable(false);
        T2.setEditable(false);
        T3.setEditable(false);
        T4.setEditable(false);
        T5.setEditable(false);
        T6.setEditable(false);
        T7.setEditable(false);
        T8.setEditable(false);
        T9.setEditable(false);
        T10.setEditable(false);
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa","root","");
            Statement s = system_db.mycon().createStatement();
            String query = " SELECT name, number, room_type, days_of_stay, checkin_date, mode_of_payment, price FROM reservation ";
            java.sql.ResultSet resultSet = s.executeQuery(query);
            
            while(resultSet.next()){    
            String name = resultSet.getString("name");
            String number = resultSet.getString("number");
            String room_type = resultSet.getString("room_type");
            String days_of_stay = resultSet.getString("days_of_stay");
            String check_in = resultSet.getString("checkin_date");
            String mod = resultSet.getString("mode_of_payment");
            String total = resultSet.getString("price");
            
            T1.setText(name);
            T2.setText(number);
            T3.setText(room_type);
            T4.setText(days_of_stay);
            T5.setText(check_in);
            T6.setText(mod);    
            T7.setText(total);
            
            } 
        
    }   catch (Exception e) {
             System.out.println(e);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa","root","");
            Statement s = system_db.mycon().createStatement();
            String query = " SELECT cc_gcash_name, cc_gcash_num, gov_id FROM details ";
            java.sql.ResultSet resultSet = s.executeQuery(query);
            String bank_name = "";
            String bank_number = "";
            String govmnt_id = "";
            while(resultSet.next()){    
            bank_name = resultSet.getString("cc_gcash_name");
            bank_number = resultSet.getString("cc_gcash_num");
            govmnt_id = resultSet.getString("gov_id");
            
            T8.setText(bank_name);
            T9.setText(bank_number);
            T10.setText(govmnt_id);
            } 
        
    }   catch (Exception e) {
           System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        T8 = new javax.swing.JTextField();
        T9 = new javax.swing.JTextField();
        T10 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        receipt = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receipt");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 210, -1));

        T2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 210, -1));

        T3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, -1));

        T4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 210, -1));

        T5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 210, -1));

        T6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 210, -1));

        T7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 210, -1));

        T8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 210, -1));

        T9.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 210, -1));

        T10.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        getContentPane().add(T10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 210, -1));

        back.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        back.setText("BACK TO HOME");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        confirm.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUSTOMER NAME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CUSTOMER NUMBER:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ROOM TYPE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DAYS OF STAY:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHECK-IN DATE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MODE OF PAYMENT:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL AMOUNT:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ACCOUNT NAME:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ACCOUNT NUMBER:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("VALID ID:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        receipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receipt.jpg"))); // NOI18N
        receipt.setText("jLabel11");
        getContentPane().add(receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Your booking has been reserved! See you at your check-in schedule!");
        this.setVisible(false);
    }//GEN-LAST:event_confirmActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditCard_GCash_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.JButton back;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel receipt;
    // End of variables declaration//GEN-END:variables
}
