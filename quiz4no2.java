
public class quiz4no2 {

   public static void main (String [] args) 
   {
       int a = 10;
       double b = 10.7;
       //int d = (int) a + b; // Lossy conversion of b, error
       //int d = (int) (a + b); // Works
       int d = a + (int)b; // Works, b is converted to int precision

       System.out.println("Value of d: " + d);
   }

}
