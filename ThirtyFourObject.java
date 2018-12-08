/**Print all 4 digit superprimes
    abcd is superprime if abcd, abc, ab and a are all prime**/

import java.util.*;
public class ThirtyFourObject {
    
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            ThirtyFour t = new ThirtyFour();
            if (t.superprime(i)) {
                System.out.print(i + "\t");
            }
        }
    }
}