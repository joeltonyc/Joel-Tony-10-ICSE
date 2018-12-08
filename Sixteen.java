/**Sort an array in descending order using bubble sort**/

import java.util.*;
public class Sixteen {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("n = ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Number: ");
			a[i] = sc.nextInt();
		}
		//Sort
		int t;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i - 1); j++) {
				if (a[j] < a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("\n\n\n");
			System.out.print(a[i]);
		}
	}
}