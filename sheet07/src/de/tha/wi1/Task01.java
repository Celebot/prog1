package de.tha.wi1;

public class Task01 {
	public static void main(String[] args) {
		int n = 5;
		int x = 3;
		
		System.out.println(powerDoWhile(x, n));
		System.out.println(powerWhile(x, n));
		System.out.println(powerRecursive(x, n));
		System.out.println(powerRecursive((double)x, n));
	}
	public static long powerRecursive(int x, int n) {
		long result = 1;
		if (n>0) {
			return result = x* powerRecursive(x, n-1);//3 hoch 5 ist das selbe wie 3 mal 3hoch 4 das so lange bis wir am ende sind dann multipliziert er
		} 
		return 1;
		
		
		
		
		
	}
	public static double powerRecursive(double x, int n) {// Überladen heißt eine methode mi dem selben namen zu haben aber anderer datentyp
		double result = 1.0;
		if (n>0) {
			return result = x* powerRecursive(x, n-1);//3 hoch 5 ist das selbe wie 3 mal 3hoch 4 das so lange bis wir am ende sind dann multipliziert er
		} 
		return 1.0;
	}
	
	
	
	
	public static long powerWhile(int x, int n) {
		long result =1;
		while (n>0) {
			result *= x;
			n--;
		}
		
		return result;
		
	}
	
	
	public static long powerDoWhile (int x,int n) {
		long result =1;
		if (n==0) {
			return 1;
		}
		do {
			result *= x;
			n--;
		} while (n>0);
		
		
		return result;
		
	}
}
