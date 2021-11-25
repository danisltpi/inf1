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
	
	public static long j = 1;
	public static void prtSqr1234(long n) {
		if (j <= n) {
			System.out.print(j * j + ", ");
			j++;
			prtSqr1234(n);
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
	public static void main(String[] args) {
		prt2468(100);
		// prt1234(Long.parseLong(args[0]));
		}	
}