package hackerrankPractice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 1; i <= q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int totalSum = a;
            for (int j = 0; j < n; j++) {
                totalSum = (int) (totalSum + Math.pow(2,j)*b);
                System.out.print(totalSum+ " ");
            }

            System.out.println();

        }

    }

}
