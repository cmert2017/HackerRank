package extra.from_nadir;
/*
=> Given a String with numbers and letters. Output the sum of all numbers in given String.
 For example: Input: String str = “jav34ajs4jk6”; Output: 44 (34 + 4 + 6 = 44)

 */
public class Q2_2 {

    public static void main(String[] args) {
        String str = "jav34ajs6jk5hjh5kjk8kjkj";
        int sum = 0;

        for (int i = 0; i < str.length();) {
            String temp = "";
            if(Character.isDigit(str.charAt(i))){
                for (int j = i; j < str.length(); j++) {
                    if(Character.isDigit(str.charAt(j))){
                    temp += str.charAt(j);
                    i++;
                    }else{
                        break;
                    }
                }
                sum+=Integer.parseInt(temp);
                continue;
            }
            i++;
        }
        System.out.println(sum);

    }
}
