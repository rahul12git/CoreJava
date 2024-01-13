package Recursion;

public class Fibonacci {
    static int a=0,b=1,c;
    public static void main(String[] args) {
       Fibonacci fb= new Fibonacci();
         fb.printFb(15);

    }

     void printFb(int i) {
        if(i>=1)
        {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
            printFb(i-1);
        }
    }
}
