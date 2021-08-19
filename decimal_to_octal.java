import java.util.Scanner;
 class Main {




    public static void main(String[] args) {

    int decimal;
    int[] octal = new int[80];
    int i = 0;

        System.out.println("Enter decimal number: ");
        Scanner input = new Scanner(System.in);
        decimal = input.nextInt();

        int copyOfDec = decimal;

        while (decimal != 0){

            octal[i] = decimal % 8;
            decimal /= 8;
            i++;

        }

        System.out.println("'" + copyOfDec + "'" + " in octal is: ");

        for (int j = i - 1; j >= 0; j--){

            System.out.print(octal[j]);

        }

        System.out.println();

    }

}




