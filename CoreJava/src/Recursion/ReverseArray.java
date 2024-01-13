package Recursion;


public class ReverseArray {
    public static void main(String[] args) {
 int arr[]={1,11,1,213};


        int start=0;
        int last= arr.length-1;
        while(start<last){
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
        System.out.println("Reversed Array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
