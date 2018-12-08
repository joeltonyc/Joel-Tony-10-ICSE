/**Combine 2 arrays**/

import java.util.*;
public class Eight {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a[] = new int[6];
		int b[] = new int[4];
		int c[] = new int[10];
		for (int i = 0; i < 6; i++) {
			j.p("Number: ");
			a[i] = sc.nextInt();
			c[i] = a[i];
		}
		for (int i = 0; i < 4; i++) {
			j.p("Number");
			b[i] = sc.nextInt();
			c[(i+6)] = b[i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(c[i]);
		}
	}
}