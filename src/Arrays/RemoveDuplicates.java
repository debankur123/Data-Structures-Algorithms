package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = getInputArray();
        int result = removeDuplicatesInArray(arr);
        System.out.println("No of duplicate elements are : " + result);
    }
    public static int[] getInputArray(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
        
    }
    static int removeDuplicatesInArray(int[] arr){
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
