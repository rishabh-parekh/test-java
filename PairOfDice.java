import java.io.*;
import java.util.*;

public class PairOfDice
{
    private int d1;
    private int d2;

    public PairOfDice()
    {
		 //This constructor creates both pairs of dice
         d1 = 0;
         d2 = 0;

    }
    
    public void rollingTheDice()
    {

		 // The rolling the dice method says that you have to get 2 random values from both the dice that...
         Random r = new Random();
         this.d1 = r.nextInt(6) + 1; // Returns a random number from 1 through 6
         this.d2 = r.nextInt(6) + 1; // Returns a random number from 1 through 6

    }
    public int totalOfDice()
    {
        return this.d1 + this.d2;
    }
    
    public int seeDiceOne()
    {
         return this.d1;
    }
    
    public int seeDiceTwo()
    {
         return this.d2;
    }
 }
