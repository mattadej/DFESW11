package org.qa.person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PersonHandler {

    PersonList peopleList = new PersonList();

    private List<Person> personList = Arrays.asList(peopleList.firstPerson,
            peopleList.secondPerson, peopleList.thirdPerson);

    public void pickSpecificPerson(String name) {
        System.out.println(personList.stream()
                .filter(personList -> personList.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList()));
    }

    public void showAllPeople() {
        personList.stream().forEach(personList -> System.out.println(personList.toString()));
    }
}


