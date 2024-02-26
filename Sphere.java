package org.example._2024_02_23;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius size: ");
        double radius = scanner.nextDouble();
        //double area = 4 * Math.PI * Math.pow(radius, 2);
        double area = calculateSphereArea(radius);
        System.out.println("Площадь сферы: " +area);
    }
    public static double calculateSphereArea (double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
