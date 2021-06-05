/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 11 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex11;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ex11 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        int userEuros = userInputScanner.nextInt();
        System.out.print("What is the exchange rate? ");
        double exchangeRate = userInputScanner.nextDouble();

        double userDollars = userEuros * exchangeRate;
        DecimalFormat roundPennies = new DecimalFormat("####.##");
        String userDollarsFinal = roundPennies.format(userDollars);

        System.out.println(userEuros + " euros at an exchange rate of " + exchangeRate + " is\n" + userDollarsFinal + " U.S. dollars.");

    }
}
