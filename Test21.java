
import java.io.*;
import java.util.*;
import java.lang.Math; 
public class Test21 {
   public static void main(String[] args) {

     // Use a "\"
      //System.out.println("Use a \"\\\"");
      // Use number6
      // Order of Operations
      // 1. Multiplication or Division
      // 2. String Appending
      // 3. Math Addition
      // System.out.println("number"+'6'+4*5);
      // System.out.println(30 % 4);
      // double aa = (double) 2/8;
      // System.out.println(aa);
      // int a = 1/(int)4.0;
      // System.out.println(a);
      //
      // String word = new String();
      // System.out.println(word.length());
      //
      // Random r = new Random() ;
      // int num = 10 + r.nextInt(91);
      //
      // System.out.println(num);
      //
      //
      // System.out.print("Here we go!");
      // System.out.println("12345");
      // System.out.print("Test this if we are not sure.");
      // System.out.print("Another.");
      // System.out.println();
      // System.out.println("All done.");
      //
      // System.out.println("To be or not to be" +
      //                     "");
      // System.out.println("50 plus 25 is " + 50 + 25 );
      //
      // System.out.println("He thrusts hs fists\n\tagainst" +
      // " the post \nand still insists\n\the sees the \"ghost\"");



      int iResult, num1 = 25, num2 = 40, num3 = 17, num4 = 5;
      double fResult, val1 = 17.0, val2 = 12.78;

      iResult = num1 / num4;
      System.out.println(iResult);

      fResult = num1 / num4;
      System.out.println(fResult);


      iResult = num3 / num4;
      System.out.println(iResult);



      fResult = num3 / num4;
      System.out.println(fResult);

      fResult = val1 / num4;
      System.out.println(fResult);

      fResult = val1 / val2;
      System.out.println(fResult);

      iResult = num1 / num2;
      System.out.println(iResult);

      fResult = (double)num1 / num2;
      System.out.println(fResult);



      fResult = (double)(num1 / num2);
      System.out.println(fResult);

      iResult = (int) (val1 / num4);
      System.out.println(iResult);

      fResult = (int) (val1 / num4);
      System.out.println(fResult);


      fResult = (int) ((double) num1 / num2);
      System.out.println(fResult);



      iResult = num3 % num4;
      System.out.println(iResult);


      iResult = num2 % num3;
      System.out.println(iResult);


      iResult = num3 % num2;
      System.out.println(iResult);



      iResult = num2 % num4;
      System.out.println(iResult);

      String m1, m2, m3;
      m1 = "Quest for the Holy Grail";
      m2 = m1.toLowerCase();
      m3 = m1 + " " + m2;
      System.out.println(m3.replace('h','z'));

      double n1, n2, n3;
      n1 = 10;
      n2 = 6;

      n3 = Math.sqrt(n1 + n2);
      System.out.println("Value of n3" + n3);
   }

}
