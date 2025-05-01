/*Question10 - Using loops pring
 *****
 ****
 ***
 **
 *
 */
import java.util.Scanner;
public class Loops_q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = input.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = num; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
