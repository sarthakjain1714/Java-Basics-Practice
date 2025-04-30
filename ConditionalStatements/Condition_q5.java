//Question5 - Check if a number is a multiple of 3 or 7
import java.util.Scanner;
public class Condition_q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        if (a % 3 == 0){
            System.out.println("This number is the multiple of 3");
        }
        else if (a % 7 == 0){
            System.out.println("This number is the multiple of 7");
        }
        else {
            System.out.println("No multiple of either 3 or 7");
        }

    }
}
