/*
Question12 - Print the pattern
****
****
****
****

*/

import java.util.Scanner;
public class Loops_q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
