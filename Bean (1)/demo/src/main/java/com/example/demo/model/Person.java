package com.example.demo.model;

public class Person {
    private int id;
    private String name;
    private int age;
    private String numberPhone;

    public Person(int id, String name, int age, String numberPhone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
