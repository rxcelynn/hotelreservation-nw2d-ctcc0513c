package dsa;
import java.sql.*;
public class system_db {
    
    public static Connection mycon(){
        
        Connection con = null;
     
       try {
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dsa","root","");
           
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e);
       }
        return con;
       
    }
}
