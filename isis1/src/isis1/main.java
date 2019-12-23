package isis1;

public class main {

	public static void main(String[] args) {
		Temperature t1=new Temperature(150,'F');
		System.out.println(t1.toString());
		
		if(t1.getScale()=='C') 
		{
			System.out.print(t1.toF());
			System.out.print("°F");
		}
		else{
		    System.out.print(t1.toC());
		    System.out.print("°C");
		}
	}

}
