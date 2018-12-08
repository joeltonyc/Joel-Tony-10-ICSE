/**Remove and element at a given index
	from an array of size 10**/

import java.util.*;
public class Twelve {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			j.p("Element: ");
			a[i] = sc.nextInt();
		}
		System.out.println("\n");
		j.p("Index of Element to Remove: ");
		int r = sc.nextInt();
		System.out.println("\n");
		for (int i = 0; i < 10; i++) {
			if (i != r) {
				System.out.println(a[i]);
			}
		}
	}
}