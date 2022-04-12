package org.qa.person;

public class Runner {
    public static void main(String[] args) {

        PersonHandler personHandler = new PersonHandler();

        personHandler.pickSpecificPerson("Matthew Adejumo");

        personHandler.showAllPeople();
    }
}
