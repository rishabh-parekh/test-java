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
    int match = 1;
    for (int i = 0;i < this.draw.size() - 1; i++ ) {
      int current = this.draw.get(i).intValue();
      int next = this.draw.get(i+1).intValue();
      if (current == next) {
        match++;
      }
    }
    if (match == 5)
      return true;
    else
      return false;
  }


  public boolean fourInRow() {
    int match = 1;
    for (int i = 0;i < this.draw.size() - 1; i++ ) {
      int current = this.draw.get(i).intValue();
      int next = this.draw.get(i+1).intValue();
      if (current == next) {
        match++;
      }
    }
    if (match == 4)
      return true;
    else
      return false;
  }

  public boolean threeInRow() {
    int match = 1;
    for (int i = 0;i < this.draw.size() - 1; i++ ) {
      int current = this.draw.get(i).intValue();
      int next = this.draw.get(i+1).intValue();
      if (current == next) {
        match++;
      }
    }
    if (match == 3)
      return true;
    else
      return false;
  }

  public boolean twoInRow() {
    int match = 1;
    for (int i = 0;i < this.draw.size() - 1; i++ ) {
      int current = this.draw.get(i).intValue();
      int next = this.draw.get(i+1).intValue();
      if (current == next) {
        match++;
      }
    }
    if (match == 2)
      return true;
    else
      return false;
  }

}
