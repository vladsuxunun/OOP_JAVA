
public class Main {
	public static void main(String[] args) {
		int a[] = {0, 8 , -3, 20};
	MinMax m = new MinMax();
	MinMax.Comparison printer = new MinMax.Comparison();
	


	m.minmax(printer.com(a));
	System.out.println(m.getMin() + " " + m.getMax());
}
}
