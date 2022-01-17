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
		System.out.println(new IntegerValueObject(2).mul(3).add(4).mul(5));
		
		// Aufgabe 10.6
		SysTextFile stf = new SysTextFile("Hello", "java");
		stf.setText("lmao");
		System.out.println(stf);
		
		// Aufgabe 10.7.5 
		SysTextFile hello = new SysTextFile("Hello", "java");
		hello.setText("public class HelloWorld{/*...*/}");
		SysTextFile test = new SysTextFile("Test", "java");
		SysTextFile prt = new SysTextFile("PrintClass", "java");
		
		SysDirectory testDir = new SysDirectory("TEST", stf);
		SysDirectory srcDir = new SysDirectory("SRC", hello, test, prt, testDir);
		SysTextFile todo = new SysTextFile("Todos", "txt");
		SysTextFile toget = new SysTextFile("Eggs", "rtm");
		SysDirectory txtDir = new SysDirectory("txt", todo, toget);
		SysDirectory home = new SysDirectory("home", srcDir, txtDir);
		srcDir.setName("SRC");
		toget.setName("Einkaufsliste");
		home.setName("HOME");
		home.setOwner("brul0001");
		System.out.printf("%s\n", home );	

		System.out.println("--------------------------");		
		System.out.println(home.dirStructure(""));
	}
}
