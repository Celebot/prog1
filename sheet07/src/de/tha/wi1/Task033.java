package de.tha.wi1;

import static de.tha.tools.Window.*;

public class Task033 {

	public static void main(String[] args) {

		int height = 800;
		int width = 800;

		initWindow(width, height, "Schneeflocke");

		int size = 600;               // großes Quadrat, damit man was sieht
		int startX = (width - size) / 2;
		int startY = (height - size) / 2;

		//drawFilledRectangle(startX, startY, width, height, "blue");

		
		kreuzsnowflake(startX, startY, size, 2);
		sleep(5000);
	

	}

	
	public static void kreuzsnowflake(int x,int y, int s, int depth) {

		if (depth==0||s<3) {
			drawFilledRectangle(x, y, s, s, "blue");
			return;

		}
		int newS = s/3;
		kreuzsnowflake(x+newS, y, newS, depth-1);//oben mitte
		kreuzsnowflake(x, y+newS, newS, depth-1);//linksmitte
		kreuzsnowflake(x+newS, y+newS, newS, depth-1);// mitte mitte
		kreuzsnowflake(x+2*newS, y+newS, newS, depth-1);// rechts mitte
		kreuzsnowflake(x+newS, y+2*newS, newS, depth-1);// unten mitte
		
	}
}
