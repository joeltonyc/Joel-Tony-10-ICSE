/**Arrange Strings in Ascending Order**/

import java.util.*;
import java.io.*;
public class FortyFour {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		String[] a = new String[5];
		for (int i = 0; i < 5; i++) {
			j.p("String: ");
			a[i] = br.readLine();
		}
		//Selection sort
		for (int i = 0; i < 5; i++) {
			String min = a[i];
			int index = i;
			for (int j = i; j < 5; j++) {
				if ((a[j].compareTo(min)) < 0) {
					min = a[j];
					index = j;
				}
			}
			//Swap
			String t = a[i];
			a[i] = min;
			a[index] = t;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
	}
}