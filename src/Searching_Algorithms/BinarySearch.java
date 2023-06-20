import java.util.Scanner;

public class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int index = binarySearch(arr,target);
		System.out.print("Element at " + index);
		sc.close();
	}
	public static int binarySearch(int[] arr,int target){
		int start = 0;
		int end = arr.length-1;
		int mid = start + (end - start)/2;
		while(start <= end){
			if(arr[mid] == target){
				return mid;
			}
			else if(target < arr[mid]){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
			mid = start + (end - start)/2;
		}
		return -1;
	}
}