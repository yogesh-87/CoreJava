package array;

public class majorityElement {

   public  static void majorityElemnt(int arr[]){
       int count = 0;
       int target = arr[0];

       for(int i = 0; i<arr.length; i++){

           if(count == 0){
               target = arr[i];
               count++;
           }
           if(arr[i] == target){
               count++;
           }else{
               count--;
           }
       }
       if(count >= arr.length/2){
           System.out.print("the majority element is " + target);
       }else{
           System.out.print("there is no majority present in this array");
       }
    }
    public static void main(String[] args){
        int[] arr = {2,5,2,8,2,2};
  majorityElemnt(arr);
    }
}
