package PracticeDSA.SortingAlogorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 35};

        int[] sort = bublleSort(arr, arr.length);
        System.out.println(Arrays.toString(sort));

       int secondHeighest=0;
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]!=arr[i-1]){

                secondHeighest=arr[i-1];
                break;
            }

        }
        System.out.println(secondHeighest);


    }
    public static int[] bublleSort(int[] arr, int n) {

        for (int i = 0; i < 2; i++) {
            //
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        return arr;

    }
}
