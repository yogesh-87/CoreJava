package BitwiseOperatorPRactice;

public class SwapNo {
    static void main() {

        int a = 34;
        int b = 45;

        System.out.println("Before swaping a and b respectively : " + a + " " + b);

        a = a^b;   // a = 3
        b = a^b;   // b = 34
        a = a^b;  // a  = 45

        System.out.println("after swaping a and b respectively : " + a + " " + b);
    }
}
