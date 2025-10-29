package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task17 {
	public static void main(String[] args) {

		int day = readInteger("bitte zahl eingeben:");
		switch (day) {
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		case 7:
			System.out.println("Sonntag");
			break;

		default:
			System.out.println("Ungültige Eingabe");
			break;
		}

	}	
}
