//Question5 - Count the number of digit in a number
import java.util.Scanner;
public class Loops_q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int count = 0;
        if (num == 0){
            count = 1;
        }
        else{
            if (num<0){
                num = -num;
            }
            while (num>0){
                num = num/10;
                count ++ ;
            }
        }
        System.out.println(count);
    }
}
