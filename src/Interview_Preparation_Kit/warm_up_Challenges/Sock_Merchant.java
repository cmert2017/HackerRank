package Interview_Preparation_Kit.warm_up_Challenges;
/*
https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class Sock_Merchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        String unique = "";
        int result = 0;
        for(int i=0;i<ar.length;i++){
            int count = 0;
            if(!unique.contains(""+ar[i])){
                unique += ar[i] + " ";
                for(int j = 0; j< ar.length;j++){
                    if(ar[i]==ar[j]){
                        count++;
                    }
                }
            }

            result+=count /2 ;

        }
        return result;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] arr = {10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(n,arr));

        //test case 2:
        int n2 = 10;
        int[] arr2 = {1,1,3,1,2,1,3,3,3,3};
        System.out.println(sockMerchant(n2,arr2));



    }

}
