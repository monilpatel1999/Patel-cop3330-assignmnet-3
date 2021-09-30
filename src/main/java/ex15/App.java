 /* Exercise 15
  *  UCF COP3330 Fall 2021 Assignment 1 Solution
  *  Copyright 2021 Monil_Patel
  */
package ex15;
public class App {
 #include <stdio.h>
    int main() {
        int pass, x=10;

        while (x!=0)
        {
            printf("\nInput the password: ");
            scanf("%d",&pass);

            if (pass==1234)
            {
                printf("I don't know you!!");
                x=0;
            }
            else
            {
                printf("Wrong password, try another");
            }
            printf("\n");
        }
        return 0;
    }

}
