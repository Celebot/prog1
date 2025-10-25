package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task06 {

	public static void main(String[] args) {
		int zahl = readInteger("Bitte Zahl eingeben:");
		int zahl1=zahl/1000;
		int zahl2=(zahl%1000)/100;
		int zahl3=(zahl%1000%100)/10;
		int zahl4=(zahl%1000%100%10)/1;
		int quersumme = zahl1+zahl2+zahl3+zahl4;
		System.out.println("die Quersumme ist:"+quersumme);
		
		
	}
	
}
