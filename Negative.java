/**
 * Name: myla Vijayan
 * Date: 4-10-24
 */

 import java.util.*;

 public class Negative{

    public static void main (String[] args){

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int sum = 0;

        firstNum = (int)(7*(Math.random())-3);
        secondNum = (int)(7*(Math.random())-3);
        thirdNum = (int)(7*(Math.random())-3);
        fourthNum = (int)(7*(Math.random())-3);


        sum = firstNum + secondNum + thirdNum + fourthNum;

        if(sum==0)
        {
            System.out.print("False");
        }

        else
        {
            System.out.print("True");
        }

        System.out.println();
        System.out.println(sum);
    }
 }