package org.qa.iteration;

public class Iteration {

    public void whileLoop() {

        int catCount = 0;
        boolean notEnoughCats = true;

        while (notEnoughCats) {
            System.out.println("Another Cat");
            catCount++;

            if (catCount > 273) {
                notEnoughCats = false;
            }
        }
        System.out.println("Too many cats what do I do?");
    }

    public void doWhileLoop() {

        int playCount = 0;
        boolean playing = true;

        do {
            System.out.println("Playing");
            playCount++;

            if (playCount > 10){
                playing = false;
            }
        } while(playing);
        System.out.println("Game Over");
    }

    public void forLoop() {

        for (int i = 0; i < 10; i++){
            System.out.println("Hello There");
        }
    }

    public void continueBreak() {

        int i;
        for (i = 0; i <= 10; i++) {
            if (i == 2) {
                continue;
            }

            if (i == 8) {
                break;
            }
            System.out.println(i);
        }
    }

}
