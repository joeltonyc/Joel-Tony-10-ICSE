/*Method Overlaoding
	function(ch, n, m)
		ch = '@'
		n = 3
		m = 2
			@ @ @
			@ @ @
	function(ch, n)
		ch = '/'
		n = 2
			/ /
			/ /
*/
import java.util.*;
import java.io.*;
public class FortySevenObject {
	
	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		FortySeven f = new FortySeven();
		j.pl("Enter 1 character and 1 integer");
		f.function(br.readLine().charAt(0), sc.nextInt());
		j.p("\n\nEnter 1 character and 2 integers\n");
		f.function(br.readLine().charAt(0), sc.nextInt(), sc.nextInt());
	}
}