package hendlers;

import org.models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    private static Scanner scanner = new Scanner(System.in);
public static MenuOptions getMenuOptionFromUser(){
    return MenuOptions.values()[getSelectedOptionFromUser() -1];
}
    private static int getIntegerFromUser() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("It is not an Integer. Try again");
        }
        return scanner.nextInt();
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();
        scanner.nextLine();
        if (result > 0 && result < MenuOptions.values().length + 1) {
            return result;
        } else {
            System.out.println("You have selected a non accepted option :(");
            return getSelectedOptionFromUser();
        }
    }
}