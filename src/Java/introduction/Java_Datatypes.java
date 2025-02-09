package Java.introduction;
/*
https://www.hackerrank.com/challenges/java-datatypes/problem

 */

import java.util.Scanner;

public class Java_Datatypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) System.out.println("* long");
               // if(x>=Float.MIN_VALUE && x<=Float.MAX_VALUE)System.out.println("* float");
                //if(x>=Double.MIN_VALUE && x<=Double.MAX_VALUE)System.out.println("* double");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }


    }
}
