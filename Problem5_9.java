//Figure out how to get the second highest score

import java.util.Scanner;


public class Problem5_9 {
    public static void main(String[] args){
        /*
        * (Find the two highest scores)
        Write a Program that prompts the user to enter the number of students and each students name and score
        and finally displays the student with the highest score and the student with the second
        highest score. Use the next() method in the Scanner class to read a name rather than using the
        nextLine() method. Assume that the number of students is at least 2
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numOfStudents = input.nextInt();
        int highestScore = 0;
        int secHighestScore = 0;
        while(true){

            for(int i = 0; i < numOfStudents; i++) {
                System.out.println("Enter the name of the student: ");
                String nameOfStudents = input.next();

                System.out.println("Enter their score: ");
                int stuScore = input.nextInt();

                if (stuScore > highestScore) {
                    highestScore = stuScore;
                }

            }
            
            //How to get the second highest scoreee hmmm...
            //
            System.out.println("The highest score is: " + highestScore);
            System.out.println("The second highest score is: " + secHighestScore);



            break;



        }



    }
}



