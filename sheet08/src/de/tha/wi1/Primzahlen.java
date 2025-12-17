package de.tha.wi1;

public class Primzahlen {

	private int[] primes ;

	private int bound;

	private int next;

	public Primzahlen (int bound) {
		primes = null;
		next = 0;
		this.bound=bound;
		generatePrimes();
		
	}	

	public int[] getPrimes() {
		return primes;	

	}
	public int getNextPrime() {
		return (primes == null || next >= primes.length) ? -1 : primes[next++];


	}

	public void generatePrimes() {
		boolean[] gestrichen = new boolean[bound + 1];

		gestrichen[0] = true;
		gestrichen[1] = true;

		for (int i = 2; i <= bound; i++) {

			if (!gestrichen[i]) {

				for (int j = i*2; j <= bound; j+=i) {
					gestrichen[j] = true;
				}
			}
		}
		int count = 0;
		for (int i = 2; i <= bound; i++) {
			if (!gestrichen[i]) count++;
		}
		primes = new int[count];
	    for (int i = 2, k = 0; i <= bound; i++) {
	        if (!gestrichen[i]) {
	            primes[k++] = i;
	        }
	    }

	}



	public static void main(String[] args) {
		Primzahlen p = new Primzahlen(30);

        System.out.println("Alle Primzahlen:");
        for (int n : p.getPrimes()) System.out.print(n + " ");

        System.out.println("\n\nEinzeln:");
        int n;
        while ((n = p.getNextPrime()) != -1)
            System.out.print(n + " ");
    }


	

}
