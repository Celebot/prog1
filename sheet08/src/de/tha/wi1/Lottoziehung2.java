package de.tha.wi1;

import java.util.Random;

public class Lottoziehung2 {

    private int[] gezogen = new int[6];
    private int superzahl;

    public Lottoziehung2() {
        Random rand = new Random();

        int counter = 0;
        while (counter < 6) {
            int n = rand.nextInt(49) + 1; // 1–49

            if (!bereitsGezogen(n, counter)) {
                gezogen[counter] = n;
                counter++;
            }
        }

        superzahl = rand.nextInt(10); // 0–9
    }

    // prüft nur intern
    private boolean bereitsGezogen(int zahl, int bis) {
        for (int i = 0; i < bis; i++) {
            if (gezogen[i] == zahl) {
                return true;
            }
        }
        return false;
    }

    // Getter für die 6 Zahlen
    public int[] getNumbers() {
        return gezogen.clone();
    }

    // Getter für Superzahl
    public int getSuperNumber() {
        return superzahl;
    }

    // Test
    public static void main(String[] args) {

        Lottoziehung2 run1 = new Lottoziehung2();
        Lottoziehung2 run2 = new Lottoziehung2();

        System.out.println("Ziehung 1:");
        for (int n : run1.getNumbers()) {
            System.out.print(n + " ");
        }
        System.out.println(" | Superzahl: " + run1.getSuperNumber());

        System.out.println("\nZiehung 2:");
        for (int n : run2.getNumbers()) {
            System.out.print(n + " ");
        }
        System.out.println(" | Superzahl: " + run2.getSuperNumber());
    }
}
