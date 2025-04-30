//Question3- take name and age, then print a welcome message
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = input.nextLine();
        System.out.println("Enter the Age");
        int age = input.nextInt();
        System.out.println("Welcome " +name+ " of age " +age);
    }
}
