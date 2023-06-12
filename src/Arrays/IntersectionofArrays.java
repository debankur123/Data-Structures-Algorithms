package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionofArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        for(int j=0; j < size2; j++) {
            arr2[j] = scanner.nextInt();
        }
        int[] resultant = IntersectionofArrays(arr1,arr2);
        System.out.println("Intersection of arrays are: " + Arrays.toString(resultant));
        scanner.close();
    }
    public static int[] IntersectionofArrays(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int index1 = 0;
        int index2 = 0;
        List<Integer> output = new ArrayList<Integer>();
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] == arr2[index2] && !output.contains(arr1[index1])){
                output.add(arr1[index1]);
                index1++;
                index2++;
            }
            else if(arr1[index1] > arr2[index2]){
                index2++;
            }
            else{
                index1++;
            }
        }
        int[] result = new int[output.size()];
        int iteration = 0;
        for(int num : output){
            result[iteration] = num;
        }
        return result;
    }
}
