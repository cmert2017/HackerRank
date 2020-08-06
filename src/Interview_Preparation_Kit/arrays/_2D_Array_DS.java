package Interview_Preparation_Kit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _2D_Array_DS {

    static int hourglassSum(int[][] arr) {
        int sumU = 0;
        int sumM = 0;
        int sumD = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <=arr.length-3 ; i++) {
            for (int j = 0; j<=arr[0].length-3 ; j++) {
                sumU = arr[i][j] + arr[i][j+1]+arr[i][j+2];
                sumM = arr[i+1][j+1];
                sumD = arr[i+2][j] + arr[i+2][j+1]+arr[i+2][j+2];
                list.add(sumU+sumM+sumD);
            }
        }

        Collections.sort(list);


        return list.get(list.size()-1);
    }



    public static void main(String[] args) {

        int[] [] list = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };
        System.out.println(hourglassSum(list));
    }
}

