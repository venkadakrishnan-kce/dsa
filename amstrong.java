package JavaPlacement;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int n = String.valueOf(number).length(); 
        while (number > 0) {
            int digit = number % 10;
            sum +=(int) Math.pow(digit, n);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
