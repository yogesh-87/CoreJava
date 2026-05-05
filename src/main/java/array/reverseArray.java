package array;

public class reverseArray {
    public static void Reverse(int arr[]){
        // using new array rev
        int[] rev = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0; i--){
            rev[j] = arr[i];
            j++;
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(rev[i] + " ");
        }
    }
    public static void reverse(int arr[]){
        // withoud using another array
        int start = 0, end = arr.length-1;
        // start point index 0 and end point to the last index

        while(start<end){
            int temp = arr[start];
            // swap the number
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // print the reverse array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    static void main() {
        int[] arr = {2,4,5,6,8};


        reverse(arr);
        Reverse(arr);




    }
}
