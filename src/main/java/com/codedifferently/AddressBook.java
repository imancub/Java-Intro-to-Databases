package com.codedifferently;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AddressBook {
    private static final Logger logger = Logger.getGlobal();
    private Person owner;
    private List<Person> people;

    public AddressBook(){
        people = new ArrayList<>();
        owner = new Person();
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void addPerson(Person person) {
        people.add(person);
        logger.info(("Adding new person " + person.getFirstName()));
        logger.info(("We have this many people " + people.size()));
    }

    public void removePerson(Person person) {

    }

    public Person getPersonByEmail(String email){
        return null;
    }

    public List<Person> getAllPeople() {
        return people;
    }

    public boolean saveAll() {
       return true;
    }
}
