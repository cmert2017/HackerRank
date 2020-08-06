package Interview_Preparation_Kit.Warm_up_Challenges;

public class Repeated_String {

    static long repeatedString(String s, long n) {
        int length = s.length();
        int count = 0;
        long firstPartA = 0;
        long secondPartA = 0;
        for(int i =0; i <= length -1; i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }

        firstPartA =  n / length * count ;
        secondPartA = n % length ;

        for(int i =0; i < secondPartA  ; i++){
            if(s.charAt(i)=='a'){
                firstPartA++;
            }
        }


        return firstPartA;
    }


    public static void main(String[] args) {
        long n = 10 ;
        String s = "aba";
        System.out.println(repeatedString(s, n));


    }
}
