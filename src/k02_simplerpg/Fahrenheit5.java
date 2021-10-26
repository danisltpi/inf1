// Datei Fahrenheit5.java
package k02_simplerpg;

public class Fahrenheit5 {
	/**
	 * Geg.: Temperaturbereich in °F <br/>
	 * Ges.: Temperaturliste in °C, mit Hinweis fuer Schal
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		for (int fahrenheit = 0; fahrenheit <= 250; fahrenheit = fahrenheit + 25)
		// Initialisierung ; Bedingung ; Fortsetzung
		{
			int celsius = 5 * (fahrenheit - 32) / 9;
			String hinweis;
			if (celsius < 0)
				hinweis = "Schal noetig. ";
			else
				hinweis = "Kein Schal.  ";

			System.out.println(hinweis + fahrenheit + "°F = " + celsius + "°C");
		}
	}
}