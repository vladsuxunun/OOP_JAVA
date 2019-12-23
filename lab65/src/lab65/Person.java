package lab65;

public class Person {
	   private String name;
	   private String address;
	   
	   public Person() {
	    this.name = "noname";
	    this.address = "no address";
	   }
	   
	   public Person(String name, String address) {
	    this.name = name;
	    this.address = address;
	   }
	   
	   public String getName() {
	    return name;
	   }
	   
	   public String getAddress() {
	    return address;
	   }
	   
	   public void setAddress(String address) {
	    this.address = address;
	   }
	   
	   @Override
	   public String toString() {
	    return ("Person name:" + getName() + "    " + "Address:  " + getAddress() + "   ");
	   }
	}