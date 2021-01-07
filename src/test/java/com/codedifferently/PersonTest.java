package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person;

    @Before
    public void setUp(){
        person = new Person("1", "Faith", "Factorial", "gmail", 2);

    }

    @Test
    public void testGetFirstName(){
        //Given
        String expected = "Faith";

        //When
        String actual = person.getFirstName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFirstName(){
        //Given
        String expected = "Factorial";

        //When
        person.setFirstName("Factorial");
        String actual = person.getFirstName();

        //Then
        Assert.assertEquals(actual, expected);
    }
}