package de.tha.wi1;

import java.util.Arrays;

public class Task01 {

	public static void main(String[] args) {

		int[] rnd = { 17, 83, 64, 5, 90, 48, 71, 3, 27, 66,
				14, 95, 9, 56, 78, 22, 60, 99, 2, 31 };

		System.out.print("Schritt 0:");
		System.out.println(Arrays.toString(rnd));	

		for (int i = 0; i < rnd.length-1; i++) {
			int minI = i;

			for (int j = i+1; j < rnd.length; j++) {

				if (rnd[j]<rnd[minI]) {
					minI = j;
				}
			}

			if (minI != i) {
				int tausch = rnd[i];
				rnd[i] = rnd[minI];
				rnd[minI] = tausch;
			}
			
			System.out.print("Schritt" +(i+1) + ": ");
			System.out.println(Arrays.toString(rnd));
		}
		
	}
}
