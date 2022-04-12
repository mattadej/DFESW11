package org.qa.stringmanipulation;

public class Runner {

    public static void main(String[] args) {

        Tasks tasks = new Tasks();

        tasks.partOne();
        tasks.partTwo();
        System.out.println(tasks.wordCount("The quick brown fox jumps over the lazy dog"));;
        tasks.printingVertical("The quick brown fox jumps over the lazy dog");
        tasks.PrintVerticalReverse("The quick brown fox jumps over the lazy dog");

    }
}

