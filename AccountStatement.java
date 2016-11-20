import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class AccountStatement
{

   public static void main (String [] args)
   {

     double previousBalance = 0;
     double additionalCharges = 0;

     Scanner scanner = new Scanner(System.in);
     System.out.println("What is your previous balance:");
     previousBalance= scanner.nextDouble();

     System.out.println("Additional charges for this month");
     additionalCharges = scanner.nextDouble();
      //Compile
      double interest;
      if (previousBalance == 0)
        interest = 0;
      else
        interest = (2.0/100.0)*(previousBalance + additionalCharges);
      double newBalance = previousBalance+additionalCharges+interest;
      double minimumPayment = 0;
      if (newBalance < 50)
        minimumPayment = newBalance;
      else if ((newBalance >= 50) && (newBalance <= 300))
        minimumPayment = 50;
      else if (newBalance > 300)
        minimumPayment = (20.0/100.0)*newBalance;

      //Printing
      NumberFormat money = NumberFormat.getCurrencyInstance();

      System.out.println("CS CARD International Statement");
      System.out.println("===============================");
      System.out.println("Previous Balance:     "+ money.format(previousBalance));
      System.out.println("Additional Charges:   "+ money.format(additionalCharges));
      System.out.println("Interest:             "+ money.format(interest));
      System.out.println("");
      System.out.println("New Balance:          "+ money.format(newBalance));
      System.out.println("");
      System.out.println("Minimum Payment:      "+ money.format(minimumPayment));

   }
}
