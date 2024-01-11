package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int f=factorial(n);
        System.out.println(f);

    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
            int fn1 = factorial(n - 1);
            int f = n * fn1;
            return f;
        }

    }
