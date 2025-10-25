package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {
		
		int zahl = readInteger("Bitte Ganzzahl eingeben: ");
		
		long fakultaet = 0;
		
		for (int i=0; i<= zahl; i++) {
			if(i%2==0) {
				fakultaet += i;
			}
		}
		System.out.println( fakultaet);
	}

}
