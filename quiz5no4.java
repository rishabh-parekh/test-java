public class quiz5no4 {

   public static void main (String [] args) 
   {
      // Question 4 program answer
      int x = 10; 
      int y = 3; 
      boolean b = true; 
      for (int I = 0; I < 15; I +=5)
      {
        x = x + y; 
        b = ( x % y == 2); // Reminder of x/y if 2  then true else false;
        if (!b) 
        { 
           y++; 
           I += 5; 
        }
      }
      System.out.println("Value of X " + x);
   }


}
