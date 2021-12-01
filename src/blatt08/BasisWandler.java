package blatt08;

public class BasisWandler {
	/** Methode zum Ausgeben einer Zahl in einer anderen Basis 
	* (aus der Vorlesung): 
	*  @param n: Zahl, die gewandelt wird
	*  @param k: Basis, in der ausgegeben wird
	*/
	void zurBasisKausgeben(long n, long k)  { // n = 255, k = 2
		if(n <= 0L){ // Rekursionsbasis
			System.out.println();
		}
		else { 
			zurBasisKausgeben(n / k, k); // n / k = 127, k = 2
			System.out.print(n % k); // n % k = 1, rekursionstiefe ist 8
		}
	}

	final int ZIFFER_MAX = 'Z' - 'A' + 10;
	/** Zahl in Ziffer wandeln. 
	 * 
	 * @param i: zu wandelnde Zahl
	 * @return Zeichen, das der Zahl entspricht ('0', '1', ..., '9', 'A', ..., 'Z') 
	 */
	char intNachZiffer(int i) {
		assert 0 <= i && i <= ZIFFER_MAX;
		char ret;
		if(0 <= i && i <= 9) ret = (char)(i + '0');
		else if(10 <= i && i <= ZIFFER_MAX) ret = (char)(i - 10 +  'A');
		else ret = '-'; // Unzulässige Zahl
		return ret;
	}
	
	/** Zahl in andere Basis-Darstellung wandeln
	 * 
	 * @param n: gegebene Dezimalzahl
	 * @param k: Basis, in die gewandelt werden soll
	 * @return Zeichenkette mit einzelnen Ziffern 0 ... 9, A, ..., Z
	 */
	String s = "";
	String inBasisKwandeln(long n, int k)  {;
		if (n <= 0L) {	
			return s;
		}
		else {
			inBasisKwandeln(n / k, k);
			s += this.intNachZiffer((int) n % k);
		}	
		return s;
	}
	public static void main(String[] args) {
		BasisWandler bwr = new BasisWandler();

		Object[][] tests = { 
		// Dimensionen: [n Tests][String_Basis_k, Basis k, Entsprechende Dezimalzahl]
				{"42",  10,  42},
				{"1101", 2,  13},
				{"I",   20,  18},
				{"JJ",  20, 399},
				{"1000",20,8000},
				{"V",   32,  31},
				{"VV",  32,1023},
				{"100", 32,1024},
		};
		// Tests, ob Wandlung Dezimal -> Basis_k OK:
		for(Object[] test : tests) {
			String wunschErgebnis = test[0].toString();
			int basis = (int)test[1];
			long dezimalZahl = Long.valueOf(test[2].toString());
			String resultat = bwr.inBasisKwandeln(dezimalZahl, basis);
			bwr.s = ""; // mein ding um rekursion zu benutzen
			System.out.printf("%6d zur Basis %2d ist %8s (%s)\n", 
					dezimalZahl, basis, resultat, 
					(resultat.equals(wunschErgebnis) ? "OK" : "falsch") );
		}	
	}
}