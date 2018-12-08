/*Accept name and toal marks of 'n' students in  2 separate arrays 'name[]' and 'totalmarks[]'
	Calculate and print:
		Average of total marks obtained by 'n' students
		Deviation of each student's total marks with the average
			Deviation = total marks of a student - average*/

import java.util.*;
import java.io.*;
public class FortySix {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		j.p("n = ");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] totalmarks = new int[n];
		for (int i = 0; i < n; i++) {
			j.p("Name: ");
			name[i] = br.readLine();
			j.p("Total marks: ");
			totalmarks[i] = sc.nextInt();
		}
		int avg = 0;
		for (int i = 0; i < n; i++) {
			avg += totalmarks[i];
		}
		avg /= n;
		int[] dev = new int[n];
		for (int i = 0; i < n; i++) {
			dev[i] = totalmarks[i] - avg;
		}
		System.out.println("Average" + avg + "\n\t\tDeviation\n");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + ": " + dev[i]);
		}
	}
}