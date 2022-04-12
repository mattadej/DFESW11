package org.qa.conditionals.fizzbuzz;

public class FizzBuzz {

   public String fizzBuzz (int num) {

       if (num % 5 == 0 && num % 3 == 0) {
          return "FizzBuzz";
       } else if (num % 5 == 0) {
           return "Buzz";
       } else if (num % 3 == 0) {
           return "Fizz";
       } else {
           return String.valueOf(num);
       }
   }

   public void fizzBuzzVoid (int num) {

     if (num % 5 == 0 && num % 3 == 0) {
       System.out.println("FizzBuzz");
     } else if (num % 5 == 0) {
       System.out.println("Buzz");
     } else if (num % 3 == 0) {
       System.out.println("Fizz");
     } else {
       System.out.println(num);
     }
   }

}
