package az.coders.chapter1.lesson22;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Establish a connection to the PostgreSQL database
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgre123");
            connection.setAutoCommit(false);
            // Prepare the SQL statement with a function call that returns a REF_CURSOR
            String sql = "{ ? = CALL apr26.get_employees_by_department() }";

            // Create a CallableStatement
            CallableStatement callableStatement = connection.prepareCall(sql);

            // Register the OUT parameter for the REF_CURSOR
            callableStatement.registerOutParameter(1, Types.OTHER);

            // Set the input parameter value
//            callableStatement.setInt(2, 1); // Department ID = 1

            // Execute the function call
            callableStatement.execute();

            // Retrieve the REF_CURSOR result
            ResultSet resultSet = (ResultSet) callableStatement.getObject(1);

            // Iterate through the result set and process the data
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // Process the retrieved data as needed
                System.out.println("Employee ID: " + id + ", Name: " + name);
            }

            // Close the result set, statement, and connection
            resultSet.close();
            callableStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
