package newss;

public class Student {
	private int idNum;
	private String name;
	private int mark;
	private static int nextID=1;	
	{
		idNum=nextID++;
	}
	
	public Student(String name,int mark) {
		this.name=name;
		this.mark=mark;
	}
	public int getIdNum() {
		return idNum;
	}
	public String getName() {
		return name;
	}
	
	public int getmark() {
		return mark;
	}
	
	public String toString() {
		return "ID: "+getIdNum()+" Name: "+getName()+" Mark: "+getmark();
	}
}
