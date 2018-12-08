/**Palindrome check for a string**/

import java.util.*;
import java.io.*;
public class ThirtyEight {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine();
		String sC = "";
		for (int i = (s.length() - 1); i >= 0; i--) {
			sC += s.charAt(i);
		}
		if (s.equals(sC)) {
			System.out.println("Palindrome: True");
		}
		else {
			System.out.println("Palindrome: False");
		}
	}
}