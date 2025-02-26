//completed

public class Problem5_7 {
    public static void main(String[] args){
/*
       (Financial application: compute future tuition) Suppose the tuition for a university
       is $10,000 this year and increases 5% every year. In one year, the tuition will
        be $10,500. Write a program that displays the tuition in 10 years, and the total
        cost of four years’ worth of tuition starting after the tenth year.
       */

        int startTuition = 10000;
        double percent = 0.05;
        double newStart = 0; //To keep track everytime the starting tuition changes
        double newIncrease = 0; // Keeps track of the new increase


        double tuitionIncrease = startTuition * percent; // 500 = 10000 * 0.05
        newStart = newStart + startTuition + tuitionIncrease; // 0 = 0 + 10000 + 500                                                      // 10500 = 10500
        newIncrease = newIncrease + newStart * percent; //525

        System.out.println("New Tuition for year " + 1 + ": " + newStart);



        for(int i = 2; i < 11; i++){

            newStart = newStart + newIncrease; //10500 + 525 = 11,025
            newIncrease = newStart * percent;
            System.out.println("New Tuition for year " + i + ": " + newStart );

        }

        System.out.println();
        double totalOfFourYears = 0;
        //total cost of four years worth of tuition starting after the tenth year
        for(int i = 1; i <= 4; i++){
            newStart = newStart + newIncrease; //10500 + 525 = 11,025
            newIncrease = newStart * percent;

            System.out.println("Tuition of Four Years After the Tenth Year " + i + ": " + newStart);


            totalOfFourYears = totalOfFourYears + newStart;

        }

        System.out.println("\n Total of 4 Years After the Tenth Year: " + totalOfFourYears);




    }
}
