package blatt05;

public class Bauer {
	private String name;
	private int anzahlGefuetteterHuehner;

	Bauer(String n) {
		name = n;
	}

	void fuettern(Huhn h) {
		if (h.getHungring()) {	
			h.setHungrig(false);
			this.anzahlGefuetteterHuehner += 1; 
		}
	}
	void rufeHuhn(Huhn h) {
		System.out.println(h.getName());
	}
	void berechneAnzahlHungrigerHuehner() {
		System.out.println(Huhn.getAnzahlHuehner() - this.anzahlGefuetteterHuehner);
	}
}
