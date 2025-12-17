package de.tha.wi1;

public class Student {

	private Exam[] exams;       
	private int examsTaken;    
	private String firstname;
	private String lastname;
	private int matrikel;

	// (b)(i) Konstruktor
	public Student(String firstname, String lastname, int matrikel) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.matrikel = matrikel;
		this.exams = new Exam[40];
		this.examsTaken = 0;
	}
	
	  public void registerExam(Exam other) {
	        if (other.isPassed() && examsTaken < exams.length) {
	            exams[examsTaken++] = new Exam(other); 
	        }
	    }
	  
	  public String toString() {
	        String result = firstname + " " + lastname + " (" + matrikel + ")\n";
	        double sum = 0;

	        for (int i = 0; i < examsTaken; i++) {
	            result = result + "- " + exams[i].toString() + "\n";
	            sum += exams[i].getGrade(); 
	        }

	        double avg = (examsTaken > 0) ? sum / examsTaken : 0;
	        result = result + "-> Durchschnitt: " + String.format("%.2f", avg);

	        return result;
	    }
}
// was neues
//lol