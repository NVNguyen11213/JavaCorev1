/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_y1;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        double a = scanner.nextInt();
        System.out.print("enter b: ");
        double b = scanner.nextInt();
        System.out.print("enter c: ");
        double c = scanner.nextInt();

        if (a == 0) {
            double x = -c / b;
            System.out.println("The equation has 1 distinct solutions:");
            System.out.println("x = " + x);
        }
        if (b == 0) {
            double x1 = Math.sqrt(-c / a);
            double x2 = -Math.sqrt(-c / a);
            System.out.println("The equation has 2 distinct solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (a != 0 && b != 0) {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has 2 distinct solutions:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Equation with double solutions:");
                System.out.println("x1 = x2 = " + x);
            } else {
                System.out.println("The equation has no solution");
            }
        }
    }

}
