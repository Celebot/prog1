package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task11 {
	public static void main(String[] args) {

		// extra blatt 8&9
		int q=100;
		int k=1;
		int f=0;
		int r=0;

		System.out.println("zahl:   Quadrat:  SummeDerZahlen:  SummeDerQuadratzahlen:");
		for ( int i = 1; i <= q; i++) {

			k =i*i;
			f += i;
			r += k;
			System.out.format("%4d     %4d     %4d        %4d %n", i, k,f,r);
		}


	}	
}
