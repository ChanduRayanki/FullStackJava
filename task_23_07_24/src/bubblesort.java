import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 5, 0, 3, 2, 1};
        int temp =0;
        
        for (int i=0;i<arr.length-1;i++) {
        	temp =0;
        	for (int j=i+1;j<arr.length;j++) {
        		if (arr[i]>arr[j]) {
        			temp = arr[j];
        			arr[j]=arr[i];
        			arr[i]= temp;
        		}
        	}
        }
        System.out.println("The sorted array: "+ Arrays.toString(arr));
        
    }
}