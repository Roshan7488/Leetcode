import java.util.Scanner;

public class Solution{
    public static int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int i = 0, count = 0, maxReach = 0, high = 0;
        while (i < nums.length) {
            if (i + nums[i] >= nums.length - 1) {
                count++;
                break;
            }
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j < nums.length &&  i+j+nums[i + j] > maxReach) {
                    maxReach = i+j+nums[i + j];
                    high = i + j;
                }
            }

            i = high;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int min_jump = jump(nums);
        System.out.println(min_jump);
        sc.close();
    }
}
