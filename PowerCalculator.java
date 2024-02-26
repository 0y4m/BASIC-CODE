import java.util.Scanner;

public class PowerCalculator {
    public static int calculatePower(int base, int exponent) {
        int result = 1;

        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scan.nextInt();

        int power = calculatePower(base, exponent);

        System.out.println("Base Number: " + base);
        System.out.println("Exponent: " + exponent);
        System.out.println("Result: " + power);

        scan.close();
    }
}
