import java.util.Scanner;
 class Main {




    public static void main(String[] args) {

    int decimal;
    int[] octal = new int[80];
    int i = 0;

        // take user input
        System.out.println("Enter decimal number: ");
        Scanner input = new Scanner(System.in);
        decimal = input.nextInt();

        // user input is copied to another variable
        int copyOfDec = decimal;
     
         // loops through the given decimal number
        while (decimal != 0){

            octal[i] = decimal % 8;
            decimal /= 8;
            i++;

        }

        System.out.println("'" + copyOfDec + "'" + " in octal is: ");

     
        // the looped results is then looped again but in reverse order
        for (int j = i - 1; j >= 0; j--){

            System.out.print(octal[j]);

        }

        System.out.println();

    }

}




