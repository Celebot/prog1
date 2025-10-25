package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task01 {

	public static void main(String[] args) {
		String word = readWord("geben sie ein Wort ein:");
		//if (word=="Programmieren") {
		if(word.equals("Programmieren")) {
			System.out.println("stimmt");
		}else{System.out.println("stimmt nicht");
			}
	}

}
