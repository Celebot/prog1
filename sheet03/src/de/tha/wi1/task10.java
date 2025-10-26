package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task10 {
	public static void main(String[] args) {

		// extra blatt
		int zahl = readInteger("bitte ganzzahl eingeben:");
		int fakulteat = 1;
		
		for (int i = 1; i <= zahl; i++) {
			// 1*2*3*4*5*6
			fakulteat= fakulteat*i;
			System.out.println("!"+ zahl +"="+ fakulteat);
		}
		System.out.println("!"+ zahl +"="+ fakulteat);
	}
}
