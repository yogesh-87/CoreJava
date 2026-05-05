package array;

public class targetsum {
  public static int targetSum(int arr[],int target){

      for(int i =0 ; i<arr.length; i++){
          for(int j = i; j<arr.length; j++){
              if(arr[i] + arr[j] == target){
                  return 1;
              }
          }
      }
      return -1;
  }
    static void main() {
        int[] arr= {3,5,2,8};
        int target = 8;

        int result = targetSum(arr,target);

        if(result == 1){
            System.out.print("target sum is found ");
        }else{
            System.out.print("target sum is not found ");
        }
    }
}
