package org.qa.operators.results;

public class Results {

    private static int physics = 120;
    private static int chemistry = 99;
    private static int biology = 70;
    private static int total;
    private static float percentage;

    public int totalMarks () {
        System.out.println("Your physics mark is: " + physics);
        System.out.println("Your chemistry mark is: " + chemistry);
        System.out.println("Your biology mark is: " + biology);
        total = physics + chemistry + biology;
        System.out.print("Your total mark is: ");
        return total;
    }

    public int percentageMarks () {
        int total = physics + chemistry + biology;
        System.out.print("Your average percentage across all tests is: ");
        return (total * 100) / 450;
    }
}
