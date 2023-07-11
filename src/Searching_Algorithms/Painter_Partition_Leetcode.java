import java.util.Scanner;

public class Painter_Partition_Leetcode {
    static int no_of_painters;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter no of painters to allocate the boards");
        no_of_painters = scanner.nextInt();
        for (int idx = 0; idx < size; idx++) {
            arr[idx] = scanner.nextInt();
        }
        int allocatedboards = findLargestMinDistance(arr, size);
        System.out.println("The minimum no of boards to be painted by a painter is  " + allocatedboards);
        scanner.close();
    }

    public static int findLargestMinDistance(int[] boards, int size) {
        //    Write your code here.
        int start = 0;
        int sum = 0;
        int ans = -1;
        for (int idx = 0; idx < boards.length; idx++) {
            sum += boards[idx];
        }
        int end = sum;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (isPossible(boards, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static boolean isPossible(int[] boards, int mid) {
        int painterCount = 1;
        int boardsSum = 0;
        for (int idx = 0; idx < boards.length; idx++) {
            if (boardsSum + boards[idx] <= mid) {
                boardsSum += boards[idx];
            } else {
                painterCount++;
                if (painterCount > no_of_painters || boards[idx] > mid) {
                    return false;
                }
                boardsSum = boards[idx];
            }
        }
        return true;
    }
}
