package de.tha.wi1;

import static de.tha.tools.Window.*;

import de.tha.tools.Window;





public class Task04 {
	
	public static void main(String[] args) {
		int b = 800;
		int h = 800;
		int z = 8;
		int size= b/z;
		int platz = 100; 
		
		initWindow(b,h,"Schachbrett");
		
		drawCheckBoard(h, b, size, platz);
	}
	public static void drawCheckBoard(int col,int row, int size, int platz) {
		int count = 0;
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				if ((count+i)%2==0) {
					drawFilledRectangle(size*j, size*i, size, size, "black");
				}
				else
				drawFilledRectangle(size*j, size*i, size, size, "white");
				count++;	
			}
			count++;
		}
		
		
		
		
		
		
	}
}
