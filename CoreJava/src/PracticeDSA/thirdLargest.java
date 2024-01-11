package PracticeDSA;

import java.util.Arrays;

public class thirdLargest {
    public static void main(String[] args) {
        int arr[] = {11, 11, 2, 15, 7, 20, 33};

        int largest = largest(arr, arr.length);
        System.out.println("Largest" + largest);
        int secondLargest = secondLargest(arr, arr.length, largest);
        System.out.println("secondLargest" + secondLargest);
        int thirdLargest = thirdLargest(arr, arr.length, secondLargest, largest);
        System.out.println("thirdLargest" + thirdLargest);
    }

    public static int largest(int arr[], int n) {

        int largest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargest(int arr[], int n, int largest) {
        int secondLargest = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int thirdLargest(int arr[], int n, int secondLargest, int largest) {
        int thirdLargest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > thirdLargest && arr[i] != secondLargest && arr[i] != largest) {
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }
}

