package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungStern(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungStern();
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
    	
    	
    	this.meinStern(g); // Aufruf der selbst programmierten Methode
    }
	/** 
	 * Hier bitte die Lösung, um den Stern zu zeichnen
	 * 
	 */
   public void meinStern(Graphics g){
	   // TODO
	   // 24 blaue Strahlen, dazwischen jeweils pinke Strahlen (insg. 24 pinke)
	   
	   // radius
	   int r = 150;
	   float rPink = r / 2;
	   int anzahlStrahlen = 24 * 2;
	   
	   for (int i = 0; i <= anzahlStrahlen; i++) {
		  double phi = (i * (2 * Math.PI) / anzahlStrahlen); 		  
		  int x;
		  int y;

		  // pinke strahlen
		  if (i % 2 == 1) {
			  g.setColor(Color.MAGENTA);
			  System.out.println(rPink);
			  x = (int) (rPink * Math.cos(phi)); 
			  y = (int) (rPink * Math.sin(phi)); 
		  }
		  else {
			  g.setColor(Color.BLUE);
			  x = (int) (r * Math.cos(phi)); 
			  y = (int) (r * Math.sin(phi)); 
		  }

		  
		  // verschiebung in die mitte
		  x += this.getWidth() / 2;
		  y += this.getHeight() / 2; 
		  
		  g.drawLine(this.getWidth() / 2, this.getHeight() / 2, x, y);  
	   }
   } 
}