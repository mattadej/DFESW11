package org.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String>  sandwiches = new ArrayList<>();
        List<List> test = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        sandwiches.add("bread sandwich");
        sandwiches.add("pop tart");
        sandwiches.add("hot dog");

        nums.add(354);
        nums.add(500);
        nums.add(192);

        System.out.println(sandwiches.get(0));
        System.out.println(sandwiches.get(2));

        sandwiches.set(0, "ice cream  sandwich");
        System.out.println(sandwiches);

        test.add(sandwiches);
        test.add(nums);
        System.out.println(test);

        sandwiches.remove(0);
        System.out.println(sandwiches);

        sandwiches.size();

        int i;
        for (i = 0; i < sandwiches.size(); i++) {
            System.out.println(sandwiches.get(i));
        }

        for (String a : sandwiches){
            System.out.println(a);
        }

        Collections.sort(nums);

        for (int b : nums) {
            System.out.println(b);
        }

        sandwiches.clear();
        System.out.println(sandwiches);
    }
}
