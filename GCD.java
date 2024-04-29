/**
 * Name: Myla Vijayan
 * Date: 3-21-24
 */
import java.util.*;

public class GCD {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: "); 
        int num1 = input.nextInt();
        System.out.print("Enter another non-negative integer: ");
        int num2 = input.nextInt();

        while (num2 > 0)
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int GCD = num1; 
        System.out.print("The GCD is " + GCD);
    
        input.close();

    }
}
