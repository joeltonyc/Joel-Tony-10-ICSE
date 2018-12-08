/*Automorphic Number*/
import java.util.*;
import java.io.*;
public class FiftyOne {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("Number: ");
		int n = sc.nextInt();
		System.out.println("Automorphic number: "  + automorphicNumber(n));
	}

	public static boolean automorphicNumber(int n) {
		int sqr = (n * n), nC = n, l = 0;
		while (n > 0) {
			l++;
			n /= 10;
		}
		if ((sqr % ((int) Math.pow(10, l))) == nC) {
			return true;
		}
		else {
			return false;
		}
	}
}