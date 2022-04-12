package org.qa.conditionals.uniquesum;

public class UniqueSumRunner {

    public static void main(String[] args) {

        UniqueSum uniqueSum = new UniqueSum();

        System.out.println(uniqueSum.methodOne(1, 2, 3)); //6
        System.out.println(uniqueSum.methodOne(3, 3, 3)); //0
        System.out.println(uniqueSum.methodOne(1, 1, 2)); //2

    }
}
