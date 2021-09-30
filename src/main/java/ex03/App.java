/* Exercise 03
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
        package oop.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String noun, verb, adj, adv;
        System.out.print("Enter a noun: ");
        noun = input.nextLine();
        System.out.print("Enter a verb: ");
        verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        adj = input.nextLine();
        System.out.print("Enter an adverb: ");
        adv = input.nextLine();

        String output = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
        System.out.println(output);

    }//end main method
}//end classB
package ex03;
public class App {
    mport java.util.Scanner;

    public class App {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String quote;
            System.out.print("What is the quote? ");
            quote = input.nextLine();
            String person;
            System.out.print("Who said it? ");
            person = input.nextLine();

            System.out.printf("%s says, \"%s\"", person, quote);

        }//end main method
    }//end classB
}
