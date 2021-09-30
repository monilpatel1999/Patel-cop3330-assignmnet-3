/* Exercise 19
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Monil_Patel
 */
package ex19;
public class App {
 #include <stdio.h>
    double get_weight(void);
    double get_height(void);
    double convert_feet_to_inches(double height_in_feet);
    double calculate_bmi(double weight_in_pounds, double height_in_feet);
    void display_bmi(double bmi);
    int main()
    {
        double weight,height,bmi;
        weight = get_weight();
        height = get_height();
        bmi = calculate_bmi(weight, height);
        display_bmi(bmi);
    }
    double get_weight(void){
        double weight;
        printf("Enter the person weight in pounds: ");
        scanf("%lf", &weight);
        return weight;
    }
    double get_height(void){
        double height;
        printf("Enter the person height in feet: ");
        scanf("%lf", &height);
        return height;
    }
    double convert_feet_to_inches(double height_in_feet){
        return height_in_feet*12;
    }
    double calculate_bmi(double weight_in_pounds, double height_in_feet){
        double height_in_inches, bmi;
        height_in_inches = convert_feet_to_inches(height_in_feet);
        bmi = ((weight_in_pounds)/((height_in_inches)*(height_in_inches)))*703;
        return bmi;
    }
    void display_bmi(double bmi){
        printf("Resultant BMI Value: %.2lf\n", bmi);
    }
}
