package PracticeDSA;

public class ReverseUsingRecursion {
    public static void main(String[] args) {
        int n=5;
        int arr[]={5,4,3,2,1};
       reversedArray(arr,0,n-1);

       for (int i=0;i<n;i++){
           System.out.println(arr[i]);
       }

    }

     static void reversedArray(int[] arr, int start, int end) {
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
             arr[end]= temp;
        }
    }
}
