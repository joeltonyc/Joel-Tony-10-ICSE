/**Menu Driven
	Check if:
		Armstrong
		Palindrome**/

import java.util.*;
public class TwentyFive {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("1. Armstrong Number\n2. Palindrome Number\n\n");
		boolean f = false;
		int input, n;
		do {
			j.p("Choice: ");
			input = sc.nextInt();
			switch (input) {
				case 1:
					j.p("\nn = ");
					n = sc.nextInt();
					f = true;
					System.out.println("\nArmstrong Number: " + armstrong(n));
					break;
				case 2:
					j.p("\nn = ");
					n = sc.nextInt();
					f = true;
					System.out.println("\nPalindrome Number: " + palindrome(n));
					break;
			}
		} while (!f);
	}

	public static boolean armstrong(int n) {
		int nC = n, s = 0, d;
		while (n > 0) {
			d = n % 10;
			s += (d * d * d);
			n /= 10;
		}
		return ((s == nC) ? true : false);
	}

	public static boolean palindrome(int n) {
		int nC = n, s = 0, d;
		while (n > 0) {
			d = n % 10;
			s *= 10;
			s += d;
			n /= 10;
		}
		return ((s == nC) ? true : false);
	}
}