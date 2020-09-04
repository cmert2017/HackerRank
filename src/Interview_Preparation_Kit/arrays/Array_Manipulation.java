package Interview_Preparation_Kit.arrays;

import java.util.Arrays;

public class Array_Manipulation {

    // Complete the arrayManipulation function below.
    //version 1: it passed several tests
   /* static long arrayManipulation(int n, int[][] queries) {
        int result = 0;
        int[] arr = new int[n];

        for (int i = 0; i < queries.length ; i++) {
            for (int j = queries[i][0]-1; j <=queries[i][1]-1 ; j++) {

                arr[j] += queries[i][2];

            }

        }

        Arrays.sort(arr);

        return arr[n-1];
    }*/


    /*// Complete the arrayManipulation function below.
    //version2: with while loop : it is same as version1
    static long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n];

        int i = 0;
        while(i < queries.length ) {
            for (int j = queries[i][0]-1; j <=queries[i][1]-1 ; j++) {

                arr[j] += queries[i][2];

            }
            i++;
        }

        Arrays.sort(arr);

        return arr[n-1];
    }
*/

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        int[] arr1 = new int[queries.length*3];
        long[] arr2 = new long[n];
        long result = 0;
        int j = 0;
        for (int i = 0; i < arr1.length ; i+=3) {
            arr1[i] = queries[j][0];
            arr1[i+1] = queries[j][1];
            arr1[i+2] = queries[j][2];
            j++;
        }
        result = arr1[2];
        for (int i = 0; i < arr1.length; i+=3) {
            try {
                if (arr1[i + 1] >= arr1[i + 3]) {
                    //arr2[arr1[i + 1]] = arr1[i + 2] + arr1[i + 5];
                    result +=  arr1[i + 5];
                } else {
                    arr2[arr1[i]] = arr1[i + 2];
                    arr2[arr1[i + 1]] = arr1[i + 2];
                    arr2[arr1[i + 2]] = arr1[i + 5];
                    arr2[arr1[i + 3]] = arr1[i + 5];
                }
            }catch (Exception e){

            }
        }


        Arrays.sort(arr2);

        //return arr2[n-1];
        return result;
    }





    public static void main(String[] args) {

    int n = 5;
    int[][] queries = new int[3][3];
    queries[0][0]= 1;
    queries[0][1]= 2;
    queries[0][2]= 100;
    queries[1][0]= 2;
    queries[1][1]= 5;
    queries[1][2]= 100;
    queries[2][0]= 3;
    queries[2][1]= 4;
    queries[2][2]= 100;

       /* int n = 10;
        int[][] queries = new int[4][3];
        queries[0][0]= 2;
        queries[0][1]= 6;
        queries[0][2]= 8;
        queries[1][0]= 3;
        queries[1][1]= 5;
        queries[1][2]= 7;
        queries[2][0]= 1;
        queries[2][1]= 8;
        queries[2][2]= 1;
        queries[3][0]= 5;
        queries[3][1]= 9;
        queries[3][2]= 15;
*/

        /*int n = 10;
        int[][] queries = new int[1][3];
        queries[0][0]= 2;
        queries[0][1]= 6;
        queries[0][2]= 8;*/

        System.out.println(queries.length);
        System.out.println(arrayManipulation(n,queries ));



    }
}
