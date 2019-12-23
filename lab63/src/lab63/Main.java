package lab63;
import java.util.HashSet;
public class Main {

	public static void main(String[] args) {
		HashSet<Employee>h=new HashSet<Employee>();
		Employee b1 = new Employee("name",56,89,"ghhg");
		Employee b2 = new Employee("name4",57,859,"ghhg6");
		//Employee m1[] = {b1,b2};
		
		Manager a = new Manager();
		h.add(b1);
		h.add(b2);
		
		//a.print();
		for(Employee e:h) {
			System.out.println(e.toString());
		}
		
		

	}

}
