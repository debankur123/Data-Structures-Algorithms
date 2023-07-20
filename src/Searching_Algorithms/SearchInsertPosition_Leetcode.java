import java.util.Scanner;

public class SearchInsertPosition_Leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array to insert ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements to insert ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target element to be searched ");
         int target  = sc.nextInt();
        int result = searchInsertPosition(array,target);
        System.out.println("The element should be inserted or present at " +result);
        sc.close();
        
    }
    public static int searchInsertPosition(int[] array, int target){
        int start = 0;
        int end = array.length;
        int midPos = start + (end-start)/2;
        while(start <= end){
            if(array[midPos] == target){
                return midPos;
            }
            else if(array[midPos] > target){
                end = midPos-1;
            }
            else
                start = midPos+1;
            midPos =  start + (end-start)/2;
        }
        return end+1;
    }
}
