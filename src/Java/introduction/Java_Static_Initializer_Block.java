package Java.introduction;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class Java_Static_Initializer_Block {
    static  Scanner input = new Scanner(System.in);
        static int B;
        static int H;
        static boolean flag;
        static {

            B = input.nextInt();
            H = input.nextInt();
            if(B > 0 & H > 0) {
                flag = true;
            }else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
    

