/* Exercise 7
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex07;
public class App {
    package oop.example;
import java.util.Scanner;


    public class App {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String first, sec;
            System.out.print("What is the length of the room in feet? ");
            first = input.nextLine();
            System.out.print("What is the width of the room in feet? ");
            sec = input.nextLine();
            int x = Integer.parseInt(first);
            int y = Integer.parseInt(sec);
            System.out.printf("You entered dimensions of %d feet by %d feet.%n", x,y);
            int ar = x*y;
            System.out.printf("The area is %n%d square feet%n", ar);
            final double c = 0.09290304;
            double area = ar * c;
            System.out.printf("%.3f square meters", area);




        }
    }

}
