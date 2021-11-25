package blatt08;

public class prt1234 {
	
	public static long i = 1;
	public static void recursiveSimplerTask(long n) {	
		System.out.print(i + ", ");
		i++;
		if (i <= n) {
			recursiveSimplerTask(n);
			}	
	}
	public static void main(String[] args) {
		recursiveSimplerTask(Long.parseLong(args[0]));
		}	
}