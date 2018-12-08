/*Insert n spaces after 1st character, (n-1) after 2 till 0*/

import java.io.*;
import java.util.*;
class SixtyFour {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine(), o = "";
		j.p("n = ");
		int n = sc.nextInt();
		for (int i = 0, sp = n; i < s.length(); i++, sp--) {
			o += s.charAt(i);
			String spaces = "";
			for (int j = 1; j <= sp; j++) {
				spaces +=" ";
			}
			o += spaces;
		}
		System.out.println(o);
	}
}