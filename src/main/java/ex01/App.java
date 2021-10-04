/* Exercise 01
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package oop.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("What is your name? ");
        name = input.nextLine();

        String outname = new String(name);
        System.out.printf("Hello, %s, nice to meet you!", outname);

    }
}
