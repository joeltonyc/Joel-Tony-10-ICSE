/**Print all the 3-digit buzz numbers and armstrong numbers**/

import java.util.*;
public class ThirtyFive {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (buzznumber(i) || armstrongnumber(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	public static boolean buzznumber(int n) {
		if (n % 7 == 0 && n % 10 == 7) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean armstrongnumber(int n) {
		int s = 0, nC = n;
		while (n > 0) {
			int d = n % 10;
			s += (d * d * d);
			n /= 10;
		}
		if (nC == s) {
			return true;
		}
		else {
			return false;
		}
	}
}