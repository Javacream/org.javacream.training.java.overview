package org.javacream.training.java.overview;

public class Student extends Person {

	public Student(String lastname, String firstname, Integer id) {
		super(lastname, firstname, id);
	}
	private String university;
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public void study() {
		
	}
}
