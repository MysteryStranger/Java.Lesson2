import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] drinks = {"Cola", "Fanta", "Water", "Sprite"};

        Scanner input = new Scanner(System.in);

        int choice;

        System.out.println("Type a number between 0 and 3 to choose a drink. When done, type -1. Drinks: 0. Cola, 1. Fanta, 2. Water, 3. Sprite");
        choice = input.nextInt();

        while (choice != -1) {
            if (choice >= -1 && choice < 4) {
                System.out.println("The drink you chose is: " + drinks[choice]);
                System.out.println("Type a number between 0 and 3 to choose a drink. When done, type -1. Drinks: 0. Cola, 1. Fanta, 2. Water, 3. Sprite");
                choice = input.nextInt();
            } else {
                System.out.println("Wrong choice, try again");
                choice = input.nextInt();
            }
        }
        System.out.println("Thank you for drinking!");
    }
}