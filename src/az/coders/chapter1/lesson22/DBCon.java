package az.coders.chapter1.lesson22;

import java.sql.*;

public class DBCon {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        try (Connection conn = DriverManager.getConnection(url, "postgres", "postgre123");
             PreparedStatement ps = conn.prepareStatement("SELECT name, id FROM apr26.student t where t.name = ?")) {

            ps.setString(1, "Babek");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt(2));}

            rs.close();
        }







    }
}
