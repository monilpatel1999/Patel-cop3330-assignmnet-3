/* Exercise 18
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex18;
public class App {

 import java.util.Scanner;

    public class TempCov {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press C to convert from Farenheit to Celsius.");
            System.out.println("Press F to convert from Celsius to Farenheit.");
            System.out.print("Your choice: ");
            char ch = sc.next().charAt(0);
            int temp=0,res=0;

            if(ch == 'C') {
                System.out.print("Please enter the temperature in Farenheit: ");
                temp = sc.nextInt();
                res = (temp - 32) * 5 / 9;
                System.out.print("The temperature in Celsius is "+ res+".");
            }
            else if(ch == 'F') {
                System.out.print("Please enter the temperature in Celsius: ");
                temp = sc.nextInt();
                res = (temp * 9 / 5) + 32;
                System.out.print("The temperature in Farenheit is "+ res+".");
            }
            else {
                System.out.println("Wrong Input!!!");

            }


        }

    }
}
