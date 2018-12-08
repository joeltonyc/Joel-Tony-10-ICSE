/**Method Overloading
	Volume of Cone
	Circumfrence of Circle
	Area of a Sphere**/

import java.util.*;
public class ThirtyTwo {
	
	public static Scanner sc = new Scanner(System.in);	

	public static void main(String[] args) {
		j.p("Enter the following:\n\nHeight of cone\nRadius of cone\nRadius of circle\nRadius of sphere\n\n");
		double vC = overload(sc.nextDouble(), sc.nextDouble());
		double cC = overload(sc.nextFloat());
		double vS = overload(sc.nextDouble());
		j.p("\n\n");
		System.out.println("Volume of cone: " + vC);
		System.out.println("Circumfrence of circle: " + cC);
		System.out.println("Area of sphere: " + vS);
	}

	public static double overload(double r, double h) {
		//Volume of a cone
		return ((Math.PI * r * r * h) / 3.0);
	}

	public static double overload(float r) {
		//Circumfrence of a circle
		return Math.PI * r * 2.0;
	}

	public static double overload(double r) {
		//Area of a sphere
		return (Math.PI * r * r * 4.0);
	}
}