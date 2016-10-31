public class quiz3no3 {

   public static void main (String [] args) 
   {
       int a = 10; 
       double b = 3.7; 
       int c = 4; 
       int x = (int) (a + b); // This is double addition, reduced to int, x = 14
     
       double y = (double) a/ c ; // This is double a divided by c and promoted to double y =  
       System.out.println( "Value of y " + y);

       double z = (double) (a/c ); // This is double a divided by c and promoted to double y =  
       System.out.println( "Value of z " + z);

       double w = x + y + z ; // This is double a divided by c and promoted to double y =  
       System.out.println( "Value of w " + w);
   }

}
