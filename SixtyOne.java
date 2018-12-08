/*Print each word of a sentence in a separate line*/

import java.io.*;
import java.util.*;
class SixtyOne {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("Sentence: ");
		String s = br.readLine().trim(), o = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				System.out.println(o);
				o = "";
			}
			else {
				o += ch;
			}
		}
		System.out.println(o);
	}
}