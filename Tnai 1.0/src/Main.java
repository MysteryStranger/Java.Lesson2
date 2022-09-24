import java.util.Scanner;

public class Main {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String [] drinks = {"Cola","Fanta","Water","Sprite"};

    int userSelection = 0;

    while (userSelection != -1) {

        displayMenu();

        userSelection = sc.nextInt();

        if (0 < userSelection && userSelection < 5)
            System.out.println("Your selection : " + drinks[--userSelection]);
        else
            System.out.println("Wrong selection, please try again...\n");
    }
    System.out.println("Thank you, have a nice day!");
}
public static void displayMenu() {
    System.out.println("Hello, please select one of the drinks below (1-4) : ");
    System.out.println("1. Cola");
    System.out.println("2. Fanta");
    System.out.println("3. Water");
    System.out.println("4. Sprite");
}
}
