//Question1- Take an integer as input and check whether it's even or odd.
import java.util.Scanner;
public class Condition_q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        if (a%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
