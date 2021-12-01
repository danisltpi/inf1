package blatt08;

public class recursiveSimplerTask {
	
	public static long i = 1;
	public static void prt1234(long n) {	
		if (i <= n) {
			System.out.print(i + ", ");
			i++;
			prt1234(n);
		}	
	}
	
	public static void prt1234_2(long n) {
		if (n > 0) {
			prt1234_2(n-1);
			System.out.print(n + ", ");
		}
	}
	
	public static long j = 1;
	public static void prtSqr1234(long n) {
		if (n > 0) {
			prtSqr1234(n - 1);
			System.out.print(n * n + ", ");
		}
	}

	public static long k = 1;
	public static void prt2468(long n) {	
		if (k <= n) {
			if (k % 2 == 0) {				
				System.out.print(k + ", ");
			}
			k++;
			prt2468(n);
		}	
	}

	static void xxx(long n) {
		if(n > 0L) { // rekursionsbasis
			System.out.println(n);
			xxx(n-1); // rekursionsvorschrift
		}
		else {} 
	}	                
		
	static void iterativeXxx(long n) {
		while (n > 0L) {
			System.out.println(n);
			n--;
		}	
	}

	public static void main(String[] args) {
		prt2468(100);
		// prt1234(Long.parseLong(args[0]));
		xxx(100);

		}	
}