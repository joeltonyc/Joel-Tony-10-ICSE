/**Accept a year of graduation, and print exists if in array**/

import java.util.*;
public class Fifteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yr;
		int a[] = {1982, 1987, 1993, 1996, 2003, 2006, 2007, 2009, 2010};
		j.p("Enter details");
		yr = sc.nextInt();
		int flag = 0, l, u, m = 0;
		l = 0;
		u = a.length - 1;
		while ((l <= u) && (flag == 0)) {
			m = (l + u) / 2;
			if (yr > a[m]){
				l = m + 1;
			}
			else if (yr < a[m]) {
				u = m - 1;
			}
			else {
				flag = 1;
			}
		}
		if (flag == 1){
			System.out.println("Exists");
		}
		else {
			System.out.println("Not there");
		}
	}
}