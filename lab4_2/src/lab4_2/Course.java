package lab4_2;

import java.io.Serializable;

public class Course implements Serializable{
	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;
	
	public Course() {
		
	}

	public Course(String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseTitle == null) ? 0 : courseTitle.hashCode());
		result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
		result = prime * result + ((textbook == null) ? 0 : textbook.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseTitle == null) {
			if (other.courseTitle != null)
				return false;
		} else if (!courseTitle.equals(other.courseTitle))
			return false;
		if (instructor == null) {
			if (other.instructor != null)
				return false;
		} else if (!instructor.equals(other.instructor))
			return false;
		if (textbook == null) {
			if (other.textbook != null)
				return false;
		} else if (!textbook.equals(other.textbook))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  "Course Title: "+courseTitle;
	}
	
	public String showAll() {
		return "Course Title: "+courseTitle+"\n"+"Textbook's info: "+"\n"+textbook.toString()+"\n"+"Instructor's info: "+"\n"+instructor.toString()+"\n";
	}
	
	
}
