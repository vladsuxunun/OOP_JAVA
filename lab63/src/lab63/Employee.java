package lab63;
import java.util.Objects;
public class Employee extends Person {

	double salary;
	String position;
	private int bonus;
	int yearStart;
	String insuranceNum;
	

	public Employee(String nname, double nesalary, int newyearStart, String hh) {
		super(nname);
		salary = nesalary;

		yearStart = newyearStart;
		insuranceNum = hh;
	}

	
	public String toString() {
		return "summary " + super.toString() + salary + yearStart + insuranceNum + super.equals();
	}

	public boolean equals(Object obj) {
		boolean f = false;
		if(this==obj) 
			f =true;
		if(obj==null) 
			f =  false;
		
		return f;
	}
	public double Getsalary() {
		return salary;
	}
	public String Getpositions() {
		return position;
	}
	public int GetyearStart() {
		return yearStart;
	}
	public int hashCode() {
		return Objects.hash(Getsalary(),Getpositions(),GetyearStart());
	}

}
