import java.lang.*;
import java.util.*;
public class area{
	public static void main(String args[]) {
		System.out.print("Hello\n");
		Scanner scan = new Scanner(System.in);
		
	// Task-1 -- Area of the Triangle
		System.out.println("Enter the sides of the triangle(a,b,c -in Centimeters): ");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		double s,aTri,aCyl,aCone;
		System.out.println("You entered- a: "+a+" b: "+b+" c: "+c);
		s = (a+b+c)/2;
		aTri = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle : "+ aTri);
		
	// Task 2 and Task 3 -- Area of Cone and Cylinder
		
		System.out.print("\nEnter the radius and height: (r,h): ");
		float r = scan.nextFloat();
		float h = scan.nextFloat();
		double l = Math.sqrt((Math.pow(r,2)+Math.pow(h, 2)));
		aCone = Math.PI*r*(r+l);
		System.out.println("Area of Cone : "+ aCone);
		aCyl = Math.PI*r*2*(r+h);
		System.out.println("Area of Cylinder : "+ aCyl);
}
}
