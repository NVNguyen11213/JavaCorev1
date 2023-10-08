package com.example.demo.view;

import com.example.demo.controller.StudentController;
import com.example.demo.model.Student;

import java.util.Scanner;

public class View {
    private static StudentController studentController = new StudentController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Student student = createStudent();
                    studentController.addStudent(student);
                    break;
                case 2:
                    System.out.print("id of student you want update: ");
                    int idUpdate = scanner.nextInt();
                    Student studentUpdate = createStudent();
                    studentController.updateStudent(studentUpdate,idUpdate);
                    break;
                case 3:
                    System.out.print("id of student you want delete: ");
                    int idDelete = scanner.nextInt();
                    studentController.deleteStudent(idDelete);
                    break;
                case 4:
                    studentController.getAllStudent();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Try Again");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Show Student");
        System.out.println("5. Exit");
        System.out.print("Enter Your Choice: ");
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("id: ");
        int id = scanner.nextInt();
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("numberPhone: ");
        String numberPhone = scanner.nextLine();
        System.out.print("hometown: ");
        String hometown = scanner.nextLine();
        Student student = new Student(id, name, numberPhone, hometown);
        return student;
    }
}
