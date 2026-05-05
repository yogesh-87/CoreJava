package array;

public class target {

    static String Target(int arr[] , int target){
        for(int i =0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return "yes";
                }
            }
        }
        return "no";
    }
    static void main() {
        int[] arr = {2,4,5,7,18,56,34,6,75,15,13,4,5};
        int target = 9;
        String result = Target(arr,target);

        if(result == "yes"){
            System.out.print("yes target found means this contain two which sum is equal to " + target);
        }else{
            System.out.print("nooooooooo");
        }
    }
}
