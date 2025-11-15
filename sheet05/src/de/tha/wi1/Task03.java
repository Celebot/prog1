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
		while (true) {


			char cmd = readChar("> ");
			char[] reihe = {'A','B','C','D','E'};

			if (q==cmd) {
				System.out.println("see u later iterator");
				return;

			}
			else if (cmd==f) {
				System.out.println("freie Sitzplätze:"+fsp);
			}
			/////////////////////////////////////////////////////////////////////////////////

			else if (cmd==b) {

				char r = readChar();      // Reihe einlesen (z. B. A)
				int s = readInteger();    // Sitznummer einlesen (z. B. 5)

				int rowIndex = r - 'A';   // Buchstabe -> Index (A=0, B=1, ...)WICHTIG!!!!!
				int seatIndex = s - 1;
				if (rowIndex < 0 || rowIndex > kino.length ||seatIndex < 0 || seatIndex>kino[0].length) {
					System.out.println("Ungültiger Sitz");
				}
				else if (kino[rowIndex][seatIndex] == 1) {
					System.out.println("Sitz bereits belegt!");
				}
				else { 
					kino[rowIndex][seatIndex] = 1;
					System.out.println("Gebucht");
				}


				////////////////////////////////////////////////
			}
			else if (cmd==p) {
				for (int i = 1; i <= 8; i++) {
					System.out.print("  ");
					System.out.print(i);
					System.out.print("    ");
				}
				System.out.println();

				for (int i = 0; i < kino.length; i++) {
					System.out.print(reihe[i]);

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
			
			

		}


	}
}
