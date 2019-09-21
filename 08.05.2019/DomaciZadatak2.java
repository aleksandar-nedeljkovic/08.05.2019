package domaci08052019;

import java.util.Scanner;

public class DomaciZadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Unesite elemente: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		int[] minimax = minmax(a);
		System.out.println("Minimum i Maksimum unetog niza su brojevi: ");
		for (int i = 0; i < minimax.length; i++) {
			System.out.print(minimax[i] + " ,");
		}
	}

	static int[] minmax(int[] niz) {
		int max = niz[0];
		int min = niz[0];
		int[] minMax = new int[2];
		for (int i = 0; i < niz.length; i++) {
			if (max < niz[i]) {
				max = niz[i];
			}
		}
		for (int i = 0; i < niz.length; i++) {
			if (min > niz[i]) {
				min = niz[i];
			}
		}
		minMax[0] = min;
		minMax[1] = max;
		return minMax;

	}

}
