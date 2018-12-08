/*Print all prime numbers in an array*/
import java.util.*;
import java.io.*;
public class FiftyTwo{
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("n = ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (prime(a[i])) {
				System.out.print(a[i] + "\t");
			}
		}
	}

	public static boolean prime(int n) {
		if (n == 1 || n == 2) {
			return true;
		}
		boolean f = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				f = false;
				break;
			}
		}
		return f;
	}
}