package GameHeadsAndTails3_14;

// Write a program that lets the user guess the result head or tail.
// The program randomly generates a boolean 1 og 0, which represents head or tail.
// The prompt the user to enter a guess, and reports whether the guess is right or wrong.
import java.util.Random;
import java.util.Scanner;

public class GameHeadsAndTails {

    public static void main(String[] args) {

        System.out.println("Please select head(0) or tail(1): ");

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        int randomNumber = (int)Math.random();

        System.out.println("Random: " + randomNumber);
        System.out.println("Guess: " + userInput);

        if(randomNumber>1){
            if(userInput==1){
                System.out.println("Userinput: " + userInput + "randomNumber: " + randomNumber);
                System.out.println("They are the same, congrats your guess was correct!");
            }else{
                System.out.println("Userinput: " + userInput + "randomNumber: " + randomNumber);
                System.out.println("They are not the same, sorry your guess was incorrect!");
            }
        }else{
            if(userInput==0){
                System.out.println("Userinput: " + userInput + " randomNumber: " + randomNumber);
                System.out.println("They are the same, congrats your guess was correct!");
            }else{
                System.out.println("Userinput: " + userInput + " randomNumber: " + randomNumber);
                System.out.println("They are not the same, sorry your guess was incorrect!");
            }
        }
    }
}
