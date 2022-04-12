package org.qa.iteration.polymorphism.demo;

public class Santander extends Bank {

    public void accountOpen() {
        System.out.println("open account at santander, they're great");
    }

    public void showBalance() {
        System.out.println("My balance is almost looking as good as Barclays");
    }
}
