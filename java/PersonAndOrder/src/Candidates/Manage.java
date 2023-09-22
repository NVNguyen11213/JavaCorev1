/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Candidates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manage {

    List<Candidates> listCandidates = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private int identificationNumber;

    void addCandidates() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter priority Level: ");
        String priorityLevel = scanner.nextLine();
        System.out.print("Enter officer (1 - A , 2 - B, 3 - C): ");
        int category = scanner.nextInt();
        scanner.nextLine();

        Candidates candidates = null;
        switch (category) {
            case 1:
                System.out.print("Enter math Scores: ");
                float mathScores = scanner.nextFloat();
                System.out.print("Enter physical Point: ");
                float physicalPoint = scanner.nextFloat();
                System.out.print("Enter chemistry Point: ");
                float chemistryPoint = scanner.nextFloat();
                candidates = new BlockA(mathScores, physicalPoint, chemistryPoint, name, address, priorityLevel);
                listCandidates.add(candidates);
                break;
            case 2:
                System.out.print("Enter math ScoresB: ");
                float mathScoresB = scanner.nextFloat();
                System.out.print("Enter chemistry PointB: ");
                float chemistryPointB = scanner.nextFloat();
                System.out.print("Enter biology Point: ");
                float biologyPoint = scanner.nextFloat();
                candidates = new BlockB( mathScoresB,  chemistryPointB, biologyPoint, name, address,  priorityLevel);
                listCandidates.add(candidates);
                break;

            case 3:
                System.out.print("Enter literature Point: ");
                float literaturePoint = scanner.nextFloat();
                System.out.print("Enter history Point: ");
                float historyPoint = scanner.nextFloat();
                System.out.print("Enter geography Point: ");
                float geographyPoint = scanner.nextFloat();
                candidates = new BlockC( literaturePoint, historyPoint, geographyPoint, name,  address,priorityLevel);
                listCandidates.add(candidates);
                break;
            default:
                System.out.println("The type of officer is invalid.");
                break;
        }
    }
    void show() {
        if (listCandidates.isEmpty()) {
            System.out.println("List of empty candidates.");
        } else {
            System.out.println("list of candidates:");
            for (Candidates candidates : listCandidates) {
                candidates.display();
                System.out.println();
            }
        }
    }
    void search() {

        System.out.print("Enter Identification Number: ");
        int Number = scanner.nextInt();

        boolean find = false;

        for (Candidates candidates : listCandidates) {
            if (candidates.getIdentificationNumber() == Number) {
                candidates.display();
                find = true;
            }
        }

        if (!find) {
            System.out.println("no fine name officer \"" + Number + "\".");
        }
    }

}
