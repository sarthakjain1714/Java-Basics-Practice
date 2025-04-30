//Question5- Taking Radius of a circle and prints its Area
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius = input.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.println("The area of Circle is "+area);
    }
}
