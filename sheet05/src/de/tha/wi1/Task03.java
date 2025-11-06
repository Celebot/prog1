package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {


	public static void main(String[] args) throws Exception {
		
		int[][] kino={
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},

		};
		int asp = 5*8;
		int buchung =0;
		int fsp =asp-buchung;
		char q = 'q'; 
		char b ='b';
		char f ='f';
		char p = 'p';
		char cmd = readChar("> ");
		if (q==cmd) {
			System.out.println("see u later iterator");
			return;

		}
		else if (cmd==f) {
			System.out.println("freie Sitzplätze:"+fsp);
		}
		else if (cmd==b) {
			

		}
		else if (cmd==p) {
			for (int i = 1; i <= 8; i++) {
				System.out.print("  ");
				System.out.print(i);
				System.out.print("    ");
			}
			System.out.println();
			//System.out.println("..1.....2.....3.....4.....5.....6.....7.....8.....");
			for (int i = 0; i < kino.length; i++) {
				for (int j = 0; j <= 7; j++) {
					if (kino[i][j] == 0) {
						System.out.print("  ");
						System.out.print(".");
						System.out.print("    ");
					}
					else {
						System.out.print("x");

					}

				}
				System.out.println();
			}
		}
		else {
			System.out.println("Unbekannter Befehl. Befehle: p|b <row> <seat> | s<row> <seat> | f |q");
		}
		char r = readChar();				
		int s = readInteger();
		System.out.println("Befehl " + cmd + " Reihe " + r + " Sitz " + s);

	}


}
