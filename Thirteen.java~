/**Bubble sort**/

import java.util.*;
public class Thirteen {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("n = ");
		int n = sc.nextInt();
		System.out.println("\n");
		int a[] = new int[n];

		//Input
		for (int i = 0; i < n; i++) {
			j.p("Number: ");
			a[i] = sc.nextInt();
		}

		//Sort
		int t;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (a.length - i - 1); j++) {
				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}

		//Output
		j.p("\n\n\tSorted array\n\n");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}