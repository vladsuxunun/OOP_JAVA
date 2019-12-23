import java.util.Scanner;
import java.util.*;
import java.util.Vector;
public class DragonLaunch {
	public boolean gg;
	static ArrayList <Person>  students = new ArrayList <Person> ();
  static Vector <Person>kidnapped=new Vector <Person>();
  static int count=0;
  public static void main(String[] args) {
    Person p1=new Person("B");
    Person p2=new Person("G");
    Person p3=new Person("B");
    Person p4=new Person("G");
    Person p5=new Person("B");
    Person p6=new Person("G");
    students.add(p1);
    students.add(p2);
    students.add(p3);
    students.add(p4);
    students.add(p5);
    students.add(p6);
    //for(int i=0;i<students.size();i++) {
     // System.out.print(students.get(i));
   // }
    for(int i=0;i<students.size();i++)
    {
  	 System.out.println(students.get(i).getGender());
   }
    System.out.println();
    // if(willDragonEatOrNot()) 
      System.out.println("YES");
   // else
      System.out.println("NO");
  }
  
  public static void willDragonEatOrNot(){
    int cnt=0;
    
    
    while (cnt < 6) {
    for(int i=0;i<students.size();i++) {
    	
     if((i + 1)!= students.size() && students.get(i).getGender()=="B"  && students.get(i+1).getGender()=="G")
      {
    	 students.remove(i);
    	 students.remove(i +1);
      }
      
      
      //if(cnt<0)
       // return true;
    }
    
    cnt++;
    
  
  }
   /// if(students.get(0).getGender()=="G"  && students.get(0+1).getGender()=="B")
   // {
    	
    //.cnt.}
    
    
  }
 	
    	
  
  


  public static void kidnap(Person p) {
    kidnapped.add(p);
  }

}