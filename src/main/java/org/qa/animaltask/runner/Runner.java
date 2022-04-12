package org.qa.animaltask.runner;

import org.qa.animaltask.domain.Bear;

public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Fish and Grass", "Woods", 6, "Black Bear", 600);

        System.out.println(bear);
    }
}
