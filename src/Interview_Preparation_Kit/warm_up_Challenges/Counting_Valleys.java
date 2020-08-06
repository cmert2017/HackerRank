package Interview_Preparation_Kit.warm_up_Challenges;
/*
https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class Counting_Valleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level =0;
        int count1 = 0;
        int count2 = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = (s.charAt(i)=='D')? -1 : 1 ;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            level+=arr[i];
            if(level < 0 && arr[i]< 0 &&(arr[i+1] - arr[i]== 0 || arr[i+1] - arr[i]==2)){
                count1++;
                continue;
            }
            if(count1 > 0 && level -1== - count1){
                count2++;
            }
            count1 = 0;
        }

    return count2;
    }


    public static void main(String[] args) {
        int n1 = 8 ;
        String arr1 = "UDDDUDUU";
        System.out.println(countingValleys(n1, arr1));

        //Test case 2
        int n2 = 12 ;
        String arr2 = "DDUUDDUDUUUD";
        System.out.println(countingValleys(n2, arr2));
    }
}
