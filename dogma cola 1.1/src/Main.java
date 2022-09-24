import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        System.out.println("Make your Choose");
        choose = input.nextInt();
        while (choose != -1) {
            switch (choose){
                case 1 :
                    System.out.println("You choose Cola");
                    break;
                case 2:
                    System.out.println("You choose Fanta");
                    break;
                case 3:
                    System.out.println("You choose Water");
                    break;
                case 4:
                    System.out.println("Your choose is sprite");
                    break;
                default:
                    System.out.println("You dont choose any Drink");

            }
            choose = input.nextInt();
        }
    }
}