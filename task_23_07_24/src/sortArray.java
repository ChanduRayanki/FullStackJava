import java.lang.*;
import java.util.*;

public class sortArray{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a[]= {0,3,2,5,3,5,6};
		System.out.println("The unsorted array: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("The sorted array : "+ Arrays.toString(a));
		}
	}