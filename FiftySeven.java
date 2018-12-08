/*Print intials of name taken from user*/

import java.io.*;
import java.util.*;
class FiftySeven {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("Name: ");
		String s = br.readLine().trim();
		String o = "";
		char ch = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				o += (ch + ". ").toUpperCase();
				ch = s.charAt(i + 1);
			}
		}
		o += (ch + ". ").toUpperCase();
		o = o.trim();
		System.out.println(o);
	}
}