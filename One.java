//Print the sum of an array of size 10

    import java.util.*;
    public class One {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    	int a[] = new int[10];
    	for (int i = 0; i < 10; i++) {
    		j.p("Enter number: ");
    		a[i] = sc.nextInt();
    	}
    	int s = 0;
    	for (int i = 0; i < 10; i++) {
    		s += a[i];
    	}
    		System.out.println("Sum:" + s);
    	}
}