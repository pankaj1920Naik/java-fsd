import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class App {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "Pankaj@@@");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
        }
    }
}

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.*;

// // Notice, do not import com.mysql.jdbc.*
// // or you will have problems!

// public class testConnection {
// public static void main(String[] args) {
// // try {
// // // The newInstance() call is a work around for some
// // // broken Java implementations

// // Class.forName("com.mysql.jdbc.Driver").newInstance();
// // } catch (Exception ex) {
// // // handle the error
// // }
// try {
// // Class.forName("com.mysql.jdbc.Driver");
// // Connection conn =
// DriverManager.getConnection("jdbc:mysql://localhost/test",
// // "root", "Pankaj@@@");
// // System.out.print("Database is connected !");
// // conn.close();
// Class.forName("com.mysql.cj.jdbc.Driver");
// Connection con =
// DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root",
// "Pankaj@@@");
// Statement stmt = con.createStatement();
// ResultSet rs = stmt.executeQuery("select * from emp");
// while (rs.next()) {
// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
// rs.getString(3));
// }
// } catch (Exception e) {
// System.out.print("Do not connect to DB - Error:" + e);
// }
// }
// }
