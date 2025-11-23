package de.tha.wi1;

public class Task02 {
	public static void main(String[] args) {
		
		int[] allValues = {1, 3, 5, 7, 9, 11};
		 int[] check1 = {3, 7, 9};
		 int[] check2 = {2, 3, 7};
		 arrayContainsint(allValues, check1);
		 
		 System.out.println( arrayContainsint(allValues, check1));
		 System.out.println( arrayContainsint(allValues, check2));
	}
	public static boolean arrayContainsint (int[] allValues,int[] check) {
		int count =0;
		boolean result =false;
		 for (int i : allValues) {
			 for (int j : check) {
				// System.out.println(i+ " "+ j);
				if (i==j) {
				count++;
				}
			}
			
		}
	if (count ==check.length) {
		result=true;
	}
	return result;
	}

	
}
