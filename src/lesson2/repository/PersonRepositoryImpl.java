package lesson2.repository;
import lesson2.model.Person;
import java.util.List;
import java.util.ArrayList;

public abstract class PersonRepositoryImpl implements PersonRepository {

    private final List<Person> PERSONS = new ArrayList<>();

    public PersonRepositoryImpl() {
        super();
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public List<Person> getAll() {
        return List.of();
    }
}
