package de.tha.wi1;

import static de.tha.tools.Window.*;

public class Task03 {

	public static void main(String[] args) {

		int height = 800;
		int width = 800;

		initWindow(width, height, "Schneeflocke");

		int size = 600;               // großes Quadrat, damit man was sieht
		int startX = (width - size) / 2;
		int startY = (height - size) / 2;

		//drawFilledRectangle(startX, startY, width, height, "blue");

		
		snowflake(startX, startY, size, 3);
		sleep(5000);
	

	}

	public static void snowflake(int x,int y, int s, int depth) {


		if (depth==0||s<3) {
			drawFilledRectangle(x, y, s, s, "blue");
			return;
		}
		int newS = s/3;
		snowflake(x, y, newS, depth-1);//oben links
		snowflake(x+2*newS, y, newS, depth-1);//oben rechts
		snowflake(x+newS, y+newS, newS, depth-1);// mitte
		snowflake(x, y+2*newS, newS, depth-1);// unten links
		snowflake(x+2*newS, y+2*newS, newS, depth-1);// unten rechts
	}
	
		
	
}
