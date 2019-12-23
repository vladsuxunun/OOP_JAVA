package sis2_4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;

public class Main {
	@SuppressWarnings("null")
	public static void main(String []args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Object [] o = new Object[12];
		
		Chocolate [] c = new Chocolate[4];
		Time [] t = new Time[4];
		c[0] = new Chocolate("Twix", 142);
		c[1] = new Chocolate("Snikers", 11);
		c[2] = new Chocolate("Kazakhstan", 200);
		c[3] = new Chocolate("KitKat", 56);
		Chocolate [] c1 =new Chocolate[4];
		c1 = c.clone();
		
		t[0] = new Time(12, 53, 23);
		t[1] = new Time(6, 23,5);
		t[2] = new Time(14, 24,9);
		t[3] = new Time(1,4,4);
		Time [] t1 = new Time[4];
		t1 = t.clone();
		
		Employee [] e = new Employee[4];
		
		e[0] = new Employee("Bro", 40000,format.parse("2011-01-01"), "20BFsfgja");
		e[1] = new Employee("Rodnik", 4144,format.parse("2012-03-01"), "2352haernae");
		e[2] = new Employee("Gaziz", 20000,format.parse("2010-09-05"), "20BFsfgja");
		e[3] = new Employee("Zhuma", 4114,format.parse("2011-04-01"), "2352haernae");
		Employee [] e1 = new Employee[4];
		e1 = e.clone();
		
		Sort.BubbleSort(c);
		Sort.mergeSort(c1,0, c1.length-1);
		
		Sort.BubbleSort(t);
		Sort.mergeSort(t1, 0, t1.length-1);
		
		Sort.BubbleSort(e);
		Sort.mergeSort(e1, 0, e.length-1);
		
		for(int i = 0; i < 4; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.println(c1[i]);
		}
		
		System.out.println();

		for(int i = 0; i < 4; i++) {
			System.out.println(t[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.println(t1[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.println(e[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			System.out.println(e1[i]);
		}
		
		System.out.println();
	}
}
