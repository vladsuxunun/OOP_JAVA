package sis133;

import java.util.Vector;

public class DragonLaunch {
	static Vector<Character> students = new Vector<Character>();
	static Vector<Person> kidnapped = new Vector<Person>();
	static int count = 0;

	public static void main(String[] args) {
		Person p1 = new Person('B');
		Person p2 = new Person('G');
		Person p3 = new Person('B');
		Person p4 = new Person('G');
		Person p5 = new Person('G');
		Person p6 = new Person('G');
		students.add(p1.getGender());
		students.add(p2.getGender());
		students.add(p3.getGender());
		students.add(p4.getGender());
		students.add(p5.getGender());
		students.add(p6.getGender());

		for (int i = 0; i < students.size(); i++) {
			System.out.print(students.get(i));
		}
		System.out.println();
		if (willDragonEatOrNot())
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	public static boolean willDragonEatOrNot() {
		int cnt = 0;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) == 'B')
				cnt++;
			else
				cnt--;

			if (cnt < 0)
				return true;
		}
		return false;
	}

	public static void kidnap(Person p) {
		kidnapped.add(p);
	}

}