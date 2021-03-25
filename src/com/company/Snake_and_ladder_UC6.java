package com.company;

public class Snake_and_ladder_UC6 {

    public static void main(String[] args) {

        //variables
        final int START=0;
        final int NO_PLAY=0;
        final int LADDER=1;
        final int SNAKE=2;
        int position=0;
        int diceCount=0;

        //while loop to iterate till player reaches winning position 100
        while(position <= 100)
        {
            //to get dice value
            int diceValue=(int) ((Math.random() * 100) % 6)+1;
            diceCount++;

            //to get status of player if its no play,ladder or snake
            int playerStatus=(int) (Math.random() * 100) % 3;

            //using switch case to check player position
            switch(playerStatus)
            {
                case NO_PLAY:
                    position =position;
                    break;
                case LADDER:
                    position +=diceValue;

                    break;
                default:
                    position -=diceValue;
                    break;
            }

            System.out.println("Player's current position is "+position);

            //checking if player position less than 0
            if(position < 0)
            {
                position =0;
                System.out.println("player position is "+position);
            }

            //checking if player exceeds its position than 100
            if(position > 100)
            {
                position -=diceValue;
                System.out.println("player goes to its previous position "+position);
            }

            //checking if player position reaches 100
            if(position == 100)
            {
                System.out.println("Player reaches its winning position "+position);
                System.out.println("Dice rolled for "+diceCount +" times");

                break;
            }
        }
    }

}
