import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the " + size + " numbers of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Array with duplicate:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        int[] result = removeDuplicates(array);

        System.out.println("\nArray without duplicates:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] removeDuplicates(int[] array) {
        int[] newArray = new int[array.length];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == newArray[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                newArray[index++] = array[i];
            }
        }
        
        int[] result = new int[index];
        System.arraycopy(newArray, 0, result, 0, index);
        
        return result;
    }
}
