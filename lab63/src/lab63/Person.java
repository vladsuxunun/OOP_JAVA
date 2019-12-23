package lab63;

public class Person {
	String name;
	
	public Person(String newname) {
		this.name = newname;
	}
	public String toString()
	{
		return name;
	}
	public String getName()
	{
		return name;
	}
	public int  equals()
	{
		return 5;
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
