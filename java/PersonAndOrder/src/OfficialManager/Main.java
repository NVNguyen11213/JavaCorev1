/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialManager;

import java.util.Scanner;


public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OfficialManager manager = new OfficialManager();
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add officer");
            System.out.println("2. Search by name");
            System.out.println("3. Search according to the character's character");
            System.out.println("4. Display information about the list of officials.");
            System.out.println("0. Program escape");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.addOfficer();
                    break;
                case 2:
                    manager.searchByName();
                    break;
                case 3:
                    manager.searchByCharacter();
                    break;
                case 4:
                    manager.show();
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
