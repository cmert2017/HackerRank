package Interview_Preparation_Kit.arrays;
/*
https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class Minimum_Swaps_2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ) {
            if(arr[i]== i + 1){
                i++;
            } else if(arr[i]!= i + 1){
                int temp = arr[i];
                arr[i] =  arr[arr[i]-1];
                arr[temp-1] = temp;
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,1,2};
       //int[] arr = {2,3,4,1,5};
        //int[] arr = {1,3,5,2,4,6,7};

        System.out.println(minimumSwaps(arr));

    }
}
