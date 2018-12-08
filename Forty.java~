/**Print each word on a separate line**/

import java.util.*;
import java.io.*;
public class Forty {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine();
		String word = "";
		j.p("\n");
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				System.out.println(word);
				word = "";
				continue;
			}
			else {
				word += ch;
			}
		}
		System.out.println(word);
	}
}