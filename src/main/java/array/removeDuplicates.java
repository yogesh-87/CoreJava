package array;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 8, 9};

        // Pointer 'i' is our "Writer" (tracks the last unique position)
        int i = 0;

        // Pointer 'j' is our "Explorer" (looks for new numbers)
        for (int j = 1; j < arr.length; j++) {
            // If we find a new unique number
            if (arr[j] != arr[i]) {
                i++;             // Move the writer to the next slot
                arr[i] = arr[j]; // Write the new unique number there
            }
        }

        // 'i + 1' is the count of unique elements
        System.out.println("Number of unique elements: " + (i + 1));

        // Print only the unique part of the array
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}