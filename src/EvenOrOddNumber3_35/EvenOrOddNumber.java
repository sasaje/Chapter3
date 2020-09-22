package EvenOrOddNumber3_35;
import java.util.Scanner;

//Write a program that prompts an int from the user and displays whether it is odd or even.

public class EvenOrOddNumber {

    public static void main(String[] args) {
        System.out.println("Please, enter an int: ");

        //Prompt the user to set a int
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        System.out.println("User input: " + userInput);

        if (userInput % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
