import java.util.Scanner;

public class Main {



        public static void main(String[] args) {

            int decimal;
            int[] hex = new int[100];
            int i = 0;

                // take user input
            System.out.println("Please enter decimal number: ");
            Scanner input = new Scanner(System.in);
            decimal = input.nextInt();

            int copyOfDec = decimal;

             /* loop through the decimal taking the remainders dividing by 16 */
            while (decimal != 0){

                hex[i] = decimal % 16;
                decimal /= 16;
                i++;

            }

            System.out.println(copyOfDec + " in hexadecimal is: ");

                // result is printed in reverse
            for (int j = i - 1; j >= 0; j--){
                

                if (hex[j] == 10){

                    System.out.print("A");
                }
                else if (hex[j] == 11){

                    System.out.print("B");
                }
                else if (hex[j] == 12){

                    System.out.print("C");
                }
                else if (hex[j] == 13){
                    System.out.print("D");
                }
                else if (hex[j] == 14){
                    System.out.print("E");
                }
                else if (hex[j] == 15){
                    System.out.print("F");
                }
                else{
                    System.out.print(hex[j]);
                }

            }

        }
    }





