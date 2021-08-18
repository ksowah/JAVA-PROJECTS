import java.util.*;

class Main {



             public static void main(String[] args) {


                 int numberOfStudents;

                 System.out.println("Enter number of students: ");
                 Scanner input = new Scanner(System.in);
                 numberOfStudents = input.nextInt();

                 String name;
                 int score;

                  // names and scores are stored in the HashMap array
                 HashMap<String, Integer> info = new HashMap<>();
               
               
                  // information is collected number of students times
                 while(numberOfStudents != 0) {

                     System.out.println("Enter name and score: ");
                     Scanner take = new Scanner(System.in);
                     name = take.nextLine();
                     score = take.nextInt();

                     info.put(name, score);
                     numberOfStudents -= 1;

                     if (numberOfStudents == 0) {

                        // scores are stored in the ArrayList
                         ArrayList<Integer> mark = new ArrayList<>(info.values());
                       
                       
                        // scores are sorted 
                         Collections.sort(mark);

                         System.out.println("The sorted list is below: \n");
                            
                       // sorted scores are now attached to their corresponding student name
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

