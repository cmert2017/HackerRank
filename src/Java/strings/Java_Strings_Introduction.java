package Java.strings;
/*
https://www.hackerrank.com/challenges/java-strings-introduction/problem
 */

import java.util.Scanner;

public class Java_Strings_Introduction {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String A = sc.next().trim();
        String B = sc.next().trim();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
       if(B.compareTo(A)< 0 ){
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }

       if(A == null|| B == null){
           System.out.println();

       }else {
           System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
       }
    }

}
