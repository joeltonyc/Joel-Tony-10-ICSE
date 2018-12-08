/**Variables
		int n, remainder, sum, count
	Methods
		accept() - Input
		sum() - Sum of digits
		frequency() - Frequency of digits**/

import java.util.*;
public class TwentyNineObject {
	
	public static Scanner sc = new Scanner(System.in);	
	public static TwentyNine t = new TwentyNine();

	public static void main(String[] args) {
		t.accept();
		System.out.println("\n");
		t.sum();
		System.out.println("\n");
		t.frequency();
	}
}