/* Exercise 09
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex09;

public class App {
package oop.example;
import java.util.Scanner;
import java.lang.Math;

    public class App {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            int x,y;
            final int c = 350;
            double z;
            System.out.print("Enter length: ");
            x = input.nextInt();
            System.out.print("Enter width: ");
            y = input.nextInt();

            double gal = (double)(x*y)/c;

            z = Math.ceil(gal);
            System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.",z,(x*y));




        }
    }





}
