package org.qa.interfaces.classes;

import org.qa.interfaces.interfaces.Carnivore;

public class Lion implements Carnivore {

    @Override
    public void eatMeat() {
        System.out.println("I eat all kinds of animals, I am the king of the jungle");
    }
}
