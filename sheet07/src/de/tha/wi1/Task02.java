package de.tha.wi1;

public class Task02 {

	public static void main(String[] args) {
		
		System.out.println(ggt(36, 24));
		System.out.println(ggt(24, 42));
		System.out.println(ggt(6, 6));

	}
	
	public static int ggt(int x ,int y) {
		int result = 1;
		if (x==y) {
			return x;
		}
		else if (x>y) {
			return result = ggt(x-y, y);
		}
		else  {
			return result = ggt(x, y-x);// ruft sich abwechselnd selber auf bis ich bei x= y lande dann hab ich die zahl
		}
		
		
		
		
		
	}

}
