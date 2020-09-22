package FindFutureDates3_5;
import java.util.Scanner;

//Write a program that promts the user to enter an integer for today's day of the week (Sunday is 0, monday 1 an so on.
// Also promt the user to enter the number of days after today, for a future day and display the future day of the week.

public class PrintFutureWeekday3_5 {
    public static void main(String[] args) {

        System.out.println("0 = Sunday");
        System.out.println("1 = Monday");
        System.out.println("2 = Tuesday");
        System.out.println("3 = Wednesday");
        System.out.println("4 = Thursday");
        System.out.println("5 = Friday");
        System.out.println("6 = Satuday");
        System.out.println("");
        System.out.println("Please, enter an int for today's weekday: ");

        //Prompt the user to set a future date
        Scanner input = new Scanner(System.in);
        int todaysDate = input.nextInt();

        System.out.println("Please, enter a number of days after today, for a future day: ");
        int futureDate = input.nextInt();


        switch((todaysDate + futureDate) % 7){
        case 0:
            System.out.println("It will be a Sunday");
        break;
        case 1:
            System.out.println("It will be a Monday");
            break;
        case 2:
            System.out.println("It will be a Tuesday");
            break;
        case 3:
            System.out.println("It will be a Wednesday");
            break;
        case 4:
            System.out.println("It will be a Thursday");
            break;
        case 5:
            System.out.println("It will be a Friday");
            break;
        case 6:
            System.out.println("It will be a Saturday");
        }
    }
}
