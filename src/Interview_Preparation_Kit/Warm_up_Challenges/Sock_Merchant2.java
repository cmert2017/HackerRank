package Interview_Preparation_Kit.Warm_up_Challenges;

       /* Integer[] ar2 = new Integer[ar.length];
        int i = 0;
        for(Integer each: ar){
            ar2[i] = each;
            i++;
        }

        List<Integer> list = Arrays.asList(ar2);
        */
import java.util.Arrays;

public class Sock_Merchant2 {

    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        Arrays.sort(ar);
        int count = 1;
        for (int i = 1; i < ar.length  ; i++) {
                if(ar[i]==ar[i-1]){
                    count++;
                    if(i+1 < ar.length){
                    continue;
                    }
                }
              if(count > 1 ){
                  result += count  / 2 ;
              }
              count = 1;
        }

        return result;
    }


    public static void main(String[] args) {
        int n = 9;
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(n, arr));


        //test case 2:
        int n2 = 10;
        int[] arr2 = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3,3};
        System.out.println(sockMerchant(n2, arr2));
    }
}
