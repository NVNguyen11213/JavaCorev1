/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personandorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admissions {

    List<Person> people = new ArrayList<>();

    void addPerson(Scanner scanner) {
        System.out.print("Enter the name of the person: ");
        String personName = scanner.nextLine();
        System.out.print("Enter the hometown of the person: ");
        String personHometown = scanner.nextLine();
        System.out.print("Enter the age: ");
        String personAge = scanner.nextLine();
        System.out.print("Enter the number phone: ");
        String personNumberPhone = scanner.nextLine();

        Person newPerson = new Person(personName, personHometown, personAge, personNumberPhone);
        people.add(newPerson);
        System.out.println("Adding.");
    }

    void editPerson(Scanner scanner) {
        System.out.print("Enter the index of information to edit information: ");
        int editPersonIndex = scanner.nextInt();
        scanner.nextLine();
        if (editPersonIndex >= 0 && editPersonIndex < people.size()) {
            System.out.print("Enter the name of the person: ");
            String personName = scanner.nextLine();
            System.out.print("Enter the hometown of the person: ");
            String personHometown = scanner.nextLine();
            System.out.print("Enter the age: ");
            String personAge = scanner.nextLine();
            System.out.print("Enter the number phone: ");
            String personNumberPhone = scanner.nextLine();

            Person updatedPerson = new Person(personName, personHometown, personAge, personNumberPhone);
            people.set(editPersonIndex, updatedPerson);
            System.out.println("Information has been edited.");
        } else {
            System.out.println("Can not find people to edit.");
        }
    }

    void deletePerson(Scanner scanner) {
        System.out.print("Enter the index of the person to delete: ");
        int deletePersonIndex = scanner.nextInt();
        scanner.nextLine();
        if (deletePersonIndex >= 0 && deletePersonIndex < people.size()) {
            people.remove(deletePersonIndex);
            System.out.println("The person has been deleted.");
        } else {
            System.out.println("Can not find people to delete.");
        }
    }

    void addOrder(Scanner scanner) {
        System.out.print("Enter the number of people to add orders: ");
        int personIndex = scanner.nextInt();
        scanner.nextLine();
        if (personIndex >= 0 && personIndex < people.size()) {
            System.out.print("Enter the number: ");
            String orderNumber = scanner.nextLine();
            System.out.print("Enter the name: ");
            String orderName = scanner.nextLine();
            System.out.print("Enter the price: ");
            String orderPrice = scanner.nextLine();

            Order newOrder = new Order(orderNumber, orderName, orderPrice);
            people.get(personIndex).addOrder(newOrder);
            System.out.println("The order has been added.");
        } else {
            System.out.println("Can't find people to add orders.");
        }
    }

    void editOrder(Scanner scanner) {
        System.out.print("Enter the index of the person: ");
        int personIndex = scanner.nextInt();
        scanner.nextLine();
        if (personIndex >= 0 && personIndex < people.size()) {
            Person person = people.get(personIndex);
            List<Order> orders = person.getOrders();
            if (orders.isEmpty()) {
                System.out.println("This person has no order.");
            } else {
                System.out.print("Enter the order index to be edited: ");
                int editOrderIndex = scanner.nextInt();
                scanner.nextLine();
                if (editOrderIndex >= 0 && editOrderIndex < orders.size()) {
                    System.out.print("Enter the number: ");
                    String orderNumber = scanner.nextLine();
                    System.out.print("Enter the name: ");
                    String orderName = scanner.nextLine();
                    System.out.print("Enter the price: ");
                    String orderPrice = scanner.nextLine();

                    Order newOrder = new Order(orderNumber, orderName, orderPrice);
                    person.editOrder(editOrderIndex, newOrder);
                } else {
                    System.out.println("Unable to find orders to edit.");
                }
            }
        } else {
            System.out.println("Can not find the person to edit the order.");
        }
    }

    void deleteOrder(Scanner scanner) {
        System.out.print("Enter the index of the person: ");
        int personIndex = scanner.nextInt();
        scanner.nextLine();
        if (personIndex >= 0 && personIndex < people.size()) {
            Person person = people.get(personIndex);
            List<Order> orders = person.getOrders();
            if (orders.isEmpty()) {
                System.out.println("This person has no order.");
            } else {
                System.out.print("Enter the order index to be deleted: ");
                int deleteOrderIndex = scanner.nextInt();
                scanner.nextLine();
                if (deleteOrderIndex >= 0 && deleteOrderIndex < orders.size()) {
                    person.deleteOrder(deleteOrderIndex);
                } else {
                    System.out.println("Unable to find orders to delete.");
                }
            }
        } else {
            System.out.println("Can not find the person to edit the delete.");
        }
    }

    void displayPeopleAndOrders() {
        if (people.isEmpty()) {
            System.out.println("List of people and empty orders.");
        } else {
            System.out.println("===== List of people and orders =====");
            for (int i = 0; i < people.size(); i++) {
                Person person = people.get(i);
                System.out.println("people " + i + ": " + person.getName());
                List<Order> orders = person.getOrders();
                if (orders.isEmpty()) {
                    System.out.println("  (This person has no order)");
                } else {
                    System.out.println("  Order:");
                    for (int j = 0; j < orders.size(); j++) {
                        Order order = orders.get(j);
                        System.out.println("    - Order " + j + ":");
                        System.out.println("      Order Number: " + order.getOrderNumber());
                        System.out.println("      Order Name: " + order.getOrderName());
                        System.out.println("      Order Price: " + order.getOrderPrice());
                    }
                }
            }
        }
    }
}
