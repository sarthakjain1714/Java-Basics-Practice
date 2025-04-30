//Question2 - Check if a number is devisible by 5 and 11
import java.util.Scanner;

public class Condition_q2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%5 == 0){
            if (a%11 == 0){
                System.out.println("The number is devisible by both 5 and 11");
            }
            else{
                System.out.println("The number is only devisible by 5");
            }
        }
        else {
            System.out.println("The number is not devisible by either 5 or 11");
        }
    }
}
