package Java.strings;

import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        for(int i = 0; i < A.length()/2; i++){

            if(A.charAt(i)!=A.charAt(A.length()-1-i)){
                System.out.println("No");
                System.exit(0);
            }

        }

        System.out.println("Yes");



    }
}
