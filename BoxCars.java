import java.io.*;
import java.util.*;

public class BoxCars
{
  public static void main (String [] args)
  {
    int NumberofBoxCars = 0;
    PairofDice pd = new PairofDice();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many times do you want to roll");
    int NumberofRolls = scanner.nextInt();
    System.out.println("Number of Rolls : " + NumberofRolls);

    for(int i = 0; i < NumberofRolls; i++)
    {
      pd.RollingTheDice();
      int d1 = pd.SeeDieOne();
      System.out.println("Dice 1 : " + d1);
      int d2 = pd.SeeDieTwo();
      System.out.println("Dice 2: " + d2);

      if(d1==6 && d2==6)
      {
        System.out.println("130xCar");
        NumberofBoxCars++;
      }
      else
        System.out.println("Please Try Again");
    }
    System.out.println("Number of Box Cars : " + NumberofBoxCars);

  }
}
