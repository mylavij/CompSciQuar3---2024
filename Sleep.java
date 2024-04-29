/*****
 * Name: Myla Vijayan
 * Date: 3-7-2024
 */

 import java.util.*;

 public class Sleep{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate: "); 
        System.out.print("Year: ");
        int birthYear = input.nextInt();
        System.out.print("Month: ");
        int birthMonth = input.nextInt();
        System.out.print("Day: ");
        int birthDay = input.nextInt();

        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        int currentYear = input.nextInt();
        System.out.print("Month: ");
        int currentMonth = input.nextInt();
        System.out.print("Day: "); 
        int currentDay = input.nextInt();

        int timeAlive = (currentYear - birthYear)*365 + (currentMonth - birthMonth)*30 + (currentDay - birthDay);
        System.out.println("You have been alive for: " + timeAlive + " days");

        int timeSlept = timeAlive * 8;
        System.out.println("You have slept for: " + timeSlept + " hours");

        input.close();

    }
 }