package de.tha.wi1;
import static de.tha.tools.Input.*;

import java.util.Arrays;

public class Task03 {
	public static void main(String[] args) {
		String str = "Otto";
		String pali =  readWord("Palindrom eingeben:");

		char[] CharArray = new char[pali.length()];
		CharArray = pali.toCharArray();
		//System.out.println(Arrays.toString(CharArray));
		System.out.println(convertToSmall(CharArray));
		System.out.println(isPalindrome(CharArray, 0, CharArray.length-1));

	}
	//b

	public static char[] convertToSmall(char[] CharArray) {


		for (int i = 0; i < CharArray.length; i++) {

			if (CharArray[i]<97) {
				CharArray[i] += 32;

			}

		}
		return CharArray;
	}
	public static boolean isPalindrome(char[] CharArray, int k, int j ) {

		if (j==0 || k == CharArray.length-1) {
			
			if (CharArray[k] == CharArray[j]) {
				return true;
				}
				else {
					return false;
				}
					
		}
		if (CharArray[k] == CharArray[j]) {

		 isPalindrome(CharArray, k+1, j-1);
		}
		else {
			return false;
		}
	return true;
	}
}
