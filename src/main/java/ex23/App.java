/*Exercise 23
        *  UCF COP3330 Fall 2021 Assignment 1 Solution
        *  Copyright 2021 Monil_Patel
        */
package ex23;

public class App {
         # Input 1

    A = input("Is the car silent when you turn the key? ")

if A == 'y':

            # Input 2

    B = input("Are the battery terminals corroded? ")

if B == 'y':

    print("Clean terminals and try starting again.")

else:

    print("The battery cables maybe damaged.")

    print("Replace cables and try again.")

else:

        # Input 3

    C = input("Does the car make a clicking noise? ")

if C == 'y':

    print("Replace the battery.")

else:

        # Input 4

    D = input("Does the car crank up but fail to start? ")

if D == 'y':

    print("Check spark plug connections.")

else:

        # Input 5

    E = input("Does the engine start and then die? ")

if E == 'y':

            # Input 6

    F = input("Does your car have fuel injection? ")

if F == 'y':

    print("Get it in for service.")

else:

    print("Check to ensure the choke is opening and closing.")


}
