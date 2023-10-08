package com.example.demo.DAO;

import com.example.demo.model.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> getAllPerson();
    void addPerson(Person person);
    void updatePerson(Person person, int id);
    void deletePerson(int id);
    Person getPersonById(int id);
}
