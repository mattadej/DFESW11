package org.qa.stringmanipulation;

public class Tasks {

    public void partOne() {
        String str1 = "today it is sunny";
        String str2 = "yesterday it was raining";
        System.out.println(str1.toUpperCase() + ", " + str2.toUpperCase());
    }

    public void partTwo() {
        String str1 = "today it is sunny";
        String str2 = "yesterday it was raining";
        String subStringOne = str1.substring(0, 11);
        String subStringTwo = str2.substring(16, 24);
        System.out.println(subStringOne + subStringTwo);
    }

    public int wordCount(String message) {
        if (message == null || message.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                count++;
                while (message.charAt(i) != ' ' && i < message.length() - 1) {
                    i++;
                }
            }
        }
        return count;
    }

    public void printingVertical(String message) {
        int i;
        String word = "";

        for (i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                System.out.println(word);
                word = "";
            } else {
                word += message.substring(i, i + 1);
            }
        }
        System.out.println(word);
    }

    public void PrintVerticalReverse(String message) {

        int i;
        String word = "";
        // i = length of word as we start from reverse
        for (i = message.length(); i > 0; i--) {
            // picks up the maximum/last character
            if (message.substring(i - 1, i).equals(" ")) {

                System.out.println(word);

                // make word empty
                word = "";

            } else {

                // inside word, its stores last character, and keeps going until a character is
                // a space
                // we want to store letters to the left, rather than right (therefore we cant
                // use +=
                // as it always add to the end
                word = message.substring(i - 1, i) + word;
            }
        }
        // prints last word that gets cut off
        System.out.println(word);
    }

    public static void main(String[] args) {
        Tasks t = new Tasks();

        t.PrintVerticalReverse("Hello World I Am Matthew");
    }

}
