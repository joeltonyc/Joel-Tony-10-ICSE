/**Input: School

	Output:
	Sc
	ch
	ho
	oo
	ol**/

import java.util.*;
import java.io.*;
public class FortyThree {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine();
		j.p("\n");
		for (int i = 1; i < s.length(); i++) {
			System.out.println(s.charAt(i - 1) + "" + s.charAt(i));
		}
	}
}