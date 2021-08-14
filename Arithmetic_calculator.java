
import java.util.Scanner;

 class Main {


    public static void main(String[] args) {

        double firstNum;
        double secondNum;
        char operator;
        double answer;

        System.out.println("Enter first number: ");
        Scanner num1 = new Scanner(System.in);
        firstNum = num1.nextDouble();

        System.out.println("Enter operator: ");
        Scanner operand = new Scanner(System.in);
        operator = operand.next().charAt(0);    //to accept char type input

        System.out.println("Enter second number: ");
        Scanner num2 = new Scanner(System.in);
        secondNum = num2.nextDouble();

        if (operator == '+'){
            answer = firstNum + secondNum;
            System.out.println("Your answer is: " + answer);
        }else if (operator == '-'){
            answer = firstNum - secondNum;
            System.out.println("Your answer is: " + answer);
        }else if (operator == '/'){
            answer = firstNum / secondNum;
            System.out.println("Your answer is: " + answer);
        }else if (operator == '*'){
            answer = firstNum * secondNum;
            System.out.println("Your answer is: " + answer);
        }else if (operator == '%'){
            answer = firstNum % secondNum;
            System.out.println("Your answer is: " + answer);
        }else {
            System.out.println("Invalid operator!!");
        }

    }
 }




