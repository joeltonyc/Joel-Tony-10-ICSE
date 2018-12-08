/**Binary Search in  an Array**/

import java.util.*;
public class Eleven {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        j.p("n = ");
        int n = sc.nextInt();
        System.out.println("\n");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number: ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("\n");
        System.out.print("Search key: ");
        int k = sc.nextInt();
        
        //Binary Search
        int l = 0, h = (n - 1), m = ((l + h) / 2);
        int index = -1;
        boolean f = false;
        while (l != h) {
            if (k == a[m]) {
                f = true;
                index = m;
                break;
            }
            else if (k > a[m]) {
                l = (m + 1);
            }
            else {
                h = (m - 1);
            }
        }
        System.out.println("\n");
        System.out.println("Element '" + k + "' found: " + f + " (At index " + index + ")");
    }
}