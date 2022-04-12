package org.qa.conditionals.uniquesum;

public class UniqueSum {

    public int methodOne (int num1, int num2, int num3) {

        if (num1 == num2 && num2 == num3) {
            return 0;
        } else if (num1 == num2) {
            return num3;
        } else if (num1 == num3) {
            return num2;
        } else if (num3 == num2) {
            return num1;
        } else {
            int total = num1 + num2 + num3;
            return total;
        }
    }
}
