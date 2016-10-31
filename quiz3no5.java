
public class quiz3no5 {

   public static void main (String [] args) {
     int speed = 102;
     int fine = 0; 
     if (speed >= 75)
        fine = 300; 
     if (speed >= 65 && speed < 75 ) 
        fine = 150; 
     if (speed > 55 && speed < 65 )
        fine = 100; 
        
     System.out.println("Fine : " + fine); 
   }
}
