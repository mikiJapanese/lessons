package lesson1;

import lesson1.model.Person;
import lesson1.repository.PersonRepositoryImpl;
import lesson1.service.PersonService;
import lesson1.service.PersonServiceImpl;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class Main {
    static void main() {
        String separator = "\n\n------------%s------------";
        Person person = new Person();
        Person person1 = new Person();

        person.setId(1);
        person.setName("TestName");
        person.setSurname("TestSurname");

        person1.setId(1);
        person1.setName("TestName");
        person1.setSurname("TestSurname");

        Object object = new Object();
        Object object1 = new Object();

        System.out.println(separator.formatted("Object"));

        System.out.println(object.getClass());
        System.out.println(object.hashCode());
        System.out.println(object1.hashCode());
        System.out.println(object.equals(object1));

        System.out.println(separator.formatted("Person"));

        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(separator.formatted("Person1"));
        System.out.println(person1.getId());
        System.out.println(person1.getName());
        System.out.println(person1.getSurname());

        System.out.println(separator.formatted("PersonEquals"));
        System.out.println(person.equals(person1));

        PersonService personService = new PersonServiceImpl(new PersonRepositoryImpl());

        personService.addPerson(person);
        System.out.println(separator.formatted("PersonList"));

        List<Person> personList = personService.getAll(true);


        System.out.println(personList);
        System.out.println(personList);

        System.out.println("Size of a list %s".formatted(personList.size()));

        System.out.println(separator.formatted("INDEX ++ (ASCENDING)"));

        String systemOutPattern = "id: %s; name: %s; surname:%s";

        for (int index = 0; index < personList.size(); index++) {
            Person personFromList = personList.get(index);

            System.out.println(systemOutPattern.formatted(
                    personFromList.getId(),
                    personFromList.getName(),
                    personFromList.getSurname())
            );
        }
        System.out.println(separator.formatted("INDEX ++ (DESCENDING)"));
        for (int index = personList.size() - 1; index >= 0; index--) {
            Person personFromList = personList.get(index);

            System.out.println(systemOutPattern.formatted(
                    personFromList.getId(),
                    personFromList.getName(),
                    personFromList.getSurname())
            );
        }
        System.out.println(separator.formatted("METHOD REFERENCE"));
        personList.stream().forEach(System.out::println);

        System.out.println(separator.formatted("CLASSIC FOR EACH"));

        personList.stream().forEach(p -> System.out.println(systemOutPattern.formatted(
                p.getId(),
                p.getName(),
                p.getSurname()
        )));
    }
}
