package sis2_4;


import java.util.Date;
import java.util.Vector;

public class Employee implements Comparable<Employee>{
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	private String name;
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		this.name = name;
		this.insuranceNumber = insuranceNumber;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return super.toString() + " "+ this.hireDate + " Insurance #: " + this.insuranceNumber + ""
				+ " Salary: " + this.salary + "";
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)){
			return false;
		}
		if(o instanceof Employee) {
			Employee e = (Employee)o;
			if(e.equals(insuranceNumber)) {
				return true;
			}
		}
		return false;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {   
	    return super.clone();
	}

	@Override
	public int compareTo(Employee e) {
		if(e.getSalary() > getSalary()) {
			return 1;
		} else if(e.getSalary() < getSalary()) {
			return -1;
		} else {
		return 0;
		}
	}

}
