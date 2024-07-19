// Task-5 Compound Interest
import java.lang.*;
import java.util.*;
public class comInterest{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the P,t,r,n: ");
		float P = scan.nextFloat();
		float t = scan.nextFloat();
		float r = scan.nextFloat();
		float n = scan.nextFloat();
		interest(P,t,r,n);
	}
	public static void interest(float P,float t, float r,float n) {
		double C = P*Math.pow((1+(r/n)),n*t);
		System.out.println("The interest for the given parameters: "+ C);
		}
}