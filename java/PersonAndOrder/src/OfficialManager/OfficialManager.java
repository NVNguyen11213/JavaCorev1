/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfficialManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficialManager {

    List<Officer> listOfficer = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void addOfficer() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter sex: ");
        String sex = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter officer (1 - work , 2 - engineer, 3 - staff): ");
        int category = scanner.nextInt();
        scanner.nextLine();

        Officer officer = null;
        switch (category) {
            case 1:
                System.out.print("Enter work: ");
                String work = scanner.nextLine();
                officer = new Worker(work, name, age, sex, address);
                listOfficer.add(officer);
                break;
            case 2:
                System.out.print("Enter majors: ");
                String majors = scanner.nextLine();
                officer = new Engineer(name, age, sex, address, majors);
                listOfficer.add(officer);
                break;
            case 3:
                System.out.print("Enter leve: ");
                int leve = scanner.nextInt();
                officer = new Staff(name, age, sex, address, leve);
                listOfficer.add(officer);
                break;
            default:
                System.out.println("The type of officer is invalid.");
                break;
        }
    }

    void searchByName() {

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        boolean find = false;

        for (Officer officer : listOfficer) {
            if (officer.getName().equalsIgnoreCase(name)) {
                officer.display();
                find = true;
            }
        }

        if (!find) {
            System.out.println("no fine name officer \"" + name + "\".");
        }
    }

    void searchByCharacter() {

        System.out.print("Enter the character to search: ");
        String characters = scanner.nextLine();

        boolean find = false;

        for (Officer officer : listOfficer) {
            if (officer.getName().toLowerCase().contains(characters.toLowerCase())) {
                officer.display();
                find = true;
            }
        }

        if (!find) {
            System.out.println("Can not find officials containing characters \"" + characters + "\" of name.");
        }
    }

    void show() {
        if (listOfficer.isEmpty()) {
            System.out.println("List of empty officials.");
        } else {
            System.out.println("list of officer:");
            for (Officer officer : listOfficer) {
                officer.display();
                System.out.println();
            }
        }
    }

}
