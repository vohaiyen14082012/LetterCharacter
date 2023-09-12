/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.StringTokenizer;

public class WordCharacterCounterModel {
    private HashMap<Character, Integer> letterCounts;
    private int characterCount;

    public WordCharacterCounterModel() {
        letterCounts = new HashMap<>();
        characterCount = 0;
    }

    public void processInput(String input) {
        letterCounts.clear();
        characterCount = input.length();

        input = input.toLowerCase(); // Convert input to lowercase for case-insensitivity
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isLetter(c)) {
                    letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
                }
            }
        }
    }

    public HashMap<Character, Integer> getLetterCounts() {
        return letterCounts;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
