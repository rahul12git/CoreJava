package Exception;

public class MultipleCatch {
    public static void main(String[] args) {

        int a=5,b=0;

        int x=a+b;
        try{
          //  int z=a/b;

          String s=null;
          System.out.println(s.length());
        }

      catch (ArithmeticException e){
            System.out.println(e);
      }
        catch(NullPointerException n){
            System.out.println(n);
        }
        catch (IndexOutOfBoundsException i){
            System.out.println(i);
        }
        int r=a-b;
    }
}
