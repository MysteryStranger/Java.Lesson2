import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

 soda();
    }
  public static void soda(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("For cola press 1. For Pepsi press 2. For sprite press 3.For fanta press 4");
        int userInput = scanner.nextInt();

        switch(userInput) {
            case 1:
                System.out.println("Cola is a Great drink");
                break;
            case 2:
                System.out.println("Pepsi is better than cola");
                break;
            case 3:
                System.out.println("Sprite is big smoke drink");
                break;
            case 4:
                System.out.println("Fanta is orange");
                break;
            default:
                System.out.println("You need to try yourself Better");
                soda();
        }
    }
}