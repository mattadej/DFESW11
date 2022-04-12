package org.qa.interfaces.classes;

import org.qa.interfaces.interfaces.Carnivore;
import org.qa.interfaces.interfaces.Herbivore;

public class Bear implements Carnivore, Herbivore {

    @Override
    public void eatMeat() {
        System.out.println("I eat meat and fish");
    }

    @Override
    public void eatGrass() {
        System.out.println("I eat grass and plants");
    }
}
