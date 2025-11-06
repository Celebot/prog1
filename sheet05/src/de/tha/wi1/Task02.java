package de.tha.wi1;

import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {

		int[][] sudoku = {
				{9,0,0,0,0,0,0,4,0},
				{2,1,6,3,8,4,7,9,0},
				{4,0,0,0,0,9,8,2,1},
				{0,6,0,1,0,0,9,0,0},
				{5,0,1,9,0,8,0,7,6},
				{0,2,9,5,7,6,0,0,8},
				{1,0,4,8,6,5,2,3,7},
				{0,0,7,0,0,0,0,6,4},
				{6,5,2,4,3,7,1,8,9}
		};
		String thickLine = "|+===+===+===++===+===+===++===+===+===+|";
		String thinLine  = "|+---+---+---++---+---+---++---+---+---+|";

		System.out.println(thickLine);
		for (int i = 0; i < 9; i++) {
			System.out.print("||");
			for (int j = 0; j < 9; j++) {
				// Leeres Feld (0) bleibt leer
				if (sudoku[i][j] == 0) {
					System.out.print("   ");
				} else {
					System.out.print(" " + sudoku[i][j] + " ");
				}
				if ((j + 1) % 3 == 0) {
					System.out.print("||");
				} else {
					System.out.print("|");
				}
			}
			System.out.println();

			// Nach jeder 3. Zeile dicke Linie, sonst dünne
			if ((i + 1) % 3 == 0) {
				System.out.println(thickLine);
			} else {
				System.out.println(thinLine);
			}
		}

	}
}
