package blatt03;

public class SchleifenUebung {
	public static void main(String[] args) {

		final double START = -4.0;
		final double END = 4.0;
		final double STEP = 0.5;

		for (double i=START; i <= END; i+=STEP) {
			System.out.println("x, x^2: " + i + ", " + Math.pow(i, 2));
		}	
		for (double i=START; i <= END; i+=STEP) {
			System.out.println("x, sin(x), cos(x): " + i + ", " + Math.sin(i) + ", " + Math.cos(i));
		}	
	}
}