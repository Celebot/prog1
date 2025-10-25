package de.tha.wi1;

import static de.tha.tools.Input.*;

public class Task02 {

	public static void main(String[] args) {
		float length;
		float height;
		float radius;
		float width;
		float area;
		double pi = Math.PI;
		double Kreis;
		String geoform= readWord("Geben sie eine Form ein:");
		if (geoform.equals("Rechteck")) {
			System.out.println("Auswahl Rechteck");

			length = readFloat("Gebe länge ein in m");
			width = readFloat("Gebe breite ein in m");
			area = length*width;
			System.out.format("Die Fläche der Form beträgt: %.2f m²%n", area);


		} else if (geoform.equals("Quadrat")) {
			System.out.println("Auswahl Quadrat");

			length = readFloat("Gebe länge ein in m");
			area = length*length;
			System.out.format("Die Fläche der Form beträgt: %.2f m²%n", area);

		} else if (geoform.equals("Kreis")) {
			System.out.println("Auswahl Kreis");

			radius = readFloat("Gebe länge ein in m:");
			Kreis = radius*radius*pi;
			System.out.format("Die Fläche der Form beträgt: %.2f m²%n", Kreis);


		} else if (geoform.equals("Dreieck")){
			System.out.println("Auswahl Dreieck");

			width = readFloat("Gebe länge ein in m");
			height = readFloat("Gebe höhe ein in m");
			area = height*width;
			System.out.format("Die Fläche der Form beträgt: %.2f m²%n", area);



		} else {System.out.println("Falsche Eingabe");
		}
	
	}

}


