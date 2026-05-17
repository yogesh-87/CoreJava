package BitwiseOperatorPRactice;
import java.util.*;
public class practice2 {
    static void main() {

        // check given number is even or odd
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number and check it is even or not : ");
        int n = sc.nextInt();

        if( (n&1) == 0){
            System.out.println("Given number is Even number -- " + n);
        }else{
            System.out.println("Given number is ODD number --  " + n);
        }
    }
}
