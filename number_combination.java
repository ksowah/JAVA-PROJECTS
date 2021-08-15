package com.Practice;
import java.util.Scanner;
public class Main {

        static long productOfNumerator(int copyOfn, int[] store) {

            {
            long product = 1;
            for (int j = 0; j < copyOfn; j++)

                product *= store[j];

            return product;
            }
        }

    static long productOfdenomenatorA(int copyOfdenomenatorA, int[] denA) {

        {
            long product = 1;
            for (int j = 0; j < copyOfdenomenatorA; j++)

                product *= denA[j];

            return product;
        }
    }

    static long productOfdenomenatorB(int copyOfr, int[] denB) {

        {
            long product = 1;
            for (int j = 0; j < copyOfr; j++)

                product *= denB[j];

            return product;
        }
    }



    public static void main(String[] args) {

        int n;
        int r;
        int i = 0;

        System.out.println("Enter first number: ");
        Scanner enterN = new Scanner(System.in);
        n = enterN.nextInt();
        System.out.println("Enter combination number: ");

        Scanner enterR = new Scanner(System.in);
        r = enterR.nextInt();


        int copyOfn = n;
        int[] store = new int[n];

        while(n != 0){

            store[i] = n;
            n = n - 1;
            i++;

        }

      long top = productOfNumerator(copyOfn, store);

        int j = 0;

        int denomenatorA = copyOfn - r;
        int copyOfdenomenatorA = denomenatorA;

        int[] denA = new int[denomenatorA];

        while(denomenatorA != 0){

            denA[j] = denomenatorA;
            denomenatorA -= 1;
            j++;

        }

        long denoA = productOfdenomenatorA(copyOfdenomenatorA, denA);

        int denominatorB = r;
        int copyOfr = r;
        int[] denB = new int[r];
        int k = 0;

        while(r != 0){

            denB[k] = r;
            r -= 1;
            k++;

        }

        long denoB = productOfdenomenatorB(copyOfr, denB);

        long finalDenominator = denoA * denoB;

        long combination = top / finalDenominator;

        System.out.println(combination);


    }

}




