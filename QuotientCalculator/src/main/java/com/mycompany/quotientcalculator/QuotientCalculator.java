/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quotientcalculator;
import java.util.Scanner;

/*This is an if-else practice program that calculates quotient of numbers given by user
 */
public class QuotientCalculator {

    public static void main(String[] args) {
        double number1;
        double number2;
        double quotient;
        
        Scanner keyboard = new Scanner(System.in); 
        
        System.out.println("Enter a number: ");
        number1 = keyboard.nextDouble();

        System.out.println("Enter another number: ");
        number2 = keyboard.nextDouble();
        
        if(number2 == 0)
        {
            System.out.println("Division by zero is not possible "
                    + "\nRun the progrm again "
                    + "\nAnd enter a number other than zero");
        }
        else
        {
            quotient = number1 / number2;
            System.out.println(number1 + "/" + number2 + "=" + quotient);
  
        }
        
    }
}
