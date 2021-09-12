
import java.util.Scanner;

class Main{

    static double add(int numOfCourses, double[] gradePoint){
        {
            double sum = 0;
            for(int j = 0; j <= (numOfCourses - 1); j++)

                sum = sum + gradePoint[j];
            return sum;
        }
    }


    public static void main(String[] args) {

        int creditHours;
        int numOfCourses;

        Scanner cHours = new Scanner(System.in);
        Scanner gPoint = new Scanner(System.in);
        Scanner numCourses = new Scanner(System.in);

        System.out.println("Please enter number of courses: ");
        numOfCourses = numCourses.nextInt();
        System.out.println("Please enter credit hours: ");
        creditHours = cHours.nextInt();
        int j = 0;
            //stores gradepoints in array 
        double[] gradePoint = new double[numOfCourses];

        for (int i = 0; i <= (numOfCourses - 1); i++){
            System.out.println("Enter gradepoint: ");
            gradePoint[i] = gPoint.nextDouble();
        }

        double sum = add(numOfCourses, gradePoint);

        double gpa =  sum / (creditHours * numOfCourses);

        System.out.println("Your GPA is: " + gpa);

        if (gpa >= 3.6 && gpa <= 4.0){              //gpa classification
            System.out.println("First Class");
        }else if(gpa >= 3.0 && gpa <= 3.599){
            System.out.println("Second Class (Upper Division)");
        }else if(gpa >= 2.00 && gpa <= 2.999){
            System.out.println("Second Class (Lower Division)");
        }else if(gpa >= 1.50 && gpa <= 1.999){
            System.out.println("Third Class");
        }else if(gpa >= 1.00 && gpa <= 1.499){
            System.out.println("Pass");
        }else if(gpa >= 0.00 && gpa <= 0.999){
            System.out.println("Fail");
        }else{
            System.out.println("You might have made a wrong input");
        }

        System.out.println("\nYour performance chart is shown below: \n");


                //performance chart

        while(Math.round(gradePoint[j]) != 0){    //gradepoint is rounded
            gradePoint[j] -= 1;
            System.out.print("[#");
             if (Math.round(gradePoint[j]) == 0){
                j++;
                System.out.println(" ");
            }else if(j == numOfCourses - 1){
               while(Math.round(gradePoint[j]) != 0){
                gradePoint[j] -= 1;
                   System.out.print("[#");
               }
                System.out.println("");
                break;
            }
        }

    }
}




