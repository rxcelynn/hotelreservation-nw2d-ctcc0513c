package dsa;
import java.sql.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ReservationUI extends javax.swing.JFrame {
    
    String roomtype1;
    String price;
    int Iprice;

    public ReservationUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        customer_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        customer_num = new javax.swing.JTextField();
        standard = new javax.swing.JRadioButton();
        suite = new javax.swing.JRadioButton();
        deluxe = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        others = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkin = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        mop = new javax.swing.JComboBox<>();
        confirm_reservation = new javax.swing.JButton();
        back = new javax.swing.JButton();
        reservation_ui = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Reservation");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer's Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        customer_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customer_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customer_nameKeyTyped(evt);
            }
        });
        getContentPane().add(customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 220, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer's Number: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        customer_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customer_numKeyTyped(evt);
            }
        });
        getContentPane().add(customer_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 140, 30));

        buttonGroup1.add(standard);
        standard.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        standard.setText("Standard Room (P5,000 Per Night || 4 Pax)");
        getContentPane().add(standard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 290, -1));

        buttonGroup1.add(suite);
        suite.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        suite.setText("Suite Room (P7,000 Per Night || 6 Pax)");
        getContentPane().add(suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 260, -1));

        buttonGroup1.add(deluxe);
        deluxe.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        deluxe.setText("Deluxe Room (P12,000 Per Night || 10 Pax)");
        getContentPane().add(deluxe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 290, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room Type:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Days of Stay:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        others.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                othersKeyTyped(evt);
            }
        });
        getContentPane().add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 50, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Check-in Date:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        checkin.setDateFormatString("yyyy-MM-dd\n");
        getContentPane().add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 140, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mode of Payment:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        mop.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        mop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "CREDIT CARD", "GCASH" }));
        getContentPane().add(mop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 150, -1));

        confirm_reservation.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        confirm_reservation.setText("Confirm Reservation");
        confirm_reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_reservationActionPerformed(evt);
            }
        });
        getContentPane().add(confirm_reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        back.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        reservation_ui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/booking.jpg"))); // NOI18N
        reservation_ui.setText("jLabel8");
        getContentPane().add(reservation_ui, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirm_reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_reservationActionPerformed
      
        if(standard.isSelected()){
          roomtype1 = "STANDARD ROOM";
            Iprice = Integer.parseInt(others.getText()) * 5000;
            price = String.valueOf("Php " + Iprice);
      }if(suite.isSelected()){
          roomtype1 = "SUITE ROOM";
          Iprice = Integer.parseInt(others.getText()) * 7000;
          price = String.valueOf("Php " + Iprice);
      }if(deluxe.isSelected()){
          roomtype1 = "DELUXE ROOM";        
          Iprice = Integer.parseInt(others.getText()) * 12000;
          price = String.valueOf("Php " + Iprice);
      }if(customer_name.getText().isEmpty() || customer_num.getText().isEmpty() || checkin.getDate() != null 
              || mop.getSelectedItem().equals("SELECT") || others.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Please complete all the required information.");
      }else{
          if(mop.getSelectedItem().equals("CREDIT CARD")){
          this.setVisible(false);
          new CreditCard_Details().setVisible(true);
      }if(mop.getSelectedItem().equals("GCASH")){
          this.setVisible(false);
          new GCashDetails_UI().setVisible(true);
      }
       }
      
        String insert = "INSERT INTO reservation" + "(name,number,room_type,days_of_stay,checkin_date,mode_of_payment,price) VALUES"
             + "(?, ?, ?, ?, ?, ?, ?)";
                
                try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa","root","");
             PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(insert);
             
                 preparedStmt.setString(1,customer_name.getText() );
                 preparedStmt.setString(2,customer_num.getText() );
                 preparedStmt.setString(3,roomtype1 );
                 preparedStmt.setString(4,others.getText() );
                 preparedStmt.setString(5,((JTextField)checkin.getDateEditor().getUiComponent()).getText());
                 preparedStmt.setString(6, mop.getSelectedItem().toString());
                 preparedStmt.setString(7, price);
                 
                 preparedStmt.executeUpdate(); 
            
        }catch(Exception e) {
            System.out.println(e);
        } 
    }//GEN-LAST:event_confirm_reservationActionPerformed

    private void customer_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customer_nameKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE ))){
            evt.consume();
        }
    }//GEN-LAST:event_customer_nameKeyTyped

    private void customer_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customer_numKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE ))){
            evt.consume();
        }
    }//GEN-LAST:event_customer_numKeyTyped

    private void othersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_othersKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE ))){
            evt.consume();
        }
    }//GEN-LAST:event_othersKeyTyped

    private void customer_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customer_nameKeyReleased
        customer_name.setText(customer_name.getText().toUpperCase());
    }//GEN-LAST:event_customer_nameKeyReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       this.setVisible(false);
       new Home().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser checkin;
    private javax.swing.JButton confirm_reservation;
    private javax.swing.JTextField customer_name;
    private javax.swing.JTextField customer_num;
    private javax.swing.JRadioButton deluxe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> mop;
    private javax.swing.JTextField others;
    private javax.swing.JLabel reservation_ui;
    private javax.swing.JRadioButton standard;
    private javax.swing.JRadioButton suite;
    // End of variables declaration//GEN-END:variables
}
