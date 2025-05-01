/*Question11 - Print the following Pattern
*
**
***
****
*/

import java.util.Scanner;
public class Loops_q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = input.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
