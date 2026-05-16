package array;
// using sliding window :
public class maxSum {
    public static void FindMaxSum(int arr[] , int k){
        int MaxSum = 0;
        int maxSum = 0;
        int i = 0, j = k-1;

        while(i <= j){

            if(i == j){
                MaxSum += arr[i];
                i++;
                j--;
            }else{
                MaxSum += arr[i] + arr[j];
                i++;
                j--;
            }

        }

       System.out.println("Max sum of an Sub array using two pointers " + MaxSum);

        for(i = 0; i<k; i++){
            maxSum += arr[i];
        }
        System.out.println("from brute force " + maxSum);
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,7,8,11,23,34,45};
        int k = 8;
        FindMaxSum(arr,k);

    }
}
