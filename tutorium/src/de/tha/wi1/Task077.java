package de.tha.wi1;

import static de.tha.tools.Input.*;



public class Task077 {
	public static void main(String[] args) {
		int[] data = {7, 3, 1, 9, 4, 2};
		
	}
	
	public static void print(int[] data) {
		for (int i : data) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void sort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[j]>data[j+1]) {
					swap(data,j,j+1);
					System.out.print("Tausche ("+ data[j]+ "mit" + data[j+1]+ "j:");
					print(data);
				}
			}
			System.out.print("durchlauf:");
			
		}
	}
	public static void swap(int[] data,int j, int i ) {
		int tmp = data[j];
		data[j]= data[i];
		data[i] = tmp;
	}
	
	
}
