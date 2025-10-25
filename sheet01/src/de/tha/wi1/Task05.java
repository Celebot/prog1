package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task05 {

	public static void main(String[] args) {	
		System.out.println("Geben Sie den Netto-Preis ein:");
		float nettoEuro= readFloat();
		System.out.format("Eingegebener Netto-Preis: %.2f%n", nettoEuro);
		//b
		float brutto19 = nettoEuro*1.19f;
		float brutto7 = nettoEuro*1.07f;
		System.out.format("Preis mit 19%% MwSt: %.2f Euro%n", brutto19);
		System.out.format("Preis mit 7%% MwSt: %.2f Euro%n%n", brutto7);
		//c
		int nettoCent = Math.round(nettoEuro*100);
		//Umrechnung in Ct
		int brutto19Cent = Math.round(nettoCent*1.19f);
		int brutto7Cent = Math.round(nettoCent*1.07f);
		//Ausgabe in Ct
		System.out.format("Eingegebener Netto-Preis: %d Cent%n", nettoCent);
		//Ct zu €


		int euro19 = brutto19Cent/100; //ganze Euro
		int cent19	= brutto19Cent %100; //rest-cent (0-99)
		int euro7 = brutto7Cent/100; //ganze Euro
		int cent7	= brutto7Cent %100; //rest-cent (0-99)
		System.out.format("Preis mit 19%% MwSt: %d.%02d%n", euro19,cent19);
		System.out.format("Preis mit 7%% MwSt: %d.%02d", euro7,cent7);
		


	}
}
	

