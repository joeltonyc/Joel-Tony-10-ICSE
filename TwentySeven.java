/**Pattern (n = 4)
	2
	2 4
	2 4 6
	2 4 6 8**/

import java.util.*;
public class TwentySeven {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("n = ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((j * 2) + " ");
			}
			System.out.println();
		}
	}
}