package blatt05;

public class DreiChinesen {

/*	static public class Huhn {
		private String name;
		private Boolean hungrig = true;

		// konstruktor
		Huhn(String n){
			name = n;
		}
	} */
	
/*	static public class Bauer {
		private String name;
		
		Bauer(String n) {
			name = n;
		}
		void fuettern(Huhn h) {
			h.hungrig = false;
			System.out.println(h.hungrig);
		}
	} */
	
	final static String text = "Drei Chinesen mit dem Kontrabass\n" 
	+ "saßen auf der Straße und erzählten sich was.\n"
	+ "Da kam ein Mann: Ja was ist denn das?\n"
	+ "Drei Chinesen mit dem Kontrabass.\n\n"
	;  
	 static void printCentered(String t) {
		 String lines[] = t.split("\\n");

		 // finde die längste zeile
		 int indexLaengste = 0;
		 for (int i=0;i<lines.length;i++){
			 if (lines[i].length() > lines[indexLaengste].length()) {
				indexLaengste = i; 
				}
			 }
		 // eingerückt printen
		 for (int i=0;i<lines.length;i++){	
			 if (i == indexLaengste) {
				 System.out.println(lines[i]);
				 }
			 
			 else {
				 String output = "";
				 // spaces einfuegen so oft wie die differenz zwischen der aktuellen zeile und der laengsten
				 int diff = lines[indexLaengste].length() - lines[i].length();
				 
				 for (int j=0; j<diff/2; j++) {
					 output += " ";
				 } 
				 output += lines[i];
				 System.out.println(output);
				}
			 }
		 } 

	 static String changeVowels(String t, String vowel) {
		 // mithilfe replaceall methode und regex alle vokale mit dem argument vowel ersetzen
		 return t.replaceAll("[aeiouAEIOU]", vowel);
	 }
	 
	 public static void main(String[] args) {
		 printCentered(changeVowels(text, "ä"));	
		 /*
		 Bauer bauer = new Bauer("Walter");
		 Huhn h1 = new Huhn("Heidrun");
		 Huhn h2 = new Huhn("Heike");
		 Huhn h3 = new Huhn("Hannelore");
		 
		 Huhn huehner[] = {h1, h2, h3};
		  
		 for (int i=0;i<3;i++) {
			 bauer.rufeHuhn(huehner[i]);
			 bauer.fuettern(huehner[i]);
			 System.out.println(huehner[i].getHungring());
		 }
		 
		 bauer.fuettern(h1);
		 
		 bauer.berechneAnzahlHungrigerHuehner();
		 */
	 }
}

