package org.qa.enhancedforloop;

public class Exercises {

    int arrayInt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    String array[] = {"Hello", "Hi", "Bonjour", "Guten tag", "Ciao"};

    public void questionOne() {

        for (String s : array) {
            System.out.println(s);
        }
    }

    public void questionTwo() {

        for (int i : arrayInt) {
            System.out.println(i);
        }

    }

    public boolean questionThree(int i) {

        if (i % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }

    public void questionFour() {

        for (int i : arrayInt) {
            questionThree(i);

            if (questionThree(i)) {
                System.out.println(i * i * i);
            }else {
                System.out.println(i * i);
            }
        }
    }
}
