
import java.util.Scanner;

 class Main {



    public static void main(String[] args) {
        int num;
        System.out.println("Enter number: ");
        Scanner numInput = new Scanner(System.in);
        num = numInput.nextInt();

        if(num % 2 == 0){
            System.out.println("\'" + num +"\'" + " is an even number");
        }else{
            System.out.println("\'" + num +"\'" + " is an odd number");
        }
    }

}
