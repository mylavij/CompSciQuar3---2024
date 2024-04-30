/**
 * Name: Myla Vijayan
 * Date: 3-22-24
 */

 import java.util.*;

public class DigitsSum{

  public static void main(String[] args){
  int num = 0;
  int numLength = 0;
  int sumFinal = 0;
  String i = "";

  Scanner input = new Scanner(System.in);

  System.out.print("Enter a positive integer: ");
  num = input.nextInt();

  String numStr = "" + num;
  numLength = numStr.length();

  for(int j = 0; j < numLength; j++){

    i = numStr.substring(j, j + 1);
    sumFinal += Integer.valueOf(i);


  }

  System.out.println("The sum of the digits is: " + sumFinal);

  input.close();
  }
}
