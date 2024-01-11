package PracticeDSA;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,3,55,5,12};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
