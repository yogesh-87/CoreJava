package array;

public class checkSorted {

    public static int isSorted(int arr[]){
        for(int i = 0 ; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                return -1;
            }
        }
        return 0;
    }
    static void main() {
        int[] arr = {2,4,68,7,8,9,11,24,34,56};

        int result = isSorted(arr);
        if(result == -1){
            System.out.println("array is not Sorted: ");
        }else{
            System.out.print("array is sorted ");
        }
    }
}
