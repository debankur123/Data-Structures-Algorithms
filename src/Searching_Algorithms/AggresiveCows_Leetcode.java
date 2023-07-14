import java.util.*;
import java.util.Arrays;


public class AggresiveCows_Leetcode{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int[] stalls_arr = new int[size];
		for(int idx=0;idx<size;idx++){
			stalls_arr[idx] = sc.nextInt();
		}
		System.out.println("Enter the no of aggresive cows to be placed: ");
		int no_of_cows = sc.nextInt();
		int result = aggresiveCows(stalls_arr,no_of_cows);
		System.out.println("The largest minimum distance where the cows should be placed is " + result);
		sc.close();
	}

	public static boolean isPossible(int[] arr,int no_of_cows,int mid){
		int cowCount = 1;
		int lastPosition = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] - lastPosition >= mid){
				cowCount++;
				if(cowCount == no_of_cows){
					return true;
				}
				lastPosition = arr[i];
			}
		}
		return false;
	}

	public static int aggresiveCows(int[] arr,int no_of_cows){
		Arrays.sort(arr);
		int start = 0;
		int end = largestElement(arr);
		int ans = 0;
		int mid = start + (end-start)/2;
		while(start <= end){
			if(isPossible(arr,no_of_cows,mid)){
				ans = mid;
				start = mid + 1;
			}
			else{
				end = mid-1;
			}
			mid = start + (end-start)/2;
		}
		return ans;
	}

	public static int largestElement(int[] arr){
		int largest = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		return largest;
	}
}
