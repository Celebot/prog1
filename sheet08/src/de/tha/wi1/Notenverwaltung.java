package de.tha.wi1;

public class Notenverwaltung {

//Exam
	public static void main(String[] args) {
		Exam lul = new Exam("Einführung Prog", 2.0);
		System.out.println(lul);
		
		System.out.println(lul.isPassed());
		
		Student lal =new Student("Leon", "Bayer", 23451);
		System.out.println(lal);
		 Student s = new Student("Erika", "Mustermann", 2178889);

	        // Prüfungen erstellen
	        Exam e1 = new Exam("Einführung in die Programmierung", 1.0);
	        Exam e2 = new Exam("Grundlagen der Wirtschaftsinformatik", 2.3);
	        Exam e3 = new Exam("Mathematik", 4.3); // nicht bestanden, wird nicht gespeichert
	        Exam e4 = new Exam("Datenbanken", 3.0);

	        // Prüfungen registrieren
	        s.registerExam(e1);
	        s.registerExam(e2);
	        s.registerExam(e3); // nicht bestanden -> wird ignoriert
	        s.registerExam(e4);

	        
	        System.out.println(s);
	    

	}
}
