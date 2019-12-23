package lab4_22;


public class Student {
	private String surname;
	private String name;
	private int score;
	private char scoreChar;
	public Student() {
		
	}
	
	public Student(String surname, String name, int score) {
		this.surname = surname;
		this.name = name;
		this.score = score;
	}
	
	public char getScoreChar() {
		return scoreChar;
	}

	public void setScoreChar(char scorechar) {
		this.scoreChar = scorechar;
	}

	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return getSurname()+" "+getName()+" "+getScore();
	}
	
	public String withCharScore() {
		return getSurname()+" "+getName()+" - "+("\"")+getScoreChar()+("\"")+("\n");
	}
}