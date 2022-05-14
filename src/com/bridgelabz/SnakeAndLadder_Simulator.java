package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder_Simulator {

    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;

    public static void main(String[] args) {
        int position = 0;
        System.out.println("position: "+position);
        while (position<100) {
            Random ran = new Random();
            int dice = ran.nextInt(6)+1;
            System.out.println("dice: "+dice);
            int optionCheck = ran.nextInt(3);
            System.out.println("optionCheck: "+optionCheck);


            if (optionCheck == LADDER) {
                System.out.println("ladder!!!");
                position = position + dice;
            }
            else if (optionCheck == SNAKE) {
                System.out.println("snake!!!");
                position = position - dice;
            }
            else {
                System.out.println("noPlay!!!");
                position = position;
            }
            if (position<0) {
                position =0;
            }
            System.out.println("position: "+position);
        }
    }
}
