/**Print all 4 digit superprimes
	abcd is superprime if abcd, abc, ab and a are all prime**/

import java.util.*;
public class ThirtyThree {
	
	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			if (superprime(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	public static boolean superprime(int n) {
		boolean flag = true;
		while (n > 0) {
			if (prime(n)) {
				n /= 10;
				continue;
			}
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static boolean prime(int n) {
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