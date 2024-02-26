package org.example._2024_02_23;

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner sc_1 = new Scanner(System.in);
        System.out.println("Enter base side size: ");
        double base_1 = sc_1.nextDouble();

        Scanner sc_2 = new Scanner(System.in);
        System.out.println("Enter base side size: ");
        double base_2 = sc_2.nextDouble();

        Scanner sc_3 = new Scanner(System.in);
        System.out.println("Enter  side size: ");
        double side_1 = sc_3.nextDouble();

        Scanner sc_4 = new Scanner(System.in);
        System.out.println("Enter  side size: ");
        double side_2 = sc_4.nextDouble();

        //double perimetr = base_1 + base_2 + side_1 + side_2;
        double perimetr = calculatePerimetrTrapezoid(base_1, base_2, side_1, side_2);
        System.out.println("Периметр трапеции: " +perimetr);
    }
    public static double calculatePerimetrTrapezoid(double base_1, double base_2, double side_1, double side_2){
        return base_1 + base_2 + side_1 + side_2;
    }

}
