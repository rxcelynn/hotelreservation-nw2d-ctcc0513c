package dsa;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Management_UI extends javax.swing.JFrame {

    public Management_UI() {
        initComponents();
      }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        by_name = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        CDate = new com.toedter.calendar.JDateChooser();
        bydate = new javax.swing.JButton();
        management_ui = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Management");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 456, -1));

        by_name.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        by_name.setText("SEARCH BY NAME");
        by_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                by_nameActionPerformed(evt);
            }
        });
        getContentPane().add(by_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        logout.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 17, 130, 30));

        table.setBackground(new java.awt.Color(224, 217, 183));
        table.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer's Name", "Customer's Number", "Room Type", "Days of Stay", "Check-in Date", "Mode of Payment", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 793, 310));

        CDate.setBackground(new java.awt.Color(255, 255, 255));
        CDate.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(CDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 142, -1));

        bydate.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        bydate.setText("SEARCH BY DATE ");
        bydate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bydateActionPerformed(evt);
            }
        });
        getContentPane().add(bydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        management_ui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/management.jpg"))); // NOI18N
        management_ui.setText("jLabel1");
        getContentPane().add(management_ui, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void by_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_by_nameActionPerformed
        String searchName = name.getText();
       
        try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa", "root", "");
    String query = "SELECT * FROM reservation";
    PreparedStatement pst = con.prepareStatement(query);
    ResultSet rs = pst.executeQuery();

    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);

    String dbname = "name";

    while (rs.next()) {
        if (rs.getString(dbname).equalsIgnoreCase(searchName)) {
            model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
        }
    }
} catch (Exception ex) {
    System.out.println("Error");
}
    }//GEN-LAST:event_by_nameActionPerformed

    private void bydateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bydateActionPerformed
        java.sql.Date date = new java.sql.Date(CDate.getDate().getTime());
        
        try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dsa", "root", "");
    String query = "SELECT * FROM reservation WHERE checkin_date = ? ORDER BY price DESC";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setDate(WIDTH, date);
    ResultSet rs = pst.executeQuery();
    
    List<Object[]> rows = new ArrayList<>();

    while (rs.next()) {
        Object[] row = {
            rs.getString(1), rs.getString(2), rs.getString(3),
            rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)
        };
        rows.add(row);
    }

    int n = rows.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            int days1 = Integer.parseInt((String) rows.get(j)[3]); 
            int days2 = Integer.parseInt((String) rows.get(j + 1)[3]);

            if (days1 < days2) {
                Object[] temp = rows.get(j);
                rows.set(j, rows.get(j + 1));
                rows.set(j + 1, temp);
            }
        }
    }
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);

    for (Object[] row : rows) {
        model.addRow(row);
    }

} catch (Exception ex) {
    System.out.println("Error");
}
    }//GEN-LAST:event_bydateActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        name.setText(name.getText().toUpperCase());
    }//GEN-LAST:event_nameKeyReleased

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_SPACE ))){
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CDate;
    private javax.swing.JButton by_name;
    private javax.swing.JButton bydate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel management_ui;
    private javax.swing.JTextField name;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
