//completed

import java.util.Scanner;

public class Problem5_1 {
    public static void main(String[] args){
        //Write a program that reads an unspecified number of integers , determines how many positive and
        //negative values have been read, and computes the
        //total average if the input values(not counting zeroes) . Your program ends with
        //the input 0. Display the average as a floating-point number

        // Problem: my print statements are also iterating

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a set of integers, the input ends if it is 0: ");
        int countPositives = 0;
        int countNegatives = 0;
        float total = 0;
        double sum = 0;



        while(true) {

            int userInput = input.nextInt();


            if(userInput>0){
                total += countPositives;
               countPositives++; sum++;


            }
            if(userInput< 0){
                total += countNegatives;
               countNegatives++; sum++;


            }

            if(userInput == 0){
                break;
            }



        }

        System.out.print("Number of Positives: " );
        System.out.println(countPositives);
        System.out.print("Number of Negatives: ");
        System.out.println(countNegatives);
        System.out.println("Total amount of ints: " + sum);
        System.out.println("Average: ");
        System.out.print(total / sum);




    }
}
