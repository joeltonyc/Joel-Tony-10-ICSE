/**Linear Search**/

import java.util.*;
public class Ten {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("Search key: ");
		int n = sc.nextInt();
		int a[] = new int[10];
		boolean in = false;
		for (int i = 0; i< 10; i++) {
			System.out.print("Item: ");
			a[i] = sc.nextInt();
			if (a[i] == n) {
				in = true;
			}
		}
		System.out.println("\n");
		if (in) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}