package fa.training.excerises2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
//        Cylinder Computation
//        Surface area = 1295.906968125
//        Base area = 490.8738515625
//        Volume = 1963.49540625
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Height: ");
        double height = scanner.nextDouble();
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        double baseArea = Math.PI * radius * radius;
        double volume = baseArea * height;
        System.out.println("Surface area = " + surfaceArea);
        System.out.println("Base area = " + baseArea);
        System.out.println("Volume = " + volume);
        scanner.close();
    }
}
