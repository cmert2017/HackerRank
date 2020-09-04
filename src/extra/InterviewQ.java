package extra;

import java.util.Scanner;

public class InterviewQ {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //forming first array
        System.out.println("Please enter the size of the first array");
        int sizeOfFirstArray = input.nextInt();
        String[] firstArray = new String[sizeOfFirstArray];
        input.nextLine();

        for (int i = 0; i < sizeOfFirstArray ; i++) {
            System.out.println("Please enter a string");
            firstArray[i]= input.nextLine();
        }

        //forming second array
        System.out.println("Please enter the size of the Second array");
        int sizeOfSecondArray = input.nextInt();
        String[] secondArray = new String[sizeOfSecondArray];
        input.nextLine();

        for (int i = 0; i < sizeOfSecondArray ; i++) {
            System.out.println("Please enter a string");
            secondArray[i]= input.nextLine();
        }

        int lengthOfLoop = sizeOfFirstArray > sizeOfSecondArray ? sizeOfSecondArray : sizeOfFirstArray ;

        //comparing chars of arrays
        for (int i = 0; i <lengthOfLoop ; i++) {
            int countNo = 0;
            for (int j = 0; j < firstArray[i].length(); j++) {
                if(secondArray[i].contains(""+firstArray[i].charAt(j))){
                    System.out.println("YES");
                    break;
                }else{
                    countNo++;
                }

            }
            if(countNo==firstArray[i].length()){
                System.out.println("NO");
            }

        }


    }
}
