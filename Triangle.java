package org.example._2024_02_23;

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc_1 = new Scanner(System.in);
        System.out.println("Enter base side size: ");
        double base = sc_1.nextDouble();

        Scanner sc_2 = new Scanner(System.in);
        System.out.println("Enter height size: ");
        double height = sc_1.nextDouble();
        //double area = 0.5 * base * height;
        double area = calculateAreaTriangle(base, height);
        System.out.println("Площадь треугольника: " +area);
    }
    public static double calculateAreaTriangle (double base, double height) {
        return 0.5 * base * height;
    }

}