package PracticeDSA;

public class ReverseString {
    public static void main(String[] args) {
        String reverseString="";
        String orignalString="A man, a plan., a canal: Panama";
        orignalString  = orignalString.toLowerCase().replaceAll("[,\\s:.]", "");

        System.out.println(orignalString);


        char[] orignalStringCharArray= orignalString.toCharArray();

        for(int i = orignalStringCharArray.length-1;i>=0;i--){

            reverseString =reverseString+ orignalStringCharArray[i];
        }

        System.out.println(reverseString);




    }
}
