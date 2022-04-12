package org.qa.classmembers;

import org.qa.classmembers.customer.Customer;

public class Runner {

    public static void main(String[] args) {
        //initialising an object
        Customer customerOne = new Customer();

        //customerOne object has a first name of Matthew and a surname of Adejumo
        customerOne.setFirstName("Matthew");
        customerOne.setSurname("Adejumo");

        //show what is sorted
        System.out.println(customerOne.getFirstName() + " " + customerOne.getSurname());

        //With toString method
        System.out.println(customerOne);

        System.out.println("========================================================");

        //static class members
        System.out.println(Customer.getNumberOfPeople());

        Customer customerTwo = new Customer();

        System.out.println(Customer.getNumberOfPeople());
    }
}
