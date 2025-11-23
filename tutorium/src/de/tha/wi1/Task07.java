package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task07 {
	public static void main(String[] args) {
		int[] data = {7, 3, 1, 9, 4, 2};
		int klein = Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[j]>klein) {
					klein =data[i];
					data[i]=data[j];
					
				}
				System.out.println(data[i]);
			}
		}
	}
	
}
