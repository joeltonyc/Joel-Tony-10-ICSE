/**Accept 10 numbers into an array
	Calculate the sum of numbers present in the odd and even positions respectively**/

import java.util.*;
public class Seventeen {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			j.p("Number: ");
			a[i] = sc.nextInt();
		}
		int co = 0, ce = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				ce += a[i];
			}
			else {
				co += a[i];
			}
		}
		System.out.println("Odd positions' sum: " + co);
		System.out.println("Even positions' sum: " + ce);
	}
}