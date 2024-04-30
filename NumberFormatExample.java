/**
 * Description of class NumberFormatExample: this application shows how to use different NumberFormat statements in order to write different numerical data in different formats. Like:
 * writing numerical data as currency ($ and hundreds place), as an integer (commas if needed, whole #), as a decimal number (most exact form), and as a percentage (% and conversion).
 * Name: Myla Vijayan
 * Date: 3-1-24
 */

import java.text.NumberFormat;
public class NumberFormatExample {

        public static void main(String[] args){
            double dollars = 21.5;
            int num = 1234;
            double numWithDecimal = 2.0/3.0;
            double sale = .15;


            NumberFormat money = NumberFormat.getCurrencyInstance();
            NumberFormat number = NumberFormat.getIntegerInstance();
            NumberFormat decimal= NumberFormat.getNumberInstance();
            NumberFormat percent= NumberFormat.getPercentInstance();

            System.out.println(money.format(dollars));
            System.out.println(number.format(num));
            System.out.println(decimal.format(numWithDecimal));
            System.out.println(percent.format(sale));
        

    }
    
}
