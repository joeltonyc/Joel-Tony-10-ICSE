//Add even numbers in an array of size 20

import java.util.*;
public class Two {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[] = new int[20];
		int sum = 0;
		for (int i = 0; i < 20; i++) {
			j.p("Number: ");
			a[i] = sc.nextInt();
			sum += (a[i] % 2 == 0) ? (a[i]) : 0;
		}
		System.out.println("Sum of even numbers: " + sum);
	}
}