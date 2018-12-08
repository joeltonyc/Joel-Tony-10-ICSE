/**Accept the names of 10 cities and their STD codes
	Search for a city, and print its STD code**/

import java.util.*;
public class Fourteen {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String c[] = new String [10];
		int s[] = new int [10];
		for (int i = 0; i < 10; i++) {
			j.p("City: ");
			c[i] = sc.nextLine();
			j.p("STD code: ");
			s[i] = sc.nextInt();
		}
		System.out.print("Name of city to be searched for: ");
		String cs = sc.nextLine();
		boolean ss = false;
		for (int i = 0; i < 10; i++) {
			if (c[i].equals(cs)) {
				System.out.print("\tSearch Sucessful\n\n");
				System.out.println("City: " + c[i]);
				System.out.println("STD: " + s[i]);
				ss = true;
				break;
			}
		}
		if (!ss) {
			System.out.println("City not found");
		}
	}
}