package de.tha.wi1;

public class Task02 {

	public static void main(String[] args) {

		int data[] = {
				42, 87, 13, 65, 90, 22, 7, 54, 38, 62, 64, 31, 76, 48, 15, 70, 3, 81, 24, 93,
				11, 60, 45, 57, 28, 85, 17, 96, 2, 73, 33, 68, 9, 78, 50, 91, 19, 35, 4, 26,
				8, 63, 47, 71, 52, 39, 4, 95, 23, 66, 88, 41, 59, 12, 84, 18, 77, 25, 46, 69,
				34, 53, 4, 98, 43, 10, 56, 20, 97, 16, 6, 75, 27, 40, 83, 21, 61, 49, 32, 67,
				14, 58, 29, 94, 1, 62, 5, 79, 36, 82, 37, 4, 44, 72, 92, 51, 55, 74, 86, 14
		};
		int minarray = Integer.MAX_VALUE;
		int maxarray= Integer.MIN_VALUE;

		for (int i = 0; i < data.length; i++) {

			System.out.printf("%4d", data[i]);
			if ((i+1)%10==0) {
				System.out.println();
			}
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("b)");
		for (int k = 0; k <data.length; k++) {
			if (data[k]<minarray) {
				minarray = data[k];
			}
		}
		System.out.println("kleinster Wert:"+minarray);

		for (int i = 0; i < data.length; i++) {
			if (data[i]>maxarray) {
				maxarray = data[i];
			}
		}
		System.out.println("größter Wert:"+ maxarray);

		///////////////////////////////////////////////////////////////////////////////

		double k =0;
		for (int i = 0; i < data.length; i++) {
			k += data[i];
		}
		k = k/data.length;
		System.out.println("Mittelwert:"+ k);

		///////////////////////////////////////////////////////////////////////////////

		int q = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 5 == 0) {
				q +=1;
			}
		}
		System.out.println("Durch 5 teilbare werte (Anzahl: "+q + ")");
	}
}


