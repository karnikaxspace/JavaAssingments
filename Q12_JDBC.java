// Q12. JDBC Insert
import java.sql.*;

public class Q12_JDBC {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "1234"
        );

        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES (?,?)"
        );

        ps.setInt(1, 1);
        ps.setString(2, "Karnika");

        ps.executeUpdate();
        System.out.println("Inserted");

        con.close();
    }
}
