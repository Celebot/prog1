package de.tha.wi1;

import static de.tha.tools.Input.*;

import java.util.Iterator;

public class task13 {
	public static void main(String[] args) {

		int	h=5; //bei 4= 2   // 5 -1 -2 //3 2
		//1
		for (int i = 0; i < h-1; i++) {
			System.out.print("__");	

		}
		System.out.println("*_");
		//2
		for (int i = 0; i < h-2; i++) {


			for (int j = 0; j < (h-2)-i; j++) {
				System.out.print("__");
			}

				System.out.print("*_");

				for (int a = 0; a < i*2+1; a++) {
					System.out.print("__");
				}
			
			System.out.println("*_");
		}

		//3
		for (int b = 0; b < 2*h-1; b++) {
			System.out.print("*_");
		}

	}
}