package lab63;

import java.util.Vector;

public class Manager {//extends  //Employee {
	private int bonus;
	String name;
	public Manager()
	{
		super();
	}
	 Vector<Employee> work = new Vector<Employee>();
	public void add(Employee p)
	{
		work.add(p);
	}
	public void print()
	{
		for(Employee s : work)
		{
			System.out.println(s);
		}
	}
		public boolean equals(Object obj) {
			boolean f = false;
			if(this==obj) 
				f =true;
			if(obj==null) 
				f =  false;
			
			return f;
		}
	}
	
