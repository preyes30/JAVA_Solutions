//completed

public class Problem5_3 {
    public static void main(String[] args){

        //Conversion from kilograms to pounds : Write a program that displays the following table
        //Kilograms     Pounds
        //1             2.2/05
        //3             6.6
        //....
        // 197          433.4
        //199           437.8

        System.out.println("Kilograms   Pounds");
        for(int i = 0; i < 100 ; i++){
            //odd numbers : 2n + 1
            int oddNumbers = 2*i + 1;
            double pounds = oddNumbers * 2.205;


            System.out.println(oddNumbers + "           " + pounds);
        }

        
    }
}
