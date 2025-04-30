//Question7 - Swap two number without using Third variable
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The First number becomes = " +a);
        System.out.println("The Second number become =  " +b);

    }
}
