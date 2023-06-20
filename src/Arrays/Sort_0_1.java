package Arrays;

//package Arrays;
import java.util.Scanner;


public class Sort_0_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		sort(arr);
		printArray(arr);
		sc.close();
	}
	public static void sort(int[] arr){
		int left = 0;
		int right = arr.length-1;
		while(left < right){
			while(arr[left] == 0 && left < right){
				left++;
			}
			while(arr[right] == 1 && left < right){
				right--;
			}

			if(arr[left] == 1 && arr[right] == 0 && left < right){
				// swap
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println(); 
	}

}