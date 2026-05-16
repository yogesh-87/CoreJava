package array;

public class MaxMin {

    public static int min(int arr[]){
        int low = 0, high = arr.length-1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low ) / 2;

            if(arr[mid] < min){
                min = arr[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return min;
    }

    public static int max(int arr[]){
        int low = 0, high = arr.length-1;
        int max = Integer.MIN_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] > max){
                max = arr[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return max;
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,11,23,56};

        System.out.println(min(arr) + " , " + max(arr));
    }
}
