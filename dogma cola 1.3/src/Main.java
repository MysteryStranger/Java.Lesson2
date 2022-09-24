import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String drinks[] = {"Fanta", "Cola", "Sprite", "Whatever it takes"};
        Scanner drinkInput = new Scanner(System.in);
        int drink = drinkInput.nextInt();
        while (drink != -1){
            if(drink > -1 && drink < 4) {
                System.out.println(drinks[drink]);
                drink = drinkInput.nextInt();
            }
            else{
                System.out.println("Invalid choice, try again");
                drink = drinkInput.nextInt();
            }
        }

    }
}