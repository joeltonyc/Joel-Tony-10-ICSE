/**Series
	1 1 1 2 2 3 4 5 7 9 12 16 21
	d = a + b**/

import java.util.*;
public class TwentyFour {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("n = ");
		int n = sc.nextInt();
		int co = 0;
		int a, b, c, d = 0;
		a = b = c = 1;
		System.out.print(a + "\t" + b + "\t" + c + "\t");
		while (co < (n - 3)) {
			d = a + b;
			System.out.print(d + "\t");
			a = b;
			b = c;
			c = d;
			co++;
		}
	}
}