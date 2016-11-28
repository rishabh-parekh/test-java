
/* The intent of this class is to cover all the topics in the Module 4.
Here are the main topics:
  Null References

  Exceptions
  Interfaces
  AP Java Interfaces
    Comparable
    List
    Iterator
    ListIterator
*/


import java.io.*;
import java.util.*;



public class Module4NPE {
  // Null References
  String ns;

   public static void main (String [] args) {
     Module4NPE m4 = new Module4NPE();

     // Note ns has not been initialized, which means it is a null string. When you check the length of a null string
     // or call any method on the null string, you will get a Compilation Error.
     // Note this only happens with the Instance Variables, because the Compiler cannot catch them earlier on during code compilation.
     // IF the same code was in the local to the method, then the compiler would have caught it.

     //m4.printName(); // Uncomment the line to see Null Pointer Exception thrown.

     try {
       m4.printName(); // Uncomment the line to see Null Pointer Exception thrown.
     }
     catch (NullPointerException e){
       System.out.println("Caught an exception, the details of the exception are: " + e.toString());
       // Also print where is this exception coming from
       e.printStackTrace();
       // And if you want to let the program bubble the exception, like passing the hot potato, you can throw the exception
       throw(e);
     }
     // It is always a good practice to make sure you are initializing your instances (objects)
     // Second good practice is always have try..catch blocks of code you are not sure of, so you can handle exceptions gracefully.

   }

   // This method will throw a Null Pointer Exception during runtime, if the String ns which is part of the Instance
   // is not initialized

   public void printName ()  {
     System.out.println("This will result in NullPointerException" + ns.length());
   }

  /* Uncomment the next 4 lines to see compile time error. */
  //  public void printLocalName ()  {
  //    String nls;
  //    System.out.println("This will result in NullPointerException" + nls.length());
  //  }





}
