/**
 * Name: Myla Vijayan
 * Date: 3-1-24
 */

import java.util.Scanner;

public class AccountSetup {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.next();
        System.out.println("Your name is " + fullName);

        System.out.print("Enter your password: ");
        String password = input.next();
        System.out.println("Your password is " + password);

        input.close();

    } 
}
