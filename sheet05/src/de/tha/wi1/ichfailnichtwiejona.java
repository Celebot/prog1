package de.tha.wi1;

import java.util.Arrays;
import java.util.Iterator;

public class ichfailnichtwiejona {

	public static void main(String[] args) {

		int[] data = {-2,-3,-5,-8,-9,-23,-4};
		
		
		System.out.println(sortsum(data, 0));
	}
	public static int sortsum(int[] data, int k) {
		
		int[]leckeier =new int[data.length];
		k=0;
		for (int i = 0; i < data.length-1; i++) {
			
				if (data[i]>0) {
					leckeier[i]=data[i];
				}
				else if (data[i]<0) {
					leckeier[i]=0;
				}
				
			
		}
		for (int i = 0; i < leckeier.length; i++) {
			k+=leckeier[i];
		}
		
		return k;
	}
}
