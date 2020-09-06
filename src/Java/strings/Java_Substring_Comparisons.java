package Java.strings;
/*
https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.Scanner;

public class Java_Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i <= s.length() - k; i++) {

            if (s.substring(i, k + i).compareTo(smallest) < 0) {
                smallest = s.substring(i, k + i);
            }

            if (s.substring(i, k + i).compareTo(largest) > 0) {
                largest = s.substring(i, k + i);
            }

        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
}

