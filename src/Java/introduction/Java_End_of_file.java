package Java.introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(input.hasNext()){

            list.add(input.nextLine());

        }


        for (int i = 0; i < list.size(); i++){

            System.out.println(i+1 + " " + list.get(i));
        }

    }
}
