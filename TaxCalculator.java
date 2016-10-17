/*
Tax Calculator
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
