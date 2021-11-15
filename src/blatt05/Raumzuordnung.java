package blatt05;

import blatt05.Person;

/** Beispiel für Referenzen: Klasse für Mitarbeiter-Raumzuordnung */
public class Raumzuordnung {
	private Raum raum;		// Referenz auf Raum
	private Person nutzer;	// Referenz auf Nutzer/in
	// TODO Grund für Zuordnung (z.B. "Büroraum", "Labor") als Zeichenkette ergänzen. 
	//		Darf nicht NULL sein und muss mindestens aus 3 Zeichen bestehen. 
	//		Bitte auch passende Zugriffsmethode und zusätzlichen Konstruktor 
	//		mit Zuordnungsgrund hinzufügen.
	private String grund;
	
	/** Konstruktor */
	public Raumzuordnung(Raum raum, Person nutzer) {
		// TODO: prüfen, dass jeweils nicht null
		if (raum != null && nutzer != null) {
			this.raum = raum; this.nutzer = nutzer;
		}
	}
	
	// Konstruktor mit Zuordnungsgrund
	public Raumzuordnung(Raum raum, Person nutzer, String grund) {
		this.raum = raum; this.nutzer = nutzer; 
		if (grund.length() >= 3) {			
			this.grund = grund;
		}
		else {
			System.err.println("Der Zuordnungsgrund muss aus mindestens 3 Zeichen bestehen.");
		}
	}
	
	public void print() {
		this.getNutzer().print();
		System.out.print(" nutzt den Raum: ");
		this.getRaum().print();
	}
	
	Raum getRaum() {
		return this.raum;
	}
	
	Person getNutzer() {
		return this.nutzer;
	}
	
	String getGrund() {
		return this.grund;
	}
	
	public static void main(String[] a) { 
		// Bröckl nutzt den Raum E 212a
		Person ub = new Person("Ulrich", "Bröckl");
		Raum e212a = new Raum("e 212a", 2);
		Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub);
		ub2e212a.print();	

		// Bröckl nutzt außerdem den Raum E 201
		Raumzuordnung ub2e201 = new Raumzuordnung(
				new Raum("e 201", 77, true), // keine Zwischenvariable für e201 nötig...
				ub);
		// Den Raum dieser Zuordnung ausgeben:
		System.out.print("\n     Außerdem: ");
		ub2e201.getRaum().print();
		System.out.println("\n");
		
		// Vogelsang nutzt den Raum E 209
		Raumzuordnung hv2e209 = new Raumzuordnung(
				new Raum("e 209", 3),
				new Person("Holger", "Vogelsang"));
		hv2e209.print();
		
	}

}
