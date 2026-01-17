package lesson1.repository;

import lesson1.model.Person;

import java.util.List;

public interface PersonRepository {
    void initializeList();

    Person addPerson(Person person);

    int updateName(int id, String name);

    List<Person> getAll(boolean staticOrNot);
}
