/* Exercise 10
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex10;

public class App {
    ackage oop.example;

import java.util.Scanner;
import java.lang.Math;

    public class App {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            double x,y,z;

            int a,b,c;

            System.out.print("Enter the price of item 1: ");
            x = input.nextDouble();
            System.out.print("Enter the quantity of item 1: ");
            a = input.nextInt();

            System.out.print("Enter the price of item 2: ");
            y = input.nextDouble();
            System.out.print("Enter the quantity of item 2: ");
            b = input.nextInt();

            System.out.print("Enter the price of item 3: ");
            z = input.nextDouble();
            System.out.print("Enter the quantity of item 3: ");
            c = input.nextInt();

            double tot = (x*a) + (y*b) + (z*c);
            double tax = tot * 0.055;
            double sum = tot + tax;

            String tots, taxs, sums;
            tots = String.format("Subtotal: $%.2f",tot);
            taxs = String.format("Tax: $%.2f",tax);
            sums = String.format("Total: $%.2f",sum);

            System.out.println(tots);
            System.out.println(taxs);
            System.out.println(sums);


        }
    }
}
