/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_y1;

import java.util.Scanner;


public class TongChanNhoHonN {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int Sum = 0;
        for(int i= 0;i<n;i++)
        {
            if(i%2==0){
                Sum +=i;
            }
        }
         System.out.println("The total even smaller numbers n:" + Sum);
     }
}
