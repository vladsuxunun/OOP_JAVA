import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class Prob3 {


public static void main(String[] args) throws CloneNotSupportedException {
   Employee emp = new Employee("nn", 30, 1, "uu");  
   Employee emp1 = new Employee("nn", 50, 2, "uu");
   Employee emp2 = new Employee("dd", 60, 3, "gg");
   Employee emp3 = new Employee("ff", 70, 4, "bb");

   // TODO Auto-generated method stub
   HashSet<Employee> emps = new HashSet<Employee>();
   emps.add(emp);
   emps.add(emp1);
   emps.add(emp2);
   emps.add(emp3);


      Employee hghg = new Employee("sgs", 32, 1, "fdf");
      Employee clll = (Employee)hghg.clone();
      System.out.println(clll);
      
     
  int d = 2019;
  Employee e = new Employee("Naruto", 3000, d , "Vladik");
       Employee e1 = new Employee("Sasuke", 10055, d, "Lolchik");
       
       //System.out.println(e.compareTo(e1));
       
       Manager m = new Manager("Kakashi", 2000, d, "in", 200);
       Manager m2 = new Manager("Gai", 2000, d, "in", 100);
       
       //System.out.println(m.compareTo(m2));
       Vector<Employee>em=new Vector<Employee>();
       em.add(e1);
       em.add(e);
       Collections.sort(em,new CompareName());
       ///Collections.sort(em, new CompareDate());
       
       for(int i=0;i<em.size();i++) {
        System.out.println(em.elementAt(i));
       }
}      




}