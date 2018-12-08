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
public class FortyEight {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int pan;
	public static String name;
	public static double tax, taxincome;

	public FortyEight() {
		pan = 0;
		tax = taxincome = 0;
		name = "";
	}

	public void accept() throws Exception {
		j.p("Name: ");
		name = br.readLine();
		j.p("Account number: ");
		pan = sc.nextInt();
		j.p("Taxable income: ");
		taxincome = sc.nextDouble();
	}

	public void calc() {
		if (taxincome <= 100000) {
			tax = 0;
		}
		else if (taxincome > 100000 && taxincome <= 150000) {
			tax = 0.1 + (taxincome - 100000);
		}
		else if (taxincome > 150000 && taxincome <= 250000) {
			tax = 5000 + (0.2 * (taxincome - 150000));
		}
		else {
			tax = 25000 + (0.3 * (taxincome - 250000));
		}
	}

	public void display() {
		System.out.println("Name\tAccount number\tTaxable Income\tTax\n\n" + name + "\t" + pan + "\t₹" + taxincome + "\t₹" + tax);
	}
}