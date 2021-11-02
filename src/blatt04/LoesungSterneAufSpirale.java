package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Zusatzaufgabe:
 * Klasse für das Zeichnen von Sternen entlang einer Spirale.
 * Wir leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu können.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungSterneAufSpirale(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024,768);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungSterneAufSpirale();
    }
   
	/** 
	 * Bitte ab hier Lösung zum Zeichnen der Sterne auf der Spirale entwickeln.
	 */
    public void paint(Graphics g){

   } 
}
