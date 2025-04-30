//Question4 - Check The smallest number among 3 number
import java.util.Scanner;
public class Condition_q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();

        System.out.println("Enter the second number");
        int b = input.nextInt();

        System.out.println("Enter the third number");
        int c = input.nextInt();

        if (a<b){
            if (a<c){
                System.out.println("The smallest is " +a);
            }
            else {
                System.out.println("The smallest is " +c);
            }
        }
        else if (b<c){
            System.out.println("The smallest is " +b);
        }
        else {
            System.out.println("The smallest is " +c);
        }
    }
}
