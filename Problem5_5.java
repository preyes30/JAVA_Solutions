//completed


public class Problem5_5 {
    public static void main(String[] args){
        /*
        (Conversion from kilograms to pounds and pounds to kilograms)
        Write a program that displays the following two tables side by side:
        Kilograms   Pounds      |   Pounds Kilograms
        1               2.2     |   20      9.09
        3               6.6
        ....
        197             433.4   |   510     231.82
        199             437.8   |   515     234.09
         */

        System.out.println("Kilograms   Pounds  |   Pounds  Kilograms");

        for(int i = 0; i < 200; i++){
            int oddNumbers = 2*i + 1;
            double pounds = oddNumbers * 2.205;
            System.out.println(oddNumbers + "           " + pounds);
        }

        for(int i = 4; i < 104; i++){
            int multipleOfFives = i * 5;
            double kilogram = multipleOfFives/2.205;
            System.out.println("                    |   " + multipleOfFives + "     " + kilogram);
            }


        }
    }

