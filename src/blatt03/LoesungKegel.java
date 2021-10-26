package blatt03;
import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungKegel(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(610,417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungKegel();
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
    	
    	
    	this.meinKegel(g); // Aufruf der selbst programmierten Methode
    }
   
	/** 
	 * Hier bitte die Lösung, um den Kegel zu zeichnen
	 * 
	 */
   public void meinKegel(Graphics g){
	   // TODO
   } 
}