import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookTest {
	public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
	GradeBook ob1 = new GradeBook();
	int points;
	
	String  words[]= {"A","B","C","D","E","F","G"};//,"H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z
			
	
for(int i = 0;i < words.length;i++) {
	System.out.print("Student " + words[i] + " ");
	   
	Student first = new Student("Student " + words[i],a.nextInt());
	ob1.addlist(first);
	
	
	
}
ob1.displayGradeReport();
	}
}
