
import java.util.Scanner;

 class Main {


    public static void main(String[] args) {

        int decimal;
        int i = 0;

        System.out.println("Enter decimal number: ");
        Scanner dNum = new Scanner(System.in);
        decimal = dNum.nextInt();

        int copyOfdec = decimal;

        long[] binary = new long[32];

        while(decimal != 0){
            binary[i] = decimal % 2;
            decimal /= 2;
            i++;

        }
        {
            System.out.println("'" + copyOfdec + "'" + " in binary is: ");

        for(int j = i - 1; j >= 0; j--)
            System.out.print(binary[j]);
        }

    }
 }




