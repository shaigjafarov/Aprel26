package az.coders.chapter1.coders.service;

import az.coders.chapter1.coders.config.DBConfig;
import az.coders.chapter1.coders.exceptions.StudentNotFoundExceptions;
import az.coders.chapter1.coders.repository.StudentRepository;
import az.coders.chapter1.coders.repository.StudentRepositoryImpl;

import java.sql.SQLException;

public class StudentService {

    public static void main(String[] args) throws SQLException, StudentNotFoundExceptions {

        StudentRepository studentRepository= new StudentRepositoryImpl(DBConfig.getConnection());

        System.out.println(studentRepository.getStudentById(1L));


    }
}
