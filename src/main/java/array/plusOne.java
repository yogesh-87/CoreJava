package array;

public class plusOne {
    static void main() {
        int[] arr = {2,4,5,6};
        int i = 0;
        int rem, res = 0;

        for(i = 0; i<arr.length; i++){
            res = (res * 10 ) + arr[i];
        }
 System.out.println("the sum of all the array element is " + res);
        res = res + 1;
        int count = 0;
        int temp = res;

        while (temp > 0) {
            temp /= 10;
            count++;
        }
        int[] resultArray = new int[count];
        for( i= count-1; i>= 0; i--){
           resultArray[i] = res % 10;
            res /= 10;
        }

        for(i = 0; i<resultArray.length; i++){
            System.out.print(resultArray[i] + " ");
        }
    }
}
