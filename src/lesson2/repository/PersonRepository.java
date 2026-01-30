package lesson2.repository;

import lesson2.model.Person;

import java.util.List;

public interface PersonRepository {

    void addPerson(Person person);
    Person getPersonById(int id);
    void deletePerson(int id);
    void updatePerson(Person person);
    List<Person> getAll();


}
