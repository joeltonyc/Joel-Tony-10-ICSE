/*Sum of 0 + 7 + 26 + 63 + ... n terms*/

import java.io.*;
import java.util.*;
class FiftySix {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("n = ");
		int s = 0;
		for (int i = 1; i <= (sc.nextInt()); i++) {
			s += pattern(i);
		}
		System.out.print(s);
	}

	public static int pattern(int n) {
		return (int) (Math.pow(n, 3) - 1);
	}
}