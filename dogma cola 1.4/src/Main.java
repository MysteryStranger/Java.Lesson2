import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[]  sodas  = {"Cola","Soda","Water","Sprite"};
        int soda;
        System.out.println("choose a soda:\n1)Cola\n2)Soda\n3)Water\n4)Sprite\n\nto stop ordering sodas please enter -1\n");
        soda=input.nextInt();
        while(soda!=-1){
            if ((soda>4)||(soda<1&&soda!=-1)) {
                System.out.println("Wrong input please try again\n");
            }
            else {
                System.out.println("You chose "+sodas[soda-1]+"\n");
            }

            soda=input.nextInt();
        }
        System.out.println("Thank you for your purchase");

    }
}