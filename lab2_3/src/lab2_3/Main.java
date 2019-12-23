package lab2_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DATA ab = new DATA();
		String words;
		
		Scanner a = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.print("press something or press q to quit");
			words = a.next();
			if (words.equals("q"))
			{
				break;
			}
			else
			{
				ab.adddata(Double.parseDouble(words));
			
			}
			
			
		}
		System.out.println("max ="  + ab.getmaximum());
		System.out.println("average =" + ab.getAverage() );
		

	}

}
