
package lab5_2;
import java.util.Vector;

public class Manager implements Comparable{
	public int bonus;
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
		@Override
		public int compareTo(Object otherObject) {
			
			 Employee other = (Employee) otherObject;
			 
		
				 if (bonus  < other.getBonus()) return -1;
				 
				 if (bonus > other.getBonus()) return 1; 
			 
		return 0;
			 }
			
		}

	
	