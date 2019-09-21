package domaci08052019;

import java.util.Scanner;

public class DomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata:");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Unesite elemente: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sortiraj(a);
	}

	static void sortiraj(int[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[j] < niz[i]) {
					int temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
		for (int i = 0; i < niz.length; i++) {
			int prvi = niz[i];
			int drugi;
			if (i == niz.length - 1) {
				drugi = prvi;
			} else {
				drugi = niz[i + 1];
			}

			int razlika = drugi - prvi;
			if (razlika > 1) {
				System.out.println("Nedostaje broj: " + (niz[i] + 1));
			}
		}

	}

}
