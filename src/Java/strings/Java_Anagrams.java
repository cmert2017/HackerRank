package Java.strings;
/*
https://www.hackerrank.com/challenges/java-anagrams/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.Scanner;

public class Java_Anagrams {

    //solution1
    /*static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result= false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        result = Arrays.equals(charA, charB);

        return  result;
    }*/

    //solution2
    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length()!=b.length()){
         result = false;
        }else {
            for (int i = 0; i < a.length(); i++) {
                int countA = 0, countB = 0, tempCount = 0;
                int j;
                for(j = 0 ; j < a.length(); j++){
                    if(a.charAt(i)==b.charAt(j)){
                        break;
                    }else{
                        tempCount++;
                        if(tempCount==a.length()){
                            return false;
                        }
                    }

                }
                for(int k = 0 ; k < a.length(); k++) {

                    if (a.charAt(i) == a.charAt(k)) {
                        countA++;
                    }

                    if (b.charAt(j) == b.charAt(k)) {
                        countB++;
                    }

                }

                if(countA!=countB){
                    return false;
                }

            }
            result = true;
        }

        return  result;
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
