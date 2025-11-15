package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task01 {
	public static void main(String[] args) {

		int punkte = readInteger("bitte Punktzahl eingeben:");

		if ( punkte>100) {
			System.out.println("ungültige eingabe");
		}
		else if (punkte>=95) {
			System.out.println(punkte +"  | "+ "1.3");
		}
		else if (punkte>=90) {
			System.out.println(punkte +"  | "+ "1.3");
		}
		else if (punkte>=85) {
			System.out.println(punkte +"  | "+ "1.7");
		}
		else if (punkte>=80) {
			System.out.println(punkte +"  | "+ "2.0");
		} 
		else if (punkte>=75) {
			System.out.println(punkte +"  | "+ "2.3");
		}
		else if (punkte>=70) {
			System.out.println(punkte +"  | "+ "2,7");
		}
		else if (punkte>=65) {
			System.out.println(punkte +"  | "+ "3.0");
		}
		else if (punkte>=60) {
			System.out.println(punkte +"  | "+ "3.3");
		}
		else if (punkte>=55) {
			System.out.println(punkte +"  | "+ "3.7");
		}
		else if (punkte>=50) {
			System.out.println(punkte +"  | "+ "4.0");
		}
		else if (punkte>=0) {
			System.out.println(punkte +"  | "+ "5.0");
		}

		else {
			System.out.println("ungültige eingabe");

		}
		
		//b)
		if (punkte >= 50) {
			double grade =Math.max(1.0, 4.0 -(1.0/3.0)*Math.floor(((punkte-50)/5))); 
			System.out.printf("Punkte: %d \nNote: %.1f",punkte,grade);
		}
		else {
			System.out.println("note 5.0");
		}
	}
}
