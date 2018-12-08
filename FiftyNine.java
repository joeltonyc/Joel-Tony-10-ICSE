/*Check if a string is a palindrome*/

import java.io.*;
import java.util.*;
class FiftyNine {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		System.out.println("Palindrome: " + palindrome(br.readLine().trim()));
	}

	public static boolean palindrome(String s) {
		String sR = "";
		int c = 0;
		for (int i = (s.length() - 1); i >= 0; i--) {
			sR += s.charAt(i);
		}
		return (s.equals(sR) ? true : false);
	}
}