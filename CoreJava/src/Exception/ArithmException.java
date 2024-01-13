package Exception;

public class ArithmException extends Throwable {
    public static void main(String[] args) {
        int x=10,y=0,z;



         z=x-y;
        System.out.println(z);

try {

    z = x / y;
    System.out.println(z);

}catch (Exception e){

}

         z=x+y;
        System.out.println(z);

    }
}
