package PracticeDSA;

import java.util.Arrays;

public class RemoveDulicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 5, 6, 6};

        int[] UniqueElement = removeDuplicates(arr);
        System.out.println(Arrays.toString(UniqueElement));


    }

    public static int[] removeDuplicates(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        if (arr[arr.length - 1] == arr[arr.length - 2]) {
            arr[j] = arr[arr.length - 1];
            j++;
        }
        while (j != arr.length) {
            arr[j] = 0;
            j++;
        }
        return arr;
    }

}
