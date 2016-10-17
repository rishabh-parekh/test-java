
import java.io.*;
import java.util.*;

public class EmployeePay {

   public static void main(String[] args) {
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

      System.out.println("Employee Name \t|Regular Pay\t|OverTime Pay\t|Total Gross Pay | ");

      for (ListIterator<Employee> iter = employeeList.listIterator(); iter.hasNext(); ) {
          Employee employee = iter.next();
          System.out.print(employee.getName() + "\t|");
          System.out.print(employee.calculateRegularPay()  + "\t|");
          System.out.print(employee.calculateOverTimePay() + "\t|");
          System.out.println(employee.calculateGrossPay() + "\t|");
       }
   }
}
