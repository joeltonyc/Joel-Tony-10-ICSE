/*Print patterns
	n = 4*/

import java.io.*;
import java.util.*;
class FiftyFour {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("n = ");
		one(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		two(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		three(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		four(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		five(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		six(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		seven(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		eight(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		nine(sc.nextInt());
		j.pl("\n");
		j.p("n = ");
		ten(sc.nextInt());
		j.pl("\n");
	}

	public static void one(int n) {
		/*
		1
		21
		321
		4321
		*/
		for (int i = 0; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void two(int n) {
		/*
		1
		22
		333
		4444
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void three(int n) {
		/*
		1
		12
		123
		1234
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void four(int n) {
		/*
		4
		43
		432
		4321
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = n, c = 1; c <= i; j--, c++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void five(int n) {
		/*
		4321
		432
		43
		4
		*/
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void six(int n) {
		/*
		4321
		 321
		  21
		   1
		*/
		for (int i = 1; i <= n; i++) {
			//Spaces loop
			int s;
			for (s = 0; s < (i - 1); s++) {
				System.out.print(" ");
			}
			//Number loop
			for (int j = (n - s); j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void seven(int n) {
		/*
		   4
		  34
		 234
		1234
		*/
		for (int i = 1; i <= n; i++) {
			//Spaces loop
			for (int s = 1; s <= (n - i); s++) {
				System.out.print(" ");
			}
			//Number loop
			for (int c = 1, j = (n - (i - 1)); c <= i; c++, j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void eight(int n) {
		/*
		   1
		  2 3
		 4 5 6
		7 8 9 10
		*/
		int num = 1;
		for (int i = n, iR = 1; i > 0; i--, iR++) {
			//Spaces loop
			for (int s = 1; s <= (i - 1); s++) {
				System.out.print(" ");
			}
			//Number loop
			for (int j = 1; j <= iR; j++, num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void nine(int n) {
		/*
		   1
		  121
		 12321
		1234321
		*/
		for (int i = 1; i <= n; i++) {
			//Spaces loop
			for (int s = 1; s <= (n - i); s++) {
				System.out.print(" ");
			}
			//Number loops
				for (int j = 1; j < i; j++) {
					System.out.print(j);
				}
				for (int j = i; j >= 1; j--) {
					System.out.print(j);
				}
			System.out.println();
		}
	}

	public static void ten(int n) {
		//Pascal's Triangle
		//n = 5
		/*
		    1
		   1 1
		  1 2 1
		 1 3 3 1
		1 4 6 4 1
		*/
		//Spaces loop
		
		//Numbers loop
		for (int i = 0; i < n; i++) {
			//Spaces loop
			for (int s = 1; s <= (n - i); s++) {
				System.out.print(" ");
			}
			//Numbers loop
			for (int j = 0; j <= i; j++) {
				System.out.print(tenHelp(i, j) + " ");
			}
			System.out.println();
		}
	}

	public static int tenHelp(int n, int k) {
		int r = 1;
		if (k > n - k) {
			k = n - k;
		}
		for (int i = 0; i < k; ++i) {
			r *= (n - i);
			r /= (i + 1);
		}
		return r;
	}
}