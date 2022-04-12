package org.qa.constructors.runner;

import org.qa.constructors.domain.Person;

public class Runner {

    public static void main(String[] args) {

        Person personOne = new Person();
        Person personTwo = new Person("Matthew ","Adejumo");
        System.out.println(personTwo.getFirstName());
        personTwo.setFirstName("Matt");
        System.out.println(personTwo.getFirstName());
    }
}
