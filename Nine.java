/**Reverse and array**/

import java.util.*;
public class Nine {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        j.p("n = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number: ");
            a[i] = sc.nextInt();
        }
        int ai = (n-1);
        for (int bi = 0; bi < n; bi++) {
            b[bi] = a[ai];
            ai--;
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}