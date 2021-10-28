package blatt02;

import java.util.Scanner;

public class Konto {
	public static void main(String[] args) {

		double zins = 2.0;
		double guthaben;
		final double ersparnis = 1000;	
		int jahre = 0;
		double betrag = 1000;
		

		
		
		// Befragung
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wähle 1 um einen Sparplan mit Zinseszins zu berechnen");
		System.out.println("Wähle 2 um einen Sparplan ohne Zinseszins zu berechnen");	
		System.out.println("Wähle 3 um die Erreichung eines Sparplans mit Zinseszins zu berechnen");
		int auswahl = sc.nextInt();		
	
		

		
		//TM1
		if (auswahl == 1) {	
			System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");
			guthaben = sc.nextDouble();
			System.out.println("Bitte geben Sie den Zinssatz(in %) ein: ");
			zins = sc.nextDouble();
			System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
			jahre = sc.nextInt();
			for (int i=1; i < (jahre+1); i++) {	
				System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);	
				guthaben += ersparnis + guthaben * (zins * 0.01);
			}
		}
		//TM2
		if (auswahl == 2) {
			System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");
			guthaben = sc.nextDouble();
			System.out.println("Bitte geben Sie den Zinssatz(in %) ein: ");
			zins = sc.nextDouble();
			System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
			jahre = sc.nextInt();
			for (int i=1; i<=jahre; i++) {
				System.out.println("Guthaben nach dem " + i + ". Jahr: " + betrag);		
				betrag = (betrag + ersparnis) + ersparnis * i * 0.01 * zins;
				}
		}
		//TM3
		if (auswahl == 3) {				
			System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");
			guthaben = sc.nextDouble();
			System.out.println("Bitte geben Sie den Zinssatz(in %) ein: ");
			zins = sc.nextDouble();
			System.out.println("Bitt geben Sie Ihr Sparziel ein: ");
			double sparziel = sc.nextDouble();
			while (guthaben < sparziel) {
				guthaben = guthaben + (guthaben * (zins * 0.01));
				guthaben = guthaben + ersparnis;
				jahre++;
			}
			System.out.println("Guthaben nach dem " + jahre + ". Jahr: " + guthaben);
		}
		
	}
}