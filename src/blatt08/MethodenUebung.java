package blatt08;
import java.awt.Point; 

public class MethodenUebung {

	public static int betrag(int x) {
		return Math.abs(x);
	}
	public static int roundUp(double x) {
		return (int) Math.ceil(x);
	}
	public static int roundDown(double x) {
		return (int) Math.floor(x);
	}
	public static boolean isDivisible(double x, double y) {
		return x % y == 0 ;
	}
	public static double getDistance(Point p1, Point p2) {
		double dist = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
		return dist;
	}
	public static double smallestOfThree(double x, double y, double z) {
		double smallest = x;
		if  (y > smallest) {
			smallest = y;
		}
		if (z > smallest) {
			smallest = z;
		}	
		return smallest;
	}
	
	static public void main(String[] args) {
		System.out.println(betrag(-1)); // expected 1

		System.out.println(roundUp(1.01)); // expected 2

		System.out.println(roundDown(1.9)); // expected 1
		System.out.println(roundDown(101.9)); // expected 1
		
		System.out.println(isDivisible(31, 15.5));	
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 3);
		System.out.println(getDistance(p1, p2));
		
		System.out.println(smallestOfThree(5, 4, 3));
	}
}