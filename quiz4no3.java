
public class quiz4no3 {

   public static void main (String [] args) 
   {
       int x = 10;
       int y = 2; 
       int z = 2;
       //while (( x > y) || y >= z) 
       // while (( x <= y) || (y > z))
       while ((x > y) && (y >= z))
       { 
         System.out.println("*");
         break;
       }

       System.out.println("x <= y:" + (x<=y));
       System.out.println("y < z:" + (y < z));
       boolean b =((x <= y) && (y < z)) ;
       System.out.println("B: " + b);
       System.out.println("F&&F:" + (false && false)); 
       System.out.println("T&&T:" + (true && true)); 

       
   }

}
