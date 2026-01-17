package lesson1.service;

import lesson1.model.Person;

import java.util.List;

public interface PersonService {
    void addPerson(Person person);
    List<Person> getAll(boolean staticOrNot);
}
