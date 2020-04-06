//Listing 3.3
//********************************************************************
//  Guessing.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a block statement in an if-else.
//********************************************************************
import java.util.Scanner;
import java.util.Random;
public class SecondGuessingClass {

    //-----------------------------------------------------------------
    //  Plays a simple guessing game with the user.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        final int MAX = 100;
        int answer, guess, keepPlaying ;
        boolean IsPlaying = true;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        answer = generator.nextInt(MAX) + 1;
        System.out.println(answer);
        System.out.print("I'm thinking of a number between 1 and "
                + MAX + ". Guess what it is or enter -1 to quit: ");
        while (IsPlaying == true) {
            guess = scan.nextInt();
            if (guess == answer) {
                System.out.println("You got it! Good guessing!");
                System.out.println("Do you want to keep playing?");
                System.out.println("Answer- 1 for yes / 2 for no:" );
                keepPlaying = scan.nextInt();
                if (keepPlaying == 1){

                    answer = generator.nextInt(MAX) + 1;
                    System.out.println("Guess the new number");
                    System.out.println(answer);
                }   else {
                    IsPlaying = false;
                    System.out.println("you are no longer playing");
                }

            } else if (guess > answer) {
                System.out.println("It is too high.");
                System.out.println("TRY AGAIN or enter -1 to quit");
            } else if (guess == -1){
                IsPlaying = false;
                System.out.println("you quit");
            }zv
            else {
                System.out.println("It is too low.");
                System.out.println("TRY AGAIN or enter -1 to quit");
            }
        }
    }
}

