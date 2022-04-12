package org.qa.interfaces.classes;

import org.qa.interfaces.interfaces.Carnivore;
import org.qa.interfaces.interfaces.SeaAnimal;

public class Shark implements Carnivore, SeaAnimal {

    @Override
    public void eatMeat() {
        System.out.println("I eat all kinds of fish");
    }

    @Override
    public void swim() {
        System.out.println("I am gonna get you");
    }
}
