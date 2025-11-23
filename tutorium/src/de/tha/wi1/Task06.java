package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task06 {
	
	public static void main(String[] args) {
		
		int zahl = readInteger("ganzzahl eingeben:");
		int f=0;
		if (zahl<1) {
			System.err.println("Ungültige Eingabe ");
		}
			for (int i = 1; i <= zahl; i++) {
				for (int j = 1; j <= zahl; j++) {
					f=i*j;
					System.out.println(i+ "x"+j + "="+f);
			}
		}
		
	}
	
}
