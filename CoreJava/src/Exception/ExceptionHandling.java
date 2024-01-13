package Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        int x=20,y=0,a;

        a=x-y;
        System.out.println(a);

        a=x*y;
        System.out.println(a);
try{
    a=x/y;
    System.out.println(a);
}
catch (Exception e)
{
    System.out.println("Exception handling");
}

        a=x+y;
        System.out.println(a);
    }
}
