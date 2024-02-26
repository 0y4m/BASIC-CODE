import java.util.Scanner;

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a non-negative numbers: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Factorial is only defined a non-negative numbers.");
        } else {
            int result = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }

        scan.close();
    }
}
