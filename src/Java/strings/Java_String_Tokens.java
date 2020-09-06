package Java.strings;
/*
https://www.hackerrank.com/challenges/java-string-tokens/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.Scanner;

public class Java_String_Tokens {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.length()==0){
            System.out.println(0);
        }else {
            String[] strings = s.split("[ !,?._'@]+", 0);
            System.out.println(strings.length);
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
        }
        // Write your code here.
        scan.close();

    }

}
