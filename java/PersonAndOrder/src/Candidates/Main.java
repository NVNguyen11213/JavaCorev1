/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Candidates;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manager = new Manage();
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Candidates");
            System.out.println("2. Display candidate's information and the candidate's exam block");
            System.out.println("3. Search by the number of newspapers.");
            System.out.println("0. Program escape");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.addCandidates();
                    break;
                case 2:
                    manager.show();
                case 3:
                    manager.search();
                    break;
                case 0:
                    System.out.println("The program has ended.");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection.");
            }
        }
    }
}
