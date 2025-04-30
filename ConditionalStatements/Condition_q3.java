//Question3 - Find greatest of three number
import java.util.Scanner;
public class Condition_q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the Second number");
        int b = input.nextInt();
        System.out.println("Enter the Third number");
        int c = input.nextInt();
        if (a>b){
            if (a>c){
                System.out.println("The number bigger is " +a);
            }
            else {
                System.out.println("The bigger number is  " +c);
            }
        }
        else if (b>c) {
            System.out.println("the biggest number is " +b);
        }
        else {
            System.out.println("The biggest number is " +c);
        }
    }
}
