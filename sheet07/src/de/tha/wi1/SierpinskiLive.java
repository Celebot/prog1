package de.tha.wi1;

import static de.tha.tools.Window.*;

public class SierpinskiLive {

	public static void main(String[] args) {

		int width = 800;
		int height = width;
		initWindow(width, height, "Hallo Fenster");

		int tb = 800;
		int th = (int) Math.sqrt(tb * tb - tb/2 * tb/2);
		drawFilledTriangle(400, 700, tb, th, "blue");
		
		sleep(5000);
		sierpinski(400, 700 - th / 2, tb / 2, th / 2);
	}

	public static void sierpinski(int x, int y, int w, int h) {
		
		if(w < 10 || h < 10) {
			return;
		}
		
		int id = drawFilledTriangle(x, y, w, h, "white");
		setOrientation(id, 180);
		
		sleep(40);

		sierpinski(x, y - h/2, w / 2, h / 2); 		// rekursiv nach oben
		sierpinski(x - w/2, y + h/2, w / 2, h / 2); // rekursiv nach links
		sierpinski(x + w/2, y + h/2, w / 2, h / 2); // rekursiv nach rechts
		
		
	}
	
	
}