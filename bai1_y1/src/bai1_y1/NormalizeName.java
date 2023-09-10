/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_y1;

public class NormalizeName {
    public static void main(String[] args) {
        String name = "tA duY hieU";
        String[] words = name.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String normalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            words[i] = normalizedWord;
        }
        String normalizedName = String.join(" ", words);

        System.out.println("Standardization name: " + normalizedName);
    }
}
