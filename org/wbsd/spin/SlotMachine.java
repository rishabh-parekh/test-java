
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

     System.out.println("Enter amount to start with:");
     double amount = scanner.nextDouble();
     scanner.nextLine(); //throw away the \n not consumed by nextLine()

     player.setAmount(amount);

     Spinner s = new Spinner();

     while (true)
     {
        if (player.getAmount() <= 0) {
          System.out.println("Sorry, you are out of money. Goodbye," + player.getName());
          return;
        }
        System.out.println("You have $" + player.getAmount() + " money left.");
        System.out.println("Would you like to bet or quit. Enter s to spin and q to quit");
        String option = scanner.nextLine();
        if (option.equals("q")) {
            System.out.println("You cash-out amount is " + player.getAmount());
            System.out.println("Good bye! " + player.getName());
            return;
        }

        System.out.println("How much money would you like to bet");
        double bet = scanner.nextDouble();
        scanner.nextLine(); //throw away the \n not consumed by nextInt()

        if (bet > player.getAmount()) {
          System.out.println("Sorry, you are out of money. Goodbye," + player.getName());
          return;
        }
        player.setAmount(player.getAmount() - bet);

        List<Integer> numberList = s.spin() ;
        for (ListIterator<Integer> iter = numberList.listIterator(); iter.hasNext(); ) {
            Integer n = iter.next();
            System.out.print(n + "\t");
         }
         System.out.println("");

        if (s.fiveInRow()) {
          player.setAmount(player.getAmount() + 30);
          System.out.println("Five in a row!!! , your new amount is : " + player.getAmount());
        }
        else if (s.fourInRow()) {
          player.setAmount(player.getAmount() + 15);
          System.out.println("Four in a row!!! , your new amount is : " + player.getAmount());

        }
        else if (s.twothreeInRow()) {
          player.setAmount(player.getAmount() + 8);
          System.out.println("Three in a row and  two in a row , your new amount is : " + player.getAmount());
        }
        else if (s.threeInRow()) {
          player.setAmount(player.getAmount() + 6);
          System.out.println("Three in a row!!! , your new amount is : " + player.getAmount());
        }
        else {
          for (int i = 0; i < 4 ; i++ ) {
            if (s.twoInRow(i)) {
               player.setAmount(player.getAmount() + 2);
               System.out.println("Two in a row!!! , your new amount is : " + player.getAmount());
            }
          }
        }
      }
   }
}
