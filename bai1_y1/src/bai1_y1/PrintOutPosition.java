/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_y1;

import java.util.Scanner;

public class PrintOutPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the number b: ");
        int b = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == a - b) {
                System.out.println("The location of the a-b element in the array:");
                System.out.println("Location " + i);
            }
        }
    }
}
