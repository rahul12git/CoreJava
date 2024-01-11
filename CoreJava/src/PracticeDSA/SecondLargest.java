package PracticeDSA;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        System.out.println(Arrays.toString(arr));

  // int   secondLargest = printsecondlargest(arr , arr.length);
   //System.out.println(secondLargest);

       int seccond= print2largest(arr,arr.length);
       System.out.println(seccond);

    }

public  static int printsecondlargest(int arr[],int n){
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    int largest =0;
    int secondLargest=0;

    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
        }
    }


    return secondLargest;
}
    public static int print2largest(int arr[], int n) {

        int largest=0;
        int secondLargest=0;


        for(int i=0;i<n;i++){
            if(arr[i]>largest  ){
                largest=arr[i];

            }
        }


        System.out.println("Largest"+largest);
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=largest ){

                secondLargest=arr[i];
            }
        }
        System.out.println("secondlargest"+secondLargest);

        return secondLargest;
    }
}
