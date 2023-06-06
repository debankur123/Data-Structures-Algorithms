package Arrays;

import java.util.Arrays;
import java.util.Scanner;


// Time complexity is O(NlogN) as we are using in hand sort function
public class UniqueOccurencesLeetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);
        sc.close();
    } 
    public static boolean uniqueOccurrences(int[] arr) {
        boolean[] unique = new boolean[1000];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count = 0;
            while(i < arr.length-1 && arr[i] == arr[i+1]){
                i++;
                count++;
            }
            if(unique[count]){
                return false;
            }
            unique[count] = true;
        }
        return true;
    }

}
