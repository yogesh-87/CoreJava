package array;

public class twoPointerP1 {
    public static int[] TargetSum(int arr[] ,int  targett){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int sum = arr[start] + arr[end];

            if(sum == targett){
                return new int[] {start , end };
            }else if(sum > targett){
                end--;
            }else{
                start++;
            }
        }
        return new int[] {-1 , -1};
    }
    static void main() {
        int[] arr= {2,4,5,6,7,8,9,11,23,45,54};
        int targett = 20;

        int[] result = TargetSum(arr,targett);

        System.out.println("0 index  : " + result[0]);
        System.out.print("1 index : " + result[1]);
    }
}
