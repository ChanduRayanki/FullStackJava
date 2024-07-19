// Task 4 Celsius to Fahrenheit

import java.lang.*;
import java.util.*;
public class temperature{
	public static void main(String args[]) {
		System.out.print("Hello\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Temperature in Celsius: ");
		float Celsius = scan.nextFloat();
		celToFah(Celsius);
	}
		
		public static void celToFah(float Celsius) {
		double fahrenheit = (Celsius*(1.8))+32;
		System.out.println("Temperature in Farenheit: "+fahrenheit);
		}
	}