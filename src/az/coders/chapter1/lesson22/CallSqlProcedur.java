package az.coders.chapter1.lesson22;

import java.sql.*;

public class CallSqlProcedur {


    public static void main(String[] args) {


        String sql =" {? = call  apr26.get_student()}";

        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgre123");
             CallableStatement cs = conn.prepareCall(sql)){
            conn.setAutoCommit(false);

//             cs.registerOutParameter(1, );
//             cs.setInt(1,3);
             cs.registerOutParameter(1, Types.OTHER);
             cs.execute();

            ResultSet results = (ResultSet) cs.getObject(1);
            while (results.next()) {
                // do something with the results.
            }

//            System.out.println( cs.getObject(1));

//             ResultSet resultSet = cs.executeQuery();




//            System.out.println(name);


        }catch (Exception e ){


            e.printStackTrace();
        }

    }
}
