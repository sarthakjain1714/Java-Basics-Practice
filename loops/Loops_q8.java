//Question8 - Print Fibonacci series upto n terms
import java.util.Scanner;
public class Loops_q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the term");
        int first = 0;
        int second = 1;
        int num = input.nextInt();
        System.out.print(first+ "," +second);
        for (int i = 1 ; i<num ; i++){
            int next = first + second;
            System.out.print(","+next);
            first = second;
            second = next;
        }
    }
}
