/**Reverse a string**/

import java.util.*;
import java.io.*;
public class ThirtyNine {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine();
		String sC = "";
		for (int i = (s.length() - 1); i >= 0; i--) {
			sC += s.charAt(i);
		}
		System.out.println("Reversed String: " + sC);
	}
}