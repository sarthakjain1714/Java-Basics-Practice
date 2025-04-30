//Question6 - check if a number is Consonant or Vovel
import java.util.Scanner;
public class Condition_q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character");
        char alpha = input.next().charAt(0);
        if (alpha >= 'a' && alpha <= 'z' || alpha >= 'A' && alpha <= 'Z'){
            if (alpha == 'a' || alpha == 'e' || alpha == 'o'  || alpha == 'i' || alpha == 'u' ){
                System.out.println("It is vovel");
            }
            else if (alpha == 'A' || alpha == 'E' || alpha == 'I'  || alpha == 'O' || alpha == 'U'){
                System.out.println("It is a vovel");
            }
            else{
                System.out.println("It is a consonant");
            }
        }
        else {
            System.out.println("Enter a valid Character");
        }
    }
}
