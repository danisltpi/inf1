package blatt06;

import java.util.Arrays;

public class ArrayStatistik {

	public static void main(String[] args) {
		int liste[] = {35, 7,  90, 26, 92, 54, 24, 65,  2, 67, 43, 26, 80, 92, 7, 40, 67,
					   66, 31, 45, 7, 100, 96, 93, 12, 20, 57, 22, 62, 51};

		// berechne arithmetisches mittel
		int sum = 0;
		for (int i : liste) {	
			sum += i;
		}
		double mittel = sum / liste.length;
		System.out.println("Arithmetischer Mittelwert: " + mittel);
		
		// finde minimal und maximal wert
		Arrays.sort(liste);
		System.out.println("Minimalster Wert: " + liste[0]);
		System.out.println("Maximalster Wert: " + liste[liste.length-1]);
		
		// finde median
		// da die liste die länge 30 hat, muss der median der mittelwert der beiden mittlerer werte an position 31/2  = 15.5 also 15 und 16	
		// (n+1)/2 : position des median elements 
		int midIndex = (liste.length + 1) / 2;
		System.out.println("Median: " + (liste[16] + liste[17])/2);
		System.out.println("Alternativer Median: " + liste[midIndex + 1]);
		
		// statistik mit mehrdimensionale arrays
		double statistik[][] = {{0, 350, 1500, 5000}, {74.4, 18.2, 6.1, 1.3}};
		double erwartungswert = 0;

		for (int i = 0; i<statistik[0].length; i++) {
			erwartungswert += statistik[0][i] * (statistik[1][i] / 100);
		}
			System.out.println("Erwartungswert: " + erwartungswert);
	}
}





