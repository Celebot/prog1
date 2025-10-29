package de.tha.wi1;

import static de.tha.tools.Input.*;

public class task14 {
	public static void main(String[] args) {

		// geschicktes pdf
		int oberg = readInteger("Geben sie die obergrenze ein:");
		
		for (int i = 5; i <= oberg; i+=5) {
			System.out.println(i);
		}


	}	
}
