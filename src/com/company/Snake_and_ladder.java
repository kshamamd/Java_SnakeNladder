package com.company;
import java.util.Random;

public class Snake_and_ladder {

    public static void main(String args[]) {
        //Initializing the position variable
        int position = 0;
        //Using store array to print it later
        String[] storer={"One" ,"Two", "Three" ,"Four","Five","Six"};
        Random dice = new Random();
        //Generating a random value to match the dice
        int roll = dice.nextInt(6);
        //printing the respective dice value
        System.out.println(storer[roll]);



    }

}
