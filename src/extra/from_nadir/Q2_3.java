package extra.from_nadir;

import java.util.ArrayList;
import java.util.Arrays;

/*
=> Given a String with numbers and letters. Output the sum of all numbers in given String.
 For example: Input: String str = “jav34ajs4jk6”; Output: 44 (34 + 4 + 6 = 44)

 */
public class Q2_3 {
    public static void main(String[] args) {
        String str = "javaaa34ajjs6jkklk5hljh5kljk8kjkj";
        str = str.replaceAll("[^0-9]", " ");
        /*System.out.println(str);
        str = str.replace("--", " ");
        System.out.println(str);*/
              //String[] str1 = str.split(" ");
        //System.out.println(Arrays.toString(str1));
              // ArrayList<String> list = new ArrayList<>(Arrays.asList(str1));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        list.removeIf(p -> p.equals(""));
        //System.out.println(list);

        //version1
        int sum = 0;
        for (String each: list) {
            sum+= Integer.parseInt(each);
        }

        System.out.println(sum);


        //version2
        /*final int[] sum = {0};
        list.forEach((p -> sum[0] += Integer.parseInt(p)));
        System.out.println(sum[0]);*/



        //version3
       /* AtomicInteger sum = new AtomicInteger();
        list.forEach(p -> {
            sum.addAndGet(Integer.parseInt(p));
            System.out.println(sum);

        });*/





    }
}
