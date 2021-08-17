package com.Practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class UserInput {

    String name;
    String password;

    public class Account extends UserInput {


     public void CreateAccount(){

        try{

           Scanner input = new Scanner(System.in);
            System.out.println("Enter username: ");
            name = input.nextLine();
            System.out.println("Enter password");
            password = input.nextLine();
            FileWriter data = new FileWriter("C:\\Users\\user\\Java_Practice\\src\\com\\Practice\\" + name +  password + ".txt");
            data.write("Dear " + name + " you have successfully logged in");
            data.close();
            System.out.println("Account successfully created");

        }catch (IOException e){
            System.out.println("An error may have occurred");
            e.printStackTrace();
        }

    }

        public void LogIn(){

            System.out.println("Enter username: ");
            Scanner user = new Scanner(System.in);
            name = user.nextLine();
            System.out.println("Enter password: ");
            password = user.nextLine();

            try{
                File signIn = new File("C:\\Users\\user\\Java_Practice\\src\\com\\Practice\\" + name + password + ".txt");
                Scanner logOn = new Scanner(signIn);
                while(logOn.hasNextLine()){
                    String data = logOn.nextLine();
                    System.out.println(data);
                }
                logOn.close();
            }catch (FileNotFoundException e){
                System.out.println("Username or password may be incorrect");
                e.printStackTrace();
            }

        }

        public void Delete(){

            System.out.println("Enter username: ");
            Scanner user = new Scanner(System.in);
            name = user.nextLine();
            System.out.println("Enter password: ");
            password = user.nextLine();

            File terminate = new File("C:\\Users\\user\\Java_Practice\\src\\com\\Practice\\" + name +  password + ".txt");
            if(terminate.delete()){
                System.out.println("Account successfully deleted");
            }else{
                System.out.println("Username or password may be incorrect");
            }
        }
    }





    public static void main(String[] args) {

        int response;

        System.out.println("Enter '1' to create an account");
        System.out.println("Enter '0' to login");
        System.out.println("Enter '2' to delete account");
        System.out.println("enter response: ");

        Scanner feedBack = new Scanner(System.in);
        response = feedBack.nextInt();

        if (response == 1){

            UserInput parent = new UserInput();
            UserInput.Account child = parent.new Account();
            child.CreateAccount();
        }else if (response == 0){

            UserInput parent = new UserInput();
            UserInput.Account child = parent.new Account();
            child.LogIn();

        }else if(response == 2){

            UserInput parent = new UserInput();
            UserInput.Account child = parent.new Account();
            child.Delete();

        } else{
            System.out.println("Invalid input");
        }

    }
}




