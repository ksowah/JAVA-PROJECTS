
import java.util.Scanner;

 class Main {



    public static void main(String[] args) {

        final int secreteNum = (int)(Math.random() * 10);
        int num;
        int i = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("The secrete number ranges from 0 to 10\n");
        System.out.println("You have 4 chances to get it right\n");

        System.out.println("Guess the number: ");
        num = userInput.nextInt();

        if (num < 0 || num > 10){
            System.out.println("Please enter a number between 0 and 10");

        while (num != secreteNum && i <= 2)
        {
            System.out.println("Try again: ");
            num = userInput.nextInt();
            i++;

            if (num < 0 || num > 10){
                System.out.println("Please enter a number between 0 and 10");
            }
        }

        if(num == secreteNum){
            System.out.println("\nYou Win!!\n");
        }else{
            System.out.println("\nYou lose!!\n");
            System.out.println("The secrete number is: " + secreteNum + "\n");
        }

        }
    }
 }




