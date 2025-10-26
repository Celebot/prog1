package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task07 {

	public static void main(String[] args) {

		int h = readInteger("Bitte höhe eingeben:");
		int i =0;
		int j =0;
		int k = 0;

		for ( i = 1; i < h; i++) {

			for ( j = i; j <= h; j++) {
				System.out.print(" ");
			}
			for ( k = 1; k <= (2*i-1); k++) {
				System.out.print("*");

			}

			System.out.println("");
		}
		System.out.println("#");

	}

}




