/*Armstrong Number*/
import java.util.*;
import java.io.*;
public class Fifty {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("Number: ");
		int n = sc.nextInt();
		System.out.println("Armstrong number: " + armstrongNumber(n));
	}

	public static boolean armstrongNumber(int n) {
		int s = 0, nC = n;
		while (n > 0) {
			int d = n % 10;
			s += (d * d * d);
			n /= 10;
		}
		return (s == nC) ? true : false;
	}
}