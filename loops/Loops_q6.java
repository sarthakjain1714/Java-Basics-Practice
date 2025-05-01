//Question6 - Find the reverse of a number
import java.util.Scanner;

public class Loops_q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int rev = 0;
        while(num != 0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
