/**Pattern (n = 4)
	1 3 5 7
	1 3 5
	1 3
	1**/

import java.util.*;
public class TwentyEight {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("n = ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = n; i >= 0; i--) {
			int output = 1;
			for (int j = 1; j <= i; j++, output += 2) {
				System.out.print(output + " ");
			}
			System.out.println();
		}
	}
}