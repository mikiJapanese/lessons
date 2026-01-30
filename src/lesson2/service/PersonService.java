package lesson2.service;

import lesson1.model.Person;

import java.util.List;

public interface PersonService {

    void addNewPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(int id);
    List<Person> getAll();
    Person getPersonById(int id);
}

