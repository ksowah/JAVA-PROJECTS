import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{



        public static void main(String[] args) {

            int numOfList;
        // user enters number of items
            System.out.println("Enter number of names: ");

            Scanner number = new Scanner(System.in);
            numOfList = number.nextInt();

            System.out.println("Please enter list of names");
                // ArrayList stores the names 
            ArrayList<String> names = new ArrayList<>();
            Scanner name = new Scanner(System.in);


              // loop the number of items times
            for (int i = 1; i <= numOfList; i++){

                names.add(name.nextLine());
            }

            Collections.sort(names);

            System.out.println();
            System.out.println("The sorted list is below: ");
            System.out.println();


            for (String s : names) {
                System.out.println(s);
            }
            

            }

    }





