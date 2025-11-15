package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.util.Iterator;

public class Task03 {
	public static void main(String[] args) {
		
		int temp[] = {2, 4, 8, 12, 17, 21, 23, 22, 19, 14, 7, 3};
		String monat[] = {"Jan","Feb"," Mär","Apr","Mai","Jun", "Jul", " Aug", " Sep"," Okt", " Nov", " Dez"};
		for (int i = 0; i < monat.length; i++) {
			System.out.print("|");
			System.out.format("%4s",monat[i]);
		}
		System.out.println();
		//System.out.println("|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|-------|");
		for (int i = 0; i <5* monat.length; i++) {
			if (i%5==0) {
				System.out.print("|");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.println();
		for (int i = 0; i < monat.length; i++) {
			System.out.print("|");
			System.out.format("%4d",temp[i]);
		}
		System.out.println();
		int üd = 0;
		double mittel = 0;
		for (int i = 0; i < monat.length; i++) {
			mittel += temp[i];
		}
		mittel = mittel/temp.length;
		System.out.format(" Mittelwert:%.1f ", mittel);
		System.out.println();
		for (int i = 0; i < monat.length; i++) {
			if (temp[i]>mittel) {
				üd +=1;
			}
		}
		System.out.println("Monate über durchschnitt:"+üd);
	}
}
