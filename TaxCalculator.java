/*
AP computers
Program 1

Write a program that computers a person's income tax. The user inputs are
1. The person's name
2. The Gross income
3. The number of dependents

The program calculates the income tax based on the inpute and the tax law and then displays the income tax.

The relevant tax law (mythical in nature):
   There is a flat tax rate of 20%
   There is a $10,000 standard deduction
   There is a $2000 additional deduction for each dependents
   Gross income must be entered to the nearest penny
   The income tax is expressed as a decimal number

When constructing the program, generate three constants.

Remember to create the algorithm and program description with this program
*/

import java.io.*;
import java.util.*;

public class TaxCalculator 
{


  /* The three constants */
   public static final int FLATRATE = 20;
   public static final int STANDARDDEDUCTION = 10000;
   public static final int DEPENDENTDEDUCTION = 2000;

   public static void main(String[] args) 
   {
      /* initialize the tax variable */
      double tax = 0;

      /* Define the scanner to read the inputs */
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your Name:");
      String name = scanner.nextLine();

      System.out.println("Enter your gross income to nearest penny:");
      double grossIncome = scanner.nextDouble();

      System.out.println("Enter number of Dependents:");
      int dependents = scanner.nextInt();

      /* Call the alogrithm to calculateTax */
      tax = calculateTax(grossIncome,dependents);
      System.out.println ("Hello," + name + " your Total tax: " + tax);
   }

   public static double calculateTax(double grossIncome, double dependents) 
   {
     double incomeTax = 0;
     double netIncome = 0;

     if (grossIncome > 0) 
     {
        netIncome = grossIncome - STANDARDDEDUCTION;
        if (netIncome > 0 ) 
        {
          if (dependents > 0 ) 
          {
            netIncome = netIncome - DEPENDENTDEDUCTION*dependents;
          }
          if (netIncome > 0 ) 
          {
            incomeTax = netIncome * FLATRATE/100;
          }
        }
     }
     return incomeTax;
   }
}
