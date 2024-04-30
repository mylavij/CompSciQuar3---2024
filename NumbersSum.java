/***
 * Name: Myla Vijayan
 * Date: 3-20-2024
 ***/

import java.util.*;

public class NumbersSum {
    
    public static void main(String[] args){

        int number = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        number = input.nextInt();
        System.out.println(number);
        sum += number;

        while(number > 1)
        {
            number = number - 1;
            sum += number;
            System.out.println(number);
        }
        
        System.out.println("Sum of the numbers: " + sum);

        input.close();
    }
}
