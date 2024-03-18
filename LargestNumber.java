import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int numIntegers = scanner.nextInt();

        int largestNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= numIntegers; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();

            if (num > largestNumber) {
                largestNumber = num;
            }
        }

        System.out.println("The largest number is: " + largestNumber);

        scanner.close();
    }
}