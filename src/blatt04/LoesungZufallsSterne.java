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
	   // 24 blaue Strahlen, dazwischen jeweils pinke Strahlen (insg. 24 pinke)
	   // radius
	   float rPink = r / 2;
	   int anzahlStrahlen = 24 * 2;
	   
	   for (int i = 0; i <= anzahlStrahlen; i++) {
		  double phi = (i * (2 * Math.PI) / anzahlStrahlen); 		  
		  int x;
		  int y;

		  // pinke strahlen
		  if (i % 2 == 1) {
			  g.setColor(Color.MAGENTA);
			  x = (int) (rPink * Math.cos(phi)); 
			  y = (int) (rPink * Math.sin(phi)); 
		  }
		  else {
			  g.setColor(Color.BLUE);
			  x = (int) (r * Math.cos(phi)); 
			  y = (int) (r * Math.sin(phi)); 
		  }
		  
		  // verschiebung in die mitte
		  x += midX;
		  y += midY; 
		  
		  g.drawLine(midX, midY, x, y);
	   }
    }
    
    /**(int) Math.random() * this.getWidth(), Math.random() * this.getHeight()
     * 2. Teilaufgabe: Sterne zufällig platzieren mit zufälligem Radius
     */
   
   public void meineZufallsSterne(Graphics g){
   	// TODO 60 Sterne zufällig groß und zufällig verteilt zeichnen
	   int ix;
	   int iy;
	   for (int i=1; i<=60; i++) {
		   ix = (int) (Math.random() * this.getWidth());
		   iy = (int) (Math.random() * this.getHeight());
		   zeichneEinenStern(g, ix, iy, 50);
	   }
   } 
}
