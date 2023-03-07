package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
     /*   //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is yor pay rate?");
        payRate = scanner.nextDouble();
        //close scanner
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours + payRate;

        //4. Display result
        System.out.println("Gross pay: " + grossPay); */

        //initializing the  variables
        String seasonYear = "";
        int number = 0;
        String adjective = "";
        //create the scanner
        Scanner scanner = new Scanner(System.in);
        // input the data
        System.out.println("Welcome to the fill in the blank program and create a story");
        System.out.println("What is your favorite season of the year?");
        seasonYear = scanner.next();
        System.out.println("What is your favorite number?");
        number = scanner.nextInt();
        System.out.println("Enter an adjective");
        adjective = scanner.next();
        // close the scanner
        scanner.close();

        //Print the history
        System.out.println("On a(n) " + adjective + " " + seasonYear + " day. I drink a minimum of " + number + " cups of coffee.");



    }
}
