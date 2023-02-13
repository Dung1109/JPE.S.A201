package fa.training.excerises2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Input first number: 101
        //Input second number: 122
        //Input third number: 123
        //Input fourth number: 111
        //Numbers are not equal!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Input fourth number: ");
        int fourthNumber = scanner.nextInt();
        if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }


}
