
import java.util.*;

public class DivandMod{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int int1 = input.nextInt();

        System.out.print("Enter a second integer: ");
        int int2 = input.nextInt();

        double div = int1 / int2;
        double mod = int1 % int2;

        System.out.println(int1 + " divided by " + int2 + " = " + div);
        System.out.println("the remainder = " + mod);

        input.close();
    }
}
