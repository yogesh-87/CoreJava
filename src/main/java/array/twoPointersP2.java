package array;

public class twoPointersP2 {
    static void RemoveDuplicates(int arr[]){
        int i = 0;
        int count = 0;

       for(int s = 0; s<arr.length; s++){
           if(arr[i] != arr[s]){
               i++;
               count++;
               arr[i] = arr[s];
           }
       }
        for(int k = 0; k<=count; k++){
            System.out.print(arr[k] + " ");
        }
    }
    static void main() {
        int[] arr = {1,2,2,2,3,4,5,5,5,6,6,6,8,8,9};
        RemoveDuplicates(arr);
    }
}
