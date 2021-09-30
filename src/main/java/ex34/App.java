/* Exercise 34
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package oop.assignment2.ex34;
import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution34
{
    public static String ask()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an employee name to remove: ");
        String name = input.nextLine();
        return name;
    }

    public static void main(String[] args)
    {

        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees)
        {
            System.out.println(emp);
        }

        Scanner input = new Scanner(System.in);

        System.out.println();
        String nameToRemove = ask();

        employees.remove(nameToRemove);

        System.out.println();
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees)
        {
            System.out.println(emp);
        }

    }

}