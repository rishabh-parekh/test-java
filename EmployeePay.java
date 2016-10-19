
import java.io.*;
import java.util.*;

public class EmployeePay
{

   public static void main(String[] args)
   {
      /* initialize the variables */
      double grossPay, regularPay, overTimePay = 0;

      List<Employee> employeeList = new ArrayList <Employee> () ;

      for (int i = 0; i < 4 ; i++)
      {
        /* Define the scanner to read the inputs */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        Employee employee = new Employee();
        employee.setName(name);

        System.out.println("Enter your hourly rate:");
        double hourlyRate = scanner.nextDouble();

        employee.setHourlyRate(hourlyRate);

        System.out.println("Enter your total regular hours");
        double regularHours = scanner.nextDouble();

        employee.setRegularHours(regularHours);


        System.out.println("Enter your total overtime hours:");
        double overTimeHours = scanner.nextDouble();

        employee.setOverTimeHours(overTimeHours);

        employeeList.add(employee);

      }
      for (int i = 0; i < 84; i++ ) System.out.print("-");
      System.out.println("");
      System.out.println(padTwenty("Employee Name") + "|" + padTwenty("Regular Pay") + "|" + padTwenty("OverTime Pay") + "|" + padTwenty("Total Gross Pay") + "|");
      for (int i = 0; i < 84; i++ ) System.out.print("-");
      System.out.println("");
      for (ListIterator<Employee> iter = employeeList.listIterator(); iter.hasNext(); )
      {
          Employee employee = iter.next();
          System.out.print(padTwenty(employee.getName()) + "|");
          System.out.print(padTwenty(Double.toString(employee.calculateRegularPay()))  + "|");
          System.out.print(padTwenty(Double.toString(employee.calculateOverTimePay())) + "|");
          System.out.println(padTwenty(Double.toString(employee.calculateGrossPay())) + "|");
       }
       for (int i = 0; i < 84; i++ ) System.out.print("-");
       System.out.println("");
   }

   public static String padTwenty(String s)
   {
     int count = s.length();
     if (count < 20)
     {

        for (int i = 0; i < (20 - count); i++)
        {
          s = s.concat(" ");
        }
      }
      return s;
   }
}
