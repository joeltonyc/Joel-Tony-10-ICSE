/**Input: Ansh Manuj Desai
	Output: A. M. Desai**/

import java.util.*;
import java.io.*;
public class FortyFive {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("String: ");
		String s = br.readLine();
		int sC = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sC++;
			}
		}
		String[] a = new String[(sC + 1)];
		int oldSplit = -1, newSplit = -1, aI = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				oldSplit = newSplit;
				newSplit = i;
				a[aI] = s.substring((oldSplit + 1), newSplit);
				aI++;
			}
		}
		oldSplit = newSplit;
		a[aI] = s.substring((oldSplit + 1), (s.length()));
		for (int i = 0; i < (a.length - 1); i++) {
			a[i] = "" + a[i].charAt(0);
			a[i] = a[i].toUpperCase();
			System.out.print(a[i] + ". ");
		}
		System.out.print(a[a.length - 1]);
	}
}