//Question4 - Take input from the user and and calculate its sum from 1
import java.util.Scanner;

public class Loops_q4 {
    public static void main(String[] args) {
        System.out.println("Enter the number till where to find sum");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0 ; i<=num ; i++){
            sum += i;
        }
        System.out.println("The sum is " +sum);
    }
}
