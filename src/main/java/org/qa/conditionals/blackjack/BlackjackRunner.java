package org.qa.conditionals.blackjack;

public class BlackjackRunner {

    public static void main(String[] args) {

        Blackjack blackjack = new Blackjack();

        System.out.println(blackjack.play(10, 21)); //21
        System.out.println(blackjack.play(20, 18)); //20
        System.out.println(blackjack.play(1, 22)); //1
        System.out.println(blackjack.play(22, 23)); //0

    }

}
