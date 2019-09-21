package domaci08052019;

import java.util.Scanner;

public class DomaciZadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		double aritmetickasredina = aritmetickaSredina(a);
		int medijana = medijana(a);
		System.out.println("Aritmeticka sredina: " + aritmetickasredina);
		System.out.println("Medijana: " + medijana);
	}

	static double aritmetickaSredina(int[] niz) {
		double zbir = 0;
		for (int i = 0; i < niz.length; i++) {
			zbir += niz[i];
		}
		// Racunamo aritmeticku sredinu (as)
		double as = zbir / niz.length;
		return as;
	}

	static int medijana(int[] niz) {
		int med = 0;
		for (int i = 0; i < niz.length; i++) {

			// Racunamo medijanu (med)
			if (niz.length % 2 == 0) {
				int pola = niz.length / 2;
				med = (niz[pola - 1] + niz[pola]) / 2;
			} else {
				int polovina = (int) Math.ceil(niz.length / 2);

				med = niz[polovina];
			}
		}
		return med;

	}

}
