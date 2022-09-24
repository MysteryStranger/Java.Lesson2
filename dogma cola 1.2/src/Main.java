
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i!=-1){
            System.out.println("Enter Number");
            i = input.nextInt();
            if (i == 1)
                System.out.println("Cola");
            else if (i == 2)
                System.out.println("Fanta");
            else if (i == 3)
                System.out.println("Water");
            else if (i == 4)
                System.out.println("Sprite");
            else
                System.out.println("Error");

            }
        }
    }
