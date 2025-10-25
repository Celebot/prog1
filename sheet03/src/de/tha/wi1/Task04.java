package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task04 {

	public static void main(String[] args) {

		int zahl = readInteger("Bitte Ganzzahl eingeben: ");
		long fakultaet = 1;

		/* int i = 1; // Zähler für die Schleife

        while (i <= zahl) {
            fakultaet *= i;
            i++;
        }

        System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
		 */

		/*for (int i=1; i<= zahl; i++) {
			fakultaet *= i;
		}
		System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);
		 */

		int i = 1;
		do {
			fakultaet *= i;
		i++;

		} while (i <= zahl);
System.out.println(fakultaet);

	}
}
