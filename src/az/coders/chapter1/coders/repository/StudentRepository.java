package az.coders.chapter1.coders.repository;

import az.coders.chapter1.coders.exceptions.StudentNotFoundExceptions;
import az.coders.chapter1.coders.model.Student;

import java.sql.SQLException;

public interface StudentRepository {

    Student getStudentById (Long id) throws SQLException;



}
