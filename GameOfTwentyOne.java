/**
 * Name: Myla Vijayan
 * Date: 4-10-24
 */

import java.util.*;

public class GameOfTwentyOne {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rand1 = 0;
        int rand2 = 0;
        int rand3 = 0;
        int sum = 0;
        int option;

        int drand1 = 0;
        int drand2 = 0;
        int drand3 = 0;
        int dsum = 0;

        rand1 = (int)(10*(Math.random())-1);
        rand2 = (int)(10*(Math.random())-1);
        sum = rand1 + rand2;
        
        System.out.println("You have a " +rand1 +" and a " + rand2 + " for a total of " + sum);
        System.out.print("Enter a 1 if you want another card or any other number for no card: ");
        option = input.nextInt();

        if(option == 1)
        {
            rand3 = (int)(10*(Math.random())-1);
            sum = rand1 + rand2 + rand3;
            System.out.println("You got an additional " + rand3 + " for a total of " + sum);
        }

        drand1 = (int)(10*(Math.random())-1);
        drand2 = (int)(10*(Math.random())-1);
        drand3 = (int)(10*(Math.random())-1);

        dsum = drand1 + drand2 + drand3;     
        System.out.println("The dealer has a " + drand1 + ", " +drand2 + " and, " + drand3 + " for a total of " + dsum + ".");
        
        if(sum > 21)
        {
            System.out.println("You lose. Dealer wins!");
        }

        else if(dsum > 21)
        {
            System.out.println("You win. Dealer loses!");
        }

        else if(sum > dsum)
        {
            System.out.println("You win. Dealer loses!");
        }

        else if(sum < dsum)
        {
            System.out.println("You lose. Dealer wins!");
        }

        else
        {
            System.out.println("Tie.");
        }

        input.close();

    }
}    

