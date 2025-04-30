//Question4- Converting Character into Ascii Code
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character");
        char name = input.next().charAt(0);
        int ascii = name;
        System.out.println("The Ascii value is " +ascii);

    }
}
