package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task03 {

	public static void main(String[] args) {
		int money = readInteger("Bitte gewünschten Ausgabebetrag auf 5€ genau angeben:");
		int zweihunni = money/200;
		int hunni= (money%200) /100;
		int fufi= (money%200%100) /50;
		int zwani= (money%200%100 %50)/20;
		int zehner=(money%200%100 %50 %20) /10;
		int fuenfer= (money%200%100 %50 %20%10) /5;
		System.out.println("200-Euro Scheine:"+ zweihunni);
		System.out.println("100-Euro Scheine:"+ hunni);
		System.out.println("50-Euro Scheine:"+ fufi);
		System.out.println("20-Euro Scheine:"+ zwani);
		System.out.println("10-Euro Scheine:"+ zehner);
		System.out.println("5-Euro Scheine:"+ fuenfer);

	}

}
