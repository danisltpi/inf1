package blatt05;

public class Huhn {
	private String name;
	private Boolean hungrig = true;
	private static int anzahlHuehner;

	// konstruktor
	Huhn(String n){
		name = n;
		anzahlHuehner += 1;
	}
	
	// hungrig setter
	void setHungrig(Boolean b) {
		this.hungrig = b;
	}
	
	Boolean getHungring() {
		return this.hungrig;
	}
	
	// name getter
	String getName() {
		return this.name;
	}
	
	static int getAnzahlHuehner() {
		return anzahlHuehner;
	}

}
