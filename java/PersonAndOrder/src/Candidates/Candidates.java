/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Candidates;


public class Candidates {
    private static int count = 0;
    private int identificationNumber;
    private String name;
    private String address;
    private String priorityLevel;

    public Candidates( String name, String address, String priorityLevel) {
        this.identificationNumber = ++count;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
    void display(){
        System.out.println("Identification Number: " + identificationNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Priority Level: " + priorityLevel);
    }
}
