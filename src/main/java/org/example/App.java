package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();

        int maxValue;
        if(num1 == num2 || num1 == num3 || num3 == num2) {
            System.out.println("Please try again and enter different values.");
            System.exit(1);
        }
        if(num1 > num2 && num1 > num3) {
            maxValue = num1;
        } else if(num2 > num1 && num2 > num3) {
            maxValue = num2;
        } else {
            maxValue = num3;
        }

        System.out.printf("The largest number is %d.", maxValue);
    }
}
