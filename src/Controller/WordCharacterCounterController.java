/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.WordCharacterCounterModel;
import VIew.WordCharacterCounterView;
import java.util.Scanner;

public class WordCharacterCounterController {
    private WordCharacterCounterModel model;
    private WordCharacterCounterView view;
    private Scanner scanner;

    public WordCharacterCounterController() {
        model = new WordCharacterCounterModel();
        view = new WordCharacterCounterView();
        scanner = new Scanner(System.in);
    }

    public void run() {
        String input = getInputFromUser();

        if (input != null) {
            model.processInput(input);

            view.displayLetterCounts(model.getLetterCounts());
            view.displayCharacterCount(model.getCharacterCount());
        }

        scanner.close();
    }

    private String getInputFromUser() {
        System.out.print("Enter your content: ");
        String input = scanner.nextLine();


        if (input.trim().isEmpty()) {
            System.out.println("Error: Input is empty. Please enter some content.");
            return null;
        }

        return input;
    }
}
