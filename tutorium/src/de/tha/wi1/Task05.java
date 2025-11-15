package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.util.Arrays;

public class Task05 {

	public static void main(String[] args) {

		int[] grades = {1, 3, 2, 4, 5, 1, 2, 3, 2, 4};
		int[] stern = new int[grades.length];


		System.out.println("Note:");
		for (int i = 0; i < grades.length; i++) {

			System.out.print(grades[i]+ " ");

		}
		System.out.println();
		System.out.println("Histogramm:");
		for (int i = 0; i < grades.length; i++) {
			if (grades[i]==1) {
				stern[1] +=1;
			}
			else if (grades[i]==2) {
				stern[2] += 1;
			}
			else if (grades[i]==3) {
				stern[3] += 1;
			}
			else if (grades[i]==4) {
				stern[4] += 1;
			}
			else if (grades[i]==5) {
				stern[5] += 1;
			}
			System.out.println(Arrays.toString(stern));

		}
		for (int i = 1; i < 6; i++) {
			System.out.print(i+":");
			for (int j = 0; j < stern[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}





}

}
