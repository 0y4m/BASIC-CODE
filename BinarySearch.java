import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else { 
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the number of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int target = scan.nextInt();

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target +  " found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scan.close();
    }
}
