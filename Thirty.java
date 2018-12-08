/**S = (1/2!) + (1/4!) + (1/6!)...(1/10!)**/

import java.util.*;
public class Thirty {
	
	public static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		double s = 0.0;
		j.p("");
		for (int i = 1; i <= 5; i++) {
			s += (1.0 / (fact(i * 2)));
		}
		System.out.println(s);
	}

	public static int fact(int n) {
		int f = 1;
		for (int i = 2; i <= n; i++) {
			f *= i;
		}
		return f;
	}
}