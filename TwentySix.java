/**Pattern (n = 4)
	*
	*#
	*#*
	*#*#	**/

import java.util.*;
public class TwentySix {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		j.p("n = ");
		int n = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (!(j % 2 == 0)) {
					System.out.print("* ");
				}
				else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}