package org.qa.inhertitance.runner;

import org.qa.inhertitance.demo.Animals;
import org.qa.inhertitance.demo.Tiger;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Animals.tester();

        Tiger tiger = new Tiger("Deer", 4, true);
        System.out.println(tiger);
        tiger.eat();

        List<Integer> test = new ArrayList<>();
    }
}
