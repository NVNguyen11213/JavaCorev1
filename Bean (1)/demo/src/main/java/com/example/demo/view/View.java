package com.example.demo.view;

import com.example.demo.controller.PersonController;
import com.example.demo.model.Person;

import java.util.Scanner;

public class View {
    private static PersonController personController = new PersonController();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Person person = createPerson();
                    personController.addPerson(person);
                    break;
                case 2:
                    System.out.print("id of person you want update: ");
                    int idUpdate = scanner.nextInt();
                    Person personUpdate = createPerson();
                    personController.updatePerson(personUpdate,idUpdate);
                    break;
                case 3:
                    System.out.print("id of person you want delete: ");
                    int idDelete = scanner.nextInt();
                    personController.deletePerson(idDelete);
                    break;
                case 4:
                    personController.getAllPerson();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Try Again");
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Add Person");
        System.out.println("2. Update Person");
        System.out.println("3. Delete Person");
        System.out.println("4. Show Person");
        System.out.println("5. Exit");
        System.out.print("Enter Your Choice: ");
    }

    public static Person createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt();
        System.out.print("numberPhone: ");
        String numberPhone = scanner.nextLine();
        Person person = new Person(0, name, age, numberPhone);
        return person;
    }
}
