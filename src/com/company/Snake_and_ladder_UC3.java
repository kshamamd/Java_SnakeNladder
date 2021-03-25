package com.company;
import java.util.Random;

public class Snake_and_ladder_UC3 {

    public static void main(String args[]) {
        //Intializing the position variable
        int position = 0;

        String[] storer = {"One", "Two", "Three", "Four", "Five", "Six"};
        Random dice = new Random();
        //generating the dice value
        int displayer = dice.nextInt(6);
        System.out.println(storer[displayer]);

        //generating the random value to play options
        int ladder_or_snake = dice.nextInt(3);
        switch (ladder_or_snake) {
            //Noplay case
            case 0:
                System.out.println("No play");
                System.out.println(position);
                break;
            //Ladder case
            case 1:
                System.out.println("Ladder");
                //position += roll;
                System.out.println(position);
                break;
            //snake case
            case 2:
                System.out.println("Snake");
                //position = position - roll;
                System.out.println(position);
                break;

            default:
                break;


        }

    }
}
