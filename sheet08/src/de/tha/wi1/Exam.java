package de.tha.wi1;

public class Exam {

	private String title;
	private double grade;

	public Exam(String title, double grade){
		this.title = title;
		this.grade = grade;
	}

	public Exam(Exam other) {
		this.title = other.title;
		this.grade = other.grade;
	}

	public boolean isPassed(){
		if (grade>4.0) {
			return false;
		}
		return true;

	}
	
	public double getGrade() {
	    return grade;
	}
	
	 public String toString() {
	        return title + " (" + grade + ")";
	    }
	 
}
