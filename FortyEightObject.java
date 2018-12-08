/*Data members
	int pan - Stores account number
	String name - Stores name
	double taxincome - Stores annual taxable income
	double tax - Stores calculated tax

Member functions
	Non-parameterised constructor
	accept() - Accept details
	calc() - Calculate tax
	display() - Displays details

Total Income : Tax
	Upto ₹100000 : No tax
	₹100001 - ₹150000 : 10% of income exceeding ₹100000
	₹150001 - ₹250000 : ₹5000 + 20% of income exceeding ₹150000
	More than ₹250000 : ₹25000 + 30% of income exceeding ₹250000
*/
import java.util.*;
import java.io.*;
public class FortyEightObject {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		FortyEight f = new FortyEight();
		f.accept();
		f.calc();
		f.display();
	}
}