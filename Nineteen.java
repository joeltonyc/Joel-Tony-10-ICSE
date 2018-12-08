/**Accept the name and marks in 3 subjects of 25 students
	Display the a list of the total and average**/

import java.util.*;
public class Nineteen {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String n[] = new String [25];
		int a[][] = new int [25][3];

		for (int i = 0; i < 25; i++) {
			j.p("Name: ");
			n[i] = sc.nextLine();
			for (int x = 0; x < 3; x++) {
				System.out.print("Marks in subject " + (x + 1) + ": ");
				a[i][x] = sc.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < 25; i++) {
			System.out.println("Name: " + n[i]);
			System.out.println("Total: " + (a[i][0] + a[i][1] + a[i][2]));
			System.out.println("Average: " + ((a[i][0] + a[i][1] + a[i][2]) / 3));
			System.out.println();
		}
	}
}