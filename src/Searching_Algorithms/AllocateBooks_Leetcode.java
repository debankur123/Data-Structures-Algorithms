import java.util.Scanner;

public class AllocateBooks_Leetcode{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of the array ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter no of student to allocate the books");
		int no_of_students = scanner.nextInt();
		for(int idx=0;idx<size;idx++){
			arr[idx] = scanner.nextInt();
		}
		int allocatedBooks = allocateBooks(arr,size,no_of_students);
		System.out.println("The minimum no of pages to be read by a student is  " + allocatedBooks);
		scanner.close();
	}

	public static boolean isPossible(int[] arr,int size,int no_of_students,int mid){
		int pageSum = 0;
		int studentCount = 1;
		for(int idx=0;idx<size;idx++){
			if(pageSum + arr[idx] <= mid){
				pageSum += arr[idx];
			}
			else{
				studentCount++;
				if(studentCount > no_of_students || arr[idx] > mid){
					return false;
				}
				pageSum = arr[idx];
			}
		}
		return true;
	}


	public static int allocateBooks(int[] arr,int size,int no_of_students){
		int start = 0;
		int sum = 0;
		for(int i=0;i<size;i++){
			sum += arr[i];
		}
		int end = sum;
		int ans = -1;
		int mid = start + (end-start)/2;
		while(start <= end){
			if(isPossible(arr,size,no_of_students,mid)){
				ans = mid;
				end = mid-1;
			}
			else{
				start = mid+1;
			}
			mid = start + (end-start)/2;
		}
		return ans;
	}
}
