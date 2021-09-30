/* Exercise 26
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex26;
package oop.assignment2.ex26;
import java.lang.Math;

public class paymentcalculator
{
    double calculateMonthsUntilPaidOff(double b, double i, double p)
    {
        double result;
        double power = Math.pow((1 + i),30);
        result = -(1) * (Math.log(1 + ( (b * (1 - power) )/ p) ) );

        result = result / 30;
        result = result / (Math.log(1 + i));

        return result;
    }
}