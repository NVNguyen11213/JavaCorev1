/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_y1;

import java.util.Scanner;

public class CountTheNumberOfAppearance {

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
        int[][] appear = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            appear[i][0] = arr[i];
            appear[i][1] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    appear[j][1] = 0;
                }
            }
            if (appear[i][1] != 0) {
                appear[i][1] = count;
            }
        }
        for (int i = 0; i < appear.length; i++) {
            if (appear[i][1] != 0) {
                System.out.println("Element " + appear[i][0] + " appear " + appear[i][1]);
            }
        }
    }
}
