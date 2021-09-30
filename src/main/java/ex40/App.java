/* Exercise 40
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex40;

public class App {
    package oop.assignment2.ex40;
import java.util.Date;

    public class Record
    {
        String firstName;
        String lastName;
        String position;
        Date seperationDate;

        public Record(String firstName, String lastName,
                      String position, Date seperationDate)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.position = position;
            this.seperationDate = seperationDate;
        }
    }
}
