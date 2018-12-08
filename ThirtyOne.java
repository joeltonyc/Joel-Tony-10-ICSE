/**Methods
	input() - Accept a, b, c and d
	satisfy() - Return 0 if a^3 + b^3 + c^3 = d^3. Else return -1**/

import java.util.*;
public class ThirtyOne {
	
	public static Scanner sc = new Scanner(System.in);	
	public static int a, b, c, d;

	public static void main(String[] args) {
		input();
		System.out.println(satisfy());
	}

	public static void input() {
		j.p("Enter numbers\n");
		a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); d = sc.nextInt();
	}

	public static int satisfy() {
		int f = 1;
		if ((a * a * a) + (b * b * b) + (c * c * c) == (d * d * d)) {
			f = 0;
		}
		else {
			f = -1;
		}
		return f;
	}
}