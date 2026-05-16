package collectionFramework;

import java.util.Arrays;

public class sort {
    static void main() {

        Integer[] arr = {4,5,6,8,33,3,1,4,3};

        Arrays.sort(arr, new SortCOMP());

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
