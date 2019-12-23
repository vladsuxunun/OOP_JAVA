
public class Employee extends Person implements Comparable<Object>, Cloneable{
  private double salary;
  private int year;
  private String insuranceNumber;
  public Employee(String name, double salary, int year, String in) {
   super(name);
   this.salary = salary;
   this.year = year;
   this.insuranceNumber = in;
  }
  public double getSalary() {
   return salary;
  }
  public void setSalary(double bonus) {
   salary += bonus;
  }
  public boolean equals(Object o){
   if(!super.equals(o)) return false;
   Employee p = (Employee)o;
   return insuranceNumber.equals(p.insuranceNumber);
  }
  public int hashCode() {
   return super.hashCode()
     +31*insuranceNumber.hashCode();
     
  }
  public String toString() {
   return super.toString() + ", salary: " + salary + ", year: " + year
     + ", insuranceNumber: " + insuranceNumber;
  }
  
  @Override
  public int compareTo(Object o) {
   Employee e = (Employee) o;
   if(this.salary == e.salary) return 0;
   if(this.salary > e.salary) return 1;
   else return -1;
   
   
  
  }
  
  public int getYear()
  {
   return year;
  }
  
  public Object clone() throws CloneNotSupportedException 
  {
  return super.clone();
  }
 }