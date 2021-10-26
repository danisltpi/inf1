package blatt02;

import java.util.Scanner;

public class Konto {
	public static void main(String[] args) {

		double zins = 2.0;
		double guthaben;
		final double ersparnis = 1000;	
		int jahre = 30;
		
		// Befragung
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr Startguthaben ein: ");
		guthaben = sc.nextDouble();
		System.out.println("Bitte geben Sie den Zinssatz(in %) ein: ");
		zins = sc.nextDouble();
		System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein: ");
		jahre = sc.nextInt();

		System.out.println(guthaben);
		
		for (int i=1; i < (jahre+1); i++) {	
			System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);	
			guthaben += guthaben * (zins * 0.01);
			guthaben += ersparnis;	
		}
		for (int i=1; i<=30; i++) {
			System.out.println("Guthaben nach dem " + i + ". Jahr: " + guthaben);
			
		}
	}
}