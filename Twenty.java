/**Selection Sort**/

import java.util.*;
public class Twenty {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("n = ");
		int n = sc.nextInt();
		int a[] = new int [n];

		//Input
		for (int i = 0; i < n; i++) {
			j.p("Number: ");
			a[i] = sc.nextInt();
		}

		//Sort
		for (int i = 0; i < n; i++) {
			int min = a[i];
			int t, minC = i;
			
			//Finding minimum
			for (int minI = (i + i); minI < n; minI++) {
				if (a[minI] < min) {
					min = a[minI];
					minC = minI;
				}
			}
			
			//Swap
			t = a[minC];	//t is min
			a[minC] = a[i];
			a[i] = t;
		}

		//Output
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}