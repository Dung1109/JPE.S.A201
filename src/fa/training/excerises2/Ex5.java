package fa.training.excerises2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
//        Write a Java program, called SumNComputation that accepts an integer (n) and computes the value of
//        n+nn+nnn.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        String number = scanner.next();
        System.out.printf("%s+%s%s+%s%s%s = %d", number, number, number, number, number, number, Integer.parseInt(number) + Integer.parseInt(number + number) + Integer.parseInt(number + number + number));
    }
}
