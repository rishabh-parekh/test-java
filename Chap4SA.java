import java.io.*;
import java.util.*;

public class Chap4SA
{
    int x = 200;
    double sum = 0;
    public Chap4SA ()
    {
     this.sum = 0.0;
    }

    public Chap4SA (double d)
    {
     this.sum = d;
    }

    public static void main (String [] args)
    {
         Chap4SA c4 = new Chap4SA();
         int x = 10;
         double d = c4.translate(x);
         System.out.println("The return value of translate: " + d);
         System.out.println("Print the value of x: " + x);
         System.out.println("Print the value of x: " + c4.x);
         int i  = c4.find("Hello",10.2);
         System.out.println("Print the value of i: " + i);


         System.out.println("Print the value od sum: " + c4.sum);
         c4.printAnswer(10.5,11.2,12.7);
         System.out.println("Print the value of sum: " + c4.sum);

         Chap4SA c41 = new Chap4SA(10.0);
         System.out.println("Print the value od sum: " + c41.sum);
         c41.printAnswer(10.5,11.2,12.7);
         System.out.println("Print the value of sum: " + c41.sum);
         String s = c4.welcomeMessage("Joe",7);
         System.out.println(s);

         c4.powersOfTwo();
         c4.alarm(10);
         int s100= c4.sum100();
         System.out.println(s100);

         int max = c4.maxofTwo(20,20);
         System.out.println(max);
        
         boolean b = c4.larger( 10.2, 10.3);
         System.out.println("Print the value of b: " + b);

         b = c4.evenlyDivisible(10,2);
         System.out.println("Print the value of b: " + b);
         b = c4.evenlyDivisible(12,10);
         System.out.println("Print the value of b: " + b);
         String s = c4.multiConcat("hi",1);
         System.out.println("Print the value of s: " + s);
         s = c4.multiConcat("hi");
         System.out.println("Print the value of s: " + s);

         b = c4.isIsoceles(1,1,1);
         System.out.println("Print the value of b: " + b);
         b = c4.isIsoceles(1,2,2);
         System.out.println("Print the value of b: " + b);
         b = c4.isIsoceles(1,2,3);
         System.out.println("Print the value of b: " + b);

        
    }

    public double translate(int x)
    {
        double d = 10;
        return d;
    }
    public int find(String s, double d)
    {
         int i = 100;
         return i;
    }

    public void printAnswer(double d1, double d2, double d3)
    {
        this.sum = this.sum + d1 + d2 + d3;
    }

    public String welcomeMessage (String name, int visitorNum)
    {
        return "Welcome " +  name + "! You are visitor number " + visitorNum;
    }

    public void powersOfTwo()
    {
        int base = 2;
        for(int power = 1; power <= 10; power++)
            System.out.println(Math.pow(base,power));
    }

    public void alarm (int number)
    {
        if (number < 1)
            System.out.println ("Error: number is less then 1.");
        else
        {
            for (int count = 1; count <= number; count ++)
                System.out.println("Alarm");
        }

    }

    public int sum100()
    {
        int sum = 0;
        for(int i=0; i<=100; i++)
            sum = sum+i;
        return sum;
    }

    public int maxofTwo (int n1, int n2)
    {
        if(n1>n2)
            return n1;
        else
            return n2;
    }
    
    
   public boolean larger(double x, double y)
   {
        if (x > y)
            return true;
        else
            return false;
   }

   public boolean evenlyDivisible (int x, int y)
   {
       if (x != 0 && y != 0)
       {
            if (x%y == 0 || y%x == 0)
                return true;
        }
        return false;

   }


   public String multiConcat (String s, int x)
   {
       String rs = s;
       for (int i = 1; i < x ; i ++)
            rs = rs + s;
        return rs;
   }

   public String multiConcat (String s)
   {
        return s+s;
   }


   public boolean isIsoceles (int a, int b, int c)
   {
        boolean rb = true;
        if (a == b && b == c)
            rb = false;
        else if (a != b && b != c)
            rb = false;
        return rb;
   }
    
    
}
