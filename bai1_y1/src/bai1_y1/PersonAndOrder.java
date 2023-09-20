package bai1_y1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {

    private String name;
    private String hometown;
    private String age;
    private String phoneNumber;

    public Person(String name, String hometown, String age, String phoneNumber) {
        this.name = name;
        this.hometown = hometown;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.orders = new ArrayList<>();
    }
    private List<Order> orders;

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void editOrder(int index, Order newOrder) {
        if (index >= 0 && index < orders.size()) {
            orders.set(index, newOrder);
            System.out.println("Orders have been edited.");
        } else {
            System.out.println("Unable to find orders to edit.");
        }
    }

    public void deleteOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            orders.remove(index);
            System.out.println("Orders have been deleted.");
        } else {
            System.out.println("Unable to find orders to delete.");
        }
    }

    public List<Order> getOrders() {
        return orders;
    }
}

class Order {

    private String orderNumber;
    private String orderName;
    private String orderPrice;

    public Order(String orderNumber, String orderName, String orderPrice) {
        this.orderNumber = orderNumber;
        this.orderName = orderName;
        this.orderPrice = orderPrice;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
}

public class PersonAndOrder {

    private static List<Person> people;

    public static void main(String[] args) {
        people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPerson(scanner);
                    break;
                case 2:
                    editPerson(scanner);
                    break;
                case 3:
                    deletePerson(scanner);
                    break;
                case 4:
                    addOrder(scanner);
                    break;
                case 5:
                    editOrder(scanner);
                    break;
                case 6:
                    deleteOrder(scanner);
                    break;
                case 7:
                    displayPeopleAndOrders();
                    break;
                case 0:
                    System.out.println("The program has ended.");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Add person");
        System.out.println("2. Edit person");
        System.out.println("3. Delete person");
        System.out.println("4. Add orders for people");
        System.out.println("5. Edit orders of people");
        System.out.println("6. Delete orders of people");
        System.out.println("7. Show list of people and orders");
        System.out.println("0. Program escape");
        System.out.print("Your choice: ");
    }

    private static void addPerson(Scanner scanner) {
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

    private static void editPerson(Scanner scanner) {
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

    private static void deletePerson(Scanner scanner) {
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

    private static void addOrder(Scanner scanner) {
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

    private static void editOrder(Scanner scanner) {
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

    private static void deleteOrder(Scanner scanner) {
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

    private static void displayPeopleAndOrders() {
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
