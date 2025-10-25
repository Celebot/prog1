package de.tha.wi1;

public class Task0102 {

	public static void main(String[] args) {
		int totalSec = 3671; 		// 1 h, 1 min, 11 s
		int a = -7, b = -12; 		// Beispielwerte
		int x = 103; 				// z.B. Prozentwert oder Punktzahl
		int lo = 0, hi = 100; 		// Zielbereich
		double celsius = 23.7; 		// Temperatur in Celsius
		//a
		int hh = totalSec/3600;
		int mm = totalSec%3600 / 60;
		int ss = totalSec % 60;
		System.out.format("%d h, %d min, %d s%n", hh,mm,ss);
		//b
		int minAB= a<b?a:b;
		int maxAB= a>b?a:b;
		System.out.println("minAB="+minAB);
		System.out.println("maxAB="+maxAB);
		//c
		int absB = b; 
		System.out.println(absB);
		//d
		int clamped = x < lo ? lo :(x > hi ? hi : x);
		System.out.println(clamped);
		//e
		double Fahrenheit = (9/5)*celsius+32;
		System.out.format("%02.2f%n", Fahrenheit);
		//2a)
		int i = 10;//i wird initialisiert
		System.out.println(i > 100);
		// wird verglichen und es kommt bollean wert hier false
		System.out.println(i % 5 == 1 || i++ == 10);
		// logisches ||oder geht nur weiter wenn erstes false its deswegen hier erstes false und zweites true deswegen wird true ausgegeben am ende wird dann plus 1 also haben wir am ende nach ausgabe i = 11
		System.out.println(i > 5 || i == 12);
		//ein true da das erste von logischem oder || richtig ist hören wir auf und bleiben beim ersten
		System.out.println(i == 11); 
		// da i bei Z.34 am ende auf 11 gesetzt wird und nun hier i mit 11 verglichen wird ob es das selbe ist, deswegen ist hier ein true
		System.out.println(i << 1);
		// wir machen einen Linksschift um 1 und da es um eine ganzzahl verschoben wird etspricht das einer multiplikation um 2. bei 2 wäre mal 4, bei 3 mal 8 etc.deswegen hier i=22
		System.out.println(i);
		// da wir es mit syso gemacht haben wurde kein neuer wert zu i initialisiert deswegen wird hier wieder 11 ausgegeben
		System.out.println(Integer.MAX_VALUE + i > 0 && ++i > 1);
		//es kommt ein false da durch int Max_Value +i ein overflow kommt deshalb ist i ein negativer wert und durch logisches && hören wir nach dem ersten false auf deswegen kommt ein false
		System.out.println(i);
		//da wir in der oberen zeile nach dem false augehört haben wurde ++i nicht gerechnet. Deswegen bleibt i bei 11
		
		//3a)
		



	}

}
