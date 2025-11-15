package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {
	public static void main(String[] args) {
		String ampel = readWord("Bitte ampelphase eingeben:");
		
	/*	if (ampel.equals("gruen")) {
			System.out.println("Los fahren");
		}
		else if (ampel.equals("gelb")) {
			System.out.println("Bitte warten");
		}
		else if (ampel.equals("rot")) {
			System.out.println("Stehen bleiben");
		}
		else {
			System.out.println("Ungültige Eingabe");
		}
*/
		
		switch (ampel) {
		case "rot":
			System.out.println("Stehen bleiben");
			break;
		case "gelb":
			System.out.println("bitte warten");
			break;
		case "gruen":
			System.out.println("Los fahren");
			break;

		default:
			System.out.println("Ungültige Eingabe");
			break;
		}
	}
}
