/* Exercise 02
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
        package ex02;
public class App {
    import java.util.Scanner;

    public class App {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String name;
            System.out.print("What is the input string? ");
            name = input.nextLine();

            int length = name.length();
            System.out.printf("%s has %d characters.", name, length);

        }
    }
