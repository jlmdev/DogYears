/*
1.2.2 Basic Input
Josh Mann
06-23-22
 */

import java.util.Scanner;

public class DogYears {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int dogYears;
        int humanYears;

        System.out.println("Enter number of dog years: ");
        dogYears = scnr.nextInt();
        humanYears = 7 * dogYears;

        System.out.print(dogYears);
        System.out.print(" dog years is about ");
        System.out.print(humanYears);
        System.out.println(" human years.");
    }
}
