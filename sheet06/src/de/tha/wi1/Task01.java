package de.tha.wi1;

public class Task01 {

	public static void main(String[] args) {


		// Beispiel-Array mit unregelmäßigen Dimensionen
		int[][][] data = {
				{ {1, 2, 3}, {4, 5} },
				{ {10}, {20, 30, 40}, {50} },
				{ {7, 8}, {}, {11, 12, 13, 14} }
		};
		int max = findMaxForLoop(data);
		System.out.println(max);
		
		int maxEach = findMaxForEachLoop(data);
		System.out.println(maxEach);
	}
//b)
	public static int findMaxForEachLoop(int[][][]a) {
		int maxEach = Integer.MIN_VALUE; 
		for (int[][] array2D : a) {
			for (int[] array1D : array2D) {
				for (int value : array1D) {
					if (value>maxEach) {
						maxEach=value;
					}
				}
				
			}
			
		}
		return maxEach;
	}

//a)
	public static int findMaxForLoop(int[][][] a) {

		int max = Integer.MIN_VALUE;  
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					if (a[i][j][k] > max) {
						max = a[i][j][k];
					}
				}
			}
		}
	
	return max;
}
}
