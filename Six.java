//Array of size n and print all the prime numbers

import java.util.*;
public class Six {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		j.p("n =");
		n = sc.nextInt();
		int a[] = new int [n];
		for (int i = 0; i < n; i++) {
			j.p("Number: ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (prime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	public static boolean prime(int n) {
		boolean ans = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				ans = false;
				break;
			}
		}
		return ans;
	}
}