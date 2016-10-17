public class Employee {
  private String name;
  private double hourlyRate;
  private double overTimeHours;
  private double regularHours;

  private double overTimePay;
  private double regularPay;
  private double grossPay;


  /* The constant OVERTIMERATE */
   public static final double OVERTIMERATE = 1.5;

  public String getName() {
   return this.name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getOverTimeHours() {
    return this.overTimeHours;
  }

  public void setOverTimeHours(double overTimeHours) {
    this.overTimeHours = overTimeHours;
  }

  public double getRegularHours() {
    return this.regularHours;
  }

  public void setRegularHours(double regularHours) {
    this.regularHours = regularHours;
  }


  public double calculateRegularPay() {
    regularPay = regularHours * hourlyRate ;
    return regularPay;
  }

  public double calculateOverTimePay() {
    overTimePay = overTimeHours * OVERTIMERATE * hourlyRate;
    return overTimePay;
  }

  public double calculateGrossPay() {
    grossPay = regularPay + overTimePay;
    return grossPay;

  }

}
