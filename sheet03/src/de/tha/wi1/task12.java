package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task12 {
	public static void main(String[] args) {

		int kh =3; //readInteger("bitte kanten höhe eingeben:");


		for (int i = 1; i <= kh; i++) {
			System.out.print("*_");
			// mitte
		}
		System.out.println();
		for (int i = 0; i < kh-2; i++) {
			System.out.print("*_");

			for (int j = 1; j <= kh-2; j++) {
				System.out.print("__");

			}
			System.out.println("*_");
		}
//unten
		for (int i = 1; i <= kh; i++) {
			System.out.print("*_");
		}
	}
}
