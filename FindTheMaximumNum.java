import java.util.Scanner;

public class FindTheMaximumNum {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter a number of the array");
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

            int maximumNumber = findMaximum(nums);
            System.out.println("Maximum number: " + maximumNumber);

        scan.close();
    }
    public static int findMaximum(int[] nums) {     
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}

    
    
