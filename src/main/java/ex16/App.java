
/* Exercise 16
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Monil_Patel
 */package ex16;
public class App {
 import java.util.*;
    public class Main
    {
        public static void main(String[] args) {

            int age;
            Scanner sc= new Scanner(System.in);
            System.out.print("What is your age? ");
            age=sc.nextInt();
            if(age>=16)
                System.out.println("You are old enough to legally drive");
            else
                System.out.println("You are not old enough to legally drive");


        }
    }
}
