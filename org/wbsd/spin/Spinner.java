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

  public boolean fiveInRow() {

      int match = Collections.frequency(this.draw,this.draw.get(0).intValue());
      if (match == 5)
        return true;
      else
        return false;
  }


  public boolean fourInRow() {
    if (((this.draw.get(0).intValue() == this.draw.get(1).intValue()) &&
         (this.draw.get(1).intValue() == this.draw.get(2).intValue()) &&
          (this.draw.get(2).intValue() == this.draw.get(3).intValue())
        ) ||
        ((this.draw.get(1).intValue() == this.draw.get(2).intValue()) &&
             (this.draw.get(2).intValue() == this.draw.get(3).intValue()) &&
              (this.draw.get(3).intValue() == this.draw.get(4).intValue())
        ))
      return true;
     else
       return false;

  }

  public boolean threeInRow() {

    if (((this.draw.get(0).intValue() == this.draw.get(1).intValue()) &&
         (this.draw.get(1).intValue() == this.draw.get(2).intValue()))
        ||
       ((this.draw.get(1).intValue() == this.draw.get(2).intValue()) &&
        (this.draw.get(2).intValue() == this.draw.get(3).intValue()))
        ||
       ((this.draw.get(2).intValue() == this.draw.get(3).intValue()) &&
          (this.draw.get(3).intValue() == this.draw.get(4).intValue()))
       )
       return true;
      else
        return false;

  }

  public boolean twothreeInRow() {

    if ((this.draw.get(0).intValue() == this.draw.get(1).intValue()) &&
         (this.draw.get(1).intValue() == this.draw.get(2).intValue())
        )
    {
      if (twoInRow(3))
      {
          return true;
      }
    }

    if ((this.draw.get(2).intValue() == this.draw.get(3).intValue()) &&
             (this.draw.get(3).intValue() == this.draw.get(4).intValue())
        )
    {
      if (twoInRow(0))
      {
          return true;
      }
    }
    return false;
  }

  public boolean twoInRow(int index) {
    if (this.draw.get(index).intValue() == this.draw.get(index+1).intValue())
      return true;
     else
      return false;
  }
}
