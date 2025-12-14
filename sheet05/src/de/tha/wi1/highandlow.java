package de.tha.wi1;

import java.util.Arrays;
import java.util.Iterator;

public class highandlow {

	public static void main(String[] args) {

		int[] zahl = {1,2,-3,4-5};
		System.out.println(Arrays.toString(highlow(zahl, 0, 0)));

	}

	public static int[] highlow(int[]zahl, int min, int max) {
		int[] lul = new int[2];
		min =0;
		max = 0;
		for (int i = 0; i < zahl.length-1; i++) {
			if (zahl[i]>max) {
				max=zahl[i];
				lul[0]=max;
			}
		
		}
		for (int i = 0; i < zahl.length-1; i++) {
			if (min<zahl[i]&&zahl[i]<max) {
				min = zahl[i];
				lul[1]=min;
			}
		}
		



		return lul;
	}
}
