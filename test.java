/*
1-Test Class
*/
import java.io.*;
import java.util.*;

public class test {

   public static void main(String[] args) {


      int one, two, three;
      Scanner scanner = new Scanner(System.in);

      double what;

      System.out.print ("Enter two integrer: ");
      one = 10;
      two = 2;
      what = 14.3;

      three = 4 * one + 5 * two;
      System.out.println ("Value of threer: " + three);


      System.out.println("Value of one: " + (int)(++one));
      one = 10;
      System.out.println("Value of one: " + (int)(one++));
      three = one;
      System.out.println ("Value of threer: " + three);

      double answer = (double) (13/5);
      System.out.println("Answer:" + answer);
      int n = -10;
      int x = 1;
      if (n!= 0 &&  x/n > 100)
        System.out.println("Here");
      else
        System.out.println("There");

      for (int count = 1; count <= n; count ++)
        System.out.println("There: for");


      int count = 1;
      final int s = -999;
      while (count != s) {
        System.out.println("Enter the number:");
        count = scanner.nextInt();


      }

      int j , k;
      for (j =  -2; j <=2 ; j +=2)
        for (k =  j; k < j + 3 ; k++)
          System.out.println(k);
  }

}
