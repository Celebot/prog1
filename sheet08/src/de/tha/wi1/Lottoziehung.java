package de.tha.wi1;

import java.util.Random;

public class Lottoziehung {



	private  int counter =0;
	int[] gezogen =new int[7];

	private boolean bereitsgezogen(int zahl) {
		for (int i = 0; i <counter && i<6; i++) {
			if (gezogen[i] == zahl) {
				return true;
			}		
		}
		return false;
	}

	public static void main(String[] args) {

		Lottoziehung run = new Lottoziehung();
		Lottoziehung run2 = new Lottoziehung();


		run.zieheZahlen();
		run2.zieheZahlen();
		
	}

	private void zieheZahlen() {
		for (int i = 0; i < 8; i++) {
			System.out.print(this.nextNumber()+" ");
			
			counter++;
		}
		
	}

	public  int nextNumber() {

		int n=-1;
		Random rand = new Random();

		if (counter<6) {
			do {
				n = rand.nextInt(50);
			}
			while(bereitsgezogen(n));
			gezogen[counter] = n;
			if (n==0) {
				n = n+1;
			}
		
		}
		if (counter==6) {
			
			n = rand.nextInt(10);
			
		}
		
		




		return n;
	}
}
