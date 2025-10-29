package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task15 {
	public static void main(String[] args) {

		int i = 1;
		int summe = 0;
		while (i<=100) {
			 summe +=i;
			 i +=2;
		}
		System.out.println("Die summe aller ungeraden Zahlen von 0 bis 100 beträgt:"+ summe);
			
		}
	}	

