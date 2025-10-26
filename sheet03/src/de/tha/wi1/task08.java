package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task08 {

	public static void main(String[] args) {
		int n = readInteger("zahl für das 1*1 angeben:");

		System.out.print("       ");
		for ( int spalte = 1; spalte <= n; spalte++) {
			System.out.print(spalte);
			System.out.print("   ");
		}
		System.out.println();

		for (int zeile = 1; zeile <= n; zeile++) {
			 System.out.printf("%2d |", zeile);

			for (int spalte = 1; spalte <= n; spalte++) {
				int produkt = zeile * spalte;

				System.out.printf("%4d", produkt);

			}
			System.out.println();
		}
	}
}