package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das zufällige Zeichnen von Sternen
 */
public class LoesungZufallsSterne extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungZufallsSterne(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024,768);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Paint-Methode. Nichts zu ändern hier. Diese Methode 
     *  wird beim Öffnen des Fensters automatisch aufgerufen. 
     *  Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     *  verändert wird. 
     *  @param g Grafik, auf die gezeichnet wird.
     *  */
    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	
    	this.meineZufallsSterne(g); // Aufruf der selbst programmierten Methode
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungZufallsSterne();
    }
   
	/** 
	 * Bitte ab hier Lösung zum Zeichnen der zufälligen Sterne entwickeln.
	 */
    /**
     * 1. Teilaufgabe: Methode, um einen Stern zu zeichnen.
     * 
     * @param g	Grafikbereich, auf dem gezeichnet wird
     * @param midX	x-Koordinate des Mittelpunkts des Sterns
     * @param midY y-Koordinate des Mittelpunkts des Sterns
     * @param r Radius des Sterns
     */
    public void zeichneEinenStern(Graphics g, int midX, int midY, int r){
    	// TODO Einen Stern mit gegebenen Parametern zeichnen
    }
    
    /**
     * 2. Teilaufgabe: Sterne zufällig platzieren mit zufälligem Radius
     */
   
   public void meineZufallsSterne(Graphics g){
   	// TODO 60 Sterne zufällig groß und zufällig verteilt zeichnen
   } 
}
