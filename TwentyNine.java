/**Variables
		int n, remainder, sum, count
	Methods
		accept() - Input
		sum() - Sum of digits
		frequency() - Frequency of digits**/

import java.util.*;
public class TwentyNine {
	
	public static Scanner sc = new Scanner(System.in);
	public static int n, r, s, c;

	
	public static void accept() {
		j.p("n = ");
		n = sc.nextInt();
	}

	public static void sum() {
		int nC = n;
		while (nC > 0) {
			r = nC % 10;
			s += r;
			nC /= 10;
		}
		System.out.println("Sum of digits = " + s);
	}

	public static void frequency() {
		int nC = n;
		r = -1;
		for (int i = 0; i <= 9; i++) {
			c = 0;
			nC = n;
			while (nC > 0) {
				r = nC % 10;
				if (r == i) {
					c++;
				}
				nC /= 10;
			}
			System.out.printf("Frequency of %d: %d\n", i, c);
		}
	}
}