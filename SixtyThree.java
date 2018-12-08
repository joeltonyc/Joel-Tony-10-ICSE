/*Capitalise each word*/

import java.io.*;
import java.util.*;
class SixtyThree {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("Number: ");
		String n = "" + sc.nextInt();
		String s = "";
		for (int i = 0; i < n.length(); i++) {
			int d = Integer.parseInt("" + n.charAt(i));
			switch (d) {
				case 0:
					s += "Zero";
					break;
				case 1:
					s += "One";
					break;
				case 2:
					s += "Two";
					break;
				case 3:
					s += "Three";
					break;
				case 4:
					s += "Four";
					break;
				case 5:
					s += "Five";
					break;
				case 6:
					s += "Six";
					break;
				case 7:
					s += "Seven";
					break;
				case 8:
					s += "Eight";
					break;
				case 9:
					s += "Nine";
					break;			
			}
			s += ' ';
		}
		System.out.println(s);
	}
}