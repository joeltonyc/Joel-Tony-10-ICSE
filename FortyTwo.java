/**Extract all capital letters**/

import java.util.*;
import java.io.*;
public class FortyTwo {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine();
		String sC = "";
		j.p("\n");
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				sC += ch;
			}
		}
		System.out.println(sC);
	}
}