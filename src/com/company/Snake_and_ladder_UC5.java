package com.company;

public class Snake_and_ladder_UC5 {

    public static void main(String[] args) {

        //variables
        final int NO_PLAY=0;
        final int LADDER=1;
        final int SNAKE=2;
        int position=0;

        //while loop to iterate till player reaches winning position 100
        while(position <= 100)
        {
            //to get dice value
            int dieValue=(int) ((Math.random() * 100) % 6)+1;

            //to get status of player if its no play,ladder or snake
            int playerStatus=(int) (Math.random() * 100) % 3;

            //to print player status
            if(playerStatus == 0)
            {
                System.out.println("Status: NoPlay ");
            }
            if(playerStatus == 1)
            {
                System.out.println("Status: Ladder");
            }
            if(playerStatus == 2)
            {
                System.out.println("Status: Snake");
            }

            //using switch case to check player position
            switch(playerStatus)
            {
                case NO_PLAY:
                    position =position;
                    break;
                case LADDER:
                    position +=dieValue;
                    break;
                default:
                    position -=dieValue;
                    break;
            }

            System.out.println("Player current position is: "+position);

            //checking if player position less than 0
            if(position < 0)
            {
                position =0;
                System.out.println("Player current position is: "+position);
            }

            //checking if player exceeds its position than 100
            if(position > 100)
            {
                position -=dieValue;
                System.out.println("Player went to previous position: "+position);
            }

            //checking if player position reaches 100
            if(position == 100)
            {
                System.out.println("Player reaches its winning position: "+position);
                break;
            }
        }
    }
}
