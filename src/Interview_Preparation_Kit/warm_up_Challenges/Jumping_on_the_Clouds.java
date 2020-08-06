package Interview_Preparation_Kit.warm_up_Challenges;

import java.util.Arrays;

public class Jumping_on_the_Clouds {
    static int jumpingOnClouds(int[] c) {
        int count = 0;

        for(int i =0; i < c.length-3;){
            if(c[i]==1){
                i++;
                continue;
            }else{
                if(c[i+2]==0) {
                    count++;
                    i=i+2;
                }else{
                    count++;
                    i=i+1;
                }
            }
        }
        return count+1;
    }
        

        /*

        int path = 0;
        String str = Arrays.toString(c).replace("[","").replace("]", "").replace(", ", "");
        int tempIndex = str.indexOf("0");
        for (int i = str.indexOf("0"); i <= c.length-2 ; i+=tempIndex) {
                if(str.charAt(i+2)=='0'){
                    if(tempIndex+2== c.length-2){
                        tempIndex=1;
                        path++;
                    }else {
                        tempIndex=2;
                        path++;
                    }
                }else if(str.charAt(i+1)=='0'){
                    tempIndex=1;
                    path++;
                }else {
                    break;
                }
            }
        return path;
    }
         */





        /*int path = 0;
        String str = Arrays.toString(c).replace("[", "").replace("]", "").replace(", ", "");
        int tempIndex = str.indexOf("0");
        for (int i = str.indexOf("0"); i <= c.length - 2; i += tempIndex) {

                if (str.charAt(i + 2) == '0') {
                    if (i + 2 == c.length - 2) {
                        tempIndex = 1;
                        path++;
                    } else {
                        tempIndex = 2;
                        path++;
                    }
                } else if (str.charAt(i + 1) == '0') {
                    tempIndex = 1;
                    path++;
                } else {
                    break;
                }
            }
            return path;
        }

*/



       /* int path = 0;
        String str = Arrays.toString(c).replace("[","").replace("]", "").replace(", ", "");
        int tempIndex = str.indexOf("0");
        for (int i = str.indexOf("0") ; i <= c.length-3 ; i++) {
                if(str.charAt(tempIndex+2)=='0'){
                    tempIndex=i+2;
                    path++;
                }else {
                    tempIndex=i+1;
                    path++;
                }
            }
        return path-1;
    }*/



        public static void main (String[] args){
            int[] arr = {0, 0, 1, 0, 0, 1, 0};
            int[] arr2 = {1, 0, 0, 1, 0, 0};



            // String str = Arrays.toString(arr);
            //String str1 = Arrays.toString(arr).replace("[","");
            String str = Arrays.toString(arr).replace("[", "").replace("]", "").replace(", ", "");
            System.out.println(str);
            System.out.println(jumpingOnClouds(arr));
        }
}

