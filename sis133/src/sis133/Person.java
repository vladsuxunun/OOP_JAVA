package sis133;

public class Person {
	public enum Gender {
		boy, girl
	}

	private Gender g;
	private char gender;

	public Person() {
		this.g = Gender.boy;
		this.gender = 'B';

	}

	public Person(char gender) {
		this.gender = gender;
		if (gender == 'G') {
			this.g = g.girl;
		} else {
			this.g = Gender.boy;

		}

	}

	public char getGender() {
		return gender;
	}

	
	// static, equals, hashcode. naming conventions, dlya kazhdogo klassa razniy file.
}
