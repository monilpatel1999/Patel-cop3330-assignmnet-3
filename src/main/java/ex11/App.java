/* Exercise 11
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */

package ex11;
public class App {
    package oop.example;
    /*
     *  UCF COP3330 Summer 2021 Assignment 1 Solution
     *  Copyright 2021 Ayush Pindoria
     */
import java.util.Scanner;
import java.lang.Math;

    public class App {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            double x,y,z;

            System.out.print("How many euros are you exchanging? ");
            x = input.nextDouble();
            System.out.print("What is the exchange rate? ");
            y = input.nextDouble();

            z = x*y;

            System.out.printf("%.0f euros at an exchange rate of %.4f is%n",x,y);
            System.out.printf("%.2f U.S. dollars.",z);



        }//end main method
    }//end class
}
