import java.lang.*;
import java.util.*;

public class binarySearch{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int arr[]= {0,3,2,5,4,10,6};
		System.out.print("Enter the search element: ");
		int n = scan.nextInt();
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		while (low<=high){
			int mid = (low+high)/2;
			if (n==arr[mid]){
				System.out.println("Element found at index: "+mid);
				break;
			}
			else if (n<arr[mid]){
				high = mid-1;
			}
			else if (n>arr[mid]){
				low = mid+1;
			}
			else{
				System.out.println("Element not found");
			}
		}

	}
}
		