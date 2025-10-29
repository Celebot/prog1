package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task21 {
	public static void main(String[] args) {
		int totalSec = 3671; // 1 h, 1 min, 11 s
		int a = 7, b = -12; // Beispielwerte
		int x = 2; // z.B. Prozentwert oder Punktzahl
		int lo = 0, hi = 100; // Zielbereich
		double celsius = 23.7; // Temperatur in Celsius
		/*
 //a)
		int hh = totalSec/3600;
		int mm = (totalSec%3600)/60;
		int ss = (totalSec%3600)%60;

		System.out.format("%dh %d min %d s", hh,mm,ss);

		//b)
		int minAB = a<b ? a:b;
		int maxAB = a>b ? a:b;
		System.out.format(" min:%d max: %d", minAB, maxAB);
		 
		
		//c
		int absB = b;
		
		
		//d
		int clamped=x<lo ? lo: (x>hi ? hi : x);
		System.out.println(clamped);
		*/
		
		//e
		double f = (9.0/5.0) *celsius + 32;
		System.out.format("%02.2f%n", f);



	}	
}
