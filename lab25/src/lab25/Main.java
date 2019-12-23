package lab25;

public class Main {
	  
	  
	  public static void main(String[] args) {
	    int bills=5000;
	    SchoolBoy ab=new SchoolBoy("Director"," G U C C I");
	    Cource s1course = Cource.middle;
	    System.out.println(ab.toString());
	    System.out.println("Course: "+ s1course);
	    ab.bill();
	    ab.scholarship(466);
	    System.out.println(ab.ov(6,7));
	    
	    
	    SchoolBoy s2=new SchoolBoy("Nikita","Khan");
	    
	    Cource ac =Cource.middle;
	    System.out.println(s2.toString());
	    System.out.println("Course: "+ ac);
	    s2.bill();
	    ab.scholarship(563);
	  }
	}