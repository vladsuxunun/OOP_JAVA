package TaskB;

public class Main {

	public static void main(String[] args) {
		LadaPriora lada=new LadaPriora(1.6,"FWD",4);
		
		lada.ignite();
		System.out.println();
		lada.move();
	}

}
