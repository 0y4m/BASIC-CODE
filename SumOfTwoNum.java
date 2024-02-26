import java.util.Scanner;

public class SumOfTwoNum {
    public static boolean hasTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number for an array: ");
        int n = scan.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter a number of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scan.nextInt();

        boolean result = hasTwoSum(nums, target);
        System.out.println("Result: " + result);

        scan.close();
    }
}
