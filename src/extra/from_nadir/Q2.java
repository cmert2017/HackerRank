package extra.from_nadir;
/*
=> Given a String with numbers and letters. Output the sum of all numbers in given String.
 For example: Input: String str = “jav34ajs4jk6”; Output: 44 (34 + 4 + 6 = 44)

 */
public class Q2 {
    public static void main(String[] args) {

        String str = "jav34ajs4jk6hjh10kjk7kjkj";
        String[] nums = str.split("");
        String digits ="0123456789";
        int sum = 0;

        for (int i = 0; i < nums.length ; ) {//checking each element whether it is a number or not

            if(digits.contains(nums[i])){ //if it is a number it will check the next elements of the array

                String temp = "";
                for (int j = i; j < nums.length; j++) { //catching consecutive digits
                    if(digits.contains(nums[j])){ //storing all consecutive digits into temp
                        temp += nums[j];
                        i++;

                    }else{
                        break; // once the inner loop catches consecutive numbers then it exists
                    }
                }
                sum+=Integer.valueOf(temp);
                continue;
            }
            i++;
        }

        System.out.println(sum);

    }
}
