package Arrays;

import java.util.Scanner;


// Time complexity for this code is O(N) . This is the floyd's hare and tortoise algorithm for finding duplicate . it takes constant space complexity and for one pass it takes only one traversal so it is O(N)
public class DuplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int duplicate = findDuplicate(arr);
        System.out.println("The duplicate element is" + duplicate);
        sc.close();
    }
    public static int findDuplicate(int[] nums) {
        if(nums.length <= 1){
            return -1;
        }
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
}
