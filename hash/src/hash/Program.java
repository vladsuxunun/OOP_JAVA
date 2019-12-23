package hash;

import java.util.Vector;

public class Program {
  public static void main(String[] args) {
    Student student = new Student("Vitaliy", 100);
    Student student1 = new Student("Vlad", "18BD");
    
    Vector<Student> studs = new Vector<Student>();
    
    studs.add(new Student("Vlad eblan", "18BD"));
    
    if(student1.equals(studs.get(0))) {
      System.out.println("gggj");
    } else {
      System.out.println("Nine");
    }
  }
}