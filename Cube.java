package org.example._2024_02_23;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side size: ");
        double side = scanner.nextDouble();
        //double volume = Math.pow(side, 3);
        double volume = calculateVolumeCube(side);
        System.out.println("Объем куба: " +volume);
    }
    public static double calculateVolumeCube(double side) {
        return  Math.pow(side, 3);
    }
}