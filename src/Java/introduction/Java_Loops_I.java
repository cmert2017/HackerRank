package Java.introduction;


import java.util.Scanner;

public class Java_Loops_I {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


            for (int j = 1; j <= 10; j++) {
                System.out.println(N + " x " + j + " = " + N * j);

            }




        scanner.close();
    }
}
