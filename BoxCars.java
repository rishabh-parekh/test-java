import java.io.*;
import java.util.*;

public class BoxCars
{
  public static void main (String [] args)
  {
    int numberofBoxCars = 0;
    PairOfDice pd = new PairOfDice();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many times do you want to roll");
    int numberOfRolls = scanner.nextInt();
    System.out.println("Number of Rolls : " + numberOfRolls);

    for(int i = 0; i < numberOfRolls; i++)
    {
      pd.rollingTheDice();
      int d1 = pd.seeDiceOne();
      int d2 = pd.seeDiceTwo();

      if(d1==6 && d2==6)
      {
        System.out.println("Dice 1 : " + d1 + " Dice 2: " + d2);
        numberofBoxCars++;
      }
    }
    System.out.println("Number of Box Cars : " + numberofBoxCars);
  }
}
