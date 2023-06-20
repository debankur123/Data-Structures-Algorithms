import java.util.Scanner;
public class Last_First_Occurance_of_Element_Leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println("First occurance of the element is " + leftOccurance(arr, target));
        System.out.println("Last occurance of the element is " + rightOccurance(arr, target));
        sc.close();
    }
    public static int leftOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int indexVal = -1;
        while (start <= end) {
            if(target == arr[mid]){
                indexVal = mid;
                end = mid - 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return indexVal;
    }
    public static int rightOccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int indexVal = -1;
        while (start <= end) {
            if(target == arr[mid]){
                indexVal = mid;
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return indexVal;
    }

}
