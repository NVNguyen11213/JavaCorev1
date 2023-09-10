/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_y1;

import java.util.Arrays;
import java.util.Scanner;

public class MixTowArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array 1 : ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the array 1 :");
        for (int i = 0; i < n1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements of the array 2 : ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the array 2 :");
        for (int i = 0; i < n2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr2[i] = scanner.nextInt();
        }

        int[] mergedArray = new int[n1 + n2];
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1, n2);
        Arrays.sort(mergedArray);

        System.out.println("The array has been mixed in the order of increasing: " + Arrays.toString(mergedArray));
    }
}
