package work;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random random=new Random();

        int score=0;
        int attempts;
        boolean playAgain=true;
        int StartNum=1;
        int endNum=100;
        System.out.println("welcome to game!");

        while(playAgain){
            int randomNumber=random.nextInt(endNum-StartNum+1)+StartNum;
            boolean guessedRight=false;
            attempts=0;

            System.out.println("pick a number between"+StartNum+"to"+endNum+"IF you gussed correct you got your  Rank");

            while(!guessedRight&&attempts<5){
                attempts++;
                System.out.println("Enter your number:");
                int guss=scn.nextInt();
                if(randomNumber==guss){
                    score=score+5-attempts;
                    System.out.println("your guss is right.Your score is " + score +  "in "+attempts+"attempts");

                } else if (guss<randomNumber) {
                    System.out.println("to low.try again");

                }else{
                    System.out.println("too high.try agin");
                }

            }
            if(!guessedRight){
                System.out.println("Your Attempts is finished ." + "guss number is "+randomNumber);
            }

            System.out.println("your score is "+score+"."+"Do you want to play again(yes/no)");
           String Playaginchoice=scn.next().toLowerCase();
           playAgain=Playaginchoice.equals("yes")||Playaginchoice.equals("y");



        }
        System.out.println("your final score is "+score);
        System.out.println("thank to play my Game!");
        scn.close();
    }
}
