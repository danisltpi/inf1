package blatt10;
public class IntegerValueObject {
	private final int i;

	private IntegerValueObject(int i) {
		this.i = i;
	}

	/**
	 * Werte zusammenzählen
	 * @param j zweiter Summand
	 * @return this.i + j als neues Value-Objekt
	 */
	IntegerValueObject add(int j) {
		return new IntegerValueObject(this.i + j);
	}

	/**
	 * Werte ausmultiplizieren
	 * @param j zweiter Faktor
	 * @return this.i * j als neues Value-Objekt
	 */
	IntegerValueObject mul(int j) {
		return new IntegerValueObject(this.i * j);
	}

	/**
	 * Objekt als String zurückgeben
	 * @param j Wert der als String zurückgegeben wird
	 * @return String
	 */
	public String toString() {	
		return String.valueOf(this.i);
	}
	
	public static void main(String[] args) {
		System.out.println(new IntegerValueObject(2).mul(3).add(4).mul(5).toString() );
	}
}
