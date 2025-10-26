package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task09 {
	//Schaltjahre sind Jahre, die durch vier teilbar sind (aber nicht alle).
	//• Ist ein Jahr durch vier und einhundert teilbar ist, dann ist es in der Regel kein Schaltjahr.
	//• Ein Jahr das durch vier, einhundert und vierhundert teilbar ist, ist aber dennoch ein Schaltjahr.
	public static void main(String[] args) {

		int year = readInteger("bitte jahr eingeben:");

		boolean schaltjahr = (year % 4 == 0 && year % 100 !=0) || (year % 400 ==0);

		if (schaltjahr) {
			System.out.println("schaltjahr");
		}else {
			System.out.println("kein schaltjahr");
		}
	}
}
