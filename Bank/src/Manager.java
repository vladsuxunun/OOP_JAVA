
import java.util.Vector;

 public class Manager extends Employee implements Cloneable{
  private Vector<Employee> employees = new Vector<Employee>();
  private double bonus;
  public Manager(String name, double salary,  int year, String in, double bonus) {
   super(name, salary, year, in);
   this.bonus = bonus;
  }
  public boolean equals(Object o) {
   if(!super.equals(o)) return false;
   Manager p = (Manager)o;
   return employees.equals(p.employees);
  }
  public int hashCode() {
   return super.hashCode()
     +31*employees.hashCode();

  }
  public void AddEmployee(Employee e) {
   employees.add(e);
   super.setSalary(bonus);
  }
  public String toString() {
   String names = "";
   for(int i=0;i<employees.size();i++) {
    names = names + getName() + ", ";
   }
   names.trim();
   return super.toString() + "\n Team: " +  names;
     
  }
  
  @Override
  public int compareTo(Object o) {
   Manager e = (Manager) o;
   if(super.compareTo(e) == 0)
   {
    if(this.bonus < e.bonus) return -1;
    if(this.bonus > e.bonus) return 1;
    else return 0;
   }
   
  return super.compareTo(o);
  }
  public Object clone() throws CloneNotSupportedException {
   return super.clone();
  }
 }