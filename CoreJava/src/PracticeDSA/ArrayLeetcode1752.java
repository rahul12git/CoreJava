package PracticeDSA;
//nums =[3,4,5,1,2] -----true  count =0,1 >true
//nums =[2,1,3,4]  -------false count=0,1,2 > false
//nums = [1,2,3]  --- true   count= 0,    >false
//nums = [1,1,1]  --- true   count= 0,    >true

public class ArrayLeetcode1752 {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};

       int  count=0;
        for(int i= 0;i<=arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
       }
        System.out.println(count);
    }

}
