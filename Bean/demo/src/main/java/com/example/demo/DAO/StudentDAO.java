package com.example.demo.DAO;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudent();
    void addStudent(Student student);

    void updateStudent(Student student, int id);

    void deleteStudent(int id);
    Student getStudentById(int id);
}
