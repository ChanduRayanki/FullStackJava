import java.util.*;

public class binarySearch{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int arr[]= {2,3,5,7,8,9};
		System.out.print("Enter the search element: ");
		int n = scan.nextInt();
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		int found=0;
		while (low<=high){
			int mid = low+(high-low)/2;
			if (n==arr[mid]){
				System.out.println("Element found at index: "+mid);
				found=1;
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
		if (found==0){
		System.out.println("Element not found");
		}

	}
}
		