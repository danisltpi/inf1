package blatt08;

public class MethodenUebung {
	
	public static void main(String[] args) {
		System.out.println(betrag(-1)); // expected 1
		System.out.println(roundUp(1.5)); // expected 2
		System.out.println(roundDown(1.5)); // expected 1
	}
	public static int betrag(int i) {
		return Math.abs(i);
	}
	public static double roundDown(double i) {
		return Math.floor(i);
	}
	public static double roundUp(double i) {
		return Math.round(i);
	}
}