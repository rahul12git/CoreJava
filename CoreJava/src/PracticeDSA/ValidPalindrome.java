package PracticeDSA;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str ="A man, a plan, a canal: Panama";
        str = str.replaceAll("[,\\s:]", "");
        System.out.println(str);
       String str1= str.toLowerCase();
       System.out.println(str1);

    }
}
