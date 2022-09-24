import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int customerChoose;
        int[] drinksArray = {1, 2, 3, 4};
        System.out.println("what drink would you like to purchase? (choose a number pls!)");
        System.out.println("1 - cola");
        System.out.println("2 - fanta");
        System.out.println("3 - water");
        System.out.println("4 - sprite");
        customerChoose = scan.nextInt();
        if (customerChoose > 4) {
            System.out.println("you typed wrong number!");
            System.out.println("what drink would you like to purchase? (choose a number pls!)");
            System.out.println("1 - cola");
            System.out.println("2 - fanta");
            System.out.println("3 - water");
            System.out.println("4 - sprite");
            customerChoose = scan.nextInt();
        } else if (customerChoose == 1) {
            System.out.println(customerChoose + "-" + "your choice is cola!");
        } else if (customerChoose == 2) {
            System.out.println(customerChoose + "-" + "your choice is fanta!");
        } else if (customerChoose == 3) {
            System.out.println(customerChoose + "-" + "your choice is water!");
        } else if (customerChoose == 4) {
            System.out.println(customerChoose + "-" + "your choice is sprite!");
        } else {
            System.out.println(customerChoose + "-" + "error pls try later");
        }
