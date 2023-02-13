package fa.training.excerises2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Input first number: 121
//        Input second number: 12
//        Input third number: 123
//        Input fourth number: 22
//        Input fourth number: 23
//        The sum is 301
//        The average is 75.25
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Input fourth number: ");
        int fourthNumber = scanner.nextInt();
        System.out.println("Input fourth number: ");
        int fifthNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        System.out.println("The sum is " + sum);
        double average = sum / 5.0;
        System.out.printf("The average is %.2f", average);
    }
}
