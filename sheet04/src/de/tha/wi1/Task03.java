package de.tha.wi1;

import static de.tha.tools.Input.*;
public class Task03 {

	public static void main(String[] args) {
		double a = readDouble("a:");
		double b = readDouble("b:");
		double c = readDouble("c:");
		printEquatation(1,2,3);
		printEquatation(0,2,3);
		//printEquatation(a,b,c); für testfälle
		
	}
public static void printEquatation(double a, double b, double c) {
	System.out.println("Formel:");
	if (a !=0) {
		System.out.println(a+"x+2");
	}
	if (b != 0) {
		if (b>0) {
		System.out.println("+" + b+ "x ");
		}
		else {
			System.out.println("- " + -b + "x ");
		}
	}
	
}
}
