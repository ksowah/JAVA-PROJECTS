import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    // main class
    String name;
    String password;

    public class Account extends Main {

        // method for creating account
     public void CreateAccount(){

        try{

           Scanner input = new Scanner(System.in);
            System.out.println("Enter username: ");
            name = input.nextLine();
            System.out.println("Enter password");
            password = input.nextLine();
            FileWriter data = new FileWriter(/*You can decide to specify file path here +*/name +  password + ".txt");
            data.write("Dear " + name + " you have successfully logged in");
            data.close();
            System.out.println("Account successfully created");

        }catch (IOException e){
            System.out.println("An error may have occurred");
            e.printStackTrace();
        }

    }

        // Login method
        public void LogIn(){

            System.out.println("Enter username: ");
            Scanner user = new Scanner(System.in);
            name = user.nextLine();
            System.out.println("Enter password: ");
            password = user.nextLine();

            try{
                File signIn = new File(/*You can decide to specify file path here +*/ name + password + ".txt");
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
        
        
        // Delete method
        public void Delete(){

            System.out.println("Enter username: ");
            Scanner user = new Scanner(System.in);
            name = user.nextLine();
            System.out.println("Enter password: ");
            password = user.nextLine();

            File terminate = new File(/*You can decide to specify file path here +*/ name +  password + ".txt");
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
        
        // take user response
        Scanner feedBack = new Scanner(System.in);
        response = feedBack.nextInt();

        // evaluate response with conditional if statement
        if (response == 1){

            Main parent = new Main();
            Main.Account child = parent.new Account();
            child.CreateAccount();
        }else if (response == 0){

            Main parent = new Main();
            Main.Account child = parent.new Account();
            child.LogIn();

        }else if(response == 2){

            Main parent = new Main();
            Main.Account child = parent.new Account();
            child.Delete();

        } else{
            System.out.println("Invalid input");
        }

    }
}




