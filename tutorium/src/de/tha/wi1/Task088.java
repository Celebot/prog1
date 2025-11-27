package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task088 {
	
	public static void main(String[] args) {
		// Leeres Feld deklarieren und definieren 
		char[][] field = new char[8][8];
		
		// Feld mit '.' initialisieren
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				field[i][j] = '.';
			}
		}
		
		// Zehn Minen platzieren
		field[0][7] = 'X';
		field[1][5] = 'X';
		field[2][3] = 'X';
		field[3][1] = 'X';
		field[3][2] = 'X';
		field[4][0] = 'X';
		field[6][0] = 'X';
		field[6][1] = 'X';
		field[7][3] = 'X';
		field[7][7] = 'X';
		
		print(field);// alles fotos gemacht code nicht fertig hier
		System.out.println();
	}
	public static void countMine(char[][] fields,int r,int c) {
		int count = 0;
		for (int i = r-1; i<= r+1; i++) {
			for (int j = c-1; j <= c+1; j++) {
				
				if (i<0 || i>=fields.length) {
					
				}
			}
		}
	}
	
	public static void print(char[][] field) {
		for (char[] cs : field) {
			for (char c : cs) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
