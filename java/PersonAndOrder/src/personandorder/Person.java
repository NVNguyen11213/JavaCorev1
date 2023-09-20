/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personandorder;

import java.util.ArrayList;
import java.util.List;

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
