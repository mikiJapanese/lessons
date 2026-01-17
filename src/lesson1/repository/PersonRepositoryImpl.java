package lesson1.repository;

import lesson1.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository{
    private static List<Person> PERSON_LIST = new ArrayList<>();

    private static List<Person> PERSON_LIST_2 = new ArrayList<>();

    public void initializeList(){
        PERSON_LIST_2.add(new Person(1, "TestName", "TestSurname"));
        PERSON_LIST_2.add(new Person(2, "TestName1", "TestSurname1"));
        PERSON_LIST_2.add(new Person(3, "TestName2", "TestSurname2"));
        PERSON_LIST_2.add(new Person(4, "TestName3", "TestSurname3"));
        PERSON_LIST = PERSON_LIST_2;
    }

    public PersonRepositoryImpl() {
        initializeList();
    }

    @Override
    public Person addPerson(Person person) {
        List<Person> personList = PERSON_LIST;
        personList.add(person);
        PERSON_LIST = personList;
        return person;
    }

    @Override
    public int updateName(int id, String name) {
        Person person = PERSON_LIST.stream().filter(p -> p.getId() == id).findAny().orElse(null);

        if (person != null){
            person.setName(name);
            return 1;
        }
        return 0;
    }

    @Override
    public List<Person> getAll(boolean staticOrNot) {
        if (staticOrNot){
            return PERSON_LIST;
        }
        else return PERSON_LIST_2;
    }
}
