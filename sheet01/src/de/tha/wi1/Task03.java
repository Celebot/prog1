package de.tha.wi1;

public class Task03 {

	public static void main(String[] args) {

		// Teilaufgabe a)
		int hours = 1, minutes = 2, seconds = 3;
		System.out.format(" Aktuelle Uhrzeit: %02d:%02d:%02d%n" , hours,minutes,seconds);


		// Teilaufgabe b)
		int totalSeconds = 18101;	// Entspricht den seit 0:00 Uhr vergangenen Sekunden
		int hours1 =(totalSeconds/3600);
		int minutes1 =(totalSeconds % 3600)/ 60;
		int seconds1=(totalSeconds % 60);
		System.out.format(" Aktuelle Uhrzeit: %02d:%02d:%02d%n" , hours1,minutes1,seconds1);

		// Teilaufgabe c) und d)
		int hoursA = 14, minutesA = 20, secondsA = 33;
		int hoursB = 18, minutesB = 31, secondsB = 43;
		//		int hoursB = 14, minutesB = 21, secondsB = 21;
		int allsecondsB =hoursB*3600+ minutesB*60+secondsB;
		int allsecondsA =hoursA*3600+ minutesA*60+secondsA;
		int allseconds= Math.abs(allsecondsA-allsecondsB);
System.out.format("allseconds=%d", allseconds);
	}

}
