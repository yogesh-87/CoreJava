package BitwiseOperatorPRactice;

public class practice1 {
    static void main() {


        int a = 2;
        int b = 8;


        //        if both the bit is same then  output will be one other wise zero
        // 3      0 0 1 1
        // 4      0 1 0 0
        // &      0 0 0 0   --- 0
        int and = a&b;
        int or = a|b;
        int Xor = a^b;
        int leftshift = a << 2;
        int rightShift = b >> 2;

        System.out.println("USING AND GATE -- 3" + and);


        //        if both the bit zero then output is zero otherwise one
        // 3      0 0 1 1
        // 4      0 1 0 1
        // |      0 1 1 1   --- 7
        System.out.println("Using OR Gate --"+ or);

        //        it reverse the input 1 to zero or  0 to one
        // 3      0 0 1 1
        // ~3   now value come in negative so it calculate the value using 2's compliment
        System.out.println("Using Not GAte -- "+ ~a);

        // ^ XOR when both the input is different then output will be One otherwise Zero
        // 3   0  0  1  1
        // 4   0  1  0  0
        // ^   0  1  1  1 ---- 7
        System.out.println("using Xor --" + Xor);

        // this is Called Left Shift
        // we use num * 2^i where i is how many times we shift the number

        // 3 << 2    means 3 * 2^2  --- 12

        System.out.println("left shift " + leftshift);



        // this is Called Right Shift
        // we use num / 2^i where i is how many times we shift the number

        // 4 >> 2 means 4 / 2^2  4/4  1
        System.out.println("Right shift -- " + rightShift);
    }
}
