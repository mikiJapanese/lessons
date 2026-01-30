package lesson2.service;

import lesson1.model.Person;
import lesson1.repository.PersonRepository;

public class PersonServiceImpl {

    private PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;

    }
    void addNewPerson(Person person) {
        if(person == null) {
            return;
        }
        repository.addPerson(person);
    }

}

