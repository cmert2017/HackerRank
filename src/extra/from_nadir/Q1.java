package extra.from_nadir;
/*
java coding
=> Given an array of integers. how do you put zeros at the end of array without sorting an array?
For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]

 */

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {4,5,0,0,2,0,1,0};

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                for (int j = nums.length-1; j > i ; j--) {
                    if(nums[j]!=0){
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
