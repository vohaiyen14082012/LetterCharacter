/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIew;

import java.util.HashMap;

public class WordCharacterCounterView {
    public void displayLetterCounts(HashMap<Character, Integer> letterCounts) {
        System.out.println("Letter counts:");
        for (char c : letterCounts.keySet()) {
            System.out.println(c + "=" + letterCounts.get(c));
        }
    }

    public void displayCharacterCount(int characterCount) {
        System.out.println("Character count: " + characterCount);
    }
}

