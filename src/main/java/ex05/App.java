/* Exercise 05
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex05;
public class App {
    package oop.example;
import java.util.Scanner;

    public class App {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String first, sec;
            System.out.print("What is the first number? ");
            first = input.nextLine();
            System.out.print("What is the second number? ");
            sec = input.nextLine();
            int x = Integer.parseInt(first);
            int y = Integer.parseInt(sec);
            System.out.printf("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d", x, y, (x+y), x, y, (x-y), x, y,( x*y), x, y, (x/y));

        }
    }


}
