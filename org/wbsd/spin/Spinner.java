import java.util.Random;

import java.util.*;

public class Spinner {

  public List <Integer> draw;
  public Spinner() {
    draw = new ArrayList <Integer> (5);
  }

  public List<Integer> spin() {
    draw = new ArrayList <Integer> (5);
    Random r = new Random() ;
    for (int i = 0 ; i < 5 ; i++) {
      int n = r.nextInt(10);
      draw.add(new Integer(n));
    }
    return draw;
  }

  public boolean fiveOfKind() {

      int match = Collections.frequency(this.draw,this.draw.get(0).intValue());
      if (match == 5)
        return true;
      else
        return false;
  }


  public boolean fourOfKind() {
    for (int i = 0; i < 5 ; i ++)
    {
      int num = this.draw.get(i).intValue();
      int match = Collections.frequency(this.draw,num);
      if (match == 4)
        return true;
    }
    return false;
  }

  public boolean threeOfKind() {
    for (int i = 0; i < 5 ; i ++)
    {
      int num = this.draw.get(i).intValue();
      int match = Collections.frequency(this.draw,num);
      if (match == 3)
        return true;
    }
    return false;
  }

  public boolean twothreeOfKind() {
    boolean two = false;
    boolean three = false;
    for (int i = 0; i < 5 ; i ++)
    {
      int num = this.draw.get(i).intValue();
      int match = Collections.frequency(this.draw,num);
      if (match == 2)
        two = true;
      if (match == 3)
        three = true;
    }
    if (two && three)
      return true;
    else
      return false;
  }

  public boolean twotwoOfKind() {
    boolean firstTwo = false;
    boolean secondTwo = false;
    int firstseq = -1;

    for (int i = 0; i < 5 ; i ++)
    {
      int num = this.draw.get(i).intValue();
      int match = Collections.frequency(this.draw,num);
      if (match == 2) {
          if (firstTwo) {
            if (firstseq != num)
              secondTwo = true;
          }
          else {
            firstseq = num;
            firstTwo = true;
          }
      }
    }
    if (secondTwo)
      return true;
    else
      return false;
  }

  public boolean twoOfKind() {
    for (int i = 0; i < 5 ; i ++)
    {
      int num = this.draw.get(i).intValue();
      int match = Collections.frequency(this.draw,num);
      if (match == 2)
        return true;
    }
    return false;
  }
}
