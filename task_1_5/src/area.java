import java.lang.*;
import java.util.*;
public class tasks{
	public static void main(String args[]) {
		System.out.print("Hello");
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
		aCone = Math.PI*r*h;
		System.out.println("Area of Cone : "+ aCone);
		aCyl = aCone*r;
		System.out.println("Area of Cylinder : "+ aCyl);
		
	// Task -4 Celsius to Fahrenheit
		
		System.out.println("Temperature in Celsius: ");
		float Celsius = scan.nextFloat();
		temperature(Celsius);
		
	// Task-5 Interest
		
		System.out.println("Enter the PRin: ");
		float P = scan.nextFloat();
		float T = scan.nextFloat();
		float R = scan.nextFloat();
		interest(P,T,R);
	}
	public static void temperature(float Celsius) {
		double fahrenheit = (Celsius*(1.8))+32;
		System.out.println("Temperature in Farenheit: "+fahrenheit);
		}
	public static void interest(float P,float T, float R) {
		double I = P*T*R/100;
		System.out.println("The interest for the given parameters: "+I);
		}	

	}
