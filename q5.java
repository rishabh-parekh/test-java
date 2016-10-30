/*
Quiz-5
*/

public class q5 {
   public static void main(String[] args) {
      //q1 : Answer B
      // for (int i = 1; i < 100; i = i * 2) {
      //   if (i / 50 == 0) {
      //     System.out.println("The Value of I :" + i);
      //   }
      // }

      //q2: Answer A
      //  for (int x = 1 ; x < 5 ; x++) { // Outer Loop is number of rows
      //   for (int z = 0; z <= x; z ++) { // Inner loop is number of columns
      //     System.out.print(x*z + " ");
      //   }
      //   System.out.println("");
      // }

      //q3: Answer C
      // boolean a, b, c;
      // a = true;
      // b = true;
      // c = (a && b) || !(a || b);
      //
      //
      // System.out.println("Value of a: "  + a);
      // System.out.println("Value of b: "  + b);
      //
      // System.out.println("Value of (a && b): "  + (a && b));
      // System.out.println("Value of (a || b): " + (a || b));
      // System.out.println("Value of !(a || b): " + !(a || b));
      //
      // System.out.println("Value of c : " + c);


      //q4 Answer C
      // int x = 10 ;
      // int y = 3 ;
      //
      // boolean b = true;
      //
      // for (int i = 0; i < 15; i +=5) {
      //      x = x + y;
      //      System.out.println("Value of X = " + x);
      //      b = (x % y == 2);
      //      System.out.println("Value of b = " + b);
      //
      //      if (!b) {
      //          y++;
      //          i +=5;
      //          System.out.println("Value of y and i = " + y + "  :: " + i);
      //      }
      // }

      // q5: Answer B
      int i = 1;
      int k = 1;

      while (k < 5) {
           k *= i;
           k++;
           System.out.println("Value of i and k :" + i + " " + k);
      }

      System.out.println(k);


   }
}
