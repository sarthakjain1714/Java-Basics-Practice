//Question6 - Swap two number using third variable
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = input.nextInt();
        System.out.println("Enter the Second Number");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The first number is " +a);
        System.out.println("The second number is " +b);
    }
}
