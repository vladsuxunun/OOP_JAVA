package lab5_2;

import java.util.Objects;
import java.util.Date;
public class Employee  implements Comparable {

	double salary;
	String position;
	private int bonus;
	int hireDate;
	String insuranceNum;
	

	public Employee(String nname, double nesalary, int hireDate, String hh) {
		
		salary = nesalary;

		this.hireDate= hireDate;
		insuranceNum = hh;
	}
	public Employee(double nesalary, int bonus) {
		
		salary = nesalary;

		this.bonus = bonus;
	}
	public Employee() {
		
		
	}

	public String toString() {
		return "summary "  + salary + hireDate + insuranceNum ;
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
		return hireDate;
	}
	public int hashCode() {
		return Objects.hash(Getsalary(),Getpositions(),GetyearStart());
	}


	@Override
	public int compareTo(Object otherObject) {
		
		 Employee other = (Employee) otherObject;
		 
		 if (salary < other.salary) return -1;
		 if (salary > other.salary) return 1;
		 else 
		 {
			 if (bonus  < other.bonus) return -1;
			 if (bonus > other.bonus) return 1; 
		 }
              return 0;
		 }
	public int getBonus() {
		// TODO Auto-generated method stub
		return bonus;
	}

}
