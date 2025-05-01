//Question7 - Check if a number is palindrome or not
import java.util.Scanner;
public class Loops_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number");
        int num = input.nextInt();
        int check = num;
        int rev = 0;
        while(num != 0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        if (check == rev){
            System.out.println("It is A palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
