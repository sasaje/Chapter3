package HealthApplicationBMI3_6;
import java.util.Scanner;

public class HealthApp_weight_feet_inches {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter weight in pounds
            System.out.print("Enter weight in pounds: ");
            double weight = input.nextDouble();

            // Prompt the user to enter height in feet
            System.out.print("Enter height in feet: ");
            int heightFeet = input.nextInt();

            // Prompt the user to enter height in inches
            System.out.print("Enter height in inches: ");
            int heightInches = input.nextInt();

            final double INCHES_TO_METER_CONVERT = 0.3937*100;
            final double FEET_TO_METER_CONVERT = 0.032809*100;
            final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
            final double METERS_PER_INCH = 0.0254; // Constant

            double feetToMeters = heightFeet/FEET_TO_METER_CONVERT;
            double inchesToMeters = heightInches/INCHES_TO_METER_CONVERT;


            // Compute BMI
            double weightInKilograms = weight * KILOGRAMS_PER_POUND;
            double heightInMeters = feetToMeters+inchesToMeters;

            System.out.println("Feet: " + heightFeet);
            System.out.println("Inches: " + heightInches);
            System.out.println("Height total: " + heightInMeters);
            System.out.println("");

            double bmi = weightInKilograms /
                    (heightInMeters * heightInMeters);

            // Display result
            System.out.println("BMI is " + bmi);
            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25)
                System.out.println("Normal");
            else if (bmi < 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        }
}

