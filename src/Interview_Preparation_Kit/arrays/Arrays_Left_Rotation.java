package Interview_Preparation_Kit.arrays;

import java.util.Arrays;

public class Arrays_Left_Rotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] b = new int[a.length];

        if(d < a.length){

            for (int i = 0; i < a.length ; i++) {
                b[(i + (a.length - d)) % a.length] = a[i];
            }

            return b;
        }else if (d > a.length){
            for (int i = 0; i < a.length ; i++) {
                b[(i + (a.length - (d - a.length))) % a.length ] = a[i];
            }

            return b;
        }else{
            return a;
        }

    }




    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 4;
        System.out.println(Arrays.toString(rotLeft(arr, d)));

    }
}
