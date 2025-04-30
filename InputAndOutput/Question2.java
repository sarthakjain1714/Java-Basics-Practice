//Question 2 - Take a number and print whether it is positive, Negative or zero
import java.util.Scanner;

public class Question2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int a = input.nextInt();
        if (a>0){
            System.out.println("The number is Positive");
        } else if (a<0) {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }
    }
}