//Question9 - Find the factorial of input number
import java.util.Scanner;

public class Loops_q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the term for its factorial");
        int num = input.nextInt();
        long fact = 1;
        for (int i = 1; i<=num ; i++){
            fact = fact*i;
        }
        System.out.println("The Factorial is " +fact);
    }
}
