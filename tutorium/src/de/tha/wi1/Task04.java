package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.util.Iterator;

public class Task04 {
	public static void main(String[] args) {
		int länge = readInteger("Schachfeldgröße:");
		int zeile =1;
		
			
		
		for (int i = 1; i <= länge; i++) {

			if (zeile%2==0) {
				for (int j = 1; j <= länge; j++) {
					if (j%2 == 0) {
						System.out.print("S");
						System.out.print(" ");
					}
					else {
						System.out.print("W");
						System.out.print(" ");
					}
				}

			}
			else {
				for (int j = 1; j <= länge; j++) {
					if (j%2 == 0) {
						System.out.print("W");
						System.out.print(" ");
					}
					else {
						System.out.print("S");
						System.out.print(" ");
					}
				}

			}
			System.out.println();
			zeile +=1;

		}

	}
}
