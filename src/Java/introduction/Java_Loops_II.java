package Java.introduction;
/*
https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;

            for (int j = 0; j < n ; j++) {

                sum += Math.pow(2, j) * b ;
                System.out.print(sum+ " ");

            }
            System.out.println();
        }

        in.close();
    }
}
