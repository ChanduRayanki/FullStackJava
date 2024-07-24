import java.lang.*;
import java.util.*;

public class duplicates{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int arr[]= {0,3,2,5,3,5,6};
        ArrayList<Integer> al = new ArrayList<Integer>();  
		for (int i = 0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					al.add(arr[i]);
				}
			}
		}
		System.out.print("The duplicate elements are: ");
		System.out.print(al);
	}
}