package org.qa.arrays;

public class Arrays {

    public static void main(String[] args) {
        //SINGLE DIMENSION ARRAYS
        //first method creates empty array
        int[] ageArray;

        //second method, creates array with values in it
        int[] array = {24, 35, 46, 57, 68};
        String[] stringArray = {"Hello", "My", "Name", "is", "Matthew"};
        //printing out the array
        for (String s : stringArray) {
            System.out.println(s);
        }

        //third method, creates an array of a specific size
        int[] arraySize = new int[5];
        //adding values to array
        arraySize[0] = 20;

        //MULTIDIMENSIONAL ARRAY
        //first method
        int[][] multiArray;

        //second method
        int[][] arrayMulti = {{23, 2, 10}, {49}, {6, 18}};

        //third method
        //[3] means there are 3 arrays. [2] indicates how many values per array
        int[][] arraySet = new int[3][2];
        //adding values to a multidimensional array ([2][0] is the THIRD array,at the
        //first position
        arraySet[2][0] = 21;
        System.out.println(arraySet[2][0]);

        /////////////////////////////////////////////////////////////////////////////

        int[][] loopArray = {{23, 2, 10}, {49, 4, 10}, {6, 18, 77}};

        //Nested for loop
        for (int i = 0; i < loopArray.length; i++) {
            for (int j = 0; j < loopArray[i].length; j++) {
                System.out.println(loopArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("========================================");

        //Nested for each loop
        for (int[] a : loopArray) {
            for (int b : a) {
                System.out.println(b);
            }
            System.out.println();
        }
    }

}
