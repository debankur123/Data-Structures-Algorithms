package Arrays;
import java.util.Scanner;

class SwapAlternate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        swapAlternate(arr,size);
        printArray(arr, size);
        scanner.close();
    }
    static void swapAlternate(int[] arr,int size){
        for(int i=0;i<size;i+=2){
            if(i+1 < size){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    static void printArray(int[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
