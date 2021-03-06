/**Input and store roll number, name and marks of 3 subjects in 5 different arrays.
Display the remark based on the average marks**/

import java.util.*;
import java.io.*;
public class Seven {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		j.p("n = ");
		int n = sc.nextInt();
		String name[] =new String[n];
		int rn[] = new int[n];
		int m1[] = new int[n];
		int m2[] = new int[n];
		int m3[] = new int[n];
		String r[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Name: ");
			name[i] = br.readLine();
			System.out.print("Roll number: ");
			rn[i] = sc.nextInt();
			System.out.print("Marks 1: ");
			m1[i] = sc.nextInt();
			System.out.print("Marks 2: ");
			m2[i] = sc.nextInt();
			System.out.print("Marks 3: ");
			m3[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int avg = (m1[i] + m2[i] + m3[i]) / 3;
			if ((avg >= 85) && (avg <= 100)) {
				r[i] = "Excellent";
			}
			else if ((avg >= 75) && (avg <= 84)) {
				r[i] = "Distinction";
			}
			else if ((avg >= 60) && (avg <= 74)) {
				r[i] = "First Class";
			}
			else if ((avg >= 40) && (avg <= 59)) {
				r[i] = "Pass";
			}
			else {
				r[i] = "Poor";
			}
		}
		System.out.println("Name\tResul\n");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + "\t" + r[i]);
		}
	}
}