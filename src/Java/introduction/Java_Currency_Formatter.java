package Java.introduction;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

       // NumberFormat nf = NumberFormat.getInstance(Locale.US);
        NumberFormat nf_us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf_india = NumberFormat.getInstance(Locale.ENGLISH);
        NumberFormat nf_china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf_france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
         String us = nf_us.format(payment) ;
         DecimalFormat df = new DecimalFormat("###,###.00");
         String india = df.format(payment);
         india = "Rs."+ india ;
         String china = nf_china.format(payment) ;
         String france = nf_france.format(payment) ;


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
