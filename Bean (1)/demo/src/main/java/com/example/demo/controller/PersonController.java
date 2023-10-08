package com.example.demo.controller;

import com.example.demo.DAO.PersonDAO;
import com.example.demo.DAO.PersonDAOImpl;
import com.example.demo.model.Person;

import java.util.List;

public class PersonController {
    private PersonDAO personDAO = new PersonDAOImpl();
    public void addPerson(Person person){
        personDAO.addPerson(person);
    }
    public void updatePerson(Person person, int id){
        personDAO.updatePerson(person,id);
    }
    public void deletePerson(int id){
        Person person = personDAO.getPersonById(id);
        if( person != null) {
            personDAO.deletePerson(id);
            System.out.println("success");
        }else{
            System.out.println("not fould id: "+ id);
        }
    }
    public List<Person> getAllPerson(){
        List<Person> personList = personDAO.getAllPerson();
        if(personList.isEmpty()){
            System.out.println("not fould in BD");
        }else{
            System.out.println("List person in BD");
            for(Person person: personList){
                System.out.println(person);
            }
        }
        return personList;
    }
}
