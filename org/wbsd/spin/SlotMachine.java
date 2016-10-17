
import java.io.*;
import java.util.*;

public class SlotMachine {

   public static void main(String[] args) {

     /* Define the scanner to read the inputs */
     Scanner scanner = new Scanner(System.in);
     System.out.println("Welcome to the Slot Machine.") ;
     System.out.println("Enter Your Name :");
     String name = scanner.nextLine();

     Player player = new Player();
     player.setName(name);

     System.out.println("Enter amount to bet ");
     double amount = scanner.nextDouble();
     player.setAmount(amount);

     Spinner s = new Spinner();

     while (true)
     {
        System.out.println("Would you like to bet or quit. Enter s to spin and q to quit");
        String option = scanner.nextLine();
        if (option.equals("q")) {
            System.out.println("You cash-out amount is " + player.getAmount());
            System.out.println("Good bye! " + player.getName());
            return;
        }
        List<Integer> numberList = s.spin() ;
        for (ListIterator<Integer> iter = numberList.listIterator(); iter.hasNext(); ) {
            Integer n = iter.next();
            System.out.print(n + "\t");
         }
         System.out.println("");

        if (s.fiveInRow()) {
          player.setAmount(player.getAmount() + 20);
          System.out.println("Five in a row!!! , your new amount is : " + player.getAmount());
        }
        else if (s.fourInRow()) {
          player.setAmount(player.getAmount() + 15);
          System.out.println("Four in a row!!! , your new amount is : " + player.getAmount());

        }
        else if (s.threeInRow()) {
          player.setAmount(player.getAmount() + 10);
          System.out.println("Three in a row!!! , your new amount is : " + player.getAmount());
          if (s.twoInRow()) {
            player.setAmount(player.getAmount() + 5);
            System.out.println("And Two in a row!!! , your new amount is : " + player.getAmount());
          }
        }
        else if (s.twoInRow()) {
          player.setAmount(player.getAmount() + 5);
          System.out.println("Two in a row!!! , your new amount is : " + player.getAmount());
        }
      }
   }
}
