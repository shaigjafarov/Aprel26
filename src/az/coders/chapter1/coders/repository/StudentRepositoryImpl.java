package az.coders.chapter1.coders.repository;

import az.coders.chapter1.coders.enums.SateteEnum;
import az.coders.chapter1.coders.exceptions.StudentNotFoundExceptions;
import az.coders.chapter1.coders.model.Student;

import java.sql.*;

public class StudentRepositoryImpl implements StudentRepository {


    private final Connection connection;

    public StudentRepositoryImpl(Connection connection) {

        this.connection = connection;
    }

    @Override
    public Student getStudentById(Long id) throws SQLException {
        ResultSet   resultSet = null;
        Student student = new Student();
        try (PreparedStatement ps = connection.prepareStatement("select s.* from  apr26.student s where s.id=? and s.state=1");
        ){
            ps.setLong(1, id);
               resultSet= ps.executeQuery();

            if (resultSet.next()) {
                student.setId(resultSet.getLong("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setAddress(resultSet.getString("address"));
                student.setBirthdate(resultSet.getDate("birth_date").toLocalDate());
                student.setCreatedAt(resultSet.getTimestamp("created_at").toLocalDateTime());
                student.setState(SateteEnum.findByCode(resultSet.getInt("state")));

            }else {
               throw  new StudentNotFoundExceptions();
            }
            resultSet.close();

        } catch (Exception e) {
            resultSet.close();

            e.printStackTrace();
        }
        return student;
    }
}
