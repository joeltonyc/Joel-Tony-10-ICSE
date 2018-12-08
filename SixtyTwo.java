/*Capitalise each word*/

import java.io.*;
import java.util.*;
class SixtyTwo {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine().trim();
		String o = ("" + s.charAt(0)).toUpperCase();
		boolean f = false;
		for (int i = 1; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (f) {
				f = false;
				continue;
			}
			else if (ch == ' ') {
				o += (" " + s.charAt(i + 1)).toUpperCase();
				f = true;
			}
			else {
				o += ("" + ch).toLowerCase();
				f = false;
			}
		}
		System.out.println(o);
	}
}