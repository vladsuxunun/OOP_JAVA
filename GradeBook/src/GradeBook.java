import java.util.ArrayList;

//import java.util.Formatter;

public class GradeBook {
	public double average;
	public int cnt = 0;
	ArrayList<Student> liststudents = new ArrayList<Student>();
	Cource course = new Cource("CS101 Object-oriented Programming and Design", "Object-oriented Programming and Design",
			3, "Calculus 2");

	public void displayMessage() {
		System.out.print("Welcome to the grade book for");

	}
	

	public void addlist(Student first) {
		liststudents.add(first);
		cnt++;
	}

	public void displayGradeReport() {

		determineClassAverage();
		determineClassMin();
		determineClassMax();
		gradesDistribution();

	}

	public void determineClassAverage() {
		average = 0;
		for (Student s : liststudents) {
			average += s.getmark();
		}

		System.out.print("Class average is " + average / liststudents.size());

	}

	public void gradesDistribution() {
		System.out.print("00-09: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 0 && liststudents.get(i).getmark() < 10) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("10-19: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 10 && liststudents.get(i).getmark() < 20) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("20-29: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 20 && liststudents.get(i).getmark() < 30) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("30-39: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 30 && liststudents.get(i).getmark() < 40) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("40-49: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 40 && liststudents.get(i).getmark() < 50) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("50-59: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 50 && liststudents.get(i).getmark() < 60) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("60-69: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 60 && liststudents.get(i).getmark() < 70) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("70-79: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 70 && liststudents.get(i).getmark() < 80) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("80-89: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 80 && liststudents.get(i).getmark() < 90) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("90-99: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= 90 && liststudents.get(i).getmark() < 100) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("100: ");
		for (int i = 0; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() == 100) {
				System.out.print("*");
			}
		}
	}

	public void determineClassMax() {
		int maxmark = liststudents.get(0).getmark();
		int index = 0;
		for (int i = 1; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() >= maxmark) {
				maxmark = liststudents.get(i).getmark();
				index = i;

			}

		}
		System.out.println(
				"Highest grade is   " + maxmark + "(" + liststudents.get(index).getName() + " id: " + index + ")");
	}

	public void determineClassMin() {
		int minmark = liststudents.get(0).getmark();
		int index = 0;
		for (int i = 1; i < liststudents.size(); i++) {
			if (liststudents.get(i).getmark() <= minmark)
				minmark = liststudents.get(i).getmark();
			index = i;
		}

		System.out.println(
				"Lowest grade is   " + minmark + "(" + liststudents.get(index).getName() + " id: " + index + ")");

	}

	public void outputBarChart() {

	}

}
