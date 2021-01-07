package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {

    Person person;
    Person owner;

    @Before
    public void setUp(){
        person = new Person("1", "Faith", "Factorial", "gmail", 2);
        owner = new Person();
    }

    @Test
    public void testGetOwner() {
        //Given
        AddressBook addressBook = new AddressBook();
        Person ownerTest = addressBook.getOwner();

        //Then
        Assert.assertTrue(ownerTest instanceof Person);
    }

    @Test
    public void testSetOwner() {
    }

    @Test
    public void testAddPerson() {
    }

    @Test
    public void testRemovePerson() {
    }

    @Test
    public void testGetPersonByEmail() {
    }

    @Test
    public void testGetAllPeople() {
    }

    @Test
    public void testSaveAll() {
    }
}