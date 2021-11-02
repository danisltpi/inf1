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
   } 
}