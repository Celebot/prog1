package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.lang.ProcessBuilder.Redirect;

public class task16 {
	public static void main(String[] args) {

		int points = readInteger("Bitte Punktzahl eingeben:");
		String note;

		if (points>=90) {
			note = "sehr gut";
		}

		else if (points>=80) {
			note = "gut";
		}
		else if (points>=70) {
			note = "befriedigend";
		}
		else if (points>=60) {
			note = "ausreichend";
		}
		else if (points>=0) {
			note = "mangelhaft";
		}
		else {
			note ="unsinnige note";
		}
		System.out.println("Note:" + note);
		

	}	
}
