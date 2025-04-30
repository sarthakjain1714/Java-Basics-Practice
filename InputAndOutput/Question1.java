//Question1 - Take two number and print their sum

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = input.nextInt();
        System.out.println("Enter Second Number");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("the sum is " +c);

    }
}