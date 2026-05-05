package array;

public class mergetwoArray {
    public static void Merge(int arr1[] , int arr2[]){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;


        while(i <arr1.length && j <arr2.length){

            if(arr1[i] < arr2[j]){
              result[k] = arr1[i];
                i++;
                k++;
            }else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j <arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }

        for(int l = 0; l < result.length; l++ ){
            System.out.print(result[l] + " ");
        }
    }
    static void main() {
        int[] arr1 = {2,3,4,5,7,9};
        int[] arr2 = {1,6,8,10,13};
    Merge(arr1,arr2);


    }
}
