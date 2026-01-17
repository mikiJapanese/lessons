package lesson1.service;

import lesson1.model.Person;
import lesson1.repository.PersonRepository;

import java.util.List;

public class PersonServiceImpl implements PersonService{
    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }



    @Override
    public void addPerson(Person person) {
        if(true /* OR false */){

        }
        if (validatePerson(person) /* if true then save */){
            repository.addPerson(person);
        }
    }

    @Override
    public List<Person> getAll(boolean staticOrNot) {
        return repository.getAll(staticOrNot);
    }

    /**
     *
     * @param person
     * @return true only when person (input parameter) is not equals null and person parameters:
     *         name, surname, id are not equals null
     */
    private boolean validatePerson(Person person) {

        if (person == null){
            return false;
        }
        if (person.getId() == 0){
            return false;
        }

        //getName().isEmpty() can throw NullPointerExcetion; so first check getName() if null
        if (person.getName() == null || person.getName().isEmpty()){
            return false;
        }
        //same here
        if (person.getSurname() == null || person.getSurname().isEmpty()){
            return false;
        }

        return true;
    }
}
