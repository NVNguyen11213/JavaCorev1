package com.example.demo.model;

public class Student {
    private int id;
    private String name;
    private String numberPhone;
    private String hometown;

    public Student(int id, String name,String numberPhone,String hometown) {
        this.id = id;
        this.name= name;
        this.numberPhone = numberPhone;
        this.hometown = hometown;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
