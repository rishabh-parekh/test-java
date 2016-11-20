import java.util.Random;

public class PairofDice
{
  int dice1;
  int dice2;

  public PairofDice()
  {
  }

  public void RollingTheDice()
  {
    Random r = new Random();
    dice1 = r.nextInt(6)+1;
    dice2 = r.nextInt(6)+1;
  }

  public int TotalofDice()
  {
    return dice1 + dice2;
  }

  public int SeeDieOne()
  {
    return dice1;
  }

  public int SeeDieTwo()
  {
    return dice2;
  }
}
