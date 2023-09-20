/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personandorder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admissions admissions = new Admissions();
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add person");
            System.out.println("2. Edit person");
            System.out.println("3. Delete person");
            System.out.println("4. Add orders for people");
            System.out.println("5. Edit orders of people");
            System.out.println("6. Delete orders of people");
            System.out.println("7. Show list of people and orders");
            System.out.println("0. Program escape");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    admissions.addPerson(scanner);
                    break;
                case 2:
                    admissions.editPerson(scanner);
                    break;
                case 3:
                    admissions.deletePerson(scanner);
                    break;
                case 4:
                    admissions.addOrder(scanner);
                    break;
                case 5:
                    admissions.editOrder(scanner);
                    break;
                case 6:
                    admissions.deleteOrder(scanner);
                    break;
                case 7:
                    admissions.displayPeopleAndOrders();
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
