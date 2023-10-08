package com.example.demo.controller;

import com.example.demo.DAO.StudentDAO;
import com.example.demo.DAO.StudentDAOImpl;
import com.example.demo.model.Student;

import java.util.List;

public class StudentController {
    private StudentDAO studentDAO = new StudentDAOImpl();


    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public void updateStudent(Student student,int id) {
        studentDAO.updateStudent(student, id);
    }

    public void deleteStudent(int id) {
        Student book = studentDAO.getStudentById(id);
        if (book != null) {
            studentDAO.deleteStudent(id);
            System.out.println("success");
        } else {
            System.out.println("not fould id: " + id);
        }
    }
    public List<Student> getAllStudent() {
        List<Student> bookList = studentDAO.getAllStudent();
        if (bookList.isEmpty()) {
            System.out.println("not fould in DB");
        } else {
            System.out.println("list book in DB:");
            for (Student book : bookList) {
                System.out.println(book);
            }
        }
        return bookList;
    }
}
