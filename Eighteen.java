/**Create an array of size 10
	Fill the array with factorials of numbers from 1 to 10
	Display the array**/

import java.util.*;
public class Eighteen {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[] = new int [10];
		for (int i = 0; i < 10; i++) {
			a[i] = factorial(i + 1);
		}
		j.p("\n");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static int factorial(int n) {
		int f = 1;
		for (int i = 2; i <= n; i++) {
			f *= i;
		}
		return f;
	}
}