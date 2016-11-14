
public class quiz4no3 {

   public static void main (String [] args)
   {
       int x = 10;
       int y = 2;
       int z = 2;
       // Original is same as Option A
       //while (( x > y) || y >= z) // If I use option A, I get a *
       //while (( x <= y) || y > z) // If I use option B, I don't get a *
       //while ((x > y) && (y >= z)) // If I use option C, I get a *
       while ((x < y) && (y <= z)) // If I use option D, I don't get a *
       //while (( x <= y) || (y > z)) // If I use option E I don't get a *
       {
         System.out.println("*");
         break;
       }


   }

}
