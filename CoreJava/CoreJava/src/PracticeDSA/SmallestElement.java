package PracticeDSA;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={5,3,5,7,4,1};
        int smallest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
