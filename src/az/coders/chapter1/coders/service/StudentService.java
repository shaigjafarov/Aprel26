package az.coders.chapter1.coders.service;

import az.coders.chapter1.coders.config.DBConfig;
import az.coders.chapter1.coders.dto.StudentDTO;
import az.coders.chapter1.coders.exceptions.StudentNotFoundExceptions;
import az.coders.chapter1.coders.model.Student;
import az.coders.chapter1.coders.repository.StudentRepository;
import az.coders.chapter1.coders.repository.StudentRepositoryImpl;

import java.sql.SQLException;

public class StudentService {

    public static StudentDTO getStudentDto() throws SQLException, StudentNotFoundExceptions {
        StudentRepository studentRepository= new StudentRepositoryImpl(DBConfig.getConnection());

        Student studentById = studentRepository.getStudentById(1L);
        StudentDTO studentDTO = new StudentDTO(studentById.getId(),studentById.getName());
        
        return  studentDTO;

    }
}
