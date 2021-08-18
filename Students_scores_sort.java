import java.util.*;

class Main {



             public static void main(String[] args) {


                 int numberOfStudents;

                 System.out.println("Enter number of students: ");
                 Scanner input = new Scanner(System.in);
                 numberOfStudents = input.nextInt();

                 String name;
                 int score;

                 HashMap<String, Integer> info = new HashMap<>();

                 while(numberOfStudents != 0) {

                     System.out.println("Enter name and score: ");
                     Scanner take = new Scanner(System.in);
                     name = take.nextLine();
                     score = take.nextInt();

                     info.put(name, score);
                     numberOfStudents -= 1;

                     if (numberOfStudents == 0) {

                         ArrayList<Integer> mark = new ArrayList<>(info.values());

                         Collections.sort(mark);

                         System.out.println("The sorted list is below: \n");

                         for (Integer j : mark) {
                             for(Map.Entry<String, Integer> entry: info.entrySet()) {

                                 if (entry.getValue() == j){
                                     System.out.println(entry.getKey() + " : " + j);

                                 }

                             }
                         }

                     }
                 }
             }

         }

